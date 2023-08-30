import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PostAdmin119 extends Frame
{
	JTextField wfld;
	JTextField pwld;
	JTextField textField;
	TextArea txt1;
	String t1 = "",t2 ="",str="",t3="";
	
    public PostAdmin119()
    {
        super("Mbti 채팅 신고하기");
        // 패널 생성
        Panel power = new Panel();
        setResizable(false);  // 화면 크기 고정하는 작업
        
        // 텍스트 에어리어 10행 30열 생성
        TextArea txt1 = new TextArea(100,30);
        txt1.setBounds(11, 182, 317, 207);
        txt1.setText("※ 신고 내용 : 누가, 언제, 어디에서, \r\n무엇을, 어떻게, 왜 \r\n( 육하원칙으로 명확하게 작성 )");
        // 배경색 검은색
        txt1.setBackground(Color.black);
        // 폰트색 파랑
        txt1.setForeground(Color.white);
        power.setLayout(null);
        power.add(txt1);
        add(power);
        
        JLabel posLb = new JLabel("===== 신고하기 =====");
        posLb.setHorizontalAlignment(SwingConstants.CENTER);
        posLb.setFont(new Font("맑은 고딕", Font.BOLD, 25));
        posLb.setBounds(0, 10, 340, 39);
        power.add(posLb);
        
        JLabel wtLb = new JLabel("▶ 작성자 별명(ID) : ");
        wtLb.setFont(new Font("나눔고딕", Font.BOLD, 18));
        wtLb.setBounds(10, 61, 173, 32);
        power.add(wtLb);
        
        wfld = new JTextField();
        wfld.setBounds(189, 62, 139, 32);
        wfld.setColumns(10);
        power.add(wfld);
        
        JLabel powLb = new JLabel("▷ 신고할 별명(ID) : ");
        powLb.setFont(new Font("나눔고딕", Font.BOLD, 18));
        powLb.setBounds(10, 101, 164, 32);
        power.add(powLb);
        
        pwld = new JTextField();
        pwld.setColumns(10);
        pwld.setBounds(189, 103, 139, 32);
        power.add(pwld);
        
        JLabel powLb_1 = new JLabel("▶ 답변 받을 이메일 : ");
        powLb_1.setFont(new Font("나눔고딕", Font.BOLD, 18));
        powLb_1.setBounds(10, 143, 173, 32);
        power.add(powLb_1);
        
        textField = new JTextField();
        textField.setColumns(10);
        textField.setBounds(189, 144, 139, 32);
        power.add(textField);
        setVisible(true); 
        
        JButton btnNewButton = new JButton("신고하기");
        btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 20));
        btnNewButton.setBounds(11, 399, 154, 52);
        power.add(btnNewButton);     
       
        btnNewButton.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{		
	        	String t1 = wfld.getText();
	        	String t2 = pwld.getText();
	        	String t3 = textField.getText();
	        	String str = txt1.getText();
				System.out.println(t1+t2+str+t3);
				new MailTest(t1,t2,str,t3);
				dispose();
			}
		});
        
        JButton btnNewButton_1 = new JButton("돌아가기");
        btnNewButton_1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
        btnNewButton_1.setBounds(174, 399, 154, 52);
        power.add(btnNewButton_1);
        setSize(356,500);
        
        btnNewButton_1.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{		
				dispose();
			}
		});
    }
}
