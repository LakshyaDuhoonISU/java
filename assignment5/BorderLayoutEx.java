// Q10. Create a Swing application to demonstrate the border layout.

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Border Layout");
        JButton b1=new JButton("North");
        JButton b2=new JButton("South");
        JButton b3=new JButton("East");
        JButton b4=new JButton("West");
        JButton b5=new JButton("Center");
        frame.add(b1, BorderLayout.NORTH);
        frame.add(b2, BorderLayout.SOUTH);
        frame.add(b3, BorderLayout.EAST);
        frame.add(b4, BorderLayout.WEST);
        frame.add(b5, BorderLayout.CENTER);
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
