/*
 다형성 : 참조변수의 타입에 따라 다양한 객체를 이용할 수 있는 특성
 단, 객체간에는 상속관계가 있어야 한다
 
 자식에서 오버라이딩한 메소드가 우선적으로 호출
 */
abstract class Calc
{
	int a = 5;
	int b = 6;
	
	abstract void plus(); // 추상 클래스 ( 오버라이딩을 위해 존재 )
}

class MyCalc extends Calc
{
	// 부모에서 정의한 메소드를 오버라이딩해서 재정의한 메소드
	void plus() { System.out.println(a + b); } // 오버라이딩
	void minus() { System.out.println(a - b); } // 기능 추가
}

public class Ex01_Polymorphism1
{

	public static void main(String[] args)
	{
		// 동질화 : 자신의 참조변수로 자신의 객체를 참조한다
		MyCalc myCalc = new MyCalc();
		
//		동질화의 경우 객체 전체를 접근할 수 있다
		myCalc.plus();
		myCalc.minus();
		
		/*
		 이질화 : 부모타입의 변수로 자식객체를 참조하는 것
		 만약 접근해야 한다면 자식 타입으로 강제형변환(다운캐스팅)해야 한다
		 */
		
		// 하위클래스 객체를 상위 클래스 객체에 대입
		Calc myCalc2 = new MyCalc(); // 부모 클래스를 자식으로 형변환
		
		myCalc2.plus(); // 자식 클래스에서 a+b로 오버라이딩했으므로 부모 클래스에서 쓸 수 있다
		
		// 자식 클래스에는 minus가 있지만 부모 클래스는 minus가 없기에 사용할 수 없다
//		myCalc2.minus();
		
//		부모로 자식에 접근하려면 강제형변환
//		myCalc2를 자식 타입으로 형변환 후 멤버변수에 접근해야 한다.
		((MyCalc)myCalc2).minus(); // 부모 클래스에 아무것도 없으므로 가능한 강제형변환

	}

}
