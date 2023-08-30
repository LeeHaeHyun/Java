import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex14_ObjectInputStream
{
/*
데이터 직렬화, 역직렬화
메모리를 디스크에 저장하거나 네트워크 통신에 사용하기 위한 형식으로 변환하는 것을 말한다
역직렬화는 그 반대로 디스크에 저장한 데이터를 읽거나 네트워크 통신으로 받은 데이터를
메모리에 쓸 수 있도록 다시 변환
: 객체를 파일로 저장하여 보내어 다시 풀어서 불러들인다.
 */
	public static void main(String[] args)
	{
		/*
		 인스턴스의 복원(역직렬화)를 위한 스트림을 생성하고 readObject를 통해 복원
		 */
		try (ObjectInputStream ois = 
				new ObjectInputStream(new FileInputStream("Object.bin")))
		{
			/*
			저장시 Object기반으로 저장되므로 복원할 때는 원래의 자료형으로 형변환(다운캐스팅) 해야 한다
			 */
			Ex12_Unit unit1 = (Ex12_Unit) ois.readObject();
			// 객체의 메서드 호출
			System.out.println(unit1.getName());
			
			Ex12_Unit unit2 = (Ex12_Unit) ois.readObject();
			System.out.println(unit2.getName());
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
