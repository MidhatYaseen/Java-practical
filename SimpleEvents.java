import java.awt.*;
import java.awt.event.*;

public class SimpleEvents extends Frame implements MouseListener, KeyListener {

    Label label;

    SimpleEvents() {
        label = new Label("Try mouse click or key press");
        label.setBounds(50, 100, 200, 30);
        add(label);

        addMouseListener(this);
        addKeyListener(this);
        setSize(300, 200);
        setLayout(null);
        setVisible(true);
        setFocusable(true);

        // Close button
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    // Mouse event
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked");
    }

    // Keyboard event
    public void keyPressed(KeyEvent e) {
        label.setText("Key Pressed: " + e.getKeyChar());
    }

    // Unused methods (must be here for interface)
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        new SimpleEvents();
    }
}
