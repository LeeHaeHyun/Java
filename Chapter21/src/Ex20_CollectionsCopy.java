import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex20_CollectionsCopy
{
	public static void main(String[] args)
	{
		// 수정 안되는 배열로 생성
		List<String> src = Arrays.asList("홍길동", "전우치", "손오공", "멀린");
		
		// 수정 가능한 리스트 생성
		List<String> dst = new ArrayList<>(src);
		System.out.println(dst);
		
		// 정렬하여 그 결과를 출력
		Collections.sort(dst); // 오름차순으로 정렬
		System.out.println(dst);
		
		// 사정상 정렬 이전의 상태로 되돌려야 함
		Collections.copy(dst, src); // 복사해서 데이터를 변경했기에 홍길동이 삭제됨
		System.out.println(dst);
		
		// 수정 가능한지 확인 = 가능
		dst.remove(0);
		System.out.println(dst);
	}
}
