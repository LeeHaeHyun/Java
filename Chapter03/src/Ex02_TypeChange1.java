//형변환: 에러가 나는 것을 보는 예제
public class Ex02_TypeChange1
{

	public static void main(String[] args)
	{
		//자동형변환 : 작은 자료형 데이터를 큰 데이터에 넣는다
		
		int num1 = 1; // 4바이트
		byte num2 = 1; // 1바이트 0000 0001
		byte num3 = 127; //1바이트 끝수 2^8 => 0~127
//		byte num4 = 128; //2바이트짜리가 필요함, 그래서 에러
	
		short num5 = 1; // 2바이트, 0000 0000 0000 0001
		
		//명시적 형변환(강제 형변환) : 자료의 손실이 있을 수 있다. 
		//필요한 경우에만 사용
//		num2 = num5; // 1바이트에 2바이트 변수를 넣으려면 에러 발생
		num2 = (byte)num5; // 2바이트를 1바이트로 강제형변환 함. 에러 안남
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num5);
	}
}
