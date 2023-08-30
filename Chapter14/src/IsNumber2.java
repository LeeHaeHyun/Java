
public class IsNumber2
{
	public static void main(String[] args)
	{
		String value = "12o34";
		String ch = "";
		boolean isNumber = true;
		
		for (int i=0; i<value.length(); i++) 
		{
			/*
			 charAt(인덱스) : 문자열에서 특정 index에 해당하는 문자 하나를 반환
			 index는 배열과 같이 0부터 시작
			 */
			ch = value.substring(i, i+1); // 아스키코드 // 12o34에서 1과 1다음의 사이면 1이 나온다
			System.out.println(ch);
			
			try {
				int num = Integer.parseInt(ch);
			} catch (Exception e) {
				isNumber = false;
				break;
			}
		}
		if (isNumber) {
			System.out.println(value + "는 숫자입니다.");
		} else {
			System.out.println(value + "는 숫자가 아닙니다.");
		}
	}
}
