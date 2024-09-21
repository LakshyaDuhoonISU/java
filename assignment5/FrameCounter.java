// Q3. Write an swing GUI application as shown in the Figure. Each time the "Count" button is clicked, the counter value shall increase by 1.

import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.*;

public class FrameCounter {
    FrameCounter() {
        JFrame counter = new JFrame("Swing Counter");
        JButton button = new JButton("Count");
        JTextField textField = new JTextField(10);
        JLabel label = new JLabel("Counter");
        textField.setText("0");
        button.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int res = Integer.parseInt(textField.getText());
                        textField.setText(Integer.toString(res + 1));
                    }
                });
        counter.add(label);
        counter.add(textField);
        counter.add(button);
        counter.setSize(400, 400);
        counter.setLayout(new FlowLayout());
        counter.setVisible(true);
        counter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new FrameCounter();
    }
}
