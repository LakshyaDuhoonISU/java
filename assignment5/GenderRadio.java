// Q7.Create a Swing application that creates two radio button “Male”, “Female”. If a user selects a radio button, the application displays a dialog box as per user’s choice.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GenderRadio extends JFrame {
    GenderRadio() {
        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");
        JButton b = new JButton("Click");
        r1.setBounds(100, 50, 100, 30);
        r2.setBounds(100, 100, 100, 30);
        ButtonGroup bg = new ButtonGroup();
        b.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (r1.isSelected()) {
                            JOptionPane.showMessageDialog(null, "You selected Male");
                        }
                        if (r2.isSelected()) {
                            JOptionPane.showMessageDialog(null, "You selected Female");
                        }
                    }
                });
        bg.add(r1);
        bg.add(r2);
        add(r1);
        add(r2);
        add(b);
        setSize(300, 300);
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new GenderRadio();
    }
}
