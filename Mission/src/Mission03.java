

import java.util.Scanner;

class UpDownGame 
{
	private static int COUNT = 7;
	private int[] arrInput;// 사용자 입력
	private int answer;
	
	public UpDownGame() 
	{
		arrInput = new int[COUNT];
		answer = (int) (Math.random() * 100 + 1);
	}
	public void run() 
	{
		boolean forEnd = false;
		try 
		{
			for (int i = 0; i < arrInput.length; i++) 
			{
				Scanner sc = new Scanner(System.in);
				
				System.out.print("숫자를 입력해주세요 : ");
				int num = sc.nextInt();

				if (num > answer) 
	            {
	                System.out.println("Down ===> " + (COUNT - i - 1) + "번 남아 있습니다.");
	            } 
				else if (num < answer) 
				{
	                System.out.println("Up ====> " + (COUNT - i - 1) + "번 남아 있습니다.");
	            } 
				else 
	            {
	                System.out.println("일치====> " + (i+1) + "번만에 정답!!");
	                
					//사용자가 숫자를 맞추었을 때만 true로 변경한다
	                forEnd = true;
	                
	                break;
	            }
			}
			// false를 유지하고 있다면 맞추지 못한 경우이므로 실패처리
			if (forEnd == false)
			{
				System.out.println("당신은 실패하셨습니다. 노력하세요!");
				return;
			}
		} 
	    catch (Exception e) 
	    {
	        System.out.println("잘못된 입력입니다. 처음부터 다시 입력하세요");
	        return;
	    }
	}
}
	public class Mission03
	{
		public static void main(String[] args) 
		{
			Scanner sc;
			UpDownGame game;
	
	    while (true) 
	    {
	        try 
	        {
	            sc = new Scanner(System.in);
	            System.out.println("게임시작 1");
	            System.out.println("게임종료 2");
	            System.out.println(">>");
	            
	            int num = sc.nextInt();
	            if (num == 1) 
	            {
	                game = new UpDownGame();
	                game.run();
	            } 
	            else if (num == 2) 
	            {
	            	System.out.println("게임을 종료합니다.");
	            	break;
	            }
	            else
	            {
		            System.out.println("잘못된 입력입니다.");
		            System.out.println("게임을 다시 시작 합니다.");
	                continue;
	            }
	        } 
	        catch (Exception e) 
	        {
	            System.out.println("잘못된 입력입니다.");
	            System.out.println("게임을 다시 시작 합니다.");
	        }
	    }
	}
}