/*
 for each문 : 배열의 원소를 참조의 형태로 가져와서 사용
 값의 변경은 허용하지 않는다
 for(자료형 참조변수 : 배열명){
 	실행문장;
 	참조변수를 통해 배열의 원소 출력가능함;
 	
 향상된 for문은 가상에서 디버깅에 쓰인다
 */
public class Ex08_EnhancedFor
{

	public static void main(String[] args)
	{
		// 1차원 배열을 선언 및 초기화
		int[] arr = {1, 2, 3, 4, 5}; // new 생략, 힙 영역 저장
		
		/*
		배열 arr의 원소를 순서대로 하나씩 참조하여 출력
		 */
		// 배열 요소 전체 출력
		for(int e: arr) {
			System.out.print(e + " ");
		}
		System.out.println(); // 줄 바꿈 목적

		int sum = 0; // 전체 멤버 변수
		
		// 배열 요소의 전체 합 출력
		for (int e: arr) {
			sum = sum + e;
		}
		System.out.println("sum: " + sum);
		
		// 인덱스를 변형시키지 않는다 복사해서 보여준다
		// 배열을 전체 복사해서 가져와서 보여준다
		System.out.println("배열 arr의 요소값 1증가시키기");
		for(int b : arr) { 
			b++; // 변수 b에 저장된 값이 1증가하여 출력
			System.out.print(b +" ");
		}
		System.out.println();
		
		// 위의 1증가되는 for문을 사용하여 인덱스가 바뀌지 않는 것을 보여주기 위해서
		System.out.println("배열arr의 요소 재출력하기");
		for(int c : arr) {
			System.out.print(c +" ");
		}
	}
}
