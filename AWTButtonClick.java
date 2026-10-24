import java.awt.*;
import java.awt.event.*;

public class AWTButtonClick {
    public static void main(String[] args) {
        Frame frame = new Frame("Button Example");

        Button button = new Button("Click Me");

        button.addActionListener(e ->
            System.out.println("Button Clicked")
        );

        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.setSize(300, 200);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}