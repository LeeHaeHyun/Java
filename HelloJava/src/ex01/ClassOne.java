package ex01;

import java.util.Scanner;

class Triangle
{
	//멤버변수 : 밑변, 높이
	/*
	멤버변수의 직접적인 접근을 차단하기 위해 private으로 선언하는 것을
	정보은닉이라고 한다
	 */
	private int bottom;
	private int height;
	
	//멤버 메서드
	//멤버 변수 전체를 초기화 한다
	public void init(int _bottom, int height)
	{ // private을 간접적으로 불러오기 위해 해당 메소드를 만든다
		
		//매개변수와 멤버변수명이 다르므로 혼선이 없기에 this가 없어도 된다
		bottom = _bottom;
		//this는 멤버변수를 가리키는 키워드이다. height은 
		//Triangle의 멤버변수와 일치하기에 this를 붙여서 구분해준다.
		this.height = height;			
	}
	
	// 우클릭 소스 - getter, setter를 누른다 - setter만 생성한다.
	// private이므로 간접적으로 접근하기 위해 필요하다.
	public void setBottom(int bottom)
	{
		this.bottom = bottom;
	}

	public void setHeight(int height)
	{
		this.height = height;
	}
	
	/*
	삼각형의 넓이는 밑변*높이*0.5 이므로 계산의 결과가 소수점으로 나올 수 있다
	따라서 int가 아닌 double형으로 설정해주어야 한다.
	 */
	public double getArea(int bottom2, int height2)
	{
		return bottom2 * height2 * 0.5;
	}
	
}

public class ClassOne
{
	
	public static void main(String[] args)
	{
		/*
		1. 밑변과 높이 정보를 저장할 수 있는 Triangle클래스를 정의해보자. 
		init메소드를 통해 밑변과 높이를 초기화한다.
		*/
		Triangle t = new Triangle(); //Triangle을 불러와준다. t라는 객체로 담는다.
		Scanner scan = new Scanner(System.in); // 사용자로부터 입력값을 받는다.
		System.out.println("밑변은 몇인가요? : ");
		int bottom = scan.nextInt(); // bottom(밑변)으로 저장
		System.out.println("높이은 몇인가요? : ");
		int height = scan.nextInt(); // height(높이)로 저장
		t.getArea(bottom, height); // t클래스 객체에 포함된 getArea를 호출해서 밑변과 높이를 보낸다.
		System.out.println("삼각형의 넓이 : "+ t.getArea(bottom, height));
		System.out.println("임의로 변경한 값의 삼각형 넓이 : "+ t.getArea(5, 10));
	}

}
