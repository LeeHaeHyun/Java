/*
 메소드 오버로딩 : 동일한 이름의 메소드를 2개이상 정의하는 것
 메소드+매개변수만 달라야 한다. 반환값만 다른 건 오버로딩 성립 불가
 */

class Calc
{
	int add(int a, int b)
	{
		return a + b;
	}
	int add(int a)
	{
		return a + 1;
	}
	double add(double a, double b)
	{
		return a + b;
	}
}

public class OverloadingUse
{
	public static void main(String[] args)
	{
		Calc calc = new Calc(); // 객체 생성
		
		//매개변수가 정수 2개인 매소드 호출
		int nRtn1 = calc.add( 3, 9 );
		//매개변수가 정수 1개인 매소드 호출
		int nRtn2 = calc.add( 3 );
		//매개변수가 실수 2개인 매소드 호출
		double nRtn3 = calc.add( 3.0, 9.0 );
		
		System.out.println("Rtn1 = "+ nRtn1);
		System.out.println("Rtn2 = "+ nRtn2);
		System.out.println("Rtn3 = "+ nRtn3);
	}
}
