/*
 접근 제한자 : 변수나 메소드에 접근 제한자를 지정하면 접근을 제한할 수 있습니다
 = 정보 은닉화 - 데이터의 안정을 위해 // 권한이 있는 사람만 볼 수 있다
 */

class Student1 // 디폴트 생성자
{
	String name;
	int age;
}

class Student2
{
	public String name;
	
	// private으로 접근 제한자를 지정, 같은 클래스에서만 접근 가능
	private int age; // private 멤버 변수
	
	
	public Student2(String name, int age) // 매개변수가 있는 생성자
	{
		/*
		 동일 클래스 내에서 private 멤버라 할지라도 접근을 허용
		 this.name은 같은 클래스의 멤버변수, 뒤의 name은 매개변수 색깔이 다름
		 */
		this.name = name; // class 내 같은색 변수
		this.age = age;
	}
	
	// get set은 우클릭 - source - general getter and setter로 자동 생성 가능
	public int getAge() // 게터 : get대문자 시작 ( 출력 )
	{
		return age;
	}
	
	public void setAge(int age) // 세터 : set대문자 시작 ( 입력 )
	{
		if (age < 0 || age > 150) // 유효성 검사
		{
			System.out.println("나이가 부적절합니다.");
			this.age = 0;
			return;
		}
		this.age = age;
		this.age = age;
	}
}
public class PrivateUse
{

	public static void main(String[] args)
	{
		Student1 student1 = new Student1();
		student1.name = "홍길동"; // 멤버 변수에 직접 접근
		student1.age = -20; // 멤버 변수에 직접 접근
		System.out.printf("%s의 나이는 %d살입니다.\n",
				student1.name, student1.age);
		Student2 student2 = new Student2("전우치", 20);
		student2.name = "손오공"; // 멤버 변수에 직접 접근
		
		//private이므로 접근이 불가능해서 에러
		// student2.age = -10 에러 발생
		
//		private으로 선언된 외부 클래스에서 접근하려면 public으로 선언된 멤버 메서드를 통해 간접적으로 접근해야한다
		
		student2.setAge(-10); // 세터를 사용한 접근
		int age = student2.getAge();
		System.out.printf("%s의 나이는 %d살입니다.\n",
				student2.name, age); // 출력
	}
}
