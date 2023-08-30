//문제 06-03
//정수 하나를 입력받은 후 그 수의 팩토리얼 함수의 결과 를 출력하는 프로그램을 while문을 이용하여 구현하시오. 
//출력예) 
//입력정수 : 5 
//5*4*3*2*1 = 120

package quiz;

import java.util.Scanner;

public class Quiz06_03
{
	public static void main(String[] args)
	{
		//자신으로부터 하나씩 뺴면서 곱하는 특성 
		System.out.print("[팩토리얼] 정수를 입력해주세요:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int su = 1;
		while (num != 0) // false라면 빠져나간다. 반복 조건: 이것이면 안되는 예외적인 사항을 조건으로 넣어준다.
		{
			su *= num; // num * su = su (su에 누적)
			num--; // num을 하나씩 뺀다
		}
		System.out.println("팩토리얼: " + su);
	}
}
		
		