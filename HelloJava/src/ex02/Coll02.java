package ex02;

import java.util.LinkedList;
import java.util.Scanner;

public class Coll02
{
	private String name;
	private int age;
	private String stu;
	// 생성자
	public Coll02(String name, int age, String stu)
	{
		this.name = name;
		this.stu = stu;
		this.age = age;
	}
	//객체에 저장된 문자열을 저장하여 재정의
	@Override
	public String toString()
	{
		return "이름: "+ name + " 나이: " + age +" 학번:"+ stu;
	}	
	public String getName()
	{
		return name;
	}
	/*
	 * Q. 사용자로부터 이름을 입력받아 그 이름으로 검색해서 인덱스 위치(indexOf사용)를 알아내서 
	 * 해당 인덱스로 그 객체를 삭제하고 삭제된 객체의 정보(이름,나이,학번)를 출력하여라. 
	 * 1.검색할 이름을 입력받음 
	 * 2.확장for문으로 컬렉션 전체를 접근 
	 * 3.검색결과 유/무에 따라 검색결과 있을때 검색된 데이터 삭제되고
	 * 검색결과 없을때...검색결과가 없다고 출력 
	 * 4.전체정보 출력
	*/

	public static void main(String[] args)
	{

//		ArrayList<Coll02> list = new ArrayList<Coll02>();
		LinkedList<Coll02> list = new LinkedList<Coll02>();

		// 저장할 객체 생성
		Coll02 st1 = new Coll02("가길동", 10, "2018");
		Coll02 st2 = new Coll02("나길동", 20, "2017");
		Coll02 st3 = new Coll02("다길동", 30, "2016");
		Coll02 st4 = new Coll02("마길동", 40, "2015");
		// 객체 추가(컬렉션에 저장)
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		
		// 1.검색할 이름을 입력받음
		System.out.println("삭제할 이름을 입력해주세요: ");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		// 2.확장for문으로 컬렉션 전체를 접근
		for(Coll02 e : list)
		{
			// 3. 반복문을 돌다가 이름이 일치한 부분을 만나면?
			if(name.equals(e.getName()))
			{
				System.out.println("[검색되었습니다]");
				// 정보가 일치하는 객체를 찾았다면 참조값을 통해 삭제한다
				list.remove(e);
				// 객체를 삭제하면 즉시 반복문 완전 탈출 
				System.out.println("현재 객체수:" + list.size());
				//4.전체정보 출력
				for(Coll02 e1 : list)
				{
					System.out.println(e1);
				}
				return;
			}
		}
		// 없을 경우: 말하기
		System.err.println("그런 이름은 없습니다.");
	}		
}
