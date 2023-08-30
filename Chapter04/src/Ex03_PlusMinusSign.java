
public class Ex03_PlusMinusSign
{

	public static void main(String[] args)
	{
		short num1 = 5;
		System.out.println(+num1); // 불필요한 +
		System.out.println(-num1); // 부호를 바꿔서 얻은 결과
		System.out.println(num1);  //num1의 값은 변하지 않음

		short num2 = 7;
		
//		+ 연산자에 의해 연산이 이뤄지고 int로 변환이 되어서 강제형변환하여야 한다
		
		short num3 = (short)(+num2); //형변환 하지 않으면 오류
		short num4 = (short)(-num2); //형변환 하지 않으면 오류
		System.out.println(num3);
		System.out.println(num4);
	}
}
