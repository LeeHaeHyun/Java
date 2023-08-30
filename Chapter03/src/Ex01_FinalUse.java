public class Ex01_FinalUse
{
	public static void main(String[] args)
	{
		//상수는 변하지 않는 메모리의 종류
		//상수는 딱 1번만 초기화가 된다.
		//변수에 Final을 붙여주면 상수화
		
		//int라는 4바이트 공간을 먼저 만들어줌
		final int Max_NUM = 100; // 선언과 동시에 초기화
		final int MIN_NUM; // 선언만
		//System.out.println(MIN_NUM); //상수인데 값이 없어서 에러
		
		//코드가 길어지면 못찾을 수 있어서 초기에 설정 권장
		MIN_NUM = 60; //나중에 초기화. 딱 한번만 가능
		
		int myScore = 40;
		
		if (myScore < MIN_NUM) // 가독성이 좋음(가장 작은 수)
		{
			System.out.println("당신의 등급은 F입니다.");
		}
	}
}