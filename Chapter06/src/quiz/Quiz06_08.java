//문제 06-08
//구구단을 출력하되 짝수단만 출력하도록 프로그램을 작성하라.
//단, 2단은 2*2까지만, 4단은 4*4까지만....8단은 8*8까지만 출력해야 한다.

package quiz;

public class Quiz06_08
{

	public static void main(String[] args)
	{
		for (int dan = 2; dan < 10; dan++) // 2단=> 행을 출력
		{
			for (int su = 1; su <= dan; su++) // 행 숫자보다 같거나 작은 만큼 출력
			{
				if ((dan % 2) == 0) // 단은 짝수만 출력
				{
					System.out.print(dan + "*" + su + " = "  + (dan*su));
					System.out.println();
				}
			}
		}
	}
}
