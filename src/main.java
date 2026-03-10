import javax.swing.*;
import java.awt.*;

public class main {
    public static void main(String[] args) {
        // making a frame and pannel which holds the squares
        JFrame frame = new JFrame("2 Player Chess");
        JPanel panel = new JPanel(new GridLayout(8, 8));

        // adding frame to the middle and making it not resizable
        frame.setSize(720, 720);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        // populating the grid with alternating coloured squares by checking if the current position is "odd" or "even"
        for (int row = 0; row<8; row++) {
            for (int col = 0; col<8; col++) {
                int state = (row+col)%2;
                if (state == 0) {
                    JButton square = new JButton();
                    square.setBackground(Color.decode("#F5F5DC"));
                    square.setSize(90, 90);
                    panel.add(square);
                }
                else {
                    JButton square = new JButton();
                    square.setBackground(Color.decode("#2C1608"));
                    square.setSize(90, 90);
                    panel.add(square);
                }
            }
        }
        // setting panel dimensions and adding it in
        panel.setSize(720, 720);
        panel.setVisible(true);
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
