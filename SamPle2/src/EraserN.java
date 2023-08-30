import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

class EraserN extends JFrame
{
	int c = 0;
	JLabel[] la = new JLabel[33];
	
	private ImageIcon[] images = {
			new ImageIcon("img/1.png")};
	private JLabel imgLabel = new JLabel(images[0]);
	private String[] lowsu = { "작은수부터"};
	private JComboBox<String> lsComboBox = new JComboBox<String>(lowsu);		
	EraserN()
	{		
		new BGM();
		this.setTitle("숫자 지우기 게임");
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLocationRelativeTo(null); //TODO 부모 프레임을 화면 가운데에 배치
		for (int i = 0; i < 33; i++)
		{
			la[i] = new JLabel("");
			la[i].setText("" + i);
			la[i].setSize(70, 70);
			int x = (int) (Math.random() * 450);
			int y = (int) (Math.random() * 450);
			la[i].setLocation(x, y);
			la[i].addMouseListener(new MyMouseListener());
			this.add(la[i]);
		}
		this.setSize(515, 540);
		this.setVisible(true);
		this.setFocusable(true);
		this.requestFocus();
		this.setResizable(false);
		this.add(imgLabel);
		imgLabel.setBounds(0, 0, 500, 510);
		lsComboBox.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				JComboBox<String> ls=(JComboBox<String>)e.getSource();
				int index=ls.getSelectedIndex();
				imgLabel.setIcon(images[index]);
			}			
		});
	}

	class MyMouseListener implements MouseListener
	{
		@Override
		public void mouseClicked(MouseEvent e)
		{
			JLabel a = (JLabel) e.getSource();
			if (la[c] == a)
			{
				a.setVisible(false);
				c++;
			}
		}
		

		
		@Override
		public void mousePressed(MouseEvent e)
		{
		}

		@Override
		public void mouseReleased(MouseEvent e)
		{
		}

		@Override
		public void mouseEntered(MouseEvent e)
		{
		}

		@Override
		public void mouseExited(MouseEvent e)
		{
		}
	}

	public static void main(String[] args)
	{
		new EraserN();
	}
}