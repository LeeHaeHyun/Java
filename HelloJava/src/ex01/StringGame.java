package ex01;

import java.util.Scanner;

public class StringGame
{
	public static void main(String[] args)
	{
		/*
		5.참가자의 이름을 입력받아 끝말잇기 게임을 만드시오
		(끝말을 이으면 게임을 이어가고 끝말이 틀리면 패배한다)
		*/
		System.out.println("끝말잇기 게임을 시작합니다.");
		System.out.println("참가할 인원은 몇명?(숫자만): ");
		//1. 입력값을 받고 player라는 변수에 저장한다.
		Scanner scan = new Scanner(System.in);
		int player = scan.nextInt();
		
		//2. arr 배열에 입력한 변수 player를 넣는다.
		String arr[] = new String[player];
		
		//3. 변수 player 명만큼 반복탐색
		for(int i=0; i<player; i++)
		{
			//4. 참가자 데이터 받기
			System.out.println("참가자 이름>>");
			//5. 문자열 형의 name 변수를 입력받아 arr[i]번째 배열에 차곡차곡 넣기
			String name = scan.next();
			arr[i] = name;
		}
		String str = "컴퓨터";
		System.out.println("시작 단어는 >> [" + str + "]");
	
		//6. 무한반복: 게임의 틀
		while(true)
		{
			//7. 플레이어의 인원수만큼 반복 탐색
			for(int i=0; i<arr.length; i++)
			{
				int lastsu = str.length()-1; //컴퓨터:끝글자의 위치를 숫자로 저장
				char lastchar = str.charAt(lastsu); // 끝글자를 문자로 뽑아냄 
				
				//8. 차례를 만들어줌
				System.out.println(arr[i] + ">> ");
				//9. 여기서부터는 입력할 단어를 받음
				String word = scan.next();
				
				//10. 입력값 미달(길이가 1자만 입력하면?)
				if(word.length()<2)
				{
					System.out.println(arr[i]+": 길이가 짧아 패배!");
					System.exit(0);
				}
				//11. 마지막 글자와 입력한 시작 글자가 일치하지 않으면?
				if(word.charAt(0) != lastchar)
				{
					System.out.println(arr[i]+": 끝말을 잇지 못해 패배!");
					System.exit(0);
				}
				//12. 입력 글자도 게임에 적용되기 위해 넣는다.
				str=word;
			}
		}
		
	}
}
