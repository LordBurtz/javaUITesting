import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class SwingBroCode {

    JFrame frame;
    ImageIcon icon;
    JLabel label;
    Border border;
    JPanel red_panel, blue_panel, green_panel;

    public SwingBroCode() {
        frame = new JFrame();
        red_panel = new JPanel();
        blue_panel = new JPanel();
        green_panel = new JPanel();
        label = new JLabel();
        icon = new ImageIcon("src/main/resources/logos/kei_logo.png");

        label.setText("[sample text]");
        label.setIcon(icon);

        red_panel.setBackground(Color.red);
        red_panel.setBounds(0, 0, 350, 350);
        red_panel.add(label);
        red_panel.setBorder(BorderFactory.createLineBorder(Color.cyan));

        blue_panel.setBackground(Color.blue);
        blue_panel.setBounds(250, 0, 300, 300);

        green_panel.setBackground(new Color(0x339955));
        green_panel.setBounds(0, 350, 750, 200);

        frame.setTitle("SwingBroCode testing GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setIconImage(icon.getImage());

        frame.setLayout(null);

        frame.add(red_panel);
        frame.add(blue_panel);
        frame.add(green_panel);
    }

    public static void main(String[] args) {
        SwingBroCode c = new SwingBroCode();
    }
}
