import java.util.Scanner;

public class MyCalculator
{
	public static void showMenu()
	{
		System.out.println("계산을 계속하려면 엔터를 눌러주세요");
		Scanner scanner = new Scanner(System.in);
		String rp = scanner.nextLine();
		if (rp.isEmpty() ) {
			System.out.println("================================");
			System.out.println("메뉴를 선택하세요.숫자를 입력하세요.꼭이요");
			System.out.println("1.더하기");
			System.out.println("2.빼기");
			System.out.println("3.곱하기");
			System.out.println("4.나누기");
			System.out.println("5.거듭제곱");
			System.out.println("0.끝내기");
			System.out.println("================================");
		}
	}
	
	public static void add()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 :");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 :");
		int num2 = sc.nextInt();
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
		System.out.println();
	}
	
	public static void substract()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 :");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 :");
		
		int num2 = sc.nextInt();
		
		int result = num1 - num2;
		System.out.printf("%d - %d = %d ", num1, num2, result);
		System.out.println();
	}
	
	public static void multiply()
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 :");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 :");
		int num2 = sc.nextInt();
		
		int result = num1 * num2;
		System.out.printf("%d * %d = %d ", num1, num2, result);
		System.out.println();
	}
	
	public static void divide()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 :");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 :");
		int num2 = sc.nextInt();
		
		if (num2 == 0)
		{
			System.out.println("0으로 나눌 수 없습니다.");
			return; // if문인 경우 continue 대신 사용
		}
		
		int result1 = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + result1 + " (몫)");
		int result2 = num1 % num2;
		System.out.println(num1 + " % " + num2 + " = " + result2 + " (나머지)");
		System.out.println();
	}

	public static void power()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 :");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 :");
		int num2 = sc.nextInt();
		
		int result = 1;
		for(int i=0; i<num2; i+=1)
		{
			result *= num1;
		}
		System.out.printf("%d의 %d 제곱 = %d ", num1, num2, result);
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		while (true)
		{
			showMenu();
			
			int num = sc.nextInt(); //입력받은 수를 가져와서 집어넣는다.
			if (num == 0)
			{
				System.out.println("계산기를 종료합니다.");
				break;
			} else
			{
				if(num > 5)
				{
					System.out.println("없는 메뉴입니다.");
					System.out.println("메뉴를 다시 선택하세요.");
					continue;
				}
				
				// 계산 진행
				if (num == 1)
					add();
				else if(num==2)
					substract();
				else if(num==3)
					multiply();
				else if(num==4)
					divide();
				else if(num==5)
					power();
			} 
					
		}
		System.out.println("==========================");
	}
}
