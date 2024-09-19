import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex3RadioButton extends JFrame {
    Ex3RadioButton() {
        JRadioButton r1 = new JRadioButton("C++");
        JRadioButton r2 = new JRadioButton("Java");
        JButton b = new JButton("Click");
        r1.setBounds(100, 50, 100, 30);
        r2.setBounds(100, 100, 100, 30);
        ButtonGroup bg = new ButtonGroup();
        b.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (r1.isSelected()) {
                            JOptionPane.showMessageDialog(null, "You selected C++");
                        }
                        if (r2.isSelected()) {
                            JOptionPane.showMessageDialog(null, "You selected Java");
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
        new Ex3RadioButton();
    }
}
