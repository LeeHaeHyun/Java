package ex01;

import java.util.Scanner;

class ClassThree
{
	// 정보은닉화 private
	private int kor, eng, math;

	// 매개변수가 있는 생성자 : 
	// 직접 접근이 안되어서 간접적으로 불러오기 위해 
	public ClassThree(int kor, int eng, int math)
	{
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// 계산하는 멤버 메소드
	public int avgr() 
	{
		return ( kor + eng + math ) / 3;
	}
	
	public static void main(String[] args)
	{
//		3. 성적 클래스를 작성해보자. 국어,영어, 수학 과목의 3개의 점수를 입력받아 
//		객체를 생성하고 성적 평균을 출력하는 프로그램을 만들어라.
		// 사용자로부터 입력값을 받고
		Scanner scan = new Scanner(System.in);
		
		// 각 변수에 저장한다
		System.out.println("국어 영어 수학 점수를 순서대로 입력하시오:");
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		
		// ClassThree 클래스의 avg 객체를 생성하고 3변수를 담는다.
		ClassThree avg = new ClassThree(kor,eng,math); 
		// avgr() 멤버메소드에 저장된 3변수를 담아서 출력한다. 
		System.out.println("당신의 평균 점수는 " + avg.avgr() + "점!");
	}
}
