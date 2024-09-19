import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.*;

public class Ex1SquareCalculator {
    public static void main(String[] args) {
        JFrame f = new JFrame("Square Calculator");
        JButton b = new JButton("Calculate square");
        JButton b1 = new JButton("Reset");
        JTextField tf = new JTextField(10);
        JLabel l = new JLabel("Enter a number: ");

        l.setBounds(50, 50, 150, 20);
        tf.setBounds(150, 50, 150, 20);
        b.setBounds(50, 100, 150, 30);
        b1.setBounds(200, 100,95,30);

        b.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int num = Integer.parseInt(tf.getText());
                        int res = num * num;
                        tf.setText(String.valueOf(res));
                    }
                });

        b1.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        tf.setText("");
                    }
                });
        f.add(l);
        f.add(tf);
        f.add(b);
        f.add(b1);
        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
