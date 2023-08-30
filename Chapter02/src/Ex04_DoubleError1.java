public class Ex04_DoubleError1
{
	public static void main(String[] args)
	{
		//실수형 기본은 double
		//double num1 = 1.00000001 => 오차없이 표현이 불가능하다 ( 실수형 계산기 단점 )
		//실수형 계산기는 근사값을 표현
		//float을 대입하려면 접미사 F 혹은 f를 붙여야 한다.
		
		double num1 = 1.0000001;
		System.out.println(num1);
		double num2 = 2.0000001;
		System.out.println(num2);
		double result = num1 + num2;
		System.out.println(result); // 정확한 계산이 출력되지 않은 결과, 
		//실수는 크고 작다를 비교하는데 주로 사용한다.
		
		float f3 = 100;
		
		//여기서 f4 float이므로 에러
		//에러발생, 3.14자체를 double형으로 인식하기 때문에
		//계산기는 int형밖에 없다. 
		
		// float f4 = 3.14; >> 3.14는 소수이므로 에러발생

		float f4 = (float)3.14; //강제 형변환(명시적 형변환): 데이터 손실이 발생
		System.out.println("f4="+ f4);
		
		// 접미사를 통해 Float형 임의로 명시한다. (소문자 f도 가능)
		float f5 = 3.14F; //권장 사항
		System.out.println("f5="+ f5);
		
		float f6 = 3.14f + 3.14f;
		System.out.println("f6="+ f6);
	}
}
