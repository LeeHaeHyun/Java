//do-while문
//while(조건문); 세미콜론이 반드시 들어간다

public class Ex08_DoWhile
{
	public static void main(String[] args)
	{
		int num = 0;
		int count = 0;
		
		do
		{
			num++;
			
			if((num % 5) != 0)
				continue; //false 여야 떨어진다
			if((num % 7) != 0)
				continue;
			
			count++;
			System.out.println(num);
		} while(num < 100);
		// 세미콜론을 붙이지 않으면 에러가 난다.
		System.out.println("count: "+ count);
	}
}
