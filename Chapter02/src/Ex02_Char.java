public class Ex02_Char
{
	public static void main(String[] args)
	{
		//short 2바이트, char도 2바이트인데 서로 다르다. 정수형과 문자형으로 형태가 다르다. 
		//하지만 int형(4바이트)보단 작다
		//char은 '(싱클쿼테이션)으로 감싸서 표현, "(더블쿼테이션)으로 
		//감싸면 에러 string으로 선언해야 한다.
		
		char ch1 = 'A'; //한글자만 가능
		String ch5 = "A"; //String으로 선언(")
		
		char ch2 = 65; //char로 선언했기에 아스키코드로 변환하여 출력
		char ch3 = 0x41; //A를 16진수로 표현
		char ch4 = 0b0000000001000001; //A를 2진수로 표현한 것
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
	}
}

//아스키코드 : 1바이트로 표현할 수 있는 문자
//유니코드 : 2바이트로 표현할 수 있는 문자