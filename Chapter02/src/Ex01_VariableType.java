//byte, short, int, long 타입(형)이 있다
//정수형 계산기는 int형밖에 없다. 실수형 계산기는 float (4바이트) double (8바이트)형밖에 없다.


public class Ex01_VariableType
{
	public static void main(String[] args)
	{
//		byte num1; // 선언만 한다. (자리만 만들어놓는다)
//		num1=1; // 초기화한다.(값을 넣어줌)
		byte num1 = 1; // 0000 0001 1바이트 메모리 1칸씀
		short num2 = 1; // 0000 0000 0000 0001 2바이트 2칸을 씀
		int num3 = 1; // 4바이트 4칸
		long num4 = 1; // 8바이트 8칸

		// 다 같은 1이 출력되지만 크기가 다르다. 2^8배로 는다		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
	}
}
