// Q5.Create a Swing application that include buttons "+", "-", "*", "/", "%" (remainder) and "CLEAR" as shown and perform arithmetic operations.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingArithmetics {
    public static void main(String[] args) {
        JFrame f = new JFrame("Swing Arithmetics");
        JButton b = new JButton("+");
        JButton b1 = new JButton("-");
        JButton b2 = new JButton("*");
        JButton b3 = new JButton("/");
        JButton b4 = new JButton("%");
        JButton b5 = new JButton("CLEAR");
        JTextField tf1 = new JTextField(10);
        JLabel l1 = new JLabel("First Number");
        JTextField tf2 = new JTextField(10);
        JLabel l2 = new JLabel("Second Number");
        JLabel l3 = new JLabel("Result");
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
                        int num1 = Integer.parseInt(tf1.getText());
                        int num2 = Integer.parseInt(tf2.getText());
                        int res = num1 * num2;
                        tf3.setText(String.valueOf(res));
                    }
                });

        b3.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int num1 = Integer.parseInt(tf1.getText());
                        int num2 = Integer.parseInt(tf2.getText());
                        int res = num1 / num2;
                        tf3.setText(String.valueOf(res));
                    }
                });

        b4.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int num1 = Integer.parseInt(tf1.getText());
                        int num2 = Integer.parseInt(tf2.getText());
                        int res = num1 % num2;
                        tf3.setText(String.valueOf(res));
                    }
                });

        b5.addActionListener(
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
        f.add(l3);
        f.add(tf3);
        f.add(b);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.setSize(400, 300);
        f.setLayout(new GridLayout(6, 2, 10, 10));
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
