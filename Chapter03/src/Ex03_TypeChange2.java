//CPU는 INT, DOUBLE 계산기 밖에 없다

public class Ex03_TypeChange2
{

	public static void main(String[] args)
	{
		int num1 = 2147483647; //2^16 => 0~2147483647 디폴트가 int
//		int num2 = 2147483648; //int의 범위를 초과해서 에러
//		long num3 = 2147483648; //정수는 int밖에 없다. 별도의 L 표시를 해주어야 한다.
		long num4 = 2147483648L; //뒤에 l을 붙여야 long 인식
		
//		float num5 = 1.0; //디폴트가 double 그래서 에러(실수는 DOUBLE밖에 모른다)
		float num6 = 1.0F; //f로 float이라고 표시
		
		double num7 = 30; // int > double 자동 형변환
		
//		아래와 같은 오류가 날 수 있으므로 너무 값이 클 때만 사용, 게임등
//		앞에 1바이트에 아무런 값이 없을때만 형변환 권장
//		0000 0000 (이럴때 형변환한다. ) 0000 0001
		long num8 = 3000000007l;
		int num9 = (int)num4; //큰 수의 형변환은 조심해야 한다.
		System.out.println(num9); //int 범위를 벗어나면 다시 처음 범위로 돌아와서 샌다.(음수)
		
//		문자는 메모리 저장하면 아스키코드로 저장되므로 INT형과의 연산을 한 후 문자로 표현하고 싶다면
//		Char형으로 강제형변환 후 출력한다
		
		char ch3 = 'A', ch4;
		int num10=2;
//		ch4 = ch3 + num10; char +int(정수) 와의 연산은 안되서 에러
//		하나로 통일해야 연산이 가능하다
		ch4 = (char)(ch3 + num10);
		System.out.println("ch4 ="+ ch4);
		
		
	}
}
