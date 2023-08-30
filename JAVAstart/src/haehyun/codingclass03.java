package haehyun;

import java.util.Arrays;
import java.util.Random;

public class codingclass03
{

	public static void main(String[] args)
	{
		int[] lotto = new int[6];
		Random random = new Random();
		
		// 랜덤번호 생성
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(45) + 1; // 0번째부터 시작하므로 0~44 범위에서 +1을 해준다.
			// 중복번호 제거
			for (int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j])
				{
					System.out.println("이 숫자가 겹쳐서 뺐어요 --> "+lotto[i]);
					i--;
					break;
				}
			}
		}
		// 선택 정렬
		for (int i = 0; i < lotto.length; i++) {
			for(int j = i + 1; j < lotto.length; j++) {
				if(lotto[i] > lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		// 랜덤 번호 출력
		System.out.println("※ 로또번호 : "+ Arrays.toString(lotto));
	}
}
