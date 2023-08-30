package ex01;

public class Little
{

	public static void main(String[] args)
	{
		String str2 = "hello my name";

		// 공백을 기준으로 문자열을 자르되 2묶음으로 나눈다.
		String[] spt = str2.split(" " , 2); 
		System.out.println( spt[0] );  // hello
		System.out.println( spt[1] );  // my,name
	}

}
