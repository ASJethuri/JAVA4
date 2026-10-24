import javax.swing.*;
import java.awt.*;

public class SwingButtonLabel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button and Label");

        JLabel label = new JLabel("Welcome");
        JButton button = new JButton("Click Me");

        button.addActionListener(e ->
            label.setText("Button Pressed")
        );

        frame.setLayout(new FlowLayout());
        frame.add(label);
        frame.add(button);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(
            JFrame.EXIT_ON_CLOSE
        );

        frame.setVisible(true);
    }
}