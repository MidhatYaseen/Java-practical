import javax.swing.*;
import java.awt.*;

public class SimpleSwingApp extends JFrame {
    public SimpleSwingApp() {
        // Set the title of the window
        setTitle("Simple Swing App");
        
        // Set the layout manager
        setLayout(new BorderLayout());

        // Create a tabbed pane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Panel 1: A simple message label
        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Welcome to the Swing Application!"));
        tabbedPane.addTab("Home", panel1);

        // Panel 2: Button that shows a message
        JPanel panel2 = new JPanel();
        JButton button = new JButton("Click Me");
        button.addActionListener(e -> JOptionPane.showMessageDialog(this, "Button Clicked!"));
        panel2.add(button);
        tabbedPane.addTab("Action", panel2);

        // Add the tabbed pane to the frame
        add(tabbedPane, BorderLayout.CENTER);

        // Set frame size and behavior
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        // Make the frame visible
        SwingUtilities.invokeLater(() -> new SimpleSwingApp().setVisible(true));
    }
}
