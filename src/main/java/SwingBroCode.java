import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class SwingBroCode {

    JFrame frame;
    ImageIcon icon;
    JLabel label;
    Border border;
    JPanel panel;

    public SwingBroCode() {
        frame = new JFrame();
        label = new JLabel();
        border = BorderFactory.createLineBorder(new Color(0x559999), 1);

        icon = new ImageIcon("src/main/resources/logos/kei_logo.png");

        label.setText("do you even code?");
        label.setIcon(icon);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setForeground(Color.lightGray);
        label.setFont(new Font("Comic Sans", Font.BOLD, 20));
        label.setBackground(Color.darkGray);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds(0, 0, 288, 388);

        frame.setTitle("SwingBroCode testing GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setVisible(true);
        frame.setIconImage(icon.getImage());
        frame.add(label);
    }

    public static void main(String[] args) {
        SwingBroCode c = new SwingBroCode();
    }
}
