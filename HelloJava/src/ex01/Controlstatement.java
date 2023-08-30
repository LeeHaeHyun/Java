package ex01;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Controlstatement
{
	public static void main(String[] args) throws IOException
	{
		/*
		1. 입력을 받아서 월요일~일요일까지 주말과 주중을 판단하는 프로그램을 만드시오
		*/
//		String yoil = ""; // yoil이란 스트링을 담을 수 있는 그릇
//		System.out.println("월 화 수 목 금 토 일 중 하나만 입력하시오: ");
//		Scanner scan = new Scanner(System.in); // 입력값을 스캔한다.
//		yoil = scan.next(); // yoil에 저장한다.
//		switch (yoil) // switch > yoil을 검사한다.
//		{
//			case "월":case "화":case "수":case "목":case "금":
//				System.out.println("주중입니다"); // 월화수목금일때 주중
//				break;
//			case "토":case "일":
//				System.out.println("주말입니다"); // 토일일때 주말
//				break;
//			default: // 그 외는 default
//				System.out.println("잘못 입력하셨습니다. 다시 확인해주세요.");
		
		/*
		2. 정수를 입력받아서 팩토리얼을 출력하는 프로그램을 만드시오
		*/
		
		//팩토리얼 설계 : 자신으로부터 하나씩 뺴면서 곱하는 특성 
//		System.out.print("[팩토리얼] 정수를 입력해주세요:");
//		Scanner scanner = new Scanner(System.in);
//		long pac = scanner.nextInt();
//		long su = 1; // 1을 곱해야 자기 자신이 나오는 특성
//		
//		// false라면 빠져나간다. ★ 반복 조건: 이것이면 안되는 예외적인 사항을 조건으로 넣어준다.
//		while (pac != 0) 
//		{
//			su *= pac; // pac * su = su (su에 누적)
//			pac--; // pac을 하나씩 뺀다
//		}
//		System.out.println("팩토리얼: " + (long)su);
		
		/*
		3. 정수를 입력받아 1부터의 합을 출력하는 프로그램을 만드시오
		*/
//		System.out.println("1부터 합을 구할 정수를 입력하세요: ");
//		Scanner scan = new Scanner(System.in);
//		int on = scan.nextInt(); // 입력값
//		//자신에서 1씩 더하면서 누적해가는 특성
//		int su = 0; // 0부터 누적시킨다.
//		int sum = su; // 연산을 하려면 그릇 2개가 필요하다
//		do
//		{
//			sum += su; // su + sum = su
//			su++; // su를 1씩 계속 더하면서 sum에 누적
//		} while ( su <= on ); // su가 입력값보다 커지면 탈출(false) 
//		System.out.println(sum);
				
		/*
		4. 정수를 계속 입력받아서 0을 입력하면 그 동안의 입력한 
		숫자를 모두 더하는 프로그램을 만드시오
		*/
//		Scanner scan = new Scanner(System.in);
//		int num, count=1, sum=0; // 입력값, 세는값, 누적값 그릇을 만든다.
//		do
//		{
//			System.out.println(count+"번째 정수 입력(0 종료):");
//			num = scan.nextInt(); //입력 받은 값을 num에 저장
//			sum += num; // 입력한 num을 sum에 누적해서 계속 더해감
//			count++; // 계속해서 카운트함
//		} while (num != 0); // 0을 입력할 경우 빠져나온다 
//		System.out.println("입력한 숫자의 총합: " + sum); // 누적된 값을 보인다.
		
		/*
		5. 입력한 숫자의 구구단을 출력하는 프로그램을 만드시오
		*/
//		System.out.println("1~9중 하나의 구구단 출력: ");
//		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
//		for (int dan = num; dan <= num; dan++) // 단을 입력한 단부터 시작하여, 입력한 단까지를 출력
//		{
//			for (int su = 1; su <= 9; su++) // 1부터 시작하여 1개씩 터지면서 9까지 출력
//			{
//				System.out.print(dan + "*" + su + " = "  + (dan*su)); // 출력 형태를 만든다.
//				System.out.println();
//			}
//		}
		/*
		6. 문자 하나를 입력받아 숫자인지 숫자가 아닌지 판단하는 프로그램을 만드시오
		*/
//		System.out.println("하나의 문자를 입력해주세요: ");
//		
//		int c = System.in.read();
//		
//		//if문으로 구현
//		if(c>='0' && c<='9') {
//			System.out.println("숫자입니다.");
//		}
//		else {
//			System.out.println("숫자가 아닙니다.");
//		}
		
		/*
		7. 로또번호를 생성하는 프로그램을 만드시오 (정렬 포함)
		*/
//		int[] lotto = new int[6];  // lotto라는 6개 정수 그릇이 담긴 배열
//		Random random = new Random(); // 랜덤을 생성한다.
//		
//		// 랜덤번호 생성
//		for (int i = 0; i < lotto.length; i++) // 로또라는 그릇 6개보다 작은 0~5까지를 의미
//		{
//			lotto[i] = random.nextInt(45) + 1; // 0번째부터 시작하므로 0~44 범위에서 +1을 해준다.
//			// 중복번호 제거
//			for (int j = 0; j < i; j++) // j번째가 i번째를 탐색
//			{
//				if(lotto[i] == lotto[j]) // 같은 숫자라면
//				{
//					System.out.println("이 숫자가 겹쳐서 뺐어요 --> "+lotto[i]);
//					i--;
//					break;
//				}
//			}
//		}
//		// 선택 정렬
//		for (int i = 0; i < lotto.length; i++) 
//		{
//			for(int j = i + 1; j < lotto.length; j++) 
//			{
//				if(lotto[i] > lotto[j]) 
//				{
//					int temp = lotto[i]; // temp라는 임의의 그릇을 만들어 내려놓고 바꾸는 식으로 처리
//					lotto[i] = lotto[j];
//					lotto[j] = temp;
//				}
//			}
//		}
//		// 랜덤 번호 출력
//		System.out.println("※ 로또번호 : "+ Arrays.toString(lotto)); // 배열을 재정의한다.
		
		/*
		8. '1+1=' 이라는 문제를 내고 2라고 맞출때까지 반복하는 프로그램을 만드시오
		*/
//		String name = ""; // 빈 문자열 그릇을 만들어준다.
//		do
//		{
//			System.out.println("1+1=");
//			Scanner scanner = new Scanner(System.in);
//			name = scanner.next();		
//		} while(!(name.equals("2"))); // 입력값이 2가 아닐 경우 반복
//
//		System.out.println("정답입니다"); // 2라면 정답
		
		/*
		9.두 정수를 입력받아 큰 수에서 작은 수로 뺄셈을 출력하는 프로그램을 만드시오
		*/
//		System.out.println("두 개의 정수를 입력하시면 뺄셈을 출력합니다.");
//		Scanner scan = new Scanner(System.in);
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		if (num1 > num2)
//		{
//			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
//		}
//		else
//		{
//			System.out.println(num2 + " - " + num1 + " = " + (num2-num1));
//		}
		/*
		10. 별을 찍어 다이아몬드 모양을 출력하시오
		*/
	    System.out.println("다이아몬드닷!");
        for(int i=1; i<=5; i++) {   	        // 상단 
            for (int j=1; j<=5-i; j++) {
                System.out.print("  "); //공백
            }
            for (int j=1; j<=i*2-1; j++) { //나머지 별로 채우기.
                System.out.print("* "); 
            }
            System.out.println();
        }
        for(int i=4; i>0; i--) {    //하단 
            for (int j=4; j>=i; j--) {
                System.out.print("  "); //공백
            }
            for (int j=1; j<=i*2-1; j++) {
                System.out.print("* "); 
            }	                
            System.out.println();
        }		
	}	
}
