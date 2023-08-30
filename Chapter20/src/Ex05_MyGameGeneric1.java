class Npc5
{
	public String toString()
	{
		return "This is a Npc4.";
	}
}

class Tank5
{
	public String toString()
	{
		return "This is a Tank4.";
	}
}

class Camp5<T> //<> 다이아몬드 연산자(제네릭), 바꿔치기 연산자 Object를 T로 바꿈
{
	private T unit; 
	
	public void set(T unit)
	{
		this.unit = unit;
	}
	
	public T get()
	{
		return unit;
	}
}

public class Ex05_MyGameGeneric1
{

	public static void main(String[] args)
	{
		
		// 게임 종족 생성
		Camp5<Npc5> human = new Camp5<>(); // 뒤쪽은 추론 가능하므로 자바 7부터 생략
		Camp5<Tank5> machine = new Camp5<>();
		
		// 게임 종족에 유닛을 생성해 담기
		human.set(new Npc5());
		machine.set(new Tank5()); 
		
		// 게임 종족에서 유닛을 가져오기
		Npc5 hUnit = human.get();
		Tank5 mUnit = machine.get();
		
		System.out.println(hUnit);
		System.out.println(mUnit);
	}
}
