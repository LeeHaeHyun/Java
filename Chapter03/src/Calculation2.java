import javax.swing.plaf.synth.SynthScrollPaneUI;

public class Calculation2
{

	public static void main(String[] args)
	{
		//디폴트 int형 계산
		
		int num31 = 1; //4바이트
		int num32 = 2;
		int result3 = num31 + num32;
		System.out.println(result3); //int 계산기
		
		long num41 = 1; //8바이트
		long num42 = 2;
		long result4 = num41 + num42;
		System.out.println(result4); //자동형변환 long 계산기
		
		long result5 = num31 + num41; //int+long = long
		System.out.println(result5); // 더 큰 long을 따라간다 8바이트 long
		
		//실수형 double형 계산
		
		float num61 = 1.0f;
		float num62 = 2.0f;
		float result6 = num61 + num62; // float 계산기
		System.out.println(result6); // 4바이트(float)인 3.0으로 출력
		
		double num71 = 1.0;
		double num72 = 2.0;
		double result7 = num71 + num72; // double 계산기
		System.out.println(result7); // 8바이트(double)인 3.0으로 출력
		
		double result8 = num61 + num71;
		System.out.println(result8);
		
//		큰 자료형과 작은 자료형을 연산하면 큰 자료형으로 따라간다
//		데이터 손실이 있을 수 있기 때문
//		byte형과 short형은 에외적인 상황, int형에 최적화된 cpu 특성 때문에
		
		// num61 dpuble로 자동 형변환 후 계산합니다.
		double result9 = num61 + num71;
		System.out.println(result9);
		
		int num91 = 2147483647; //큰 값이 들어갈때는 조심해야 함
		int num92 =2;
		
		// long으로 변환해야 정확한 값이 나옴
		int result10 = num91 + num92;
		// pc는 가장 앞의 비트를 부호비트로 사용 양수, 음수를 구분
		System.out.println(result10); //int의 가장 큰 수에서 다시 맨 처음부터 돌아가서 +2를 함
	}
}
