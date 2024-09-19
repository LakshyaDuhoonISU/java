import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex4CheckBox extends JFrame {
    Ex4CheckBox() {
        JCheckBox c1 = new JCheckBox("Male");
        JCheckBox c2 = new JCheckBox("Female");
        JButton b = new JButton("Click");
        b.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String msg = "You selected: ";
                        if (c1.isSelected()) {
                            msg += "Male";
                        }
                        if (c2.isSelected()) {
                            msg += "Female";
                        }
                        JOptionPane.showMessageDialog(null, msg);
                    }
                });
        add(c1);
        add(c2);
        add(b);
        setSize(300, 300);
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Ex4CheckBox();
    }
}
