import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class HotelManagementSystem extends JFrame implements ActionListener {

    JButton next; 

    // Constructor
    HotelManagementSystem() {

        setSize(1366, 565);
        setTitle("Hotel Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Background image
        ImageIcon backgroundImage = new ImageIcon("C:\\Users\\skssa\\OneDrive\\Desktop\\PROJECTS\\first.jpg");
        JLabel background = new JLabel(backgroundImage);
        background.setBounds(0, 0, 1366, 565);
        add(background);

        // Add text
        JLabel text = new JLabel("Hotel Management System");
        text.setBounds(20, 430, 1000, 90);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("serif", Font.ROMAN_BASELINE, 50));
        background.add(text);

        // Add Button
        next = new JButton("Next");
        next.setBounds(1150, 450, 150, 50);
        next.setBackground(Color.WHITE);
        next.addActionListener(this); //connect button with ActionListener
        background.add(next);

        // Make frame visible
        setVisible(true);

        // Blinking text thread
        new Thread(() -> {
            while (true) {
                try {
                    text.setVisible(false);
                    Thread.sleep(500);
                    text.setVisible(true);
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    // ✅ Action Listener Method
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            setVisible(false); // close current window
            new Login();       // open Login window
        }
    }

    public static void main(String[] args) {
        new HotelManagementSystem();
    }
}
