package ex18lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
자바에서 제공하는 기본 함수형 인터페이스는 아래 4가지 정도가 있습니다
차이점은 매개변수의 유무와 리턴값 정도이다.

< ★ 자주 사용한다 >
predicate<T> : 매개변수 O, 리턴값 boolean
Supplier<T> : 매개변수 X, 리턴값 O
Consumer<T> : 매개변수 O, 리턴값 X
Function<T, R> : 매개변수 O, 리턴값 O

 */
public class Ex06Define1Predicate
{
	public static void main(String[] args)
	{
		// Human객체를 생성한다
		Human p1 = new Human("케이윌", "남", 80);
		Human p2 = new Human("에일리", "여", 77);
		Human p3 = new Human("임재범", "남", 97);
		Human p4 = new Human("아이유", "여", 99);

		/*
		인터페이스에 정의된 test() 추상메서드를 오버라이딩해서 아래와 같은 람다식
		매개변수로 Human객체를 전달, 성별 파악해서 남자면 true, 여자면 false
		 */
		Predicate<Human> pre = (Human h) -> {
			return h.getGender().equals("남");
		};
		System.out.println("p.test(p1) => " + pre.test(p1));
		System.out.println("p.test(p2) => " + pre.test(p2));
		
		/*
		인자로 주어진 4개의 객체를 list 컬렉션으로 반환한다
		해당 컬렉션은 값을 변경할 수 없고 참조만 가능(배열)
		 */
		List<Human> list1 = Arrays.asList(p1, p2, p3, p4);
		
//		람다식을 정의하고 참조변수는 aaa를 전달하는 것
		double maleAvg = avg((Human h) -> h.getGender().equals("남"), list1);
		System.out.println("남자 평균:"+ maleAvg);
		
		double femaleAvg = avg((Human b) -> b.getGender().equals("여"), list1);
		System.out.println("여자 평균:"+ femaleAvg);
	}
	
	/*
	매개변수로 성별을 판단하는 람다식과 list 컬렉션을 전달 받는다
	 */
	public static double avg(Predicate<Human> ph, List<Human> li)
	{
		int pCount = 0;
		int tCount = 0;
		//컬렉션에 저장된 Human 객체의 갯수만큼 4번 반복
		for(Human h : li)
		{
			// 람다식을 통해 각 human 객체의 성별을 판단
			if(ph.test(h)== true)
			{
				// 각 성별을 판단한 후 + 합니다
				pCount++;
				tCount += h.getScore();
			}
		}
		return (double)tCount / pCount;
	}
}
