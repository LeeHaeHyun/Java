import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/*
별명_ID	VARCHAR2(40 BYTE)
비밀번호_PW	VARCHAR2(50 BYTE)
이메일	VARCHAR2(100 BYTE)
생년월일	VARCHAR2(50 BYTE)
성별	VARCHAR2(10 BYTE)
MBTI	VARCHAR2(30 BYTE)
연락처	VARCHAR2(40 BYTE)
가입일	VARCHAR2(100 BYTE)*/

public class LoginProject 
{
	JPanel cardPanel;
	LoginProject lp;
	CardLayout card;
	
	public static void main(String[] args) 
	{
		LoginProject lp = new LoginProject();
		lp.setFrame(lp);
	}

	public void setFrame(LoginProject lpro) 
	{
		JFrame jf = new JFrame();
		jf.setTitle("MBTI 채팅 서비스");
		LoginPanel lp = new LoginPanel(lpro);
		signupPanel sp = new signupPanel(lpro);
		jf.getContentPane().setLayout(null);
		
		card = new CardLayout();

		cardPanel = new JPanel(card);
		cardPanel.setBounds(0, 0, 534, 661);
		cardPanel.add(lp.mainPanel, "Login");
		cardPanel.add(sp.mainPanel, "Register");
		
		jf.getContentPane().add(cardPanel);
		jf.setSize(550, 700);
		jf.setVisible(true);
	}

	public static Connection getConnection() throws SQLException 
	{
		Connection conn = null;
		
		conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.84:1521:xe", "scott", "TIGER");
		return conn;
	}
}

class LoginPanel extends JPanel implements ActionListener 
{
	JPanel mainPanel;
	JTextField idTextField;
	JTextField numbField;
	JPasswordField passTextField;
	JComboBox<String> mbtiComboBox;
	JRadioButton menButton;
	JRadioButton girlButton;
	String mbtig = "", sex = "";
	String userMode = "일반";
	LoginProject lp;
	Font font = new Font("회원가입", Font.BOLD, 50);
	String admin = "방장(관리자)";

	public LoginPanel(LoginProject lp) 
	{
		this.lp = lp;
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(5, 0));

		JPanel centerPanel = new JPanel();
		JLabel loginLabel = new JLabel("MBTI 채팅방 입장");
		loginLabel.setForeground(new Color(128, 128, 255));
		loginLabel.setFont(new Font("나눔고딕", Font.BOLD, 30));
		loginLabel.setFont(font);
		centerPanel.add(loginLabel);
		
		JLabel numbLabel = new JLabel("입장할 방번호 : ");
		numbLabel.setFont(new Font("나눔고딕", Font.BOLD, 20));
		centerPanel.add(numbLabel);
		
		numbField = new JTextField("9999", 10);
		numbField.setFont(new Font("나눔고딕", Font.BOLD, 20));
		centerPanel.add(numbField);

		JLabel numbLabel01 = new JLabel("기본값: 9999 (0 ~ 65535까지)"); //방 번호 설정
		numbLabel01.setFont(new Font("나눔고딕", Font.BOLD, 20));
		centerPanel.add(numbLabel01);
				
		menButton = new JRadioButton("남");
		menButton.setFont(new Font("나눔고딕", Font.BOLD, 17));
		girlButton = new JRadioButton("여");
		girlButton.setFont(new Font("나눔고딕", Font.BOLD, 17));
		ButtonGroup sexGroup = new ButtonGroup();
		sexGroup.add(menButton);
		sexGroup.add(girlButton);
		
		JPanel userPanel = new JPanel();
		
		JButton adminButton = new JButton("관리자 로그인");
		adminButton.setFont(new Font("나눔고딕", Font.BOLD, 25));
		userPanel.add(adminButton);

		JPanel gridBagidInfo = new JPanel(new GridBagLayout());
		gridBagidInfo.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		GridBagConstraints c = new GridBagConstraints();
		
		mbtiComboBox = new JComboBox<String>(
				new String[] {"INTJ", "INTP", "ENTJ", "ENTP", "INFJ",
						"INFP","ENFJ","ENFP","ISTJ","ISFJ",
						"ESTJ","ESFJ","ISTP","ISFP","ESTP","ESFP"});
		
		JLabel mbtiLabel = new JLabel("◆ MBTI : ");
		mbtiLabel.setFont(new Font("나눔고딕", Font.BOLD, 20));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		gridBagidInfo.add(mbtiLabel, c);
		
		mbtiComboBox.setFont(new Font("나눔고딕", Font.BOLD, 25));
		c.insets = new Insets(0, 0, 5, 5);
		c.gridx = 1;
		c.gridy = 0;
		gridBagidInfo.add(mbtiComboBox, c);
		
		
		JLabel idLabel = new JLabel("별명(ID) : ");
		idLabel.setFont(new Font("나눔고딕", Font.BOLD, 20));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 1;
		gridBagidInfo.add(idLabel, c);

		idTextField = new JTextField(15);
		c.insets = new Insets(0, 5, 0, 0);
		c.gridx = 1;
		c.gridy = 1;
		gridBagidInfo.add(idTextField, c);

		JLabel passLabel = new JLabel("비밀번호 : ");
		passLabel.setFont(new Font("나눔고딕", Font.BOLD, 20));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 2;
		c.insets = new Insets(0, 5, 0, 0);
		gridBagidInfo.add(passLabel, c);

		passTextField = new JPasswordField(15);
		c.insets = new Insets(20, 5, 0, 0);
		c.gridx = 1;
		c.gridy = 2;
		gridBagidInfo.add(passTextField, c);

		JLabel sexLabel = new JLabel("성별 : ");
		sexLabel.setFont(new Font("나눔고딕", Font.BOLD, 20));
		c.insets = new Insets(0, 0, 10, 0);
		c.gridx = 0;
		c.gridy = 3;
		gridBagidInfo.add(sexLabel, c);
		
		c.gridx = 1;
		c.gridy = 3;
		gridBagidInfo.add(menButton, c);

		c.gridx = 2;
		c.gridy = 3;
		gridBagidInfo.add(girlButton, c);
		
		JPanel loginPanel = new JPanel();
		JButton loginButton = new JButton("로그인");
		loginButton.setFont(new Font("나눔고딕", Font.BOLD, 25));
		loginPanel.add(loginButton);

		JPanel signupPanel = new JPanel();
		JButton signupButton = new JButton("회원가입");
		signupButton.setFont(new Font("나눔고딕", Font.BOLD, 25));
		signupPanel.add(signupButton);
		
		JPanel pwFind = new JPanel();
		JButton pwFindButton = new JButton("비밀번호 변경");
		pwFindButton.setFont(new Font("나눔고딕", Font.BOLD, 25));
		signupPanel.add(pwFindButton);

		mainPanel.add(centerPanel);
		mainPanel.add(userPanel);
		mainPanel.add(gridBagidInfo);
		mainPanel.add(loginPanel);
		mainPanel.add(signupPanel);
		
		pwFindButton.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{				
				new FindPw(lp);
				pwFindButton.setEnabled(false);
			}
		});
		
		menButton.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{				
				sex = e.getActionCommand();
			}
		});

		girlButton.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				sex = e.getActionCommand();
			}
		});
		
		mbtiComboBox.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				if (e.getSource() == mbtiComboBox) 
				{
					JComboBox mbtiBox = (JComboBox) e.getSource();
					mbtig = (String) mbtiBox.getSelectedItem();
				}
			}
		});
		
		loginButton.addActionListener(this);

		signupButton.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				lp.card.next(lp.cardPanel);
			}
		});

		adminButton.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				new LoginGUI();
				loginButton.setEnabled(false);
			}
		});
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JButton jb = (JButton) e.getSource();

		switch (e.getActionCommand()) {

		case "일반":
			userMode = "일반";
			break;

		case "관리자":
			userMode = "관리자";
			break;

		case "로그인":

			String id = idTextField.getText();
			String room = numbField.getText().trim();
			String pass = new String(passTextField.getPassword());
			String mbti = mbtig;
			
			try 
			{			
				String sql_query = String.format("SELECT 비밀번호_PW FROM 회원DB WHERE ((MBTI = '%s' AND 별명_ID ='%s') AND 비밀번호_PW = '%s') AND 성별 = '%s'",
						mbti, id, pass, sex);

				Connection conn = lp.getConnection();
				Statement stmt = conn.createStatement();

				ResultSet rset = stmt.executeQuery(sql_query);
				rset.next();

				if (pass.equals(rset.getString(1))) 
				{
					JOptionPane.showMessageDialog(this, "▶ " + "[" + id + "]" + "님\n▷ 어서오세요! 환영합니다★", "로그인 성공", 1);				
					String NickName = idTextField.getText();
					String IPAddress = "211.200.18.59";
					int Port = Integer.parseInt(room);
					System.out.println(Port);
					new Client_ChatGUI(sex, NickName, mbti, IPAddress, Port);
					jb.setEnabled(false);					
				} else
					JOptionPane.showMessageDialog(this, "존재하지 않는 계정입니다.", "로그인 실패", 2);

			} 
			catch (SQLException ex) 
			{
				JOptionPane.showMessageDialog(this, "존재하지 않는 계정입니다.", "로그인 실패", 2);
				System.out.println("SQLException" + ex);
			}
			break;

		}
	}

} // class