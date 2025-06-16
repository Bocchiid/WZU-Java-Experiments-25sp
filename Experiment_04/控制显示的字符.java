import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main {
    public static void main(String[] args) {
        new MyFrame("LabelDemo");
    }
}

class MyFrame extends JFrame {
    private int x;
    private int y;
    private String text;

    public MyFrame(String title) {
        super(title);
        x = 250;
        y = 250;
        text = "Hello World!";

        setBounds(100, 100, 500, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    y -= 10;
                } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    y += 10;
                } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    x -= 10;
                } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    x += 10;
                }

                repaint();
            }
        });

        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.orange);
        g.drawString(text, x, y);
    }
}
