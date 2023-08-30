//지역변수
//사용범위를 가지고 있다.
//지역을 벗어나면 즉시 메모리에서 소멸
//기본자료형은 스택(stack)이라는 메모리 공간을 사용

public class Ex03_VariableScope
{
	
	public static void main(String[] args)
	{
		// 변수의 사용 가능 범위
		boolean myState = true;
//		int num1 = 11; // 에러가 발생하므로 주석
//		해결방법: 지역변수로 선언한다 
		
		if (myState)
		{
			int num = 22;
			num++;
			System.out.println("첫번째 if문 지역:"+ num);
		}
		else
		{
			int num = 33;
			num++;
			System.out.println("첫번째 if문의 else지역:"+ num);
		}
		System.out.println();
		int num = 20;
		System.out.println(num);
		
		for (int i=0; i<3; i++)
		{
			System.out.println(i);
		}
		//for문이 끝남으로써 i가 없어졌기에 에러가 난다
//		System.out.println(i);
		
		simpleFunc();
	}
	
	static void simpleFunc()
	{
		int num = 1000;
		System.out.println("simple메소드 지역 : " + num);
	}
}
