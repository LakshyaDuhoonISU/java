// Q12. WAP that demonstrates the use of JPanel.

import java.awt.*;
import javax.swing.*;

public class JPanelEx {
    public static void main(String[] args) {
        JFrame f = new JFrame("Panel Example");
        JPanel panel = new JPanel();
        panel.setBounds(40, 80, 200, 200);
        panel.setBackground(Color.gray);
        JButton b1 = new JButton("Button 1");
        b1.setBounds(50, 100, 80, 30);
        JButton b2 = new JButton("Button 2");
        b2.setBounds(100, 100, 80, 30);
        panel.add(b1);
        panel.add(b2);
        f.add(panel);
        f.setSize(300, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
