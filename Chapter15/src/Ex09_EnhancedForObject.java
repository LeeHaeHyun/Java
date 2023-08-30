class House // DTO
{
	private int houseNum; // 정보 은닉화
	private String name;
	
	// 우클릭 - 소스 - costruc.. useing = this 생성자 
	House(int houseNum, String name)
	{
		super(); // 부모 클래스 상속을 먼저 받아야 하니까 무조건 맨처음 써야한다.
		this.houseNum = houseNum;
		this.name = name;
	}
	
	// 우클릭 - 소스 - getter setter 
	public int getHouseNum() // 간접으로 출력하기 위해 getter 생성자 
	{
		return houseNum;
	}
	public String getName()
	{
		return name;
	}
}

//객체 자료형을 가진 배열도 사용할 수 있음
public class Ex09_EnhancedForObject
{
	public static void main(String[] args)
	{
		House[] arr = new House[5]; 
		
		arr[0] = new House(101, "홍길동");
		arr[1] = new House(102, "전우치");
		arr[2] = new House(103, "손오공");
		arr[3] = new House(104, "해리포터");
		arr[4] = new House(105, "멀린");

		for(House e: arr)
		{
			if(e.getHouseNum() == 102)
				System.out.println(e.getName());
		}
	}
}
