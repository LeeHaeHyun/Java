package ex01;

import java.util.Scanner;

public class ArraySix
{
	public static void main(String[] args)
	{
		/*
		 * 6. 좌석 예약 프로그램을 만드시오. 예약 완료 후, 같은 자리를 다시 예약하려고 할 때 예약이 불가하다는 메세지와 함께 남아있는 좌석의
		 * 목록도 출력해야 합니다.
		 */
		// 1. 사용자로부터 입력값을 받는다.
		Scanner res = new Scanner(System.in);

		// 2. 총 좌석을 만든다.10x10의 100석이다.
		int[][] seat = new int[10][10];
		// 3. 입력한 값을 행열에 저장하기 위해 2개의 int형 변수를 선언한다.
		int x, y;
		// 4. 총 좌석수는 100석이다.
		int full = 100;

		// 5. 좌석이 있다면 무한 반복한다.
		while (full > 0)
		{
			System.out.println("[총 100석] 예약할 좌석 '(행 열)'로 입력: ");
			x = res.nextInt(); // 행을 입력한 값 저장
			y = res.nextInt(); // 열을 입력한 값 저장

			// 6. 존재하지 않는 좌석 입력시 걸러내기
			if (x > 10 || x < 1 || y > 10 || y < 1)
			{
				System.out.println("▶ 존재하지 않는 좌석입니다. \n▷ 1행 2열 예약시 '1 2'를 입력해주세요!)");
				continue;
			}
			// 7. 자바의 매우 중요한 특성: 배열 생성하여 공간만 만들어주면 자동으로 전부 0으로 채워준다
			// 그 특성을 이용해서 입력한 번째의 배열이 0일 경우 빈 좌석이 된다.
			// 입력한 값에 -1을 해주는 이유는 배열의 인덱스는 0번부터 시작하며 우리는 1번째부터 부르기 때문이다.
			// 10인 배열을 생성해주면 0~9까지가 생성되며, 우리는 1~10까지로 부르는 차이때문에 -1을 해준다.
			if (seat[x - 1][y - 1] == 0)
			{
				System.out.println("성공적으로 예약이 완료되었습니다.");
				// 8. 예약되었으니 0에서 1로 채워준다.
				seat[x - 1][y - 1] = 1;
			} else
			{
				System.out.println("이미 예약된 좌석입니다.");
				System.out.print("↓ 비어있는 좌석 ↓");
				// 9. 좌석의 행을 전체 탐색한다.(배열은 인덱스 0번째부터 시작)
				for (int i = 0; i < 10; i++)
				{
					// 10. 좌석의 열을 전체 탐색한다.(배열은 인덱스 0번째부터 시작)
					for (int j = 0; j < 10; j++)
					{
						// 11. 좌석의 행열이 빈 좌석이라면?
						if (seat[i][j] == 0)
						{
							// 12. 배열의 0번쨰를 우리는 1번째로 말하므로 +1을 해준다.
							System.out.printf("\n→ %d행 %d열\n", i + 1, j + 1);
						}
					}
				}
			}
		}
	}
}