import java.util.Scanner;

public class Ex03_Scanner2
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("홍길동 전우치 손오공 이렇게 입력하고 엔터를 입력하세요.");
		String name1 = sc.nextLine(); 
		// 줄단위 입력처리, 엔터치는 순간 완료
		
		System.out.println("홍길동 전우치 손오공 이렇게 입력하고 엔터를 입력하세요.");
		// 공백이나 탭 단위로 처리, 아래 3번이므로 3번을 엔터쳐야 끝남
		String name2 = sc.next();
		String name3 = sc.next();
		String name4 = sc.next();
		
		System.out.printf("[%s] [%s] [%s] [%s]", name1, name2, name3, name4);
	}
}
