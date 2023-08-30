
public class Ex07_Number
{

	public static void main(String[] args)
	{
		//Integer num1 = new Integer(20); // <= 과거에 사용하였음
		Integer num1 = Integer.valueOf(20);
		
		//현재에는 이 표현으로만 사용함, 숫자만 사용 "숫자"(문자열) 도 숫자로 사용가능
		System.out.println(num1.intValue()); // 정수로 변경
		System.out.println(num1.doubleValue()); // 실수로 변경
		
		Double num2 = Double.valueOf(3.14);
		System.out.println(num2.intValue()); // 정수로 변경
		System.out.println(num2.doubleValue()); //실수로 변경


	}

}
