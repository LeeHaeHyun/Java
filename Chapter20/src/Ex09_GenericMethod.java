class MyData
{
	public static <T> T showData(T data) // 여러개 오버로딩을 하지 않아도 됨
	{
		if (data instanceof String) // 들어온 것이 string이면 string 출력, interger이면 integer 출력
			System.out.println("String");
		else if (data instanceof Integer)
			System.out.println("Integer");
		else if (data instanceof Double)
			System.out.println("Double");
		return data;
	}
}
public class Ex09_GenericMethod
{
	public static void main(String[] args)
	{
		MyData.<String>showData("Hello World");
		MyData.showData(1); // <Integer> 생략
		MyData.showData(1.0); // <double> 생략
	}
}
