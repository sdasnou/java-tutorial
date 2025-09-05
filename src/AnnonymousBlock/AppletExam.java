package AnnonymousBlock;

import java.awt.*;

// Applet code
public class AppletExam {
    public static void main(String[] args) {
        // Create a frame
        Frame frame = new Frame("AWT Button Example");
        // Create a button
        Button button = new Button("Click Me!");

        // Set the button position on the frame
        button.setBounds(150, 130, 100, 30);

        // Add the button to the frame
        frame.add(button);

        // Set the frame size and layout
        frame.setSize(400, 300);
        frame.setLayout(null);

        // Set the frame visibility to true
        frame.setVisible(true);
    }
}
