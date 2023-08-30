import java.util.Arrays;
import java.util.stream.IntStream;

/*
스트림이란?
: 다양한 데이터 소스(컬렉션, 배열 등)를 표준화된 방법으로 다르기 위한 것
 */
public class Ex01_Stream1
{

	public static void main(String[] args)
	{
		int[] arr = {1, 2, 3, 4, 5}; // 배열 잘 사용 안함
		
		// 스트림 생성
		IntStream stm1 = Arrays.stream(arr); // IntStream <= 정수 stream 기존에 있음
		
		// 중간 연산
		IntStream stm2 = stm1.filter(n -> n%2 == 1); // 람다식이 여기에서 필요함
		// 2로 나누어서 나머지가 1이 되는 것: true만 받겠다. 즉 홀수만 받겠다
		
		// 최종 연산
		int sum = stm2.sum(); // 홀수의 합
		
		System.out.println(sum);
	}
}

// 스트림은 스트리밍 서비스와 비슷하다
// 스트림은 이론적으로 요청할 때만 요소를 계산하는 고정된 자료구조이다.
// ★★★ 사용자가 요청하는 값만 추출하는 것이 스트림의 핵심이다.