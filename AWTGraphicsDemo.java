import java.awt.*;

public class AWTGraphicsDemo extends Frame {

    AWTGraphicsDemo() {
        setTitle("AWT Graphics Example");
        setSize(300, 200);
        setVisible(true);
    }

    public void paint(Graphics g) {
        g.drawString("Hello AWT!", 100, 100);   // Text
        g.drawOval(120, 120, 50, 50);           // Circle
    }

    public static void main(String[] args) {
        new AWTGraphicsDemo();
    }
}
