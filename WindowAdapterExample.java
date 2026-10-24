import java.awt.*;
import java.awt.event.*;

public class WindowAdapterExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Window Adapter");

        frame.setSize(400, 300);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
                System.exit(0);
            }
        });
    }
}