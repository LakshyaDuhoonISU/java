import javax.swing.*;
import java.awt.event.*; // for ActionListener(for event handling)

public class Ex4_JButtonEv {
    public static void main(String[] args) {
        JFrame f = new JFrame("Button Example"); // naming the frame as "Button Example"
        JButton b = new JButton("click");
        JTextField tf = new JTextField(); // creating a textfield

        tf.setBounds(50, 50, 150, 20);
        b.setBounds(50, 100, 95, 30);

        b.addActionListener( // adding ActionListener to button to handle the click event and listen for the
                             // event
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) { // actionPerformed() method is called when the button
                                                                 // is clicked(or whenever the event occurs)
                        tf.setText("I am a button"); // set the textfield text to "the button is clicked"
                    }
                });
        f.add(b);
        f.add(tf);
        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
