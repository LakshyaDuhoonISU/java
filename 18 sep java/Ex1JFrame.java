import javax.swing.*;

public class Ex1JFrame {
    public static void main(String[] args) {
        JFrame f = new JFrame(); // creating a new frame
        JButton b = new JButton("click"); // creating a button with the text "Click"
        b.setBounds(130, 100, 100, 40); // setting the position and size of the button(x axis, y axis, width, height)

        f.add(b); // adding the button to the frame

        f.setSize(400, 500); // setting the size of the frame(width, height)
        f.setLayout(null); // setting the layout of the frame(LayoutManager)
        f.setVisible(true); // setting the visibility of the frame(bool visible)
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // to close the application on closing the frame
    }
}
