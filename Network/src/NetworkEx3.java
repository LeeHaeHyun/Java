import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
// 버퍼로 읽어서 소스 가져오기
public class NetworkEx3
{
	public static void main(String[] args)
	{
		URL url = null;
		BufferedReader input = null;
		String address = "http://www.enjoypuzzle.com";
		String line = "";
		
		try
		{
			url = new URL(address);
			input = new BufferedReader(new InputStreamReader(url.openStream()));
			
			while((line=input.readLine()) !=null)
			{
				System.out.println(line);
			}
			input.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
