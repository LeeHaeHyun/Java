package step02;

public class PhoneInfo
{
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
