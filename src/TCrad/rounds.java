package TCrad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class rounds implements ActionListener {
    JFrame jframe = new JFrame();
    JPanel jp = new JPanel();
    JTextField jtf = new JTextField("请选择游戏要进行的轮数");
    JButton[] jb = new JButton[20];
    public rounds()
    {
        jp.setLayout(new FlowLayout(6));
        for (int i=1;i<=11;i+=2)
        {
            jb[i]=new JButton(i+"轮");
            jb[i].setPreferredSize(new Dimension(150, 100));
            jb[i].addActionListener(this);
            jp.add(jb[i]);
        }
        jframe.add(jp, BorderLayout.SOUTH);
        jframe.add(jtf);
        Font font = new Font("宋体", Font.PLAIN, 30);
        jtf.setFont(font);
        // 设置初始大小并根据组件的首选大小调整窗口大小
        jframe.setPreferredSize(new Dimension(950, 300));
        jframe.pack();
        // 设置为可调整大小
        jframe.setResizable(true);
        jframe.setLocationRelativeTo(null); //居中显示
        jframe.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i=1;i<=11;i+=2)
        {
            if(e.getSource()==jb[i])
            {
                Main.rounds=i;
                jframe.dispose();
            }
        }
    }

//    public static void main(String[] args) {
//        rounds rounds = new rounds();
//    }
}
