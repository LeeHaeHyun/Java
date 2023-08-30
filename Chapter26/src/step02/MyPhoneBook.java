package step02;

import java.util.Scanner;

public class MyPhoneBook
{
	// 언제든지 불러오기 위해 스태틱으로 받음
	static Scanner sc = new Scanner(System.in); 
	
	public static void showMenu()
	{
		System.out.println("[메뉴 선택]");
		System.out.println("1.전화번호 입력");
		System.out.println("2.전화번호 조회");
		System.out.println("3.전화번호 삭제");
		System.out.println("4.종료");
		System.out.println("선택 : ");
	}
	
	public static void addNumber() // 추가
	{
		
	}
	
	public static void selNumber() // 조회
	{
		
	}
	
	public static void delNumber() // 삭제
	{
		
	}

	public static void main(String[] args)
	{
		int choice; // 입력한 값을 보관하는 변수
		while(true)
		{
			showMenu(); // 메뉴출력
			choice = sc.nextInt();
			sc.nextLine(); // 숫자를 입력하고 엔터를 입력하기 때문에 엔터처리를 위해 한번 더 입력
			switch (choice)
			{
			case 1:
				addNumber();
				break;
			case 2:
				selNumber();
				break;
			case 3:
				delNumber();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}
}
