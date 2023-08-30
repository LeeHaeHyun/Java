package ex01;

import java.util.Scanner;

public class StringOne
{
	public static void main(String[] args)
	{
		/*
		1. 사용자로부터 입력을 받아 "개" 가 포함되었을 경우 
			"나는 멍멍이"로 출력되는 프로그램을 만드시오
		*/
//		System.out.println("개발자에게 하고 싶은 말을 입력하시오: ");
//		Scanner scan = new Scanner(System.in);
//		String input = scan.nextLine();
//		if(input.contains("개"))
//		{
//			System.out.println("나는 멍멍이");
//		}
		
		/*
		2. 사용자로부터 입력을 받아 "사실"을 입력할 경우 "(힘들지만 파이팅..)"이 
		ㄴ 출력되는 프로그램을 만드시오
		*/
//		System.out.println("담아두었던 속마음이 있나요?: ");		
//		Scanner scan = new Scanner(System.in);
//		String input = scan.nextLine();
//		StringBuffer str = new StringBuffer(input);
//		if(input.contains("사실"))
//		{
//			System.out.println(str.append("(힘들지만 파이팅..)"));
//		}
		/*
		3. 주민등록번호 앞자리를 입력받아 "몇년 몇월 몇일에 태어나셨군요~"가 
		ㄴ 출력되는 프로그램을 만드시오
		*/
		System.out.println("주민등록번호 앞자리 입력(931009): ");
		Scanner scan = new Scanner(System.in);
		String jumin = scan.next();
		StringBuffer bunho = new StringBuffer(jumin);
        
		bunho.insert(2, "년생 ");
		bunho.insert(7, "월 ");
		bunho.insert(11, "일");
        
        System.out.println(bunho+ "에 태어나셨군요~");
	}
}
