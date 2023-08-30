package ex01;

import java.util.Scanner;

public class Operator
{

	public static void main(String[] args)
	{
//		1. 정수 2개를 입력받아 사칙연산을 
//		출력하는 프로그램을 만드시오.
		
//		System.out.print("정수 2개를 입력해주세요: ");
//		Scanner scan = new Scanner(System.in);
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		System.out.println("▶ 덧셈: " + (num1+num2));
//		System.out.println("▷ 뺄셈: " + (num1-num2));
//		System.out.println("▶ 곱셈: " + (num1*num2));
//		System.out.println("▷ 나눗셈(몫): " + (num1/num2));
//		System.out.println("▶ 나눗셈(나머지): " + (num1%num2));
		
//		2. 국어(kor): 75점 영어(eng): 53점 수학(mat): 81점 
//		사회(sco): 38점 과학(sci): 62점 → 
//		5가지의 과목의 합계 평균을 출력하시오.
//		int kor = 75, eng = 53, mat = 81, sco = 38, sci = 62;
//		System.out.println("평균값: "+ (kor+eng+mat+sco+sci)/5);
		
//		3. 현이의 주민등록번호(891009-1577829)이다. 
//		주민등록번호의 앞자리와 뒷자리를 잘라서 
//		따로 출력하는 프로그램을 만드시오.
//		→ substring(index시작 , index끝);
		
//		String jumin = "891009-1577829";
//		System.out.println("주민 앞자리: " + jumin.substring(0,6));
//		System.out.println("주민 뒷자리: " + jumin.substring(7));
		
//		4. 사용자로부터 시급이 얼마? 하루 근무시간? 
//		한달 근무일수? 인센티브(보너스)?를 
//		입력받아 세금과 지급액을 출력하는 프로그램을 만드시오.
//		※ 지급액은 월급에서 세금 3.3%를 빼고 출력한다. 
//		(월급 x 0.967) < 100에서 0.033을 뺀 값
		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("시급: ");
//		int tpay = scan.nextInt();
//		System.out.print("(하루)근무시간: ");
//		int time = scan.nextInt();
//		System.out.print("(한달)근무일수: ");
//		int mon = scan.nextInt();
//		System.out.print("(보너스)인센티브: ");
//		int plus = scan.nextInt();
//		int sum = (tpay*time*mon+plus); //월급
//		int seg = (int)(sum * 0.033);//세금(int강제형변환)
//		System.out.println("세금: " + seg + "원");
//		System.out.println("지급액(월급): "+ (sum-seg)+ "원");
		
//		5. 사용자로부터 입력값을 받아서 사다리꼴의 면적을 
//		구하는 프로그램을 만드시오
//		<Hint> 사다리꼴 면적: (윗변 + 아랫변) * 높이 / 2
		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("윗변의 길이: ");
//		int up = scan.nextInt();
//		System.out.print("아랫변의 길이: ");
//		int down = scan.nextInt();
//		System.out.print("높이: ");
//		int np = scan.nextInt();
//		int sum = (((up+down)*np)/2);
//		System.out.println("사다리꼴 면적은 "+ sum +"입니다.");
		
//		6. 철수와 영희와 민수는 함께 외식을 하고 
//		똑같이 더치페이를 하기로 했다
//		삼겹살 3인분 된장찌개 2인분 사이다 5개 물냉면 2그릇 
//		돼지껍데기 5인분을 먹었다.
//		1인당 내야 할 금액을 출력하는 프로그램을 만드시오.
//		+ 삼겹살(1인분) 18750원 / 된장찌개(1인분) 7500원 / 
//		사이다(1개) 1280원 / 물냉면(1그릇) 9300원 / 
//		돼지껍데기(1인분) 10780원
		
//		int sam = 18750, dz = 7500, sda = 1280, 
//				mul = 9300, dgg = 10780;
//		int sum = (sam*3+dz*2+sda*5+mul*2+dgg*5);
//		System.out.println("총 " + sum +"원 나왔어요");
//		System.out.println("1인당 "+ sum/3 + "원씩 주세요");
		
//		7. x의 반환형이 정수(int)로 선언과 동시에 값을 
//		1234567로 초기화하고 삼항연산자를 이용해서 
//		x가 3의 배수이면서 7의 배수라면 '야호' 아니면 
//		  '아니여따' 를 출력하는 프로그램을 만드시오.
//		int x = 1234567;
//		String result = (x % 3 == 0 && x % 7 == 0) ? "야호" : "아니여따";
//		System.out.printf("결과: %s", result);
		
//		8. num01~04는 반환값이 int면서 7로 초기화한다. 
//		num2는 전위증가, num3은 전위감소
//		num4는 후위증가, num5은 후위감소를 출력하는 
//		프로그램을 만드시요.
		
//		int num01 = 7, num02 = 7, num03 = 7, num04 = 7;
//		int num2 = ++num01, num3 = --num02; 
//		int num4 = num03++, num5 = num04--;
//		System.out.printf("[전위] (증가)%d (감소)%d "
//				+ "\n[후위] (증가)%d (감소)%d",num2,num3,num4,num5);
		
//		9. 사용자로부터 문자 하나를 입력하는 값을 받고 
//		삼항연산자를 이용해서 첫번째 문자가 알파벳인지 아닌지 
//		판단하는 프로그램을 만드시오
//		알파벳이라면 알파벳이다. 아니면 알파벳이 아니다라고 출력되어야 한다.
		
//		System.out.println("문자 하나를 입력하세요: ");
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine(); //Scanner는 반환형을 문자(char)로 받을 수 없다.
//		char alpha = str.charAt(0); //str 문자열 형식에서 문자(char)로 변경 후 첫번째 글자만 담음
//		String result = ('a' >= alpha && alpha <= 'z') ? "알파벳이다." : "알파벳이 아니다.";
//		System.out.println("\'"+ str.substring(0,1) + "\'" + "은(는) " + result);
		
//		10. 시프트 연산자를 사용해서 22를
//		2배, 0.5배, 4배, n/2의2승배, 8배, n/2의3승배한 값을 출력하시오
		
		int num1 = 22;
		System.out.println(Integer.toBinaryString(num1)); //22의 2진수는 10110이다.
		System.out.print("num1의 2배: "); 
		System.out.println(num1 << 1);
		System.out.print("num1의 0.5배: "); 
		System.out.println(num1 >> 1);
		System.out.print("num1의 4배: "); 
		System.out.println(num1 << 2);
		System.out.print("num1의 n/2의 2승배: "); 
		System.out.println(num1 >> 2);
		System.out.print("num1의 8배: "); 
		System.out.println(num1 << 3);
		System.out.print("num1의 n/2의 3승배: "); 
		System.out.println(num1 >> 3);		
		
	}
}
