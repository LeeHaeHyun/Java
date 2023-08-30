package common;

public class Student extends Person
{
	//자식에서 확장한 멤버 변수
	private String stNumber;
	
	//생성자

	public Student(String name, int age, String stNumber)
	{
		// ★★★ 자식 객체를 생성하기전에 부모생성자를 먼저 반드시 호출해야 한다
		super(name, age);
		this.stNumber = stNumber;
	}
	
	//객체에 저장된 문자열을 저장하여 출력
	@Override
	public String toString()
	{
		return super.toString() + ", 학번:"+ stNumber;
	}
}