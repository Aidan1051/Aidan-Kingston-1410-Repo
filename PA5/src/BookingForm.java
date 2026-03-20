import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BookingForm extends JFrame {

    private final JTextField nameField;
    private final JTextField phoneField;
    private final JTextField dateField;
    private final JComboBox<String> carTypeBox;
    private final JComboBox<String> serviceBox;
    private final JCheckBox oilCheck;
    private final JCheckBox tireCheck;
    private final JCheckBox washCheck;
    private final JRadioButton morningBtn;
    private final JRadioButton afternoonBtn;
    private final JTextArea notesArea;
    private final JTextArea summaryArea;

    public BookingForm() {
        setTitle("Car Service Booking App");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Options");
        JMenuItem clearItem = new JMenuItem("Clear Form");
        JMenuItem exitItem = new JMenuItem("Exit");
        JMenuItem aboutItem = new JMenuItem("About");
        menu.add(clearItem);
        menu.add(exitItem);
        menu.add(aboutItem);
        menuBar.add(menu);
        setJMenuBar(menuBar);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(14, 2, 5, 5));

        panel.add(new JLabel("Name:"));
        nameField = new JTextField();
        panel.add(nameField);

        panel.add(new JLabel("Phone:"));
        phoneField = new JTextField();
        panel.add(phoneField);

        panel.add(new JLabel("Car Type:"));
        carTypeBox = new JComboBox<>(new String[]{"Sedan", "SUV", "Truck", "Van"});
        panel.add(carTypeBox);

        panel.add(new JLabel("Service:"));
        serviceBox = new JComboBox<>(new String[]{"Oil Change", "Repair", "Inspection", "Full Service"});
        panel.add(serviceBox);

        panel.add(new JLabel("Date:"));
        dateField = new JTextField();
        panel.add(dateField);

        panel.add(new JLabel("Extra Services:"));
        JPanel checkPanel = new JPanel();
        oilCheck = new JCheckBox("Oil");
        tireCheck = new JCheckBox("Tires");
        washCheck = new JCheckBox("Car Wash");
        checkPanel.add(oilCheck);
        checkPanel.add(tireCheck);
        checkPanel.add(washCheck);
        panel.add(checkPanel);

        panel.add(new JLabel("Time:"));
        JPanel radioPanel = new JPanel();
        morningBtn = new JRadioButton("Morning");
        afternoonBtn = new JRadioButton("Afternoon");
        ButtonGroup group = new ButtonGroup();
        group.add(morningBtn);
        group.add(afternoonBtn);
        radioPanel.add(morningBtn);
        radioPanel.add(afternoonBtn);
        panel.add(radioPanel);

        panel.add(new JLabel("Notes:"));
        notesArea = new JTextArea(3, 20);
        panel.add(new JScrollPane(notesArea));

        JButton submitBtn = new JButton("Book Appointment");
        JButton clearBtn = new JButton("Clear Form");
        panel.add(submitBtn);
        panel.add(clearBtn);

        add(panel, BorderLayout.CENTER);

        summaryArea = new JTextArea(6, 40);
        summaryArea.setEditable(false);
        add(new JScrollPane(summaryArea), BorderLayout.SOUTH);

        submitBtn.addActionListener(e -> submitForm());
        clearBtn.addActionListener(e -> clearForm());
        clearItem.addActionListener(e -> clearForm());
        exitItem.addActionListener(e -> System.exit(0));
        aboutItem.addActionListener(e -> JOptionPane.showMessageDialog(this, "Car Service Booking App\nfor extra credit"));
        serviceBox.addActionListener(e -> notesArea.setText("Selected: " + serviceBox.getSelectedItem()));

        setVisible(true);
    }

    private void submitForm() {
        String name = nameField.getText().trim();
        String phone = phoneField.getText().trim();
        String date = dateField.getText().trim();

        if(name.isEmpty() || phone.isEmpty() || date.isEmpty()) {
            JOptionPane.showMessageDialog(this, "you need to fill in all the fields of input");
            return;
        }

        String car = (String) carTypeBox.getSelectedItem();
        String service = (String) serviceBox.getSelectedItem();
        String time = morningBtn.isSelected() ? "Morning" : afternoonBtn.isSelected() ? "Afternoon" : "Not selected";

        String extras = "";
        if (oilCheck.isSelected()) extras += "Oil ";
        if (tireCheck.isSelected()) extras += "Tires ";
        if (washCheck.isSelected()) extras += "Car Wash ";

        String notes = notesArea.getText();

        summaryArea.setText(
                "Booking Confirmed!\n" +
                        "Name: " + name + "\n" +
                        "Phone: " + phone + "\n" +
                        "Car: " + car + "\n" +
                        "Service: " + service + "\n" +
                        "Date: " + date + "\n" +
                        "Time: " + time + "\n" +
                        "Extras: " + extras + "\n" +
                        "Notes: " + notes
        );

        new ConfirmationWindow(name, phone, car, service, date, time, extras, notes);
    }

    private void clearForm() {
        nameField.setText("");
        phoneField.setText("");
        dateField.setText("");
        notesArea.setText("");
        summaryArea.setText("");
        oilCheck.setSelected(false);
        tireCheck.setSelected(false);
        washCheck.setSelected(false);
        morningBtn.setSelected(false);
        afternoonBtn.setSelected(false);
        carTypeBox.setSelectedIndex(0);
        serviceBox.setSelectedIndex(0);
    }
}