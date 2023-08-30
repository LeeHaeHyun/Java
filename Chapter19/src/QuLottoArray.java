import java.util.Arrays;
import java.util.Random;

public class QuLottoArray
{
	//전역변수 난수 생성
	static Random rnd = new Random();
	public static void main(String[] args)
	{
		// 로또 배열 6개 만들기
		int[] lotto = new int[6];
		
		// 로또 1~45까지 뽑아서 나열
		for (int i = 0; i < lotto.length; i++)
		{
			lotto[i] = rnd.nextInt(45) + 1; // 0~44까지이므로 +1
			
			// 중복 제거
			for (int j = 0; j < i; j++) // j는 i의 이전번째와 비교
			{
				if (lotto[i] == lotto[j]) // i와 j가 같으면
				{
					i--; //i번째를 뺀다
					break;
				}
			}
		}
		// 오름차순 정렬
		for (int i=0; i < lotto.length; i++)
		{
			for (int j=i+1; j < lotto.length; j++) // i의 다음번째와 i를 비교
			{
				if (lotto[i] > lotto[j]) // j가 i보다 크면
				{
					int temp = lotto[i]; 
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}			
			}				
		}	
		System.out.println("*로또번호 : " + Arrays.toString(lotto));
	}
}
