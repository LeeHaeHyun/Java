package ex01;

public class Var
{
	public static void main(String[] args)
	{
		/* 1번 문제: num1과 num2를 double 선언과 동시에 
		1.0000001과 2.0000001로 초기화하고 둘을 더하시오.*/
		double num1 = 1.0000001;
		double num2 = 2.0000001;
		System.out.println(num1+num2);
		
		/* 2번 문제: num3을 long으로 선언하고 22억으로 초기화 후 출력하시오.*/
		long num3 = 2200000000L;
		System.out.println(num3);
		
		/*3번 문제 : num4를 정수형으로 2147483647로 선언과 동시에 초기화하고 
		1을 더한 값을 출력하시오*/
		int num4 = 2147483647;
		System.out.println(num4+1);
		
		/*4번 문제 : 1+2의 값이 2가 맞는지 아닌지 참 거짓을 출력하시오.*/
		boolean num5 = (1+2==2);
		System.out.println(num5);
		
		/*5번 문제 : 대문자A와 소문자 a를 문자형 변수로 선언과 동시에 초기화하고
		둘을 더하여 정수로 출력해보시오*/
		char ch1 = 'A';
		char ch2 = 'a';
		System.out.println((int)ch1+ch2);
		
		/*6번 문제 : 국어 95 영어 5 수학 100을 kor, eng, math로 선언과 
		동시에 초기화를 하고 총점을 구하시오.*/
		int kor=95, eng=5, math=100;
		System.out.println(kor+eng+math);
		
		/*7번 문제 : 문자열 "장점이 있으면"과 "단점이 있고"와 
		 "단점이 있으면"과 "장점이 있다" 를 각각 선언하고 초기화하고 모두 줄에 출력하시오.*/
		String str1 = "장점이 있으면";
		String str2 = "단점이 있고";
		String str3 = "단점이 있으면";
		String str4 = "장점이 있다";
		System.out.println(str1+" "+str2+" "+str3+" "+str4+".");
	
	}
}
