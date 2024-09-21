// Q2. WAP to create a frame using Inheritance.
import javax.swing.*;

class Frame extends JFrame {
    JButton button;

    Frame() {
        button = new JButton("Click");
        button.setBounds(50,100,100,50);
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        add(button);
    }
}

public class FrameInheritance {
    public static void main(String[] args) {
        new Frame();
    }
}
