import java.util.Arrays;

public class Ex13_ArrayEquals
{
	public static void main(String[] args)
	{
		int[] arr1 = {1, 2, 3, 4, 5}; 
		
		//arr1에 전달된 배열을 첫번째 요소부터 arr1의 길이만큼 복사
		int[] arr2 = Arrays.copyOf(arr1, arr1.length); 
		
		//arr1와 arr2의 주소값은 다르다
		boolean bcheck1 = arr1==arr2; 
		System.out.println(bcheck1);
		
		//arr1와 arr2의 내용(equals)은 같다
		boolean bCheck = Arrays.equals(arr1, arr2);
		System.out.println(bCheck);
	}
}
