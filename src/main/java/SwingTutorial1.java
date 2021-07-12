import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingTutorial1 implements ActionListener {

    private int count;
    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JLabel label;


    public SwingTutorial1() {
        count = 0;

        frame = new JFrame();
        panel = new JPanel();

        button = new JButton("bruh");
        label = new JLabel("num of clicks: 0");

        button.addActionListener(this);

        label.setBackground(Color.YELLOW);
        label.setBorder(BorderFactory.createEmptyBorder(5, 40, 5, 40));

        panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100 ,100));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("SwingTesting GUI");
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        count++;
        label.setText("num of clicks: " + count);
    }


    public static void main(String[] args) {
        SwingTutorial1 s = new SwingTutorial1();
    }
}
