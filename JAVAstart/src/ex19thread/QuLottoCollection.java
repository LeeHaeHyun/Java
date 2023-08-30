//배열을 이용한 버전과 동일한 조건으로 제작하되 Set<E> 컬렉션을 이용한다.
//Set<E> 계열의 컬렉션은 중복이 자동으로 제거된다. 
//하지만 순서를 보장하지 않으므로 TreeSet<E>을 사용하면 된다. 

package ex19thread;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class QuLottoCollection
{
	public static void main(String[] args)
	{
		// 난수 생성 준비
		Random random = new Random();

		// 로또 번호는 중복된 숫자가 있으면 안되므로 Set계열의 컬렉션을
		// 생성한다
		HashSet<Integer> setLotto1 = new HashSet<Integer>();
		
		// 중복되지 않은 난수를 생성하기 위해 무한 루프 내에서 반복한다
		while(true)
		{
			// 1~46 사이의 난수를 생성해서 Set에 추가한다
			// 이때 중복된 숫자는 저장되지 않는다 = set 컬렉션은 중복저장이 안되므로
			setLotto1.add(random.nextInt(45)+1);
			//숫자 6개가 저장되었다면 루프를 탈출
			if (setLotto1.size()==6) break; //while문의 탈출 break;
		}
		
		// set 컬렉션은 정렬되지 않는다 = 순서가 없기 때문에
		System.out.println(setLotto1);
		
		// Set 컬렉션은 정렬은 되지 않으므로 list 컬렉션으로 변환한다
		ArrayList<Integer> listLotto1 = new ArrayList<Integer>(setLotto1); 
		listLotto1.sort(Comparator.naturalOrder()); // 오름차순 정렬
//		listLotto1.sort(Comparator.reverseOrder()); // 내림차순 정렬
		
		//정렬된 로또 번호를 출력한다
		System.out.println(listLotto1);
		
		/////////////////////////////////////////////////////////////////////
		/*
		TreeSet<E> 컬렉션은 중복은 허용하지 않지만 Tree라는 자료구조를 기반으로
		정렬 허용한다. Integer 클래스와 같은 기본 클래스 
		별도의 오버라이딩 없이도 오름차순 정렬된 상태로 저장
		 */
		TreeSet<Integer> setLotto2 = new TreeSet<Integer>();
		while(true)
		{
			setLotto2.add(random.nextInt(45)+1);
			if (setLotto2.size()==6) break; 
		}
		System.out.println(setLotto2);
	}
}
