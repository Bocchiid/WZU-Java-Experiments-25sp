import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        new MyFrame("LabelDemo");
    }
}

class MyFrame extends JFrame {
    private int x;
    private int y;

    public MyFrame(String title) {
        super(title);
        x = 10;
        y = 30;

        setBounds(100, 100, 500, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Timer timer = new Timer(17, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x += 10;

                if (x >= 450) {
                    x = 10;
                }

                repaint();
            }
        });

        timer.start();

        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.orange);
        g.fillOval(x, y, 50, 50);
    }
}
