
public class Ex11_AutoBoxingUnboxing1
{

	public static void main(String[] args)
	{
		// 오토 박싱
		Integer iObj = 10; //Integer.value(10)을 오토 박싱
		Double dObj = 3.14;
		
		// 오토 언박싱
		int num1 = iObj; 
		double num2 = dObj;
		
		System.out.println(num1 + " : " + iObj);
		System.out.println(num2 + " : " + dObj);
	}

}
