import java.util.Random;

public class Ex14_RandomUse
{

	public static void main(String[] args)
	{
		//Random 클래스는 객체 생성시 seed(씨앗)을 기반으로 난수를 생성
//		만약 동일한 seed를 사용하면 항상 같은 패턴의 난수가 생성되는데 이를 가짜 난수라고 한다
		// 매번 다른 수가 나옴
		Random rand1 = new Random();
		/*
		nextInt(N) : 0~N-1까지의 난수가 생성된다
		 */
		for(int i = 0; i < 10; i++)
			System.out.print(rand1.nextInt(45) + " ");
		System.out.println();
		
		// 가짜난수 : 같은 패턴의 난수만 생성됨. ex) 발표회
		// 매번 같은 순으로 값이 나옴
		Random rand2 = new Random(10);
		
		for(int i = 0; i < 10; i++)
			System.out.print(rand2.nextInt(10) + " ");
		System.out.println();
		
		/* 추가
		씨드를 부여하려면 setSeed() 메서드를 사용합니다. 이 때 현재시간을
		밀리세컨즈 단위로 반환하는 메서드를 사용하면 편리합니다. 시간은 계속
		흘러가므로 항상 새로운 Seed를 생성할 수 있다.
		 */
		
		//밀리세컨즈 단위로 많이 쓴다
		System.out.println("\n# 난수생성 2 : 변화하는 시간으로 씨드지정");
		Random random3 = new Random();
		random3.setSeed(System.currentTimeMillis()); // 밀리세컨즈로 랜덤
		for (int i = 0; i < 10; i++)
		{
			System.out.print(random3.nextInt(100)+" ");
		}
		
		/*
		nextInt()에 인수가 없는 경우엔느 음수, 양수가 혼용된 난수가 생성된다
		 */
		System.out.println("\n# 난수생성 3 :nextInt() 인수 없음");
		Random random4 = new Random();
		for (int i = 0; i < 10; i++)
		{
			System.out.print(random4.nextInt()+" ");
		}
	}
}
