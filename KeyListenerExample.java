import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyListenerExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Key Listener");

        JLabel label = new JLabel("Press any key");
        JTextField textField = new JTextField(15);

        textField.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                label.setText(
                    "Key Pressed: "
                    + KeyEvent.getKeyText(e.getKeyCode())
                );
            }
        });

        frame.setLayout(new FlowLayout());
        frame.add(textField);
        frame.add(label);

        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(
            JFrame.EXIT_ON_CLOSE
        );

        frame.setVisible(true);
        textField.requestFocusInWindow();
    }
}