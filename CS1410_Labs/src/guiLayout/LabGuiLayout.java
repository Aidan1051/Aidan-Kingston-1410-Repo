package guiLayout;

import javax.swing.*;
import java.awt.*;

public class LabGuiLayout extends JFrame {

    private JPanel mainPanel;
    private JPanel controlPanel;
    private JButton leftButton;
    private JButton rightButton;
    private JLabel[] tiles;
    private int blueIndex = 1;

    public LabGuiLayout() {
        setTitle("Demo Layout");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        JLabel title = new JLabel("Demo Layout", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        add(title, BorderLayout.NORTH);

        controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(2, 1, 10, 10));
        leftButton = new JButton("<==");
        rightButton = new JButton("==>");
        controlPanel.add(leftButton);
        controlPanel.add(rightButton);
        controlPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(controlPanel, BorderLayout.WEST);

        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(1, 4, 10, 10));
        tiles = new JLabel[4];
        for (int i = 0; i < 4; i++) {
            tiles[i] = new JLabel("" + (i + 1), SwingConstants.CENTER);
            tiles[i].setOpaque(true);
            tiles[i].setFont(new Font("Arial", Font.BOLD, 36));
            tiles[i].setBackground(i == blueIndex ? Color.BLUE : Color.YELLOW);
            mainPanel.add(tiles[i]);
        }
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(mainPanel, BorderLayout.CENTER);

        leftButton.addActionListener(e -> moveBlueLeft());
        rightButton.addActionListener(e -> moveBlueRight());

        setVisible(true);
    }

    private void moveBlueLeft() {
        tiles[blueIndex].setBackground(Color.YELLOW);
        blueIndex = (blueIndex - 1 + 4) % 4;
        tiles[blueIndex].setBackground(Color.BLUE);
    }

    private void moveBlueRight() {
        tiles[blueIndex].setBackground(Color.YELLOW);
        blueIndex = (blueIndex + 1) % 4;
        tiles[blueIndex].setBackground(Color.BLUE);
    }

    public static void main(String[] args) {
        new LabGuiLayout();
    }
}