
public class Ex09_BreakLabel
{
// 레이블을 이용해서 통째로 반목문 중지
	public static void main(String[] args)
	{
		int sum = 0;

myExit: while (true) // 무한 반복, 레이블(라벨)로 myExit 지정
		{
			for (int i=0; i<100; i++)
			{
				sum = sum + i;
				if (sum > 2000)
				{
					System.out.printf("%d : %d\n", i, sum);
					break myExit; //한꺼번에 멈추고 싶다면 break 옆에 라벨
				}
			}			
		}
	}
}
