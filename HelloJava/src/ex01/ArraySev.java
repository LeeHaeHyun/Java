package ex01;

import java.util.Random;
import java.util.Scanner;

public class ArraySev
{
	public static void main(String[] args)
	{
		/*
		7. 숫자야구게임을 만드시오. 
		 + 1~9 사이의 중복되지 않는 3개의 정수를 생성한다. 
		 + 사용자는 3개의 숫자를 입력한다. 
		 + 생성된
		 + 3개의 숫자를 맞추는데 위치까지 정확히 맞춰야 한다. 
		 + 숫자와 숫자의 위치까지 일치하면 strike 로 판정한다. 
		 + 숫자는 맞지만 위치가 틀렸다면 ball 로 판정한다. 
		 + 숫자3개가 모두 일치하지 않으면 out 으로 판정한다. 
		 + 3 strike 가 되면 게임은 종료된다. 
		 + 시도한 횟수를 표시한다. 
		 + 계속할지 종료할지 여부를 물어보고 다음 진행을 한다.
		*/
		
		// 1. 랜덤을 생성하며 사용자로부터 입력값을 받는다.
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		// 2. 게임에서 사용할 변수(첫게임, 2게임, 3게임 변수)
		int com1, com2, com3;
		int user1, user2, user3;
		int randomCnt = 0;// 난수생성 카운트
		int gameCount = 0;// 게임 카운트
		int strikeCnt = 0, ballCnt = 0;// 스크라이크,볼 카운트

		// 3. 게임을 전체 무한 반복
		while (true)
		{
			// 3. 게임을 전체 무한 반복2
			while (true)
			{
				// 4. 몇번째 게임인지 카운트 체크
				randomCnt++;

				// 5. 첫~세번째 게임의 1~9사이의 난수생성
				com1 = random.nextInt(100) % 9 + 1;
				com2 = random.nextInt(100) % 9 + 1;
				com3 = random.nextInt(100) % 9 + 1;
				if (!(com1 == com2 || com2 == com3 || com3 == com1))
				{
					// 6, 중복되지 않아야만 탈출하게끔 가두는 if문 조건 
					break;
				}
			} //// while end

			// 7. 컴퓨터 정답: 회차 + 첫게임 + 2게임 + 3게임 구분 출력(실게임에선 지워야함)
			System.out.println(randomCnt + "회:" + com1 + " " + com2 + " " + com3);

			while (true)
			{
				// 8. 사용자로부터 3게임의 정수를 저장한다.
				System.out.println("3게임의 정수를 입력하세요(1~9)");
				System.out.println("스페이스로 구분하며 마지막에 Enter를 눌러주세요");
				user1 = scanner.nextInt();
				user2 = scanner.nextInt();
				user3 = scanner.nextInt();

				// 9, 게임카운트 1회 증가
				gameCount++;

				// 10. 스크라이크 모든 경우(숫자와 위치까지 일치해야만 정답)
				if (com1 == user1)
					strikeCnt++;
				if (com2 == user2)
					strikeCnt++;
				if (com3 == user3)
					strikeCnt++;

				// 11. 볼의 모든 경우(숫자는 일치하나 위치가 다를때)
				if (com1 == user2 || com1 == user3)
					ballCnt++;
				if (com2 == user1 || com2 == user3)
					ballCnt++;
				if (com3 == user1 || com3 == user2)
					ballCnt++;

				// 12. 승리로 종료 선언
				if (strikeCnt == 3)
				{
					System.out.println("홈런!!~~~");
					System.out.println(gameCount + "번만에 홈런을 쳤습니다.");
					break;// 루프탈출
				} 
				else // 그외의 경우
				{
					// 13. 하나도 못맞추는 경우
					if (strikeCnt == 0 && ballCnt == 0)
					{
						System.out.println("아웃입니다");
					} 
					else // 14. 그 외를 출력해준다.
					{
						System.out.printf("%d 스트라이크, %d 볼\n", strikeCnt, ballCnt);
					}
					// 15. 스트라이크, 볼 카운트 초기화
					strikeCnt = 0;
					ballCnt = 0;
					// continue문은 필요없음.
				}
			} //// while end

			//16. 게임이 끝났다면 나오는 출력문
			System.out.println("한게임 더 하시겠습니까?(0:종료,1:재시작)");
			int restart = scanner.nextInt();
			if (restart == 0)
			{
				// 17. 게임종료
				System.out.println("\n==게임이 종료되었습니다.==\n");
				// 실행되는 즉시 main함수가 종료된다.
				System.exit(0);
			} 
			else if (restart == 1)
			{
				// 18. 게임을 재시작하기 위해 카운트변수 초기화
				strikeCnt = 0;
				ballCnt = 0;
				gameCount = 0;
				System.out.println("\n==게임을 재시작합니다.==\n");
			}
		} // 게임 전체 반복 while end
	}// main 메서드 end
}// class 끝
