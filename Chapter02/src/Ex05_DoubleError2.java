public class Ex05_DoubleError2
{

	public static void main(String[] args)
	{
		double dNum = 0.0;
		
		for (int i=0; i<1000; i=i+1)
		{
			dNum = dNum + 0.1; // 근사값만 계산된다
			//0.1을 1000번을 더한다.
			//100이 나와야 하지만 다른값이 나옴
		}
		System.out.println(dNum);
	}
}
