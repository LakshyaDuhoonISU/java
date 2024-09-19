import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;

public class Ex2SimpleCalculator {
    public static void main(String[] args) {
        JFrame f = new JFrame("Simple Calculator");
        JButton b = new JButton("Add");
        JButton b1 = new JButton("Subtract");
        JButton b2 = new JButton("Reset");
        JTextField tf1 = new JTextField(10);
        JLabel l1 = new JLabel("Enter first number: ");
        JTextField tf2 = new JTextField(10);
        JLabel l2 = new JLabel("Enter second number: ");
        JLabel l3 = new JLabel("Result: ");
        JTextField tf3 = new JTextField(10);

        b.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int num1 = Integer.parseInt(tf1.getText());
                        int num2 = Integer.parseInt(tf2.getText());
                        int res = num1 + num2;
                        tf3.setText(String.valueOf(res));
                    }
                });

        b1.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int num1 = Integer.parseInt(tf1.getText());
                        int num2 = Integer.parseInt(tf2.getText());
                        int res = num1 - num2;
                        tf3.setText(String.valueOf(res));
                    }
                });

        b2.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        tf1.setText("");
                        tf2.setText("");
                        tf3.setText("");
                    }
                });
                
        f.add(l1);
        f.add(tf1);
        f.add(l2);
        f.add(tf2);
        f.add(b2);
        f.add(l3);
        f.add(tf3);
        f.add(b);
        f.add(b1);
        f.setSize(400, 500);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
