import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Ex9 extends JFrame{
    ImageIcon[] gbb = {new ImageIcon("img/SIS.png"), new ImageIcon("img/ROCK.png"), new ImageIcon("img/PAPER.png")};
    JButton[] btn = new JButton[gbb.length];
    JLabel me= new JLabel("me");
    JLabel com= new JLabel("com");
    JLabel win= new JLabel("win");
    
    Ex9(){
        this.setTitle("가위 바위 보 게임");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel northPanel = new JPanel();
        northPanel.setBackground(Color.GRAY);
        
        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.YELLOW);
        win.setForeground(Color.red);
        centerPanel.add(me);
        centerPanel.add(com);
        centerPanel.add(win);
        
        for(int i=0; i<gbb.length; i++){
            btn[i]=new JButton(gbb[i]);
            btn[i].addActionListener(new MyActionListener());
            northPanel.add(btn[i]);
        }
        
        this.add(northPanel, BorderLayout.NORTH);
        this.add(centerPanel, BorderLayout.CENTER);
        this.setSize(400,300);
        this.setVisible(true);
    }
    
    public void draw(Icon m, Icon c, String w){
        me.setIcon(m);
        com.setIcon(c);
        win.setText(w);
    }
    
    class MyActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String w;
            JButton b =(JButton)e.getSource();
            int n=(int)(Math.random()*3);
            if(btn[0]==b){
                if(n==0){
                    w="Same!!!";
                    draw(gbb[0],gbb[n],w);
                }
                else if(n==1){
                    w="COMPUTER!!!";
                    draw(gbb[0],gbb[n],w);
                }
                else if(n==2){
                    w="ME!!!";
                    draw(gbb[0],gbb[n],w);
                }
            }
            else if(btn[1]==b){
                if(n==0){
                    w="ME!!!";
                    draw(gbb[1],gbb[n],w);
                }
                else if(n==1){
                    w="Same!!!";
                    draw(gbb[1],gbb[n],w);
                }
                else if(n==2){
                    w="COMPUTER!!!";
                    draw(gbb[1],gbb[n],w);
                }
            }
            else if(btn[2]==b){
                if(n==0){
                    w="COMPUTER!!!";
                    draw(gbb[2],gbb[n],w);
                }
                else if(n==1){
                    w="ME!!!";
                    draw(gbb[2],gbb[n],w);
                }
                else if(n==2){
                    w="Same!!!";
                    draw(gbb[2],gbb[n],w);
                }
                else
                    return;
            }
        }
    }
}
public class rock {
    public static void main(String[] args) {
        new Ex9();
    }
}