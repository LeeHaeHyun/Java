import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiServer5
{
	ServerSocket serverSocket = null;
	Socket socket = null;

	// 생성자
	public MultiServer5()
	{

	}

	public void init()
	{
		try
		{
			serverSocket = new ServerSocket(9999);
			System.out.println("서버가 시작되었습니다.");
			while(true)
			{
				socket = serverSocket.accept();
				// 연결된 원격 어드레스의 정보를 보여준다.
				System.out.println(socket.getInetAddress() + ":" + socket.getPort());
				
				Thread msr = new MultiServerT(socket); //쓰레드 생성
				msr.start(); //쓰레드 시동
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				serverSocket.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args)
	{
		// 서버객체 생성
		MultiServer5 ms = new MultiServer5();
		ms.init();
	}
	
	// 내부 클래스
	// 클라이언트로부터 읽어온 메세지를 다른 클라이언트에 보내는
	// 역할을 하는 메소드
	
	class MultiServerT extends Thread
	{
		Socket socket;
		PrintWriter out = null;
		BufferedReader in = null;
		String name = "";
		
		//생성자
		public MultiServerT(Socket socket)
		{
			this.socket = socket;
			try
			{
				out = new PrintWriter(socket.getOutputStream(), true);
				in = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
			}
			catch(Exception e)
			{
				System.out.println("예외:"+e);
			}
		}
			@Override
			public void run()
			{
				String s = "";
				
				try
				{
					name = in.readLine();
					System.out.println("[" + name + "]님이 대화방에 입장하셨습니다.");
					out.println("[" + name + "] 대화방 입장");
					while (in!=null)
					{
						s = in.readLine();

						if (s == null)
							break;
						if (s.equals("q") || s.equals("Q"))
							break;
						
						System.out.println(name + " > "+ s);
						sendAllMsg(s, out);
					}
					System.out.println("쓰레드 종료");
				}
				catch (Exception e)
				{
					System.out.println("예외:"+e);
				}
				finally
				{
					try
					{
						in.close();
						out.close();

						socket.close();
					} 
					catch (Exception e)
					{
						e.printStackTrace();
					}
				}
			}
			// 접속된 모든 클라이언트들에게 메세지를 전달
			public void sendAllMsg(String msg, PrintWriter out)
			{
				try
				{
					out.println(name + " > " + msg);
				} 
				catch (Exception e)
				{
					System.out.println("예외:" + e);
				}
			}
		}
}