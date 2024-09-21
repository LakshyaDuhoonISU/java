// Q8.Create a Swing application that creates two check boxes. Depending on the user selection of check boxes, message should be displayed.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckBoxEx extends JFrame {
    CheckBoxEx() {
        JCheckBox c1 = new JCheckBox("C++");
        JCheckBox c2 = new JCheckBox("Java");
        JLabel l1 = new JLabel("C++ Checkbox: unchecked");
        JLabel l2 = new JLabel("Java Checkbox: unchecked");

        c1.addItemListener(
                new ItemListener() {
                    public void itemStateChanged(ItemEvent e) {
                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            l1.setText("C++ Checkbox: checked");
                        } else {
                            l1.setText("C++ Checkbox: unchecked");
                        }
                    }
                });
        
        c2.addItemListener(
                new ItemListener() {
                    public void itemStateChanged(ItemEvent e) {
                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            l2.setText("Java Checkbox: checked");
                        } else {
                            l2.setText("Java Checkbox: unchecked");
                        }
                    }
                });

        add(l1);
        add(l2);
        add(c1);
        add(c2);
        setSize(300, 200);
        setLayout(new GridLayout(4, 1));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new CheckBoxEx();
    }
}
