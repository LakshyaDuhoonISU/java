// Q9. Create a Swing application to demonstrate the flow layout.

import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Flow Layout");
        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.add(new JButton("Button 3"));
        frame.add(new JButton("Button 4"));
        frame.setSize(300, 300);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
