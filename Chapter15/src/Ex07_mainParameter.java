//run - run configurations
public class Ex07_mainParameter
{
	public static void main(String[] args)
	{
		// main 메소드의 매개변수 확인
		System.out.println(args.length); // 입력한 배열의 갯수 확인. 0
		for(int i = 0; i < args.length; i++) 
			System.out.println(args[i]);
	}
}
