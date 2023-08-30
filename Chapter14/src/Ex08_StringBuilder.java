
public class Ex08_StringBuilder
{

	public static void main(String[] args)
	{
//		//힙은 추가할때 이사를 해야 되서 주소값이 변경된다  
//		String buf = new String("동해물과"); //id=23
//		buf += "백두산이"; //추가하자마자 id=32로 주소값이 바뀐다
//		System.out.println(buf);
		
//		StringBuilder 클래스
//		: String클래스는 기존 문자열에 새로운 문자열 추가시 새롭게 생성된 메모리에 문자열 저장
//		★★★>> 문자열 변경이 많은 경우 SringBuilder을 사용하는 것이 좋다 (메모리 낭비를 막는다)
		
		//builder을 사용하면 주소값은 유지, 문자열만 늘어난다
		StringBuilder buf = new StringBuilder("동해물과");

		//append(): 문자열의 끝에 새로운 문자열을 연결		인덱스 0부터 시작
		buf.append("백두산이"); // append를 주로 사용, 추가
		System.out.println(buf.toString());
		
		buf.append(12345); // 추가
		System.out.println(buf.toString());
		
		buf.delete(0, 4); // 인덱스 0번째와 3번째 자리까지 삭제
		System.out.println(buf.toString());
		
		/*
		 replace : 특정 문자열을 찾아서 지정된 문자열로 변경
		 */
		buf.replace(4, 8, "ABC");
		System.out.println(buf.toString());
		
		buf.reverse(); // 순서 반전
		System.out.println(buf.toString());
	}
}
