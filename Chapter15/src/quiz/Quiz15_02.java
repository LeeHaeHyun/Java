//문제2
//char형 1차원 배열을 선언과 동시에 'Good time' 문장으로 초기화하고, 저장된 내용을 출력하라.

package quiz;

public class Quiz15_02
{
	public static void main(String[] args)
	{
		char[] seed = new char[] {'G','O','O','D',' ','T','I','M','E'};
		
		for(int i=0; i<seed.length; i++)
		{
			System.out.print(seed[i]);
		}
	}
}
