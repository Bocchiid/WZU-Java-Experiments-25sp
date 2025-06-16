import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        new MyFrame("LabelDemo");
    }
}

class MyFrame extends JFrame {
    private int cnt;

    public MyFrame(String title) {
        super(title);
        cnt = 0;

        setBounds(100, 100, 500, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        String []s = {"Java is fun", "Java is powerful"};

        JLabel label = new JLabel(s[cnt]);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                cnt = (cnt + 1) % 2;
                label.setText(s[cnt]);
            }
        });

        Container container = getContentPane();
        container.add(label);

        setVisible(true);
    }
}
