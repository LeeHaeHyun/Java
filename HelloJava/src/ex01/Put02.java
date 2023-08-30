package ex01;
/*
사용자로부터 입력을 받아 상속관계에 있는 두 클래스를 만들어 적절한 생성자와 함께
이름, 나이, 주소, 전화번호를 인자로 출력되는 프로그램을 만드시오.
*/

import java.util.Scanner;

class Person01
{
	public String name;
	int age;
	
	public Person01(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public void PersonShow()
	{
		System.out.println("=====================");
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
	}
}

class Person02 extends Person01
{
	private String address;
	private String number;
	
	public Person02(String name,int age,String address, String number)
	{
		super(name,age);
		this.address = address;
		this.number = number;
	}
	
	public void show()
	{
		PersonShow();
		System.out.println("주소: "+address);
		System.out.println("전화번호: "+number);
		System.out.println("=====================");
	}
}

public class Put02
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("이름 입력: ");
		String name = scan.nextLine();
		System.out.println("주소 입력: ");
		String address = scan.nextLine();
		System.out.println("전화번호 입력: ");
		String number = scan.nextLine();
		System.out.println("나이 입력: ");
		int age = scan.nextInt();
		Person02 info = new Person02(name, age, address, number);
		info.show();
	}

}
