package ex18lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Ex06Define2Supplier
{

	public static void main(String[] args) {
		/*
		Supplier<T>
		: 공급자라는 의미를 가지고 있따.
		매개변수는 없으나 리턴값은 있는 get() 추상메서드가 정의되어있다
		 */
		//0~99까지 난수를 생성한 후 반환해주는 람다식 정의
		Supplier<Integer> sup = () -> {
			Random random = new Random();
			return random.nextInt(100);
		};		
		
		//추상메서드인 get()을 호출
		int rNum = sup.get();  
		System.out.println("생성된난수="+ rNum);		
		
		//난수를 생성하는 람다식 sup과 정수 10을 인수로 전달
		List<Integer> list = makeRandomNum(sup, 10);
		
	//리스트 자체를 반복문 없이 출력할 수 있다. toString() 메소드가 이미 오버라이딩 되어 있어서 출력
		System.out.println(list);
	}
				
	/*
	 매개변수로 전달된 람다식을 통해 난수를 생성한다. 이때 cnt만큼 반복하게 되므로
	 결국 난수 10개를 생성하여 list컬렉션에 저장한 후 반환
	 */
	public static List<Integer> makeRandomNum(Supplier<Integer> s, int cnt)
	{
		List<Integer> li = new ArrayList<Integer>();
		for(int i=1 ; i<=cnt ; i++)
		{
			/*
			람다식의 get()메서드 호출을 통해 난수를 생성하게 된다.
			 */
			li.add(s.get());
		}
		return li;
	}
}
