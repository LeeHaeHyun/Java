package step07;

//저장을 위해 입력해야함 없다면 save 안됨
public class PhoneInfo implements java.io.Serializable //인터페이스 추가 (직렬화)
{
	private static final long serialVersionUID = 1L; // 노란줄이 가해지지 않음
	//멤버 변수
	String name;
	String phoneNumber; // 0이 앞에 있기 때문에 스트링 선언
	String email;
	
	// 생성자 (useing field로..)
	public PhoneInfo(String name, String phoneNumber)
	{
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	// 오버로딩(매개변수만 다름)
	public PhoneInfo(String name, String phoneNumber, String email)
	{
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	public void showPhoneInfo()
	{
		System.out.println("Name : " + name);
		System.out.println("PhoneNumber : " + phoneNumber);
		if (email != null) // 이메일이 있을 경우
			System.out.println("Email : " + email);
		System.out.println("-----------------------------------------");
	}
}
