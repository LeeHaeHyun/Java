public class ShortCircuitEvaluation
{
	public static void main(String[] args)
	{
//		최단거리 평가(SCE)
//		: 연산의 효율과 속도 향상을 위해 불필요한 연산은 하지 않는다.
		
		int x = 0;
		int y = 0;
		boolean result;
		
		// 앞이 false이므로 결과는 정해졌으므로 (y = y + 1) > 0 실행 안함
		result = ((x = x + 1) < 0) && ((y = y + 1) > 0);
		
		System.out.println("result = " + result);
		System.out.println("x = " + x);
		
		// 여기서 Y는 계산조차 안해서 초기값 0이다
		System.out.println("y = " + y + '\n');
		
		// 앞이 true이므로 결과는 정해졌으므로 (y = y + 1) > 0 실행 안함
		result = ((x = x + 1) > 0) || ((y = y + 1) > 0);
		
		System.out.println("result = " + result);
		System.out.println("x = " + x);
		// 여기서 Y는 계산조차 안해서 초기값 0이다
		System.out.println("y = " + y);
	}
}
