package TCrad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gamerules implements ActionListener {
    JTextArea textArea  = new JTextArea("游戏用一副扑克牌（不含大小王），玩家和庄家（也称为荷官）轮流获得一张牌，直到牌组中的所有牌都被抽完或者双方决定不再加牌。牌面数字的点数为2-10的数字点数，J、Q、K的点数为10点，A的点数可以为1点或11点，取决于哪个值更有利于手牌的点数。\n" +
            "\n" +
            "荷官会将两张牌分别发给每位参与者，并将自己的一张牌暴露在桌面上，同时暗置第一张牌。\n" +
            "\n" +
            "玩家可以选择要求荷官发牌以增加手牌点数，或者继续保持当前手牌不变，直到达到或接近21点为止。\n" +
            "\n" +
            "当所有玩家决定停止要牌或者玩家的手牌点数爆掉时，荷官开始摸牌并根据特定规则确定是否需要再要牌。基本规则是：如果庄家的手牌点数小于17点，必须再要牌；如果庄家的手牌点数大于等于17点，则不能再要牌。\n" +
            "\n" +
            "如果玩家的手牌点数爆掉（超过21点），那么玩家输掉本局游戏。如果庄家的手牌点数爆掉，所有未爆掉的玩家都赢得游戏。如果玩家的手牌点数超过庄家的手牌点数，玩家赢得游戏，玩家积分加一，庄家积分减一。如果庄家的手牌点数超过玩家的手牌点数，玩家积分减一，庄家积分加一");JButton jb = new JButton("开始游戏");
    JFrame jf = new JFrame();

    public gamerules()
    {
        textArea.setLineWrap(true); //设置自动换行
        textArea.setWrapStyleWord(true); //设置断行不断字
        jf.add(textArea );
        jb.addActionListener(this);
        jf.add(jb, BorderLayout.NORTH);
        jf.setSize(1000,300);
        jf.setLocationRelativeTo(null); //居中显示
        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==jb)Main.start=1;
        jf.dispose();
    }
}
