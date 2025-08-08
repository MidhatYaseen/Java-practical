import java.awt.*;
import java.awt.event.*;

public class AWTControl extends Frame {

    AWTControl() {
        setLayout(new FlowLayout());

        TextField tf = new TextField(20);
        Button btn = new Button("Click");
        add(tf);
        add(btn);

        // Menu
        MenuBar mb = new MenuBar();
        Menu menu = new Menu("File");
        MenuItem exit = new MenuItem("Exit");
        menu.add(exit);
        mb.add(menu);
        setMenuBar(mb);

        // Button action
        btn.addActionListener(e -> tf.setText("Hello AWT"));

        // Exit menu action
        exit.addActionListener(e -> System.exit(0));

        // Window settings
        setTitle("AWT Controls Example");
        setSize(250, 150);
        setVisible(true);

        // Close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new AWTControl();
    }
}
