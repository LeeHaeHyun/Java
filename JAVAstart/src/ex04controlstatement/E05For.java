package ex04controlstatement;

/*
for : while 문과 같은 반복문으로 초기값, 조건식, 증감식이 한줄에
	있어 반복의 횟수를 명확히 알수 있는 반복문이다. 따라서 반복의 
	횟수가 정해져있을때 주로 사용한다.
	형식]
		for(초기값 ; 조건식 ; 증감식){
		   실행문;
	    }
   실행순서]
   	초기값 -> 조건확인-> true일때 실행 -> 증감식
   		-> 조건확인 -> 반복실행 
   		-> 조건이 false일때 for문 탈츨
*/
public class E05For
{
	public static void main(String[] args)
	{
		/*
		 for문의 실행순서
		 1. 반복을 위한 변수 i를 1로 초기화한다.
		 2. 조건식을 검사한다.
		 3. 조건이 true이면 실행문을 실행한다.
		 4. 증감식 실행
		 5. 조건을 검사(3,4,5 번을 횟수만큼 반복한다.)
		 6. 조건이 false일때 탈출한다,
		 */
		for(int i=1 ; i<=5 ; i++) {
			System.out.println("i="+ i);
		}
		
		/*
		 시나리오] 1~100까지의 합을 구하는 프로그램을 for 문을
		 	이용하여 작성하시오.
		 */
		// 누적합 저장용변수
		int sum = 0;
		// 변수 i가 1부터 100이하까지 반복하는 for문 구성
		for(int i=1 ; i<=100 ; i++) {
			// 증가하는 i를 sum에 누적해서 더한다.
			sum += i;			
		}
		System.out.println("1~100 까지의합:"+ sum);
		
		/*
		 시나리오] for문을 이용하여 1~10까지의 정수증 2의 배수의 합을
		 	구하는 프로그램을 작성하시오.
		 */
		/*
		방법1 : 1~10까지 10번 반복해서 if문을 통해 2의 배수를 찾은후 
		누적해서 더한다.
		 */
		int total = 0;
		for(int i=1 ; i<=10 ; i++) {
			if(i%2==0) {
				total += i;
			}				
		}
		System.out.println("1~10사 2의 배수의합(방법1):"+ total);
		
		/*
		방법2 : if문 없이 초기값을 0부터 시작하여 2씩 증가시킨다.
		 */
		total = 0;
		for(int i=0 ; i<=10 ; i+=2) {
			total += i;
		}
		/*
		 for문에서는 대부분 증감연산자(++,--)를 사용하지만, 필요에 따라
		 복합대입연산자를 통해 수치를 증감시킬수도 있다.
		 */
		System.out.println("1~10사이 2의 배수의합(방법2):"+ total);
		
		// for문으로 무한루프를 만들때는 아래와 같이 ;;으로 표현한다.
		int a = 1;
		for(;;) {
			System.out.println("나는 for문으로 만든 무한루프입니다."+a);
			a++;
			// 만약 탈출조건이 없으면 무한루프이므로 오류가 발생한다.
			if(a==10) break;
		}
		
		for(int j=0 ; j<=5 ; j++);
		
		{
			System.out.println("어랏...나는 누구? 여긴 어디?");
		}
		
//		System.out.println("위 for문에서 선언한 변수 j="+ j); 
		System.out.println("위 main함수 지역에서 선언한 "
				+ "변수 total="+ total);   // 자동으로 '+' 가 생김.
		
		int i=0;	
		for( ; i<=5 ; i++) {
			System.out.println("for문 안에서의 i값="+ i);
		}
		System.out.println("for문 밖에서의 i값="+ i);
		
		/*
		연습문제1] 구구단을 출력하는 프로그램을 for문으로 작성하시오.
		 */	
		System.out.println("행방향의 구구단 출력하기");
		// 단에 해당하는 for(2~9단까지 증가한다)
		for(int dan=2; dan<=9; dan++)
		{
			// 수에 해당하는 for문(1~9까지 증가한다.)
			for(int su=1; su<=9; su++)
			{
				// 구구단 출력 후 스페이스 한칸
				System.out.printf("%-2d*%-2d=%2d ", dan, su, (dan*su));
			}
			// 하나의 행을 출력한 후 줄바꿈 처리
			System.out.println(); 
		}
		
		/*
		연습문제1-2] 위 문제는 2단부터 9단까지 행으로 출력하는 형태이다.
			이번에는 열로 출력하는 형태로 변경해 보세요.
		 */	
		System.out.println("열방향의 구구단 출력하기");
		// 단에 해당하는 for(2~9단까지 증가한다)
		for(int su=1; su<=9; su++)
		{
			// 수에 해당하는 for문(1~9까지 증가한다.)
			for(int dan=2; dan<=9; dan++)
			{
				// 구구단 출력 후 스페이스 한칸
				System.out.printf("%-2d*%-2d=%2d ", dan, su, (dan*su));
			}
			// 하나의 행을 출력한 후 줄바꿈 처리
			System.out.println(); 
		}
		
		/*
		연습문제2] 다음의 출력결과를 보이는 for문을 작성하시오.
			출력결과
				0  0  0  1
				0  0  1  0
				0  1  0  0
				1  0  0  0
			해법 : row와 col를 더해서 5가 돨때 1을 출력한다. 
		 */	
		// row는 행에 해당한다.
		for (int row=1; row<=4; row++)
		{
			// col은 열에 해당한다.
			for (int col=1; col<=4; col++)
			{
				// 두개의 변수를 더해서 5가 될때만 1을 출력한다.
				if (row+col==5)
					System.out.print("1  ");
				else
					// 그 외에는 0을 출력한다.
					System.out.print("0  ");
			}
			// 하나의 행을 출력한 후 줄바꿈 처리
			System.out.println();
		}
	}
}