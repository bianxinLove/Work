package TCrad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class person {
    JButton b1 = new JButton("发牌");
    JButton b2 = new JButton("停牌");
    JTextField jtf = new JTextField("点数");
    JPanel jp1 = new JPanel();
    String card = "";
    JPanel poker_card_showing = new JPanel(new FlowLayout(FlowLayout.CENTER));
    public JPanel jp2 = new JPanel();
    JTextField score = new JTextField("积分0");
    int flag=-1;

    public person()
    {
        jp2.setLayout(new BorderLayout());
        jp1.setLayout(new FlowLayout(FlowLayout.LEFT,1,4));
        jp1.add(b1);
        jp1.add(b2);
        jp1.add(jtf);
        jp1.add(score);
        jtf.setPreferredSize(new Dimension(50,25));
        score.setPreferredSize(new Dimension(50,25));
        jp2.add(jp1,BorderLayout.CENTER);
        jp2.add(poker_card_showing,BorderLayout.NORTH);
        b2.addActionListener(new listener2());
        b1.addActionListener(new listener1());
    }
    private class listener2 implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            flag=0;
        }
    }
    private class listener1 implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            flag=1;
        }
    }
}
