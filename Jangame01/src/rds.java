import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

class rds extends JFrame
{
    int c = 0;
    JLabel[] la = new JLabel[50];
    rds()
    {
        this.setTitle("작은 수부터 클릭하여 지우세요");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        for(int i=0; i<50; i++)
        {
            la[i]= new JLabel("");
            la[i].setText(""+i);
            la[i].setSize(50,50);
            int x=(int)(Math.random()*250);
            int y=(int)(Math.random()*250);
            la[i].setLocation(x,y);
            la[i].addMouseListener(new MyMouseListener());
            this.add(la[i]);
        }
        this.setSize(300,300);
        this.setVisible(true);
    }
    class MyMouseListener implements MouseListener
    {
        @Override
        public void mouseClicked(MouseEvent e) 
        {
            JLabel a =(JLabel)e.getSource();
            if(la[c]==a)
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
