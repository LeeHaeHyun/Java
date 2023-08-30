package common;

import java.util.Objects;

public class Teacher extends Person
{
	// 자식에서 확장한 멤버 변수
	private String subject;

	// 생성자
	public Teacher(String name, int age, String subject)
	{
		super(name, age);
		this.subject = subject;
	}
	@Override
	public String toString()
	{
		return super.toString() + ", 과목:" + subject;
	}
	
	/*
	시나리오] Teacher 객체는 나이와 과목이 같으면 동일한 객체로
	처리하도록 hashcode와 equals 메소드를 적절히 오버라이딩 하시오
	 */
	
	/*
	hashCode()
	: 객체가 가진 고유한 주소값을 정수형으로 반환해준다
	따라서 서로 다른 객체라면 다른 값을 반환하게 된다
	정수형 멤버변수의 경우 그냥 사용하면 되고, 객체형 멤버변수의 경우
	hashCode() 메소드를 통해 정수값으로 반환되는 참조값을 사용하면 된다
	 */
	@Override
	public int hashCode()
	{
		// 방법1 : 정수형 변수와 객체의 해시코드값을 더해서 반환
		int returnCode1 = super.getAge() + this.subject.hashCode();
		System.out.println("returnCode=1" + returnCode1);
		
		/*
		방법2: 방법1이 번거롭다면 Object 클래스의 정적 메소드인 hash()를 
		이용해도 된다. 멤버 변수의 갯수만큼 인수로 사용하면 된다
		형식] int Objects.hash(멤버1, 멤버2, .... 멤버 N)
		 */
		int returnCode2 = Objects.hash(super.getAge(), this.subject);
		
		return returnCode2;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Teacher teacher = (Teacher)obj;
		if( (teacher.getAge()==super.getAge()) 
				&& teacher.subject.equals(this.subject) ) // 과목과 나이만 같을경우 동일 객체로 판단
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
