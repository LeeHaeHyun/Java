public class Ex02_switch
{
	public static void main(String[] args)
	{
//		switch : if문처럼 조건에 따라 분기하는 제어문
//		여러번 실행할 때 매우 많이 사용
		int n = 4;
		
//		조건식에 연산식을 넣을 수 있고 변수만 넣을 수도 있다
		
		switch (n % 3)
		{
		case 1:
			System.out.println("나머지가 1");
			// break를 만나면 switch문을 탈출한다.
			break; // 없으면 다 실행된다.
		case 2:
			System.out.println("나머지가 2");
			break;
		default:
			System.out.println("나머지가 0");
//			디폴트 마지막에는 break를 기술하지 않는다
//			더이상 실행할 문제가 없다
		}
	}
}
