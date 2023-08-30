/*
 배열 : 순차적인 메모리의 공간이 할당되는 형태로 하나가 아니라 여러개의 변수가 필요한 경우 사용
 - 생성된 배열은 힙 영역에 저장되고 할당된 메모리의 주소값을 반환 ★★★
 - 주소를 통해 배열에 접근할 수 있다
 */

class BoxA1 { // 필드와 메소드가 없어도 클래스가 맞음
	
}
public class Ex01_ArrayInstance
{

	public static void main(String[] args)
	{
		// 길이가 5인 int형 1차원 배열 생성
		int[] ar1 = new int[5];
		
		// 길이가 7인 double형 1차원 배열 생성
		double[] ar2 = new double[7];
		
		// 배열의 참조변수와 객체 생성 분리
		float[] ar3;
		ar3 = new float[9];
		
		// 객체 대상 1차원 배열
		BoxA1[] ar4 = new BoxA1[5];
		
		// 배열의 객체 변수 접근 / 메소드 사용
		// 배열명.length : 배열의 크기를 반환, 배열의 크기가 변경되는 경우 유연하게 대처할 수 있다
		System.out.println("배열 ar1 길이: " + ar1.length);
		System.out.println("배열 ar2 길이: " + ar2.length);
		System.out.println("배열 ar3 길이: " + ar3.length);
		System.out.println("배열 ar4 길이: " + ar4.length);

	}

}
