import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        new MyFrame("Handle Event");
    }
}

class MyFrame extends JFrame {
    public MyFrame(String title) {
        super(title);

        setBounds(100, 100, 500, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton button = new JButton("Please click me");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicked");
                new MyDialog();
            }
        });

        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        container.add(button, BorderLayout.NORTH);

        setVisible(true);
    }
}

class MyDialog extends JDialog {
    public MyDialog() {
        setBounds(100, 100, 500, 500);
        setTitle("This is a message box");

        setVisible(true);
    }
}
