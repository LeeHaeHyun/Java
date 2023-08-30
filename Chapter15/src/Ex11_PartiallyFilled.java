
public class Ex11_PartiallyFilled
{

	public static void main(String[] args)
	{
		int[][] arr = {
				{11},
				{22, 33},
				{44, 55, 66}
			};
		
		// 배열의 구조대로 내용 출력
		for(int i=0; i<arr.length; i++)
		{
			/*
			2차원 배열에서 열의 크기를 알고 싶을 때 배열명(인덱스)를 사용한다.
			 */
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		/* 추가
		 2차원 배열에서 특정 원소의 접근하기 위해서는 2개의 배열 기호가 
		 필요하다. 또한 값이 없는 원소, 즉 null로 채워져 있는 원소를 
		 출력하면 예외가 발생한다. (배열의 인덱스를 초과했다는 예외가 발생하게 된다) 
		 */
		System.out.println("배열 출력하기");
		System.out.println("arr[0][0]="+arr[0][0]); //0,0 = {11} 안에 있는 숫자 11
		System.out.println("arr[1][1]="+arr[1][1]);	//1,1 = {22, 33} 안에 있는 숫자 33
		//예외발생 (null이므로 출력할 수 없다.)
//		System.out.println("arr[0][1]="+ arr[0][1]); // 0,1은 {11} 다음에 아무것도 없다 ( null ) 이므로 에러
	}
}
