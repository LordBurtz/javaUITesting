import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    ImageIcon icon;
    JButton button;

    public MyFrame() {
        icon = new ImageIcon("src/main/resources/logos/kei_logo.png");
        button = new JButton();

        button.setBounds(200, 100, 300, 50);
        button.setFocusable(false);
        button.setIcon(icon);
        button.addActionListener(e -> {System.out.println("ping");});
        button.setText("pwease cwick mew sewnpaiw oWo");

        setTitle("fancy GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setVisible(true);
        setIconImage(icon.getImage());
        setLayout(null);
        add(button);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == button) {
            System.out.printf("ping");
        }
    }
}
