package ex18lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Ex06Define4Function
{
	public static void main(String[] args)
	{
		/*
		Function<T, E>
		: 매개변수와 반환값 둘다 가지고 있는 apply() 추상메서드가 정의
		가장 많이 사용한다
		
		interface Function<T, E> {
			E apply(T, t);
		}
		=> T는 매개변수, E는 반환타입으로 사용
		 */
		
		//매개변수는 String, 반환값은 Integer인 람다식을 정의
		//문자열의 길이(.length)를 반환
		Function<String, Integer> func = (String s) -> {
			return s.length(); // 오버라이딩
		};
		System.out.println("Lambda 문자열길이="+ func.apply("Lambda")); // 길이 6개

		//Human 객체 생성후 list<E> 컬렉션으로 변환
		Human p1 = new Human("케이윌", "남", 80);
		Human p2 = new Human("에일리", "여", 77);
		Human p3 = new Human("임재범", "남", 97);
		Human p4 = new Human("아이유", "여", 99);
		List<Human> list = Arrays.asList(p1, p2, p3, p4);
		
		//Human 객체를 인수로 받은 후 점수를 반환하는 람다식 정의
		Function<Human, Integer> getFunction = (Human h) -> {
			return h.getScore();
		};
		int score = getFunction.apply(p1);
		System.out.println("p1의 점수:"+ score); // 80점 출력
	
		System.out.println("### list에 저장된 객체의 점수 출력");
		
		//향상된 FOR문을 통해 컬렉션 전체를 반복하여 점수를 출력
		for(Human h : list)
		{
			System.out.println(h.getName() + "의 점수: "+ getFunction.apply(h));
		}
	}
}
