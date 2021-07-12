import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    ImageIcon icon;
    public MyFrame() {
        icon = new ImageIcon("src/main/resources/logos/kei_logo.png");

        setTitle("SwingBroCode testing GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //.setResizable(false);
        setSize(420, 420);
        setVisible(true);
        setIconImage(icon.getImage());
        getContentPane().setBackground(new Color(99, 64, 119));
    }
}
