//문제 06-04
//Do~While문을 이용하여 1~1000까지 더해서 결과를 출력하는 프로그램을 작성하시오.
//실행결과도 아래와같이 출력하시오.
//예)1+2+3.......+1000 = 500500

package quiz;

import java.util.Scanner;

public class Quiz06_04
{
	public static void main(String[] args)
	{
		System.out.println("정수 입력하시면 1부터의 합을 출력");
		Scanner scan = new Scanner(System.in);
		int on = scan.nextInt();
		//자신에서 1씩 더하면서 누적해가는 특성
		int su = 0;
		int gob = (su+1);		
		do
		{
			gob += su; // su + gob = su
			su++;
		} while ( su <= on );
		System.out.println(gob - 1);
	}
}
