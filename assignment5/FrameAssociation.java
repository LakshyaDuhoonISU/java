// Q1. WAP to create a frame using Association.

import javax.swing.*;

class Frame {
    JFrame frame;
    JButton button;

    Frame() {
        frame = new JFrame("Association Example");
        button = new JButton("Click Me");
        button.setBounds(50,100,100,50);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(button);
    }
}

public class FrameAssociation {
    public static void main(String[] args) {
        Frame frame = new Frame();
    }
}
