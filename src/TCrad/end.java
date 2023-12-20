package TCrad;

import javax.swing.*;
import java.awt.*;

public class end {
    JFrame jf = new JFrame();
    JPanel jp = new JPanel();
    public end()
    {
        jp.setLayout(new GridLayout(Main.people+1,1));
        for (int i=0;i<=Main.people;i++)
        {
            int score = Integer.parseInt(Main.p[i].score.getText().substring(2));
            String str = "玩家"+i;
            if(i==0)str="庄家";
            JTextField jtf = new JTextField();
            if(score>=0)jtf.setText(str+"赢了"+score);
            else jtf.setText(str+"输了"+(-1*score));
            jtf.setPreferredSize(new Dimension(300, 50));
            jtf.setHorizontalAlignment(JTextField.CENTER);
            jp.add(jtf);
        }
        jf.add(jp);
        jf.pack();
        jf.setVisible(true);
        jf.setLocationRelativeTo(null);
        jf.setResizable(false);
    }
}
