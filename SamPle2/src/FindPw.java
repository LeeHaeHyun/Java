import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class FindPw extends JFrame
{
	JTextField mbtiField;
	JTextField idfld;
	JTextField emailfld;
	JTextField birfld;
	JTextField phonefld;
	JLabel titleID;
	String pass = "";
	JPasswordField passwordField;
	LoginProject lp;

	public FindPw(LoginProject lp) 
	{
		this.lp=lp;
		
		setTitle("MBTI 채팅방 비밀번호 변경");

		JPanel title = new JPanel();

		JLabel pwtitle = new JLabel("비밀번호 변경", JLabel.CENTER);
			
		pwtitle.setForeground(new Color(128, 128, 255));
		pwtitle.setFont(new Font("나눔고딕", Font.BOLD, 28));
			
		JLabel login = new JLabel("MBTI 채팅방 비밀번호 변경");
		pwtitle.add(login);
		login.setForeground(new Color(128, 128, 255));

		login.setFont(new Font("나눔고딕", Font.BOLD, 20));
		
		

		JPanel jp1 = new JPanel();
		jp1.setLayout(new GridLayout(5, 5));

		JPanel mPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel jlb0 = new JLabel("MBTI : ", JLabel.LEFT);
		jlb0.setFont(new Font("나눔고딕", Font.BOLD, 18));
		
		mPanel.add(jlb0);
		setBounds(200, 200, 391, 445);
		
		setResizable(false);  // 화면 크기 고정하는 작업
		getContentPane().setLayout(null);
		
		JLabel titleFind = new JLabel("MBTI 채팅 비밀번호 변경");
		titleFind.setFont(new Font("나눔고딕", Font.BOLD, 25));
		titleFind.setForeground(new Color(128, 128, 255));
		titleFind.setHorizontalAlignment(SwingConstants.CENTER);
		titleFind.setBounds(34, 10, 306, 55);
		getContentPane().add(titleFind);
		
		JLabel titleMBTI = new JLabel("MBTI : ");
		titleMBTI.setHorizontalAlignment(SwingConstants.RIGHT);
		titleMBTI.setFont(new Font("나눔고딕", Font.BOLD, 20));
		titleMBTI.setBounds(0, 66, 158, 33);
		getContentPane().add(titleMBTI);
		
		JLabel titleID;
		titleID = new JLabel("별명(ID) : ");
		titleID.setHorizontalAlignment(SwingConstants.RIGHT);
		titleID.setFont(new Font("나눔고딕", Font.BOLD, 20));
		titleID.setBounds(0, 213, 158, 33);
		getContentPane().add(titleID);
		
		JLabel titleMail = new JLabel("이메일(Email) : ");
		titleMail.setHorizontalAlignment(SwingConstants.RIGHT);
		titleMail.setFont(new Font("나눔고딕", Font.BOLD, 20));
		titleMail.setBounds(0, 262, 158, 33);
		getContentPane().add(titleMail);
		
		mbtiField = new JTextField();
		mbtiField.setBounds(158, 60, 192, 39);
		getContentPane().add(mbtiField);
		mbtiField.setColumns(10);
		
		birfld = new JTextField();
		birfld.setColumns(10);
		birfld.setBounds(158, 109, 192, 39);
		getContentPane().add(birfld);
		
		phonefld = new JTextField();
		phonefld.setColumns(10);
		phonefld.setBounds(158, 158, 192, 39);
		getContentPane().add(phonefld);
		
		idfld = new JTextField();
		idfld.setColumns(10);
		idfld.setBounds(158, 207, 192, 39);
		getContentPane().add(idfld);
		
		emailfld = new JTextField();
		emailfld.setColumns(10);
		emailfld.setBounds(158, 256, 192, 39);
		getContentPane().add(emailfld);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(158, 308, 192, 33);
		getContentPane().add(passwordField);
		setVisible(true);
		
		JButton passButton = new JButton("비밀번호(pw) 변경");
		passButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{		
				String mbti = mbtiField.getText();
				String birth = birfld.getText();
				String phone = phonefld.getText();
				String id = idfld.getText();
				String email = emailfld.getText();
				pass = new String(passwordField.getPassword());
				
				String sql = " UPDATE 회원DB "
						   + " SET 비밀번호_PW = ?"
						   + " WHERE MBTI = ? AND 생년월일 = ? AND 연락처 = ? AND 별명_ID = ? AND 이메일 = ?";

				Pattern passPattern1 = Pattern.compile("^(?=.*[a-zA-Z])(?=.*\\d)(?=.*\\W).{8,20}$"); //8자 영문+특문+숫자
				Matcher passMatcher = passPattern1.matcher(pass);

				if (!passMatcher.find()) 
				{
					JOptionPane.showMessageDialog(null, "비밀번호는 영문 + 특수문자 + 숫자 8자 이상으로 구성되어야 합니다", "비밀번호 오류", 2);
				} 
				else 
				{
					try 
					{
						Connection conn = lp.getConnection();

						PreparedStatement pstmt = conn.prepareStatement(sql);
						
						pstmt.setString(1, pass);
						pstmt.setString(2, mbtiField.getText());
						pstmt.setString(3, birfld.getText());
						pstmt.setString(4, phonefld.getText());
						pstmt.setString(5, idfld.getText());
						pstmt.setString(6, emailfld.getText());
						
						int r = pstmt.executeUpdate();
						JOptionPane.showMessageDialog(null, "▶ " + "[" + id + "]" +"님\n▷ "
								+ "비밀번호가 성공적으로 변경되었습니다★", "비밀번호 변경 성공", 1);
						passButton.setEnabled(false);
						dispose();						
					} 
					catch (SQLException e1) 
					{
						System.out.println("SQL error" + e1.getMessage());
						JOptionPane.showMessageDialog(null, "잘못 입력하였습니다. 다시 확인해주세요!", "오류", 2);
					} // try ,catch
				}
			}
		});
		
		passButton.setFont(new Font("나눔고딕", Font.BOLD, 20));
		passButton.setBounds(12, 351, 204, 45);
		getContentPane().add(passButton);
		
		JLabel titleBir = new JLabel("생년-월-일 : ");
		titleBir.setHorizontalAlignment(SwingConstants.RIGHT);
		titleBir.setFont(new Font("나눔고딕", Font.BOLD, 20));
		titleBir.setBounds(0, 115, 158, 33);
		getContentPane().add(titleBir);
		
		JLabel titlePhone = new JLabel("연락처(Phone) : ");
		titlePhone.setHorizontalAlignment(SwingConstants.RIGHT);
		titlePhone.setFont(new Font("나눔고딕", Font.BOLD, 20));
		titlePhone.setBounds(0, 164, 158, 33);
		getContentPane().add(titlePhone);
	
		JButton btncancel = new JButton("돌아가기");
		btncancel.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				dispose(); // 현재의 frame을 종료시키는 메서드.
			}
		});
		
		btncancel.setFont(new Font("나눔고딕", Font.BOLD, 20));
		btncancel.setBounds(228, 351, 119, 45);
		getContentPane().add(btncancel);
		
		JLabel titlePass = new JLabel("변경할 비번 : ");
		titlePass.setHorizontalAlignment(SwingConstants.RIGHT);
		titlePass.setFont(new Font("나눔고딕", Font.BOLD, 20));
		titlePass.setBounds(0, 311, 158, 33);
		getContentPane().add(titlePass);	
	}
}