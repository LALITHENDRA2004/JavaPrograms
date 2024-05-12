import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener; // Interface
import java.awt.event.ActionEvent; // Class
import javax.swing.JButton;

// class DoSomething implements ActionListener {
//     public void actionPerfromed(ActionEvent e) {
//         System.out.println("You clicked me");
//     }
// }

public class Window {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setTitle("My Frame");
        // window.getContentPane().setBackground(Color.red);
        // Label -> JLabel -> swing
        // Ab object of JLabel class
        JLabel lb1 = new JLabel();
        lb1.setText("This is my first Java GUI program");
        lb1.setBounds(0, 0, 500, 30);
        lb1.setForeground(Color.red);
        Font myFont = new Font("MV Boli", Font.BOLD, 25);
        lb1.setFont(myFont);

        JTextField tf1 = new JTextField();
        tf1.setFont(new Font("MV Boli", Font.BOLD, 25));
        tf1.setBounds(0, 200, 200, 50);

        // You need to create an object of JButton class
        JButton button = new JButton();
        button.setText("Click me");
        button.setBounds(50, 50, 100, 50);
        // button.addActionListener(new ActionListener() {
        //     public void actionPerfromed(ActionEvent e) {
        //         System.out.println("You clicked me");
        //     }
        // });
        //Text Fields are used to get data from the user
        // JTextField
        


        // Add component to window
        window.add(lb1);
        window.add(button);
        window.add(tf1);
        window.setSize(500, 500); // Used to set the size of the window
        window.setLayout(null); // No Layouts
        // window.setResizable(false); // restrict from resizing
        window.setVisible(true); // Makes window visible
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
