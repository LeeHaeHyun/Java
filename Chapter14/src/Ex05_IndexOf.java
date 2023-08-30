
public class Ex05_IndexOf
{
	public static void main(String[] args)
	{
		String str = "AppleBananaOrange";
		
		/*
		 indexOF(): 문자열에서 특정 문자열의 시작 인덱스를 반환
		 존재하지 않으면 -1을 반환, 인덱스는 항상 0부터 시작
		 */
		int num1 = str.indexOf("a"); // 'a' 위치 반환 //Ba - a를 7번째 찾는다
		int num2 = str.indexOf("a", num1+1); // 첫 'a' 그 다음 "a" 위치 반환
		
		System.out.println(num1);
		System.out.println(num2);
	}
}
