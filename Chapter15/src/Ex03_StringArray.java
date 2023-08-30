//String형 배열
public class Ex03_StringArray
{

	public static void main(String[] args)
	{
		/*
		 객체 배열 : 기본자료형이 아닌 객체의 참조값을 저장한 목적으로 생성한 배열
		 */
		
		//7개의 문자열을 담을 수 있는 배열
		String[] name = new String[7]; //String이라서 디버깅하면 null로 반환
		
		// 객체를 만들어 객체의 주소를 저장
		// 인덱스를 통해 접근 후 각 스트링으로 초기화
		name[0] = new String("홍길동"); // 스트링이라서 각 문자열에 주소가 생김 ( 주소의 주소값을 찾아가는 것 )
		name[1] = new String("전우치");
		name[2] = new String("손오공");
		name[3] = new String("강감찬");
		name[4] = new String("이순신");
		name[5] = new String("을지문덕");
		name[6] = new String("양만춘");
		
//		배열명.length : 배열의 크기를 반환
		int cnum = 0;
		
		//배열의 각 원소를 출력한다
		for (int i = 0; i < name.length; i++)
		{
			System.out.println(name[i]);
			cnum += name[i].length(); //각 문자열 길이를 더하는 것
		}
		
		System.out.println("총 문자의 수: " + cnum);
	}

}
