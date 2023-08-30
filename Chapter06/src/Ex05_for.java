//for : 반복문 초기값, 조건식, 증감식으로 이루어져있음

public class Ex05_for
{
	public static void main(String[] args)
	{
		for (int i = 1; i < 10; i++)
		{
			System.out.print((2 * i) + " ");
		}
		System.out.println();

		// 한 줄만 실행하면 중괄호 생략 가능, 보통 중괄호는 꼭 넣는다.
		for (int i = 1; i < 10; i++)
			System.out.print((3 * i) + " ");
		System.out.println();
		
		// 같은 줄에 작성 가능하지만 이렇게 만들진 않는다.
		for (int i = 1; i < 10; i++) System.out.print((4 * i) + " ");
		System.out.println();
		
		
		for (int i = 1; i < 10; i++)
//			System.out.println(i); 
			
//		이 i에 세미콜론으로 끝나서 아래 내용은 for문과 관련이 없다
			System.out.print((5 * i) + " ");
		System.out.println();
		
//		[연습문제1] 다음의 출력결과를 보이는 for문을 작성하시오
//		출력결과
//			0 0 0 1
//			0 0 1 0
//			0 1 0 0
//			1 0 0 0
//		해법: row(행)와 col(열)를 더해서 5가 될 때 1을 출력
		
		//행을 반복하는 for문
		for (int row = 1; row <= 4; row++)
		{
			//열을 반복하는 for문
			for (int col = 1; col <= 4; col++)
			{
				if (row+col==5)
				{
					System.out.print("1 ");
				} else
				{
					System.out.print("0 ");
				}
			}
			System.err.println();
		}
		
		// 구구단 출력
		for (int dan = 2; dan < 10; dan++)
		{
			for (int su = 1; su < 10; su++)
			{
				System.out.print(dan + "*" + su + " = "  + (dan*su));
				if(su==9)
				{	
					System.out.println();
					System.out.println("===================");
				} else
				{
					System.out.println();
				}
			}
		}		
	}
}
