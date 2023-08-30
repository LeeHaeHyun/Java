public class Calculation1
{
//	에러를 보기 위한 예제
	public static void main(String[] args)
	{
		byte num11 = 1; //1바이트
		byte num12 = 2; //1바이트
//		byte result1 = num11 + num12; > int형 계산기밖에 없어서 byte가 안됨
	
		short num21 = 1; //2바이트
		short num22 = 2; //2바이트
//		short result21 = num21 + num22; > int형 계산기밖에 없어서 short도 안됨
		
		short result22 = (short)(num21 + num22); //강제 형변환
		System.out.println(result22);
	}
}