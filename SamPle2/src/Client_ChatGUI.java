import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

class Client_ChatGUI extends JFrame implements ActionListener, KeyListener 
{
	//클라이언트용 채팅창
	String NickName;
	String Mbti;
	String sex;
	Client_Back CB = new Client_Back();
	JPanel ClientGUIPanel = new JPanel();
	JLabel UserLabel = new JLabel("현재\r\n접속자\r\n →");
	JLabel User = new JLabel("("+Mbti+")"+NickName+"("+sex+")");
	JTextField Chat = new JTextField(45);
	JButton Enter = new JButton("전송");
	TextArea ChatList = new TextArea(30, 50);
	TextArea UserList = new TextArea(30, 15);	
	private final JLabel UserLabel_1 = new JLabel("실시간 채팅창\r\n →");
	private final JButton btnNewButton = new JButton("(Game) \r\n심심해요!");
	JLabel lblNewLabel = new JLabel("▶ 공지사항☞ 2023년 7월 5일 OPEN");
	LoginProject lp;
	
	public Client_ChatGUI(String sex, String NickName, String Mbti, String IPAddress, int Port) 
	{
		this.lp = lp;
		lblNewLabel.setText(IPAddress);
		this.Mbti = Mbti;
		this.NickName = NickName;
		this.sex = sex;
		setTitle("MBTI 채팅방");
		setVisible(true);
		setLocationRelativeTo(null);
		setSize(750, 600);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ChatList.setBounds(110, 45, 369, 430);

		ChatList.setEditable(false);
		UserList.setBounds(567, 45, 146, 430);
		UserList.setEditable(false);
		Chat.setBounds(110, 481, 501, 21);
		Chat.addKeyListener(this);
		Enter.setBounds(623, 480, 72, 23);
		Enter.addActionListener(this);
		getContentPane().setLayout(null);
		ClientGUIPanel.setBounds(0, 0, 734, 561);
		ClientGUIPanel.setLayout(null);
		User.setBounds(28, 240, 0, 0);

		ClientGUIPanel.add(User);
		UserLabel_1.setBounds(12, 233, 92, 15);
		
		ClientGUIPanel.add(UserLabel_1);
		ClientGUIPanel.add(ChatList);
		UserLabel.setBounds(485, 233, 76, 15);
		ClientGUIPanel.add(UserLabel);
		ClientGUIPanel.add(UserList);
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		btnNewButton.setBounds(28, 512, 145, 39);
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				new GameShop();
			}
			
		});
		
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lblNewLabel.setBounds(28, 10, 681, 29);
		ClientGUIPanel.add(lblNewLabel);
		
		JButton btnbye = new JButton("(탈퇴) \r\n바꼈어요!");
		btnbye.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		btnbye.setBounds(388, 512, 145, 39);
		ClientGUIPanel.add(btnbye);
		
		btnbye.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				new DelPw(lp);
			}
			
		});
		

		
		ClientGUIPanel.add(btnNewButton);
		ClientGUIPanel.add(Chat);
		ClientGUIPanel.add(Enter);
		getContentPane().add(ClientGUIPanel);

		
		
		
		
		JButton btnmbti = new JButton("(MBTI) \r\n궁금해요!");
		btnmbti.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		btnmbti.setBounds(208, 512, 145, 39);
		ClientGUIPanel.add(btnmbti);
		
		btnmbti.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				new Mbti_Dic();
			}
			
		});
		
		JButton btn119 = new JButton("(신고) \r\n너무해요!");
		btn119.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		btn119.setBounds(568, 512, 145, 39);
		ClientGUIPanel.add(btn119);
		
		btn119.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				new PostAdmin119();
			}
			
		});
		

		CB.setGui(this);
		CB.getUserInfo(sex, NickName, Mbti, IPAddress, Port);
		CB.start(); // 채팅창이 켜짐과 동시에 접속을 실행해줍니다.
	}

	public void actionPerformed(ActionEvent e) 
	{ 
		// 전송 버튼을 누르고, 입력값이 1이상일때만 전송되도록 합니다.
		String Message = Chat.getText().trim();
		if (e.getSource() == Enter && Message.length() > 0) 
		{
			CB.Transmit(NickName+"("+Mbti+")"+ " : " + Message + "\n");
			Chat.setText(null);
		}
	}

	public void keyPressed(KeyEvent e) 
	{ 
		// 키보드 엔터키를 누르고, 입력값이 1이상일때만 전송되도록 합니다.
		String Message = Chat.getText().trim();
		if (e.getKeyCode() == KeyEvent.VK_ENTER && Message.length() > 0) 
		{
			CB.Transmit(NickName+"("+Mbti+")"+" : " + Message + "\n");
			Chat.setText(null);
		}
	}

	public void AppendMessage(String Message) 
	{
		ChatList.append(Message);
	}

	public void AppendUserList(ArrayList NickName) {
		// 유저목록을 유저리스트에 띄워줍니다.
		String name;
		UserList.setText(null);
		for (int i = 0; i < NickName.size(); i++) {
			name = (String) NickName.get(i);
			UserList.append(name + "\n");
		}
	}

	public void keyTyped(KeyEvent e) 
	{
	}

	public void keyReleased(KeyEvent e) 
	{
		
	}

}

