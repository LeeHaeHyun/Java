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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Server_Gui 
{

	public static void main(String[] args) 
	{
		new ManagerLogin();
	}
}

class ManagerLogin extends JFrame implements ActionListener, KeyListener 
{ 
	// 로그인 창
	Server_ChatGUI Server_chat = null;
	JPanel Port_Log = new JPanel();
	JLabel Port_Label = new JLabel("생성할 MBTI 채팅방 번호 입력");
	
	JLabel Port_Warning = new JLabel("(단, 방번호는 0 ~ 65535까지)");
	JTextField Port_Text = new JTextField(20);
	JButton Port_Enter = new JButton("방 만들기!");
	

	public ManagerLogin() 
	{
		Port_Label.setFont(new Font("나눔고딕", Font.BOLD, 20));
		Port_Warning.setFont(new Font("나눔고딕", Font.BOLD, 15));
		Port_Enter.setFont(new Font("나눔고딕", Font.BOLD, 15));
		setTitle("MBTI 생성 (관리자)");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫았을 때 메모리에서 제거되도록 설정합니다.
		setSize(300, 150);
		setVisible(true);
		setResizable(false);
		Port_Enter.addActionListener(this);
		Port_Text.addKeyListener(this);
		Port_Log.add(Port_Label);
		Port_Log.add(Port_Warning);
		Port_Log.add(Port_Text);
		Port_Log.add(Port_Enter);
		add(Port_Log);
	}

	public void actionPerformed(ActionEvent e) { 
		// "방 만들기!" 버튼을 누르면 작동이 됩니다.
		try {
			int Port = Integer.parseInt(Port_Text.getText().trim());
			if (e.getSource() == Port_Enter) {
				Server_chat = new Server_ChatGUI(Port);
				setVisible(false);
			}
		} catch (Exception a) {
			JOptionPane.showMessageDialog(null, "올바르지 않은 입력입니다!");
		}
	}

	public void keyPressed(KeyEvent e) { 
		// 텍스트필드에 값을 입력한 후 엔터키를 누르면 작동이 됩니다.
		try {
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				int Port = Integer.parseInt(Port_Text.getText().trim());
				Server_chat = new Server_ChatGUI(Port);
				setVisible(false);
			}
		} catch (Exception a) {
			JOptionPane.showMessageDialog(null, "올바르지 않은 입력입니다!");
		}

	}

	public void keyTyped(KeyEvent e) { // 불필요
	}

	public void keyReleased(KeyEvent e) { // 불필요
	}

}

class Server_ChatGUI extends JFrame implements ActionListener, KeyListener {
	// 서버용 채팅창
	JPanel ServerGUI_Panel = new JPanel();
	JLabel ServerLabel = new JLabel("Main Server");
	JLabel UserLabel = new JLabel("User List");
	JTextField Chat = new JTextField(45);
	JTextField GongJi = new JTextField(15);
	JButton Enter = new JButton("전송");
	TextArea ServerChatList = new TextArea(30, 50);
	TextArea UserList = new TextArea(30, 15);
	Server_Back SB = new Server_Back();
	JButton btnNewButton = new JButton("공지사항 수정");
	JButton donSp = new JButton("금칙어 설정");
	JButton goAway = new JButton("접속거부 등록/해제");
	JButton chatLog = new JButton("채팅 로그 저장");
	
	
	public Server_ChatGUI(int Port) 
	{
		
		setTitle("MBTI 채팅방(관리자 모드)");
		setVisible(true);
		setLocationRelativeTo(null);
		setSize(750, 590);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫았을 때 메모리에서 제거되도록 설정합니다.
		Enter.setFont(new Font("나눔고딕", Font.BOLD, 15));
		btnNewButton.setFont(new Font("나눔고딕", Font.BOLD, 15));
		donSp.setFont(new Font("나눔고딕", Font.BOLD, 15));
		goAway.setFont(new Font("나눔고딕", Font.BOLD, 15));
		chatLog.setFont(new Font("나눔고딕", Font.BOLD, 15));
		
		ServerChatList.setEditable(false);
		UserList.setEditable(false);
		Chat.addKeyListener(this);
		Enter.addActionListener(this);
		btnNewButton.addActionListener(this);
		ServerGUI_Panel.setBounds(0, 0, 734, 511);
		
		ServerGUI_Panel.add(ServerLabel);
		ServerGUI_Panel.add(ServerChatList);
		ServerGUI_Panel.add(UserLabel);
		ServerGUI_Panel.add(UserList);
		ServerGUI_Panel.add(Chat);
		ServerGUI_Panel.add(Enter);
		ServerGUI_Panel.add(btnNewButton);
		ServerGUI_Panel.add(donSp);
		ServerGUI_Panel.add(goAway);
		ServerGUI_Panel.add(chatLog);
		ServerGUI_Panel.add(GongJi);
		add(ServerGUI_Panel);

		UserList.append("방장(관리자)\n"); // 실행과 동시에 서버주인(Admin)을 유저목록에 추가하도록 합니다.
		SB.setGUI(this);
		SB.Start_Server(Port);
		SB.start(); // 서버 채팅창이 켜짐과 동시에 서버소켓도 함께 켜집니다.
	}

	public void actionPerformed(ActionEvent e) 
	{ // 전송 버튼을 누르고, 입력값이 1이상일때만 전송되도록 합니다.
		String Message = Chat.getText().trim();
		String goji = GongJi.getText().trim();
		if (e.getSource() == Enter && Message.length() > 0) 
		{
			AppendMessage("방장(관리자) : " + Message + "\n");
			SB.Transmitall("방장(관리자) : " + Message + "\n");
			Chat.setText(null); // 채팅창 입력값을 초기화 시켜줍니다.
		}
		if (e.getSource() == btnNewButton) // 공지사항 수정
		{
			System.out.println(Message);
			Client_ChatGUI gong= new Client_ChatGUI(" "," "," ",goji,0);
			gong.lblNewLabel.setText(goji);
		}
	}

	public void keyPressed(KeyEvent e) { // 키보드 엔터키를 누르고, 입력값이 1이상일때만 전송되도록 합니다.
		String Message = Chat.getText().trim();
		if (e.getKeyCode() == KeyEvent.VK_ENTER && Message.length() > 0) {
			AppendMessage("방장(관리자) : " + Message + "\n");
			SB.Transmitall("방장(관리자) : " + Message + "\n");
			Chat.setText(null); // 채팅창 입력값을 초기화 시켜줍니다.
		}
	}

	public void AppendMessage(String Message) 
	{
		ServerChatList.append(Message);
	}

	public void AppendUserList(ArrayList NickName) 
	{
		String name;
		for (int i = 0; i < NickName.size(); i++) 
		{
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