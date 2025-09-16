import java.awt.*;
import javax.swing.*;

public class AddRooms extends JFrame {

    AddRooms() {
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setBounds(330, 200, 940, 470);
        setTitle("Add Rooms");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel heading = new JLabel("Add Rooms");
        heading.setFont(new Font("Tahoma", Font.BOLD, 19));
        heading.setBounds(150, 20, 200, 30);
        add(heading);

        // Room Number
        JLabel lblroomno = new JLabel("Room Number");
        lblroomno.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblroomno.setBounds(60, 80, 120, 20);
        add(lblroomno);

        JTextField tfroomno = new JTextField();
        tfroomno.setBounds(200, 80, 150, 30);
        add(tfroomno);

        // Availability
        JLabel lblavailable = new JLabel("Available");
        lblavailable.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblavailable.setBounds(60, 130, 120, 20);
        add(lblavailable);

        String availableOptions[] = {"Available", "Occupied"};
        JComboBox<String> availableCombo = new JComboBox<>(availableOptions);
        availableCombo.setBounds(200, 130, 150, 30);
        availableCombo.setBackground(Color.WHITE);
        add(availableCombo);

        // Cleaning Status
        JLabel lblclean = new JLabel("Cleaning Status");
        lblclean.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblclean.setBounds(60, 180, 120, 20);
        add(lblclean);

        String cleanOptions[] = {"Cleaned", "Dirty"};
        JComboBox<String> cleanCombo = new JComboBox<>(cleanOptions);
        cleanCombo.setBounds(200, 180, 150, 30);
        cleanCombo.setBackground(Color.WHITE);
        add(cleanCombo);

        // Price
        JLabel lblprice = new JLabel("Price");
        lblprice.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblprice.setBounds(60, 230, 120, 20);
        add(lblprice);

        JTextField tfprice = new JTextField();
        tfprice.setBounds(200, 230, 150, 30);
        add(tfprice);

        // Bed Type
        JLabel lblbed = new JLabel("Bed Type");
        lblbed.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblbed.setBounds(60, 280, 120, 20);
        add(lblbed);

        String bedOptions[] = {"Single Bed", "Double Bed"};
        JComboBox<String> bedCombo = new JComboBox<>(bedOptions);
        bedCombo.setBounds(200, 280, 150, 30);
        bedCombo.setBackground(Color.WHITE);
        add(bedCombo);

        setVisible(true);
    }

    public static void main(String[] args) {
        new AddRooms();
    }
}
