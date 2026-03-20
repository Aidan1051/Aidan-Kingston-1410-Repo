import javax.swing.*;
import java.awt.*;

public class ConfirmationWindow extends JFrame {

    public ConfirmationWindow(String name, String phone, String car,
                              String service, String date, String time,
                              String extras, String notes) {

        setTitle("Confirmation");
        setSize(400, 400);
        setLayout(new BorderLayout());

        JTextArea area = new JTextArea();
        area.setEditable(false);
        area.setText(
                "Appointment Confirmed!\n\n" +
                        "Name: " + name + "\n" +
                        "Phone: " + phone + "\n" +
                        "Car: " + car + "\n" +
                        "Service: " + service + "\n" +
                        "Date: " + date + "\n" +
                        "Time: " + time + "\n" +
                        "Extras: " + extras + "\n\n" +
                        "Notes:\n" + notes
        );

        add(new JScrollPane(area), BorderLayout.CENTER);

        JButton closeBtn = new JButton("Close");
        closeBtn.addActionListener(e -> dispose());
        add(closeBtn, BorderLayout.SOUTH);

        setVisible(true);
    }
}