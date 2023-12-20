package TCrad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class screen implements ActionListener {
    JButton jb1 = new JButton("开始游戏");
    JButton jb2 = new JButton("游戏规则");
    JFrame jf = new JFrame();
    public screen()
    {
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(2,1));
        jp.add(jb1);
        jp.add(jb2);
        jf.add(jp);
        jf.setSize(500,500);
        jf.setLocationRelativeTo(null); //居中显示
        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==jb1)Main.start=1;
        if(e.getSource()==jb2)Main.start=0;
        jf.dispose();
    }
}

