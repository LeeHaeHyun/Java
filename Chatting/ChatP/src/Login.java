import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login extends JFrame 
{
	public Login() // 생성자
	{
		// 기본 생성 셋팅
		setTitle("MBTI 채팅방"); // 타이틀명		
		JPanel title = new JPanel(); // 타이틀 패널 생성
		JLabel login = new JLabel("MBTI 채팅방"); // 타이틀 라벨 이름
		setBounds(500, 500, 500, 500); // 패널 크기(디폴트 값)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X누르면 프로그램 종료
		setResizable(false);  // 유저가 자유롭게 크기 조절 가능
		setVisible(true); // 보이게 하기
		
		login.setFont(new Font("나눔고딕", Font.BOLD, 28)); // 글꼴 설정
		title.add(login); // 타이틀에 글꼴 추가		
		login.setForeground(new Color(5, 0, 153)); // 타이틀 RGB 색상 설정
		
		JPanel pro = new JPanel(); // pro 패널 생성
		pro.setLayout(null); // pro 레이아웃 자유변경(on)
		
		// 구조
		
		String[] mbtilist={"apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry"};
		JComboBox mbtipart = new JComboBox(mbtilist);	
		pro.add(mbtipart);
		
		JLabel jlb1 = new JLabel("MBTI : ", JLabel.CENTER);
		
		mbtipart.add(jlb1);

		pro.add(mbtipart);
		
		
		
		
		
		
		
		
		
//		pro.setLayout(new GridLayout(5, 3,10,10));
	}
}
//		// Color color = new Color(5, 0, 153)
//		
//		
//		
//		// Font font = new Font("휴먼편지체", Font.BOLD, 25);
//		
//		
//		
//		
//		
//		
//		
////		
//		

//		
//		
//		JPanel idPart = 
//			new JPanel(new FlowLayout(FlowLayout.RIGHT));
//		JLabel jlb2 = new JLabel("별명(ID) : ", JLabel.CENTER);
//		
//		JPanel idPart2 = 
//				new JPanel(new FlowLayout(FlowLayout.LEFT));
//		JTextField jtf2 = new JTextField(4);
//		
//		idPart.add(jlb2); idPart2.add(jtf2);
//		
//		pro.add(idPart); 
//		pro.add(idPart2);
//		
//		JPanel pwPart = 
//				new JPanel(new FlowLayout(FlowLayout.RIGHT));
//		JLabel jlb3 = new JLabel("비밀번호(pw) : ", JLabel.CENTER);
//			
//		JPanel pwPart2 = 
//				new JPanel(new FlowLayout(FlowLayout.LEFT));
//		JTextField jtf3 = new JTextField(10);
//			
//		pwPart.add(jlb3); pwPart2.add(jtf3);
//		
//		pro.add(pwPart); pro.add(pwPart2);
//		
//		
//		JPanel loginPanel = 
//				new JPanel(new FlowLayout(FlowLayout.RIGHT));
//		JButton jLogin = new JButton("로그인");
//		
//		JPanel joinPanel = 
//				new JPanel(new FlowLayout(FlowLayout.LEFT));
//		JButton join = new JButton("회원가입");
//		
//		loginPanel.add(jLogin); joinPanel.add(join);
//		
//		pro.add(loginPanel); pro.add(joinPanel);
//		
//		
//		JPanel jp2 = new JPanel();
//		jp2.setLayout(new FlowLayout());
//		jp2.add(pro);
//		
//		getContentPane().setLayout(new BorderLayout());
//		
//		getContentPane().add(title, BorderLayout.NORTH);
//		getContentPane().add(jp2, BorderLayout.WEST);
//		

//		
//		
//		// 이벤트 처리
//		jLogin.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				String myMBTI = jtf1.getText();
//				String myId = new String(jtf2.getText());
//				String myPw = new String(jtf3.getText());
//				
//				JOptionPane.showMessageDialog
//					(null, "MBTI : "+myMBTI+", 별명(ID) : "+myId+", 비밀번호 : "+myPw);
//			}
//		});
//		
//		
//		join.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				
//				new Join();
//				dispose();  // 현재의 frame을 종료시키는 메서드.
//				
//			}
//		});
//
//		
//	}
//}