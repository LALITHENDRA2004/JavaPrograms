import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;

public class Task2 {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setTitle("Task2");
        window.setSize(700, 500);
        window.setLayout(null);
        window.setResizable(false);
      
        JLabel lb1 = new JLabel();
        lb1.setText("Celsius");
        lb1.setForeground(Color.BLUE);
        lb1.setBounds(100, 50, 500, 100);
        Font myFont = new Font("Courier new", Font.BOLD, 25);
        lb1.setFont(myFont);

        JLabel lb2 = new JLabel();
        lb2.setText("Fahrenheit");
        lb2.setBounds(300, 50, 500, 100);
        lb2.setFont(myFont);
        lb2.setForeground(Color.BLUE);



        JTextField tf1 = new JTextField();
        tf1.setBounds(100, 150, 100, 50);

        window.add(lb1);
        window.add(lb2);
        window.add(tf1);

        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
