package haehyun;

import java.io.IOException;

public class codingclass01
{

	public static void main(String[] args) throws IOException
	{
		System.out.println("문자를 입력하세요:");
		int num = System.in.read();
		if (num >= 48 && num <= 57)
		{
			System.out.println("숫자입니다");
		}
		else
		{
			System.out.println("숫자가 아닙니다");
		}
	}
}
