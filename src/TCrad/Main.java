package TCrad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import java.util.*;

import static java.lang.Thread.sleep;

public class Main {
    HashMap<Integer,String> hm = new HashMap<Integer,String>();
    HashMap<String,Integer> mh = new HashMap<String,Integer>();
    ArrayList<Integer> array = new ArrayList<Integer>();
    static person[] p = new person[20];
    int pokes=-1;
    static int people=0;
    static int rounds=0;
    static int start = -1;
    public Main() throws InterruptedException {
//        System.out.println(people);
//        System.out.println(rounds);
        for (int i=0;i<=people;i++) p[i] = new person();
        JPanel jp = new JPanel();
        jp.setLayout(new FlowLayout(FlowLayout.LEFT,1,people));
        for (int i=1;i<=people;i++) jp.add(p[i].jp2);
        JFrame jf = new JFrame("21点游戏");
        JPanel jp1 = new JPanel();
        jp1.setLayout(new FlowLayout(FlowLayout.CENTER,1,3));
        jp1.add(new JLabel(""));
        jp1.add(p[0].jp2);
        jp1.add(new JLabel(""));
        jf.add(jp1,BorderLayout.NORTH);
        jf.add(jp);
        jf.setSize(people*250,400);
        jf.setLocationRelativeTo(null);
        //jf.pack();
        jf.setVisible(true);
        jf.setLocationRelativeTo(null);
        jf.setResizable(false);
        String[] colors = {"♠","♥","♣","♦"};
        String[] numbers = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        int idx=1;
        for (String color : colors)
            for (String number : numbers)
            {
                hm.put(idx, color + number);
                array.add(idx);
                idx++;
            }
        idx=1;
        for (String number : numbers)
        {
            mh.put(number,idx);
            if(idx<10)idx++;
        }
        for (int i=1;i<=rounds;i++) {
            init();
            sport();
        }
        jf.dispose();
        end end = new end();
    }
    public void init() throws InterruptedException {
        Collections.shuffle(array);
        p[0].card="??";
        p[0].b1.setEnabled(false);
        p[0].b2.setEnabled(false);
        for (int i=1;i<=people;i++){
            p[i].card="";
            p[i].jtf.setText("分数");
            p[i].flag=-1;
        }
        pokes=1;
        for (int i=0;i<(people+1)*2;i++,pokes++)
        {
            int j = i%(people+1);
            //p[j].card=p[j].card+hm.get(array.get(i));

            ImageIcon icon;
            if ( i != 0 ) {
                icon = new ImageIcon("C:\\Users\\忭忻\\IdeaProjects\\Work\\poker_cards_" + array.get(i) + ".png");
                p[j].card=p[j].card+hm.get(array.get(i));
            }
            else icon = new ImageIcon("C:\\Users\\忭忻\\IdeaProjects\\Work\\poker_cards_53.png");
            Image image = icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
            icon = new ImageIcon(image);
            JLabel label = new JLabel(icon);
            p[j].poker_card_showing.add(label);
        }

        for (int i=0;i<=people;i++)
        {
            p[i].poker_card_showing.setPreferredSize(new Dimension(200, 100));
            p[i].poker_card_showing.setBorder(BorderFactory.createEmptyBorder());
            p[i].poker_card_showing.revalidate();
            p[i].poker_card_showing.repaint();
        }

        for (int i=1;i<=people;i++)calc(i);
        int score = calcscore(p[0].card.substring(2));
//        System.out.println("----"+p[0].card.substring(2));
//        System.out.println("===="+p[1].card);
        p[0].jtf.setText("点数"+score);
    }
    public int calcscore(String str)
    {
        int score=0;
        int cnt=0;
        for (int i=1;i<str.length();i+=2) {
            String s = str.charAt(i)+"";
            if(str.charAt(i)=='1'&&i+1<str.length()&&str.charAt(i+1)=='0')
            {
                s+='0';
                i++;
            }
            if(mh.get(s)==1)cnt++;
            score+=mh.get(s);
        }
        for (int i=cnt;i>=0;i--)
        {
            if(score+i*10<=21)return score+i*10;
        }
        if(score>21)return 0;
        return score;
    }
    public void calc(int t)
    {
        int score = calcscore(p[t].card);
        p[t].jtf.setText("点数"+score);
    }

    public  void sport() throws InterruptedException {
        Queue<Integer> queue = new LinkedList();
        for (int i=1;i<=people;i++) queue.add(i);
        while (!queue.isEmpty())
        {
            int t = queue.poll();
            System.out.println(t);
            for (int i=1;i<=people;i++)
            {
                if(i==t)
                {
                    p[i].b1.setEnabled(true);
                    p[i].b2.setEnabled(true);
                }
                else {
                    p[i].b1.setEnabled(false);
                    p[i].b2.setEnabled(false);
                }
            }
            while (p[t].flag==-1)
            {
                sleep(100);
            }
            if(p[t].flag==0) calc(t);
            else
            {
                p[t].card=p[t].card+hm.get(array.get(pokes));

                ImageIcon icon = new ImageIcon("C:\\Users\\忭忻\\IdeaProjects\\Work\\poker_cards_" + array.get(pokes) + ".png");
                Image image = icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                icon = new ImageIcon(image);
                JLabel label = new JLabel(icon);
                p[t].poker_card_showing.add(label);
                p[t].poker_card_showing.revalidate(); // 重新布局面板
                p[t].poker_card_showing.repaint(); // 重绘面板

                pokes++;
                calc(t);
                if(Integer.parseInt(p[t].jtf.getText().substring(2))!=0)queue.add(t);
                p[t].flag=-1;
            }
        }
        for (int i=1;i<=people;i++)
        {
            p[i].b1.setEnabled(false);
            p[i].b2.setEnabled(false);
        }
        p[0].card=hm.get(array.get(0))+p[0].card.substring(2); // 这里是让庄家的暗牌明牌

        ImageIcon newIcon = new ImageIcon("C:\\Users\\忭忻\\IdeaProjects\\Work\\poker_cards_" + array.get(0) + ".png");
        JLabel newLabel = (JLabel) p[0].poker_card_showing.getComponent(0);
        Image newImage = newIcon.getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH);
        newIcon = new ImageIcon(newImage);
        newLabel.setIcon(newIcon);
        p[0].poker_card_showing.revalidate();
        p[0].poker_card_showing.repaint();
        calc(0);
        sleep(3000);

        while (Integer.parseInt(p[0].jtf.getText().substring(2))!=0
                &&Integer.parseInt(p[0].jtf.getText().substring(2))<17)
        {
            sleep(2000);
            p[0].card=p[0].card+hm.get(array.get(pokes));

            ImageIcon icon = new ImageIcon("C:\\Users\\忭忻\\IdeaProjects\\Work\\poker_cards_" + array.get(pokes) + ".png");
            Image image = icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
            icon = new ImageIcon(image);
            JLabel label = new JLabel(icon);
            p[0].poker_card_showing.add(label);
            p[0].poker_card_showing.revalidate();
            p[0].poker_card_showing.repaint();

            pokes++;
            calc(0);
        }
        sleep(3000);
//        System.out.println("一轮结束了");
        int ans = Integer.parseInt(p[0].jtf.getText().substring(2));
        for (int i=1;i<=people;i++)
        {
            int sum = Integer.parseInt(p[i].jtf.getText().substring(2));
            if(sum>ans) {
                p[i].score.setText("积分" + (Integer.parseInt(p[i].score.getText().substring(2)) + 1));
                p[0].score.setText("积分" + (Integer.parseInt(p[0].score.getText().substring(2)) - 1));
            }
            else
            {
                p[i].score.setText("积分"+(Integer.parseInt(p[i].score.getText().substring(2))-1));
                p[0].score.setText("积分" + (Integer.parseInt(p[0].score.getText().substring(2)) + 1));
            }
        }
        for(int i=0;i<=people;i++)
        {
            Component[] components = p[i].poker_card_showing.getComponents();
            for (Component component : components) {
                if (component instanceof JLabel) {
                    p[i].poker_card_showing.remove(component);
                }
            }
            p[i].poker_card_showing.revalidate();
            p[i].poker_card_showing.repaint();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        screen screen = new screen();
        while (start==-1)sleep(100);
        //System.out.println(start);
        if(start==0)
        {
            gamerules gamerules = new gamerules();
            while (start==0)sleep(100);
        }
        people people1 = new people();
        while (people==0)sleep(100);
        rounds rounds1 = new rounds();
        while (rounds==0)sleep(100);
        Main main = new Main();
    }
}