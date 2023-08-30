class Npc2
{
	public String toString()
	{
		return "This is a Npc2.";
	}
}

class Tank2
{
	public String toString()
	{
		return "This is a Tank2.";
	}
}

class Camp2 
{
	private Object unit; // 둘다 받기 위해 Object로 받음
	
	public void set(Object unit)
	{
		this.unit = unit;
	}
	
	public Object get()
	{
		return unit;
	}
}

public class Ex02_MyGame2
{

	public static void main(String[] args)
	{
		
		// 게임 종족 생성
		Camp2 human = new Camp2();
		Camp2 machine = new Camp2();
		
		// 게임 종족에 유닛을 생성해 담기
		// 자식 객체를 부모타입의 변수에 대입
		human.set(new Npc2());
		machine.set(new Tank2());
		
		// 게임 종족에서 유닛을 가져오기
		Npc2 hUnit = (Npc2)human.get(); //자식을 부모로 형변환
		Tank2 mUnit = (Tank2)machine.get();
		
		System.out.println(hUnit);
		System.out.println(mUnit);
	}
}
