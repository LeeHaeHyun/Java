package ex01;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Date
{

	public static void main(String[] args)
	{
//		nextline을 통해 사용자로부터 입력값을 받는다.
//		<구정>을 입력하면 "구정은 음력 1월 1일입니다."가 나오게 하고 
//		<천일>을 입력하면 년-월-일-시-분-초 12시간 형식으로 오늘에서 +1000일 후가 나오게 하며
//		<10년>을 입력하면 년-월-일-시-분-초 12시간 형식으로 언제든 10년전 날짜가 나온다.
//		<웃긴더하기>를 입력하면 년,월,일,요일,시간,분,초를 모두 더한 값을 정수로 나오게 
//		출력하게 되는 프로그램 만들기
		
		Scanner sc = new Scanner(System.in);
		String wow = sc.nextLine();
		String wow1 = sc.nextLine();
		Date toDate = new Date();
		SimpleDateFormat okDate = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		Calendar oday = Calendar.getInstance(); // 객체 생성: 달력 oday 
		oday.add(Calendar.DATE, +1000); // 오늘로부터 -1000한 값을 oday에 저장
		String chunil = okDate.format(oday.getTime()); // chunil String으로 저장
		
		Calendar yday = Calendar.getInstance();
		yday.add(Calendar.YEAR, -10); // 이번년도에서 -10 한 값을 yday에 저장
		String sib = okDate.format(yday.getTime()); // sib String으로 저장
		
		Calendar cal = Calendar.getInstance(); //cal이라는 달력 객체 생성
		int year = cal.get(Calendar.YEAR); // 올해를 year 변수에 넣음
		int month = cal.get(Calendar.MONTH) + 1; // 이번 달을 month 변수에 넣음
		int date = cal.get(Calendar.DATE); // 오늘을 date 변수에 넣음
		int dayweek = cal.get(Calendar.DAY_OF_WEEK); // 요일을 dayweek 변수에 넣음
		int hour = cal.get(Calendar.HOUR); // 시간을 hour 변수에 넣음
		int minute = cal.get(Calendar.MINUTE); // 분을 minute 변수에 넣음
		int second = cal.get(Calendar.SECOND); // 초을 second 변수에 넣음
		
		if(wow1.equals("메롱"))
		{
			System.out.println(wow);
			System.out.println("wow의 주소가 맞습니다");
		}
		else
			System.out.println("땡");
//			System.out.println(System.identityHashCode(soul));
		if(wow.equals("천일"))
			System.out.println("1000일 후: " + chunil);
		if(wow.equals("10년"))
			System.out.println("10년 전: " + sib);	
		if(wow.equals("웃긴더하기"))
			System.out.println(year+month+date+dayweek+hour+minute+second);
	}
}
