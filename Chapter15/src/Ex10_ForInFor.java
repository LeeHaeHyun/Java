
public class Ex10_ForInFor
{

	public static void main(String[] args)
	{
		// 3행 3열 크기의 2차원 배열
		int[][] arr = new int[3][3];
		int num = 1; // 전체 멤버 변수 1로 초기화
		
		// 각 행과 열의 크기만큼 반복하면서 배열 초기화한다
		// 1차원 배열을 시작( 행을 시작 )
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) 
			{
				arr[i][j] = num; // {0,0} 1을 넣는다, {0,1} 2를 넣는다, {0,2} 3을 넣는다 [ 행 기준 ]
				num++; // 1씩 더한다
			}
		}
		
		// 초기화된 데이터를 출력한다
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
