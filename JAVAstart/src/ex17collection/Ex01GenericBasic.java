package ex17collection;

//오렌지를 표현한 클래스
class Orange
{
	// 멤버 변수 : 당도를 표현
	int sugar;
	
	//생성자 
	public Orange(int sugar)
	{
		this.sugar=sugar;
	}
	
	// 멤버 메소드 ( 생성자가 아니므로 )
	public void showInfo()
	{
		System.out.println("오렌지의 당도는 "+ sugar +" 입니다");
	}
}

// 오렌지 전용박스 : Orange 객체만 저장할 수 있는 클래스
class OrangeBox
{
	// 멤버 변수 : 오렌지 객체
	Orange item;
	
	// 저장하다(setter 메소드) - this.item을 초기화하니까
	public void store(Orange item)
	{
		this.item = item;
	}
	
	// 꺼내다 - return 값이 있으므로
	public Orange pullOut()
	{
		return item;
	}
}

// 과일상자 : Object 기반으로 모든 객체(과일)을 저장할 수 있는 클래스
class FruitBox
{
	// 멤버 변수 : 모든 객체를 참조할 수 있따.
	Object item;
	// 생성자
	public FruitBox(Object item)
	{
		this.item = item;
	}
	
	//setter 메소드 ( this.x = x 초기화하면 setter 이다 )
	public void store(Object item)
	{
		this.item = item;
	}
	
	//getter 메소드 ( return 으로 반환하면 getter 이다 )
	public Object pullOut()
	{
		return item;
	}
}

public class Ex01GenericBasic
{
	public static void main(String[] args)
	{
		/*
		OrangeBox를 생성하고 orange객체를 저장한다.
		그리고 Orange를 꺼낸 후 정보를 출력한다
		 */
		OrangeBox oBox1 = new OrangeBox();
		Orange orange1 = new Orange(10);
		oBox1.store(orange1); // 오렌지 1의 값이 들어가 있음
		orange1 = oBox1.pullOut(); // oBox1.pullOut을 orange1에 넣는다
		orange1.showInfo();
		
		/*
		상자1은 오렌지 전용박스이므로 다른 과일을 저장할 수 없다
		컴파일 에러가 발생하므로 실행 자체가 불가능.
		(Orange item)이 들어오면 안된다. 스트링으로 들어왔으므로 에러를 낸다
		 */
//		oBox2.store("당도가 20인 오렌지") 
		Orange orange2 = oBox1.pullOut();
		orange2.showInfo();
		
		/*
		Object 기반으로 생성된 FruitBox는 구현에는 편리하나
		코드 개발에서 오류가 나지 않는다 그래서 오류를 찾아내기가 훨씬 더 어렵다.
		 */
		FruitBox fBox1 = new FruitBox(new Orange(20));
		Orange orange3 = (Orange)fBox1.pullOut();
		orange3.showInfo();
		
		/*
		해당 객체는 String이므로 문제가 없으나 꺼내서 사용할 때 형변환에서 예외가 발생
		런타임 에러가 발생
		★★★ sugar는 int형인데 string을 받았기 때문에 런타임 에러가 발생한다
		 */
//		FruitBox fBox2 = new FruitBox("당도가 30인 오렌지");
//		Orange orange4 = (Orange)fBox2.pullOut(); // 형변환이 스트링이 들어가서 에러
//		orange4.showInfo();
	}
}
