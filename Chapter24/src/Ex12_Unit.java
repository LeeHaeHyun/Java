
public class Ex12_Unit implements java.io.Serializable //직렬화 할 수 있다는 표시
{
	// 안넣어도 되지만 되도록이면 넣을 것
	private static final long serialVersionUID = 1L;
	private String name;
	
	// 생성자 - 클래스 이름과 같은 건 무조건 생성자
	public Ex12_Unit(String name)
	{
		this.name = name;
	}
	
	public String getName() // private이기 떄문에 간접으로 getName을 통해 불러온다
	{
		return name;
	}
}
