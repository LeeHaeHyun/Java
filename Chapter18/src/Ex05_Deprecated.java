interface Unit5
{
	/*
	 @Deprecated
	 - 해당 메서드가 더이상 사용되지 않음을 표시
	 - 만약 사용할 경우 컴파일 경고를 발생시킵니다.
	 */
	@Deprecated
	public void move(String str); // 곧 없어질 내용이므로 반드시 수정할 것
	public void run(String str); // 수정될 내용
}

class Human5 implements Unit5
{
	@Override
	public void move(String str)
	{
		System.out.println(str);
	}
	@Override // 수정할 내용
	public void run(String str)
	{
		System.out.println(str);
	}
}
public class Ex05_Deprecated
{

	public static void main(String[] args)
	{
		Unit5 unit = new Human5();
		unit.move("인간형 유닛이 이동합니다."); // 오버라이딩
		unit.run("인간형 유닛이 달립니다."); // 수정될 내용
	}
}
