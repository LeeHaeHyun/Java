import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Admin_Login 
{
	public static void main(String[] args) 
	{
		LoginGUI LG = new LoginGUI();
	}
}

class LoginGUI extends JFrame implements ActionListener 
{
	// 유저의 로그인 창
	private JPanel Login_GUIPanel = new JPanel();
	private JLabel AdminCode_LB = new JLabel("관리자 코드 입력");
	
	private JTextField Admin_Text = new JTextField(20);
	private JButton Login_GUI_Button = new JButton("접속!");

	public LoginGUI() 
	{
		AdminCode_LB.setFont(new Font("나눔고딕", Font.BOLD, 30));
		Login_GUI_Button.setFont(new Font("나눔고딕", Font.BOLD, 20));
		setTitle("관리자 로그인");
		setLocationRelativeTo(null);
		setSize(300, 180);
		setResizable(false);
		setVisible(true);
		Login_GUI_Button.setPreferredSize(new Dimension(260, 40));
		Login_GUI_Button.addActionListener(this);
		Login_GUIPanel.add(AdminCode_LB);
		Login_GUIPanel.add(Admin_Text);
		Login_GUIPanel.add(Login_GUI_Button);
		add(Login_GUIPanel);
	}

	public void actionPerformed(ActionEvent e) 
	{
		String Admit = Admin_Text.getText().trim();
		// 닉네임, 주소, 포트값을 버튼을 통해 입력받습니다.
		try 
		{
			if (e.getSource() == Login_GUI_Button && Admit.equals("환상을 보여 Dream"))
			{
				new ManagerLogin();
				dispose();
			}
			else
			{
				JOptionPane.showMessageDialog(null, "★ 관리자가 아니라면 접속을 금합니다");
			}
			
		} 
		catch (Exception a) 
		{
			// 만약 올바르지 않는 값이 입력되면 팝업창을 띄워줍니다.
			JOptionPane.showMessageDialog(null, "★ 관리자가 아니라면 접속을 금합니다");
		}
	}
}