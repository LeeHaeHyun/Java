package ex17collection;

// 과일을 표현한 클래스 생성
class Apple
{
	int weight;
	public Apple(int w) 
	{
		weight = w;
	}
	public void showInfo()
	{
		System.out.println("사과의 무게는 " + weight +" 입니다.");
	}
}

class Banana
{
	int sugar;
	public Banana(int s) 
	{
		sugar = s;
	}
	public void showInfo()
	{
		System.out.println("바나나의 당도는 " + sugar +" 입니다.");
	}
}

/* 이러한 메소드를 아래 제네릭 메소드로 바꾸었습니다.
class FruitBox
{
	Object item;
	public FruitBox(Object item)
	{
		this.item = item;
	}
	public void store(Object item)
	{
		this.item = item;
	}
	public Object pullOut()
	{
		return item;
	}
 */

// 객체 생성시 자료형을 결정하기 위한 클래스명 <T> 형태로 변경
class GenericFruitBox<T> 
{
	T item;
	public void store(T item) 
	{
		this.item = item;
	}
	public T pullOut()
	{
		return item;
	}
}

public class Ex02GenericClass
{
	public static void main(String[] args)
	{
		/*
		박스 인스턴스를 생성할 때 T부분을 결정하므로 구현의 편의성이 보장됨
		각각 APPLE, BANANA 객체를 저장할 수 있는 객체가 생성되었다.
		 */
		GenericFruitBox<Apple> appleBox = new GenericFruitBox<Apple>();
		appleBox.store(new Apple(10));
		Apple apple = appleBox.pullOut();
		apple.showInfo();

		GenericFruitBox<Banana> bananaBox = new GenericFruitBox<Banana>();
		bananaBox.store(new Banana(20));
		Banana Banana = bananaBox.pullOut();
		Banana.showInfo();
		
		/*
		오렌지를 저장할 수 있는 용도로 생성되었기 때문에 다른 객체는 아에 저장할 수 없다
		
		 */
		GenericFruitBox<Orange> orangeBox = new GenericFruitBox<Orange>();
//		orangeBox.store("나는 오렌지"); // 스트링이 들어가면 당연히 받을 수 없다
//		orangeBox.store(apple); // 다른 객체도 안된다 Orange에 해당하는 변수만 된다
//		orangeBox.store(banana);

	}

}
