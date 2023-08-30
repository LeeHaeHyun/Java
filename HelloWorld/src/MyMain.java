import java.text.SimpleDateFormat;
import java.util.Date;

//주석: 코드의 설명이나 다른 개발자에게 전달할 메세지를 기술한다.
//컨트롤+/ : 라인 단위 주석
//import java.lang.*; 생략되어 있다.(import)
//컨트롤+좌클릭: 라이브러리에 있어서 호출하여 사용한다. ex) println
//컨트롤+T : 족보
//public 선언된 클래스의 파일명은 반드시 똑같아야 한다.
//노란줄: 변수선언했음에도 사용하지 않을때

public class MyMain
{
	public static void main(String[] args) // 여기가 메인이다
	{
		System.out.println("Hello");
		
		//오늘 날짜와 시간을 date클래스를 통해 가져온다. 유틸로 라이브러리에 만들어놓았다.
		Date toDayofDate = new Date();
		System.out.println("오늘날짜 :"+ toDayofDate);
		
		//simpleDateformat : 클래스를 이용해서 년-월-일 시:분:초 형태로 변환
		//simple은 주소값이 저장되어 string으로 변환이 필요하다
		// HH : 24시, hh : 12시 + (am,pm) 추가 필요
		SimpleDateFormat simple = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
		
		// String 클래스로부터 toDaystring이라는 변수를 선언하여 simple 변수를 format 형태로 바꾼다.
		String toDaystring = simple.format(toDayofDate);
		System.out.println("변형된 날짜 : "+ toDaystring);
	}
}
