package haehyun;

import java.util.Scanner;

public class codingclass02
{

	public static void main(String[] args)
	{
		String name = ""; 
		do
		{
			System.out.println("1+1=");
			Scanner scanner = new Scanner(System.in);
			name = scanner.nextLine();		
		} while(!(name.equals("2")));

		System.out.println("정답입니다");
	}
}
