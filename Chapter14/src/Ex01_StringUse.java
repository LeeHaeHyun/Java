public class Ex01_StringUse
{
	public static void main(String[] args)
	{
		/*
		스트링 클래스의 객체 생성 방법
		:new를 이용한다. new를 통해 문자열 객체(인스턴스)를 생성하면
		동일한 문자열이라도 항상 새로운 메모리를 할당
		 */
		String str1 = new String("자바프로그래밍"); // 객체 생성 , 주소생성
		String str2 = new String("자바프로그래밍");
		
		/*
		스트링 클래스의 객체 생성방법2
		더블쿼테이션(")을 사용, 이 경우 내용이 동일하다면
		같은 주소를 사용, 새로운 메모리를 할당하지 않는다
		- 메모리 낭비를 하지 않으므로 아래와 같이 생성을 권유
		 */
		String str3 = "자바프로그래밍";
		String str4 = "자바프로그래밍"; //new가 없으니 동일한 문자열을 찾아서 같은 주소값 공간 사용
		
		System.out.println(str1); 
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		//객체만 생성
		String str5 = ""; //= new String();과 같다 ( 내용이 없는 방만 만들어주는 것 )

	}

}
