package ex18lambda;

import java.util.Random;

/*
매개변수는 있으나 반환값이 없는 추상메소드
: 두개의 문자열을 전달받아 연결해서 출력한다.
 */
@FunctionalInterface
interface StringConcat
{
	// 스트링 s1과 s2를 받을 수 있는 공간
	public void makeString(String s1, String s2);
}

/*
매개변수는 없으나 반환값은 있음
: 0~99사이의 난수를 생성하여 반환
 */
@FunctionalInterface
interface RandomNumber
{
	public int randomNum();
}

/*
매개변수도 있고 반환값도 있음
: 매개변수로 전달된 두 정수만큼의 구구단을 2차원 배열로 반환
 */
@FunctionalInterface
interface GugudanRange
{
	public String[][] guguString(int n1, int n2);
}

/*
 매개변수도 없고 반환값도 없음
 : 단순히 메뉴만 출력하는 기능
 */
@FunctionalInterface
interface MenuPrint
{
	public void onlyPrint();
}


public class Ex05ParamNReturn
{
	public static void main(String[] args)
	{
		System.out.println("### 람다식1");
		String s1 = "안녕하세요?";
		String s2 = "람다식입니다.";
		
		
		StringConcat sc = (x, y) -> {
			System.out.println(x + " " + y); // 오버라이딩 된 것
		};
		sc.makeString(s1, s2);
		
		System.out.println("\n### 람다식2");
		/*
		매개변수가 없는 람다식을 정의했기에 비어있는 소괄호로 표현
		 */
		RandomNumber randomNumber = () -> {
			Random random = new Random(); // 오버라이딩
			return random.nextInt(100);
		};
		
		// 반환값이 있으므로 좌측항의 변수로 할당
		int rNumber = randomNumber.randomNum();
		System.out.println("생성된 난수:" + rNumber);
		
		System.out.println("\n### 람다식3");
		GugudanRange gugudanRange = (num1, num2) -> { // 오버라이딩
			//2차원 배열을 선언한 후 구구단을 각 원소에 삽입
			String[][] gugudan = new String[9][9];
			//num1 단에서 num2단까지만 반복한다.
			for (int i=num1; i<=num2; i++) // 4단에서 6단까지 반복한다(오버라이딩) : 대입
			{
				for (int j=1; j<=9 ; j++)
				{
					gugudan[i-1][j-1] = i+"*"+j+"="+(i*j);
				}
			}
			//배열의 참조값이 반환
			return gugudan;
		};
		
		//람다식 호출시 두 정수를 인수로 전달한 후 이차원 배열의 반환값을 받음
		String[][] returnStr = gugudanRange.guguString(4, 6);
		
		//4단에서 6단까지 출력
		for (int i=4 ; i<=6 ; i++) //: 호출을 한 for문
		{
			for (int j=1 ; j<=9 ; j++)
			{
				System.out.print(returnStr[i-1][j-1]+" "); //0행부터 출력
			}
			System.out.println();
		}
		
		// 단순히 문자열만 출력하는 람다식
		System.out.println("\n### 람다식4");
		MenuPrint menuPrint = () -> {
			System.out.println("메뉴를 출력합니다");
		};
		menuPrint.onlyPrint();
	}
}
