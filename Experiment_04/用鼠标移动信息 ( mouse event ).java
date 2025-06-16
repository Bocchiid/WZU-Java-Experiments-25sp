import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        new MyFrame("Handle Event");
    }
}

class MyFrame extends JFrame {
    private int x;
    private int y;

    public MyFrame(String title) {
        super(title);
        x = 200;
        y = 200;

        setBounds(100, 100, 500, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                x = e.getX();
                y = e.getY();

                repaint();
            }
        });

        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(new Color(new Random().nextInt(255), new Random().nextInt(255) ,new Random().nextInt(255)));
        g.drawString("This is a message", x, y);
    }
}
