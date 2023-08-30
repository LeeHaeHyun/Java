package ex01;

import java.util.Scanner;

public class Method
{
	public static void main(String[] args)
	{
		/*
		5. 현금(원)을 입력받아 달러가 환전되는 프로그램을 만드시오.
		1달러의 1250원으로 한다.
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("환전하실 현금(원)을 입력해주세요 : ");
		int pay = sc.nextInt();
		dollar(pay);
	}

	static void dollar(int pay)
	{
		int result = pay / 1250;
		System.out.println("환전 가능한 달러 : "+ result + "달러");
	}
	

}
