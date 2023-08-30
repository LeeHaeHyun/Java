package ex18lambda;

import java.util.function.Consumer;

public class Ex06Define3Consumer
{
	public static void main(String[] args) 
	{
		/*
		Consumer<T>
		: 매개변수는 있으나 반환값이 없는 accept() 추상메소드가 정의
		즉, 매개변수를 소비하는 형태로 리턴값이 없어서 단순 출력만 한다
		
		interface Consumer<T>
		{
			void accept(T t);
		}
		 */
		Consumer<String> c1 = (String s) -> {
			System.out.println(s +" 는(은) 가수입니다.");
		};
		c1.accept("케이윌"); // 위 메소드를 부른다
				
		Consumer<String> c2 = t -> {
			System.out.println(t +" 는(은) 과일입니다.");
		};
		c2.accept("Strawberry");	
	}
}