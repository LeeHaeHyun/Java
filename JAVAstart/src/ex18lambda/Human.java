package ex18lambda;

//DTO : 데이터를 활용하기 위해
public class Human
{
	// 맴버 변수 : 이름, 성별, 점수
	String name;
	String gender;
	int score;

	// 생성자
	public Human(String name, String gender, int score)
	{
		this.name = name;
		this.gender = gender;
		this.score = score;
	}

	// 게터 세터 : 삽입 및 출력 
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getGender()
	{
		return gender;
	}

	public void setGender(String gender)
	{
		this.gender = gender;
	}

	public int getScore()
	{
		return score;
	}

	public void setScore(int score)
	{
		this.score = score;
	}
}
