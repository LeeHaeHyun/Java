//메서드(함수)
//static으로 선언된 메서드는 static만 호출할 수 있다
//메서드 호출 후 반환값은 호출한 위치로 간다
//반환값이 없는 것은 void형 메서드

public class Ex01_MethodType
{

	public static void main(String[] args)
	{
		// 매개변수가 없고 반환 없는 메서드
		sayHello();
		
		// 매개변수 있고 반환 없는 메서드
		addTwoNum1(5, 2);
		
		// 매게변수 없고 반환 있는 메서드
		int age = getAge();
		System.out.println(age);
		System.out.println( getAge() );
		
		// 매게변수 있고 반환 있는 메서드
		int sum = addTwoNum2(1, 2);
		System.out.println("합은 "+ sum);
	}
	
	public static void sayHello()
	{
		System.out.println("Hello");
	}
	
	public static void addTwoNum1(int num1, int num2)
	{
		int nResult = num1 + num2;
		System.out.println(nResult);
	}
	
	public static int getAge() //반환값이 int로 있다
	{
		return 20;
	}
	
	public static int addTwoNum2(int num1, int num2)
	{
		return num1 + num2;
	}
}
