package gui_Intro;

import javax.swing.*;
import java.awt.*;

public class LabGuiIntro extends JFrame {

    private JLabel lblTitle;
    private JButton btnWest;
    private JPanel textPanel;
    private JLabel lblCenter;

    public LabGuiIntro() {
        setTitle("GUI Intro Lab");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 500);

        JPanel contentPane = new JPanel(new BorderLayout());
        setContentPane(contentPane);

        lblTitle = newLblTitle();
        contentPane.add(lblTitle, BorderLayout.NORTH);

        btnWest = newBtnWest();
        contentPane.add(btnWest, BorderLayout.WEST);

        textPanel = newTextPanel();
        contentPane.add(textPanel, BorderLayout.SOUTH);

        lblCenter = newCenterLabel();
        contentPane.add(lblCenter, BorderLayout.CENTER);

        contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    }

    private JLabel newLblTitle() {
        JLabel label = new JLabel("Lab GUI Intro", SwingConstants.CENTER);
        label.setFont(new Font("Serif", Font.BOLD, 33));
        label.setForeground(Color.GREEN);
        label.setBackground(Color.BLUE);
        label.setOpaque(true);
        label.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        return label;
    }

    private JButton newBtnWest() {
        JButton button = new JButton("WEST");
        button.setFont(new Font("SansSerif", Font.PLAIN, 18));
        button.setMargin(new Insets(20, 30, 20, 30));
        return button;
    }

    private JPanel newTextPanel() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setOpaque(true);
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        JLabel lblName = new JLabel("Name: ");
        lblName.setFont(new Font("SansSerif", Font.PLAIN, 16));

        JTextField txtName = new JTextField(16);
        txtName.setFont(new Font("SansSerif", Font.PLAIN, 16));

        panel.add(lblName);
        panel.add(txtName);

        return panel;
    }

    private JLabel newCenterLabel() {
        JLabel label = new JLabel("Hi", SwingConstants.CENTER);
        label.setFont(new Font("Serif", Font.BOLD, 77));
        label.setForeground(Color.ORANGE);
        label.setBackground(Color.RED);
        label.setOpaque(true);
        return label;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LabGuiIntro frame = new LabGuiIntro();
            frame.setVisible(true);
        });
    }
}