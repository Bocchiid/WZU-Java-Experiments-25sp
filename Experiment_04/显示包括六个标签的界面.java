import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        new MyFrame("LabelDemo");
    }
}

class MyFrame extends JFrame {
    public MyFrame(String title) {
        super(title);

        setBounds(100, 100, 500, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        String []a = {"black", "blue", "cyan", "green", "magenta", "orange"};
        Color []b = {Color.BLACK, Color.BLUE, Color.CYAN, Color.GREEN, Color.MAGENTA, Color.ORANGE};

        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        for (int i = 0; i < 6; i++) {
            JLabel label = new JLabel(a[i]);

            label.setBackground(Color.WHITE);
            label.setBorder(new LineBorder(Color.YELLOW));
            label.setFont(new Font("Times Roman", Font.BOLD, 20));
            label.setForeground(b[i]);

            container.add(label);
        }

        setVisible(true);
    }
}
