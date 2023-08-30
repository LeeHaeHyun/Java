interface Human1
{
	int MAN = 1;
	int WOMAN = 2;
}

interface Machine1
{
	int TANK = 1;
	int AIRPLANE = 2;
}
public class Ex01_Constants
{

	public static void main(String[] args)
	{
		createUnit(Machine1.TANK); // 알맞는 상수 사용
		
		createUnit(Human1.MAN); // MAN도 1, TANK와 같은 상수, 잘못된 상수 사용
	}
	
	public static void createUnit(int kind)
	{
		switch(kind)
		{
		case Machine1.TANK: // 탱크 1, 상수로 받음
			System.out.println("탱크를 만듭니다.");
			break;
		case Machine1.AIRPLANE:
			System.out.println("비행기를 만듭니다.");
			break;
		}
	}
}
