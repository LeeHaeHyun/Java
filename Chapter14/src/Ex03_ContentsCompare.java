
public class Ex03_ContentsCompare
{

	public static void main(String[] args)
	{
		String str1 = new String("Apple"); // 객체 생성 3개 다 주소값이 다르다
		String str2 = new String("apple");
		String str3 = new String("Banana");
		
		
		int cmp;
		
		/*
		equals()메소드
		: Object 클래스로부터 상속받은 메소드로 실제 저장된 문자열을 비교하도록 만들어진 메소드
		즉 아래는 객체에 저장된 실제 문자열에 대한 비교 ( 힙 영역의 내용을 비교 )
		 */
		if (str1.equals(str3))
			System.out.println("두 문자열은 같습니다");
		else
			System.out.println("두 문자열은 다릅니다");
		
		/*
		 compareTo(): 같으면 0 , 앞이 크면 1 , 뒤가 크면 -1 / 1(앞이 작음) -(compareTo) 2 (뒤가 큼)
		 첫문자부터 순차적으로 비교하면서 앞문자의 아스키코드가 크면 양수를 반환
		 뒷 문자의 아스키코드가 크면 음수로 반환 
		 */
		cmp = str1.compareTo(str2);
		
		if (cmp == 0)
			System.out.println("두 문자열은 일치합니다.");
		else if (cmp < 0)
			System.out.println("사전의 앞에 위치하는 문자: " + str1);
		else
			System.out.println("사전의 앞에 위치하는 문자: " + str1);
		
		// 대소문자 구분없이 비교
		if (str1.compareToIgnoreCase(str2) == 0)
			System.out.println("두 문자열은 같습니다");
		else
			System.out.println("두 문자열은 다릅니다");
	}
}
