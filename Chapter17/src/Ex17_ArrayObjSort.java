import java.util.Arrays;

class Person implements Comparable // 기능 구현 Comparable이 있어야 compareTo를 사용 가능
{
	private String name;
	private int age;
	
	public Person(String name, int age)
	{
		this.name = name; 
		this.age = age;
	}
	
	public int compareTo(Object o)
	{
		Person p = (Person)o;
		
//		int nNum = this.name.compareTo(p.name); // 이름을 사전순으로 정렬
//		return nNum;
		
		if(this.age > p.age) // 나이를 작은 수부터 정렬
			return 1;
		else if(this.age < p.age)
			return -1;
		else
			return 0;
	}
	
	public String toString()
	{
		return name + ": " + age;
	}
}

public class Ex17_ArrayObjSort
{

	public static void main(String[] args)
	{
		Person[] arr = new Person[3];
		
		arr[0] = new Person("홍길동", 29);
		arr[1] = new Person("전우치", 15);
		arr[2] = new Person("손오공", 37);

		Arrays.sort(arr); // 오름차순으로 정렬한다
		
		for(Person p : arr) //향상된 for문 ( 기존 데이터를 건들지 않고 보여줌 )
			System.out.println(p);
	}
}
