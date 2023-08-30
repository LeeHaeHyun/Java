class Camp7<T1, T2> // 대부분 한글자로 많이 사용 ( 제네릭의 T )
{
	private T1 param1;
	private T2 param2;
	
	public void set(T1 o1, T2 o2)
	{
		param1 = o1;
		param2 = o2;
	}
	
	@Override
	public String toString() // 오버라이딩한 것, 하지 않으면 주소값이 나온다
	{
		return param1 + " & " + param2;
	}
}
public class Ex07_MultiParameter
{

	public static void main(String[] args)
	{
		Camp7<String, Integer> camp = new Camp7<>(); 
		camp.set("Apple", 25); // param1은 string, param2는 Integer로 입력
		System.out.println(camp);
	}
}
