
public class Ex03_Boolean
{

	public static void main(String[] args)
	{
		//논리형 boolean 1바이트
		//true, false 2가지값만 가진다. 스택 영역에 저장된다. (기본자료형)
		
		boolean check1 = true;
		boolean check2 = false;
		boolean check3 = (1 < 2);
		boolean check4 = (1 + 2 == 2);
		
		System.out.println(check1); // boolean으로 대입한 값 출력
		System.out.println(check2);
		System.out.println(check3);
		System.out.println(check4);
		System.out.println(1 > 2); // 연산의 결과를 출력
	}
}
