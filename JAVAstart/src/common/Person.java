package common;
// 메인이 없고 데이터만 있는 것 = VO
public class Person
{

	// 멤버변수
	private String name;
	private int age;
	
	// 생성자
	public Person(String name, int age)
	{
		super();
		this.name = name;
		this.age = age;
	}
	
	//getter/setter
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
	// 객체의 정보를 반환
	public String toString()
	{
		return String.format("이름:%s, 나이:%d", name, age);
	}
}
