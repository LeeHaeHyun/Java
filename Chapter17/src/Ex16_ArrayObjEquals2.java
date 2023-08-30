import java.util.Arrays;

class INum2
{
	private int num;
	
	public INum2(int num) // private을 간접으로 사용
	{
		this.num = num;
	}
	
	@Override // equals를 오버라이딩 각각의 num의 값을 비교하는 것으로 재정의
	public boolean equals(Object obj)
	{
		if(this.num == ((INum2)obj).num)
			return true;
		else
			return false;
	}
}

public class Ex16_ArrayObjEquals2
{

	public static void main(String[] args)
	{
		INum2[] arr1 = new INum2[2];
		INum2[] arr2 = new INum2[2];

		arr1[0] = new INum2(1);
		arr2[0] = new INum2(1);
		
		arr1[1] = new INum2(2);
		arr2[1] = new INum2(2);
		
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(Arrays.equals(arr1, arr2)); //재정의가 되어 있기에 값을 비교		
	}
}
