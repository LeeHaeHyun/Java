import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Z_GameEr extends JFrame
{
	int c = 0;
	JLabel[] la = new JLabel[33];
	
	private ImageIcon[] images = {
			new ImageIcon("image/1.png")};
	private JLabel imageLabel = new JLabel(images[0]);
	private String[] lowsu = { "작은수부터"};
	private JComboBox<String> lsComboBox = new JComboBox<String>(lowsu);		
	Z_GameEr()
	{		
		new BGM();
		this.setTitle("숫자 지우기 게임");
		this.setLayout(null);

		setLocationRelativeTo(null); //부모 프레임을 화면 가운데에 배치
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
		this.add(imageLabel);
		imageLabel.setBounds(0, 0, 500, 510);
		lsComboBox.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				JComboBox<String> ls=(JComboBox<String>)e.getSource();
				int index=ls.getSelectedIndex();
				imageLabel.setIcon(images[index]);
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
}