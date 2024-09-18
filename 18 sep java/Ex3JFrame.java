import javax.swing.*;

public class Ex3JFrame extends JFrame { // inheriting JFrame, hence no need to create a new instance, can directly use the methods of it
    Ex3JFrame() {
        JButton b = new JButton("click");
        b.setBounds(130, 100, 100, 40);
        add(b);

        setSize(400, 500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Ex3JFrame();
    }
}
