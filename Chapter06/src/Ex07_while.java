//while문: 반복의 초기값은 밖에
//while(반복의 조건)
//	실행문장
//	증감식; <= 반복을 탈출하기 위한 식

public class Ex07_while
{
	public static void main(String[] args)
	{
		// while문을 이용한 반복
		int num = 0;
		int count = 0;
		
		//반복을 위한 조건식 ( 0 ~ 100까지의 범위 )
		//num++ = 0 대입 후 다음에 1
		while ((num++) < 100)
		{
//			if(((num % 5) != 0) || ((num % 7) != 0))
//				continue;
			
			if((num % 5) != 0)
				continue;
			if((num % 7) != 0)
				continue;
			
			count++;
			System.out.println(num);
		}
		System.out.println("count: "+ count);
	}
}
