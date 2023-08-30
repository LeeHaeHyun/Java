import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

// 응용
public class Ex11_ConvertExt
{

	public static void main(String[] args)
	{
		// 크기의 변경이 안되는 배열로 입력
		List<String> immutableList =
				Arrays.asList("홍길동", "전우치", "전우치", "손오공");
		
		// 변경 가능한 ArryList로 객체 변경하여 생성
		ArrayList<String> mutableList = new ArrayList<>(immutableList);

		// 리스트는 중복 가능하여 그대로 출력
		for(String s : mutableList)
			System.out.print(s.toString() + '\t');
		System.out.println();
		
		// Set 특성(중복을 쓸 수 없음) 을 이용해서 중복 제거 ( HashSet )
		HashSet<String> set = new HashSet<>(mutableList);
		
		// 또 다시 list로 변환
		mutableList = new ArrayList<>(set);
		
		// 향상된 for문으로 중복 제거 확인
		for(String s : mutableList)
			System.out.print(s.toString() + '\t');
		System.out.println();
	}
}
