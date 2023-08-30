
public class Ex06_Substring
{

	public static void main(String[] args)
	{
		String str1 = "AppleBananaOrange";
		int num1 = str1.indexOf("Banana"); // B는 5번째다, Banana 시작 위치 반환
		int num2 = str1.indexOf("Orange"); // O는 11번째다. Orange 시작 위치 반환
		
		/*
		 substring() : 시작인덱스와 마지막 인덱스 사이의 문자열을 잘라서 반환
		 방법1 : 인덱스 하나만 사용 
		 방법2 : 시작 인덱스, 종료 인덱스를 사용
		 */
		String str2 = str1.substring(num1, num2); // 애플과 오렌지 사이 출력, 5~10까지 반환
		System.out.println(str2);
		
		String str3 = str1.substring(num2); // 11부터 끝까지 반환 
		System.out.println(str3);
	}
}
