import java.util.Arrays;

public class Ex12_ArrayCopy
{
	public static void main(String[] args)
	{
		/*
		 1차원, 2차원 배열은 크기가 지정되면 전체 원소가 0으로 초기화된다
		 double형 배열이면 0.0으로 초기화된다
		 */
		int[] arr1 = new int[10];
		int[] arr2 = new int[8];
		
		for(int i=0; i<arr1.length; i++) //arr1 배열의 길이만큼
			System.out.print(arr1[i] + " "); // arr1 크기 10이 0으로 원소가 모두 들어간다
		System.out.println();
		
		//배열 arr1을 3으로 초기화 (fill 메소드)
		Arrays.fill(arr1, 3);
		
		//배열 arr1을 arr2로 부분 복사 (arraycopy 메소드)
		System.arraycopy(arr1, 0, arr2, 3, 4); //arr1 0에서 길이가 4까지 arr2[3] 인덱스부터 바꾸기
 		
		//arr1 출력
		for(int i=0; i<arr1.length; i++) //arr1 배열의 길이만큼
			System.out.print(arr1[i] + " "); // arr1 크기 10칸 원소 3으로 모두 들어간다
		System.out.println();
		
		//arr2 출력
		for(int i=0; i<arr2.length; i++) //arr2 배열의 길이만큼
			System.out.print(arr2[i] + " ");
		System.out.println();
		
		//배열 arr1을 arr3로 부분 복사
		// arr2에 2인덱스에서 5인덱스 전까지 ( 인덱스 4까지 )
		int[] arr3 = Arrays.copyOfRange(arr2, 2, 5); 
		
		//arr3 출력
		for(int i=0; i<arr3.length; i++)
			System.out.print(arr3[i] + " ");
		System.out.println();
	}
}
