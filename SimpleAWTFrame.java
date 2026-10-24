import java.awt.*;
import java.awt.event.*;

public class SimpleAWTFrame {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Example");

        Label label = new Label("Welcome to Java GUI");

        frame.add(label);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}