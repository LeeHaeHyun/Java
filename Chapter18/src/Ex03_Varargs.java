/*
가변 인자는 타입... 변수명과 같은 형식으로 선언하며
PrintStream 클래스의 printf()가 대표적인 예이다.
 */
public class Ex03_Varargs
{
	public static void helloEverybody(String... vargs) // 가변 인수 표시
	// ... 은 가변인자 vargs를 배율의 참조변수로 간주
	{
		for (String s : vargs) // 가변 인수 사용. 배열처럼 사용
			System.out.print(s + '\t');
		System.out.println();
	}
	public static void main(String[] args)
	{
		helloEverybody("홍길동"); // 매개변수로 전달되는 인자가 1개라도 가능
		helloEverybody("홍길동", "전우치"); // 매개변수로 전달되는 인자가 2개라도 가능
		helloEverybody("홍길동", "전우치", "손오공"); // 매개변수로 전달되는 인자가 3개라도 가능
	}
}
