import java.awt.*;
import java.awt.event.*;

public class AddRemoveControl extends Frame {

    TextField tf = new TextField(20);

    AddRemoveControl() {
        Button add = new Button("Add");
        Button remove = new Button("Remove");

        setLayout(new FlowLayout());
        add(add);
        add(remove);

        add.addActionListener(e -> {
            add(tf);
            validate();
        });

        remove.addActionListener(e -> {
            remove(tf);
            validate();
        });

        setSize(250, 150);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new AddRemoveControl();
    }
}
