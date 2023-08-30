
public class Ex08_parseXXX
{

	public static void main(String[] args)
	{
		/*
		 parseInt() : 숫자 형식의 문자열을 정수로 변경
		 parseDouble() : 실수형으로 변경
		 */
		
		String str = "100"; // 스트링 주소가 있는 "100" 문자 ( 힙 영역 )
		int a = Integer.parseInt(str); // 문자열에서 숫자로 변환 ( 스택 영역 )
		double b = Double.parseDouble("3.14"); // 문자열에서 실수로 변환 ( 스택 영역 )
		
		System.out.println(a + " : " + b);
		
		/* 추가
		 문자열을 숫자로 변경할때는 반드시 숫자형식만 기술해야 한다
		 "원:은 숫자가 아니므로 예외가 발생한다*/
		
		String money = "120원";
//		System.out.println("120원 : " + Integer.parseInt(money)); // 런타임 에러 ( 원 때문에 )
	}
}
