package ex02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Coll01
{
	public static void main(String[] args)
	{
		/*
		Q. 컬렉션을 이용한 로또번호 생성기를 구현하시오. 
		1. 배열을 이용한 버전과 동일한 조건으로 제작하되 Set 컬렉션을 이용한다. 
		2. Set 계열의 컬렉션은 중복이 자동으로 제거된다. 
		3. 하지만 순서를 보장하지 않으므로 TreeSet을 사용하면 된다.
		*/
		// HashSet으로 구현하기!
		
		// Set 계열의 HashSet lotto 변수 생성
		Set lotto = new HashSet();
		for (int i=0; lotto.size()<6; i++) // 6개 출력하기(0번째~5번째)
		{
			Random lottor = new Random(); // 난수 객체 생성
			int bunho = lottor.nextInt(45)+1; // 1~45까지의 난수 생성하여 int형 bunho에 담기
			lotto.add(new Integer(bunho)); // lotto HashSet에 난수 번호를 집어넣기
			
		}
		// list 계열의 ArrayList로 HashSet lotto 변수를 가진 객체 생성
		List list = new ArrayList(lotto);
		Collections.sort(list); // 오름차순으로 정렬
		
		System.out.println("오늘의 로또번호: " + list);		
	}

}
