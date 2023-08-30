/*
 Wrapper 클래스
 : 기본자료형의 데이터를 인스턴스화(객체화)할 떄 사용하는 클래스
 Boxing 혹은 Unboxing을 통해 기본자료형의 데이터를 객체화한다
 */

public class Ex10_BoxingUnboxing
{

	public static void main(String[] args)
	{
		// 박싱
		Integer iObj = Integer.valueOf(10); // Integer.valueOf(10) : 이것이 박싱 // iObj : 주소값
		Double dObj = Double.valueOf(3.14); 
		
		// 메소드 호출을 통한 언박싱
		int num1 = iObj.intValue(); // iObj.intValue() : 이게 언박싱
		double num2 = dObj.doubleValue(); // : dObj 안의 주소값에 있는 3.14를 num2에 넣는다
		
		System.out.println(num1 + " : " + iObj); // 스태틱선언이 된 것은 기울임체로 변화한다
		System.out.println(num2 + " : " + dObj);
		System.out.println();
		
		// 래퍼 인스턴스 값의 증가 방법
		iObj = Integer.valueOf(iObj.intValue() + 10); // 주소를 바꿀 수 없으니 언박싱해서 바꾼 후 넣는다
		
		// 언박싱 먼저 한 후에 계산후에 박싱 전환
		dObj = Double.valueOf(iObj.doubleValue() + 1.2);
		
		System.out.println(iObj);
		System.out.println(dObj);
	}

}
