package step07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MyPhoneBook
{
	// 언제든지 불러오기 위해 스태틱으로 받음
	static Scanner sc = new Scanner(System.in); 
	static Map<String, PhoneInfo> map = new HashMap<>();
	// <= 검색을 해야 하므로 Map을 사용해야 함.
	
	public static void showMenu() // 메뉴 구성
	{
		System.out.println("전화번호부를 시작하려면 엔터를 눌러주세요");
		Scanner scanner = new Scanner(System.in);
		String rp = scanner.nextLine();
		if (rp.isEmpty() ) {
		System.out.println("[메뉴 선택]");
		System.out.println("1.전화번호 입력");
		System.out.println("2.전화번호 조회");
		System.out.println("3.전화번호 삭제");
		System.out.println("4.종료");
		System.out.println("입력 : ");
		}
	}
	
	public static void addNumber() // 콜렉션 객체에 데이터 추가
	{
		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("전화번호 : ");
		String phoneNumber = sc.nextLine();
		System.out.println("이메일 : ");
		String email = sc.nextLine();
		
		PhoneInfo pInfo;
		// 이메일이 있거나 아무것도 입력하지 않았을 경우
		if (email !=null && !email.equals("")) {
			pInfo = new PhoneInfo(name, phoneNumber, email); // 3개 다 입력되었을 때
		} else {
			pInfo = new PhoneInfo(name, phoneNumber); // 2개만 입력 되었을때
		}
//		pInfo.showPhoneInfo();
		map.put(name, pInfo); // map 값을 입력
//		System.out.println("맵의 크기 : " + map.size()); step03에서 확인했으니까 주석처리
	}
	
	public static void selNumber() // 조회
	{
		System.out.println("-----------------------------------");
		System.out.print("조회할 이름 : ");
		String name = sc.nextLine();
		
//		Set<String> ks = map.keySet(); // 해시맵에 들어있는 모든 내용을 출력
//		for(String s : ks)
//			System.out.println(map.get(s).toString());
		System.out.println("-----------------------------------");
		
		PhoneInfo pInfo = map.get(name); // 입력된 값을 키로 해시맵에서 값을 가져옵니다
		if (pInfo != null)
			pInfo.showPhoneInfo(); // 저장된 정보를 출력합니다.
		else
			System.out.println("[" + name + "] 데이터가 없습니다.");
	}
	
	public static void delNumber() // 삭제
	{
		System.out.print("삭제할 이름 : ");
		String name = sc.nextLine();
		
		PhoneInfo pInfo = map.remove(name); // 해시맵에 키값을 받아서 삭제합니다
		if (pInfo != null)
		{
			System.out.println("[" + name + "]이 삭제되었습니다.");
			//pInfo.showPhoneInfo();
		} else {
			System.out.println("해당 값이 없습니다.");
		}
	}

	public static void main(String[] args)
	{
		readInfo();
		int choice; // 입력한 값을 보관하는 변수
		while(true)
		{
			showMenu(); // 메뉴출력
			choice = sc.nextInt();
			sc.nextLine(); // 숫자를 입력하고 엔터를 입력하기 때문에 엔터처리를 위해 한번 더 입력
			switch (choice)
			{
			case 1:
				addNumber();
				break;
			case 2:
				selNumber();
				break;
			case 3:
				delNumber();
				break;
			case 4:
				saveInfo(); // 저장
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}

	public static void saveInfo()
	{
		try (ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream("./bin/step07/Object.bin")))
		{
			Set<String> ks = map.keySet();
			for (String s : ks)
			{
				PhoneInfo pInfo = map.get(s);
				oo.writeObject(pInfo);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void readInfo()
	{
		try (ObjectInputStream oi = new ObjectInputStream(new FileInputStream("./bin/step07/Object.bin")))
		{
			while(true)
			{
				PhoneInfo pInfo = (PhoneInfo) oi.readObject();
				if (pInfo == null)
					break;
				map.put(pInfo.name, pInfo);
			}
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
//			e.printStackTrace();
		}
	}

}
	

