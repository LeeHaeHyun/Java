import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JButton;

public class GameShop extends JFrame
{

	// 생성자
	public GameShop()
	{
		setTitle("심심할 땐 GAME~!!");
		Container m = getContentPane();

		setLocationRelativeTo(null); //부모 프레임을 화면 가운데에 배치
		setResizable(false);
	
		setSize(300, 188);
		setVisible(true);
		
		m.setFocusable(true);
		getContentPane().setLayout(null);
		
		JButton rspG = new JButton("인생은 짱겜뽀");
		rspG.setFont(new Font("나눔고딕", Font.BOLD, 15));
		rspG.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				new JGB();
			}
		});
		rspG.setBounds(12, 10, 260, 36);
		getContentPane().add(rspG);
		
		JButton upDownG = new JButton("업다운 게임");
		upDownG.setFont(new Font("나눔고딕", Font.BOLD, 15));
	
		upDownG.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				new QuizApp();
			}			
		});
		upDownG.setBounds(12, 56, 260, 36);
		getContentPane().add(upDownG);
		
		
		JButton eraseG = new JButton("숫자 지우기");
		eraseG.setFont(new Font("나눔고딕", Font.BOLD, 15));

		eraseG.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				new EraserN();
			}
		});
		eraseG.setBounds(12, 102, 260, 36);
		getContentPane().add(eraseG);
	}	
		public static void main(String[] args) 
		{
			new GameShop();
		}
}
