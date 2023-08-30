//문제2) QuMyFriendDetailInfo.java
//다음 상속관계에 있는 두 클래스의 적절한 생성자를 정의해보자.
//main 함수에서는 MyFriendDetailInfo 클래스를 통해서 
//객체를 생성해야 하고 생성된 정보를 확인할 수 있도록 해보자.

package quiz;

//친구의 정보를 저장할 기본클래스
class MyFriendInfo{
	private String name;
	int age;
	
	public MyFriendInfo(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public void showMyFriendInfo() {
		System.out.println("이름: "+ name);
		System.out.println("나이: "+ age);
	}
}
//친구의 기본정보 외 상세정보를 저장할 클래스
class MyFriendDetailInfo extends MyFriendInfo
{
	private String addr;
  	private String phone;
  	
  	/*
  	생성자 : 부모클래스의 멤버변수가 2개, 자식의 멤버변수가 2개이므로
  		총 4개의 인수를 전달받을 매개변수가 정의되어야 한다.
  	 */
	public MyFriendDetailInfo(String name, int age, String addr, String phone)
	{	
		// 부모로 2개를 전달한다. (부모 생성자 호출)
		super(name, age);
		// 자식의 멤버변수 초기화
		this.addr = addr;
		this.phone = phone;
	}
	
	public void showMyFriendDetailInfo(){
		showMyFriendInfo();
		System.out.println("주소: "+ addr);
		System.out.println("전화: "+ phone);
	}
}
class QuMyFriendDetailInfo {
	public static void main(String[] args) {
		//이름, 나이, 주소, 전화번호를 인자로 객체를 생성…
		MyFriendDetailInfo mfdInfo1 = new MyFriendDetailInfo("이순신", 100, "성균관", "010-1000-8888");
		
		//정보Print	
		mfdInfo1.showMyFriendDetailInfo();
	}
}
