import java.awt.*;
import java.awt.event.*;

public class EventDemo extends Frame implements ActionListener {

    Button b;

    EventDemo() {
        b = new Button("Click Me");
        b.setBounds(100, 100, 100, 50);
        b.addActionListener(this); // Register listener
        add(b);

        setSize(300, 200);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        b.setLabel("Clicked!");
    }

    public static void main(String[] args) {
        new EventDemo();
    }
}
