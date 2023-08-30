import java.util.Arrays;
import java.util.List;

/*
map: 요소들을 특정조건으로 해당하는 값으로 변환해줍니다
대소문자 변환 등의 작업을 합니다
 */
public class Ex05_Map
{
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("apple", "banana", "orange"); // 변경이 안되는 배열

		list.stream() // 스트림으로 변환
			.map(s -> s.toUpperCase()) // 대문자로 변환
			// 	map은 data 원형을 변경하는데 사용
			.forEach(n -> System.out.print(n + "\t"));
		
		System.out.println();
	}
}
