package ex01;

import java.util.Scanner;

/*
가로와 세로를 사용자로부터 입력을 받아서 
정사각형을 의미하는 Square클래스와 직사각형을 의미하는 Rectangle클래스를 정의하고
둘의 면적을 출력하는 프로그램을 만드시오.
*/

class Square // 정사각형 부모 클래스
{
	// 멤버 변수
	private int x; // 한변 정보 은닉
	
	public Square(int x) // 생성자
	{
		this.x=x;
	}	
	public void ShowSquare()
	{
		System.out.println("정사각형의 면적: "+x*x);
	}
}

class Rectangle
{
	// 멤버 변수
	private int width; // 가로 정보 은닉
	private int height; // 세로 정보 은닉
	
	public Rectangle(int width, int height) // 생성자
	{
		this.width = width;
		this.height = height;
	}
	
	public void ShowRectangle()
	{
		System.out.println("직사각형의 면적: "+width*height);
	}
}

public class Put03
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("직사각형의 가로: ");
		int w = scan.nextInt();
		System.out.println("직사각형의 세로: ");
		int h = scan.nextInt();
		System.out.println("정사각형의 한 변: ");
		int j = scan.nextInt();
       	Rectangle rec = new Rectangle(w,h);
       	rec.ShowRectangle();

 		Square sqr = new Square(j);
       	sqr.ShowSquare();	
	}
}
