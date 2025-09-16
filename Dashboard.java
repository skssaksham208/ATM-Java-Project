import java.awt.*;
import javax.swing.*;

public class Dashboard extends JFrame {

    Dashboard() {
        setTitle("Dashboard");
        setBounds(0, 0, 1550, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Custom panel with background image
        JPanel backgroundPanel = new JPanel() {
            Image bg = new ImageIcon("C:\\Users\\skssa\\OneDrive\\Desktop\\PROJECTS\\third.jpg").getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Draw image scaled to panel size
                g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
            }
        };

        // Use BorderLayout to position text easily
        backgroundPanel.setLayout(new BorderLayout());

        // Text label
        JLabel text = new JLabel("THE TAJ GROUP WELCOMES YOU", SwingConstants.CENTER);
        text.setFont(new Font("Tahoma", Font.PLAIN , 46));
        text.setForeground(Color.WHITE);

        // Add text to the top-center
        backgroundPanel.add(text, BorderLayout.NORTH);

        setContentPane(backgroundPanel);

        // Menu bar
        JMenuBar mb = new JMenuBar();
        setJMenuBar(mb);

        JMenu hotel = new JMenu("HOTEL MANAGEMENT");
        hotel.setForeground(Color.RED);
        mb.add(hotel);

        JMenuItem reception = new JMenuItem("RECEPTION");
        hotel.add(reception);

        JMenu admin = new JMenu("ADMIN");
        admin.setForeground(Color.BLUE);
        mb.add(admin);

        JMenuItem addemployees = new JMenuItem("ADD EMPLOYEES");
        admin.add(addemployees);

        JMenuItem addrooms = new JMenuItem("ADD ROOMS");
        admin.add(addrooms);

        JMenuItem addrivers = new JMenuItem("ADD DRIVERS");
        admin.add(addrivers);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Dashboard();
    }
}
