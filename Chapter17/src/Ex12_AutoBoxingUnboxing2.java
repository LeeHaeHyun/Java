
public class Ex12_AutoBoxingUnboxing2
{

	public static void main(String[] args)
	{
		//wrapper 클래스
		Integer num = 10; // 오토 박싱 
		
		num++; // Integer.valueOf(num.intValue() + 1); 정수로 언박싱하여 +1, 그리고 다시 박싱
				// <--- 오토 박싱과 오토 언박싱 동시에 진행
		
		System.out.println(num);
		
		num += 3; // Integer.valueOf(num.intValue() + 3);
		System.out.println(num);
		
		//객체이지만 정수처럼 연산이 가능하다 
		int r = num + 5; // 오토 언박싱 진행, num은 주소값
		Integer rObj = num - 5; // 오토 언박싱 진행 -> 오토 박싱 진행
		
		System.out.println(r);
		System.out.println(rObj);

	}

}
