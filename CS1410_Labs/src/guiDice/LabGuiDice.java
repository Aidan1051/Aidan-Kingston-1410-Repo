package guiDice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class LabGuiDice extends JFrame {

    private JLabel diceLabel;
    private JButton rollButton;
    private Random rand;
    private int previousRoll;

    public LabGuiDice() {
        super("Dice Roller");
        rand = new Random();
        previousRoll = 0;

        setLayout(new BorderLayout());

        diceLabel = new JLabel();
        diceLabel.setHorizontalAlignment(JLabel.CENTER);
        add(diceLabel, BorderLayout.CENTER);

        rollButton = new JButton("Roll 'Em");
        rollButton.setBackground(Color.BLUE);
        rollButton.setForeground(Color.WHITE);
        rollButton.setFont(new Font("Arial", Font.BOLD, 40));
        rollButton.setOpaque(true);
        rollButton.setBorderPainted(false);
        rollButton.addActionListener(e -> rollDie());
        add(rollButton, BorderLayout.SOUTH);

        rollDie();

        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void rollDie() {
        int roll;
        do {
            roll = rand.nextInt(6) + 1;
        } while (roll == previousRoll);
        previousRoll = roll;
        diceLabel.setIcon(new ImageIcon(getClass().getResource("die-" + roll + ".png")));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LabGuiDice());
    }
}