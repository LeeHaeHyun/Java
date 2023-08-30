import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Mission02
{
	public static void main(String[] args) throws IOException
	{
		ArrayList<Phone> tel = new ArrayList<Phone>();
		//Phone의 데이터를 가지는 ArrayList의 변수를 tel이라고 만들고
		//Phone의 데이터를 가지는 ArrayList의 객체를 만들어서 변수 tel에 대입
		
		Controller c = new Controller();
		//Controller 라는 클래스 변수 이름을 c로 하고 Controller 객체를 생성해서 대입
		
		File f = new File("src/text.txt");
		if(f.exists()) 
		{
//			tel.clear(); 
			//ArrayList tel의 내용 클리어해서 tel을 비움
			FileReader fr = new FileReader("src/text.txt");
			//FileReader fr에 FileReader 객체를 생성 생성자 인자에는 파일경로를 문저열로 넣어서 객체 생성
			
			BufferedReader reader1 = new BufferedReader(fr);
			// BufferReader reader1에 BufferedReader 객체를 생성 생성자 인자에는 FileReader을 넣어서 객체 생성
			
			String line1;
			//문자열 line1 생성
			
			String[] splitLine1 = null;
			//문자열 배열 splitLine을 생성 하고 null 값 대입

			while((line1=reader1.readLine()) != null)
				//BufferReader reader1을 이용해 한줄을 읽어 와서 문자열 line1에 대입하고 line1이 널이 아니면 반복
			{
				//System.out.println(line1);
				splitLine1 = line1.split("\t\t");
				//문자열 splitLine 배열에 line1을 "\t\t"로 자른 문자열들을 대입
				//               System.out.println(splitLine.length);
				tel.add(new Phone(splitLine1[0], splitLine1[1], splitLine1[2]));
				//ArrayList tel 추가할때 Phone 객체를 생성 하고 생성자는 문자열 splitLine1 배열을 대입
			}
		} 
		

		while(true) //무한반복
		{
			try
			{
				Scanner sc = new Scanner(System.in); //입력
				FileWriter fw; //FileWriter의 fw라는 변수 선언
				System.out.println("========== 아이디 보관 프로그램 ==========");
				System.out.println("1.추가 2.검색 3.삭제 4.전체보기 5.종료"); //출력
				int num = sc.nextInt(); // 입력
				if(c.tel.size() < 0)
					//Controller의 변수 c의 객체변서 tel의 사이즈가 0이면 실행
				{
					fw = new FileWriter("src/text.txt",false);
					// fw 변수에 FileWriter 객체를 생성해서 대입 
					// 객체 생성시 파일 경로명 문자열 생성자 인자에 넣어서 객체 생성 대입
					//덮어쓰기
				}
				else //if문이 아니면
				{
					//System.out.println("11");
					fw = new FileWriter("src/text.txt",true);
					//fw 변수에 FileWriter 객체를 생성해서 대입
					// 객체 생성시 파일 경로명 문자열 생성자 인자에 넣어서 객체 생성 대입
					//이어쓰기
				}
				
				switch (num) 
				{ //num의 값에 따라 분기
				case 1: //num 1이면
					c.input(fw); 
					// Controller의 변수 c의 input 함수에 FileWriter 객체 fw를 인자로 넣어서 호출
					break; //탈출
				case 2: //num 2이면
					c.search();
					//Controller의 변수 c의 search 함수 호출
					break; // 탈출
				case 3: //num 3이면
					FileWriter fw1 = new FileWriter("src/text.txt",false);
					//FileWriter의 변수명 fw1로 선언 후 FileWriter 객체 생성
					//객체 생성시 파일 경로명을 문자열로 인자로 전달해서 객체 생성
					c.delete(fw1);
					//Controller의 변수 c의 deleter 함수에 FileWriter 객체 fw1를 인자로 넣어서 호출
					break;//탈출
				case 4://num 3이면
					System.out.println("[검색어]    	[아이디]    	[비밀번호]");
					c.allPrint(); 
					//Controller의 변수 c의 allPrint 함수 호출
					break;// 탈출
				case 5:
					System.out.println("========== 프로그램을 종료합니다 ==========");//입력
					return;//탈출
	
				default: //위에게 다아니면 
					System.out.println("잘못된 입력입니다.");
					System.out.println("1~5번까지의 숫자만 입력해주세요.");//출력
					break;//탈출
				}
			}
			catch (InputMismatchException num)
			{
				System.out.println("잘못된 입력입니다.");
				System.out.println("1~5번까지의 숫자만 입력해주세요.");//출력
			}
		}	
	}
}

class Phone //클래스 Phone
{
	String name; // 문자열 변수 name
	String idNum; // 문자열 변수 idNum
	String password; // 문자열 변수 password

	public Phone(String name, String idNum, String password) {
        //Phone 생성자 인자로 문자열 name, 문자열 idNum, 문자열 password 받아서 생성
		// TODO Auto-generated constructor stub
		this.name = name;
        //인자 name을 객체 변수 name에 대입
		this.idNum = idNum;
        //인자 idNum을 객체 변수 idNum에 대입
		this.password = password;
        //인자 password을 객체 변수 password에 대입
	}
}
class Controller //class Controller
{
	ArrayList<Phone> tel;    // Phone이 있는 ArrayList를 tel이라고 선언
	FileWriter fw; // FileWriter를 fw라고 선언
	Scanner sc; // Scanner를 sc라고 선언
	FileReader fr; // FileReader를 fr이라고 선언

	public Controller() throws IOException 
	{
		// TODO Auto-generated constructor stub
		tel = new ArrayList<Phone>();
		// tel 변수에 ArrayList<Phone>객체 생성 해서 대입
		sc = new Scanner(System.in); // 입력

	}

	void input(FileWriter fw) throws IOException
    //인자를 FileWriter로 받고 리턴이 없는 input이라는 함수
	{
		if(tel.size() < 0) // ArrayList 변수 tel의 크기가 0이면 실행
		{
			String opn1 = "검색어"+"\t\t"+"아이디(ID)"+"\t\t"+"비밀번호(PW)"+"\r\n";
            //문자열 변수 opn1에 위에 문자열 대입
			tel.add(new Phone("검색어","아이디(ID)","비밀번호(PW)"));
            //ArrayList 변수 tel의 리스트 추가 Phone 객체를 생성해서 추가 
			fw.write(opn1); 
            // FileWrite의 변수 fw를 이용해 write 함수 호출 파일에 문자열 쓰기
		}


		System.out.print("검색어 :"); //입력
		String name = sc.next(); // String name에 입력 값 대입
		System.out.print("아이디(ID) :"); //입력
		String number=sc.next(); // String number에 입력 값 대입
		System.out.print("비밀번호(PW) :"); // 입력
		String password = sc.next(); // String password에 입력 값 대입

		tel.add(new Phone(name,number,password)); 
        //ArrayList 변수 tel의 리스트 추가 Phone 객체를 생성해서 추가 Phone은 입력받은 값을 생성자에 추가

		String tatal = name+"\t\t"+number+"\t\t"+password+"\r\n";
        // 문자열 tatal 에 입력 받은 문자열을 더해서 대입
		fw.write(tatal);
         // FileWrite의 변수 fw를 이용해 write 함수 호출 파일에 tatal문자열 쓰기
		System.out.println("============ 아이디 등록완료 ============");
		System.out.println("["+name+"] 성공적으로 추가되었습니다");
		System.out.println("아이디(ID) : ["+number+"]");
		System.out.println("비밀번호(PW) : ["+password+"]");
		System.out.println();
		fw.close();
        //FileWriter 끄기
	}
	void search() throws IOException
    //인자가 없고 리턴이 없는 search 함수
	{
		System.out.print("검색어를 입력해주세요 : "); //입력
		String search = sc.next(); // 문자열 search에 입력 문자열 대입
		
		tel.clear(); 
		//ArrayList tel의 내용 클리어해서 tel을 비움
		FileReader fr = new FileReader("src/text.txt");
	    //FileReader fr에 FileReader 객체를 생성 생성자 인자에는 파일경로를 문저열로 넣어서 객체 생성
		BufferedReader reader1 = new BufferedReader(fr);
		// BufferReader reader1에 BufferedReader 객체를 생성 생성자 인자에는 FileReader을 넣어서 객체 생성
		String line1;
	    //문자열 line1 생성
		String[] splitLine1 = null;
		//문자열 배열 splitLine을 생성 하고 null 값 대입

		while((line1=reader1.readLine()) != null)
	     //BufferReader reader1을 이용해 한줄을 읽어 와서 문자열 line1에 대입하고 line1이 널이 아니면 반복
		{
		//System.out.println(line1);
		splitLine1 = line1.split("\t\t");
	     //문자열 splitLine 배열에 line1을 "\t\t"로 자른 문자열들을 대입
		//               System.out.println(splitLine.length);
		tel.add(new Phone(splitLine1[0], splitLine1[1], splitLine1[2]));
	    //ArrayList tel 추가할때 Phone 객체를 생성 하고 생성자는 문자열 splitLine1 배열을 대입
		}	
		
		boolean check = false; // boolean check 변수를 false로 초기화
		int index = -1; // int index 변수를 -1로 초기화
		
		for(int i = 0;i<tel.size();i++)
        //int i 변수를 0으로 대입 i는 ArrayList tel의 크기보다 작으면 반복 반복 때마다 i는 1씩 증가
		{
			if(tel.get(i).name.equals(search))
            //ArrayList tel에 i 인덱스에 이름이 search와 같으면 아래 명령어 실행
			{
				index = i; // 변수 index에 i를 대입
				check = true; // 변수 check에 true 대입
			}
		}
		
		if(check == true)
        // 변수 check가 true 라면 아래 명령어 실행
		{
			System.out.println("========== 성공적으로 찾았습니다 ==========");
			System.out.println("[검색어]    	[아이디]    	[비밀번호]");
			System.out.println(tel.get(index).name +"		"+ tel.get(index).idNum+"		"+tel.get(index).password );//출력
		}
		else
		{
			System.out.println("▶▷ 등록된 아이디(ID)가 없습니다.");//출력
			System.out.println();
		}
	}

	void delete(FileWriter fw) throws IOException
    //인자를 FileWriter를 받고 리턴값이 없는 delete라는 함수
	{
		System.out.print("삭제 할 검색어를 입력해주세요 : ");// 출력
		String search1 = sc.next(); 
        //문자열 search1 에 입력 값 대입
		for(int i = 0;i<tel.size();i++)
        //int i 변수를 0으로 대입 i는 ArrayList tel의 크기보다 작으면 반복 반복 때마다 i는 1씩 증가
		{
			if(tel.get(i).name.equals(search1))
            //ArrayList tel에 i 인덱스에 이름이 search와 같으면 아래 명령어 실행
			{
				System.out.println("▶▷ 성공적으로 삭제되었습니다.");//출력
				System.out.println();
				tel.remove(i);//ArrayList tel 에 i 인덱스 삭제
			}
		}
		for(int i =0;i<tel.size();i++)
        //int i 변수를 0으로 대입 i는 ArrayList tel의 크기보다 작으면 반복 반복 때마다 i는 1씩 증가
		{
			String tatal1 = tel.get(i).name+"\t\t"+tel.get(i).idNum+"\t\t"+tel.get(i).password+"\r\n";
            //문자열 tatal1에 ArrayList tel에 i인덱스 문자열 이름, 전화번호, 주소를 더해서 대입
			fw.write(tatal1);
             // FileWrite의 변수 fw를 이용해 write 함수 호출 파일에 tatal1문자열 쓰기
		}
		fw.close();
		//FileWriter 끄기
	}
	void allPrint() throws IOException
    //인자는 없고 리턴값도 없는 allPrint라는 함수
	{
		tel.clear(); 
		//ArrayList tel의 내용 클리어해서 tel을 비움
		FileReader fr = new FileReader("src/text.txt");
        //FileReader fr에 FileReader 객체를 생성 생성자 인자에는 파일경로를 문저열로 넣어서 객체 생성
		BufferedReader reader1 = new BufferedReader(fr);
		// BufferReader reader1에 BufferedReader 객체를 생성 생성자 인자에는 FileReader을 넣어서 객체 생성
		String line1;
        //문자열 line1 생성
		String[] splitLine1 = null;
		//문자열 배열 splitLine을 생성 하고 null 값 대입

		while((line1=reader1.readLine()) != null)
        //BufferReader reader1을 이용해 한줄을 읽어 와서 문자열 line1에 대입하고 line1이 널이 아니면 반복
		{
			//System.out.println(line1);
			splitLine1 = line1.split("\t\t");
            //문자열 splitLine 배열에 line1을 "\t\t"로 자른 문자열들을 대입
			//               System.out.println(splitLine.length);
			tel.add(new Phone(splitLine1[0], splitLine1[1], splitLine1[2]));
            //ArrayList tel 추가할때 Phone 객체를 생성 하고 생성자는 문자열 splitLine1 배열을 대입
		}

		for(int i = 0;i<tel.size();i++)
        //int i 변수를 0으로 대입 i는 ArrayList tel의 크기보다 작으면 반복 반복 때마다 i는 1씩 증가
		{
			System.out.println(tel.get(i).name + "\t\t"+tel.get(i).idNum +"\t\t"+ tel.get(i).password);
            //출력
		}
	}
}
