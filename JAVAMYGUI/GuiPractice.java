package JAVAMYGUI;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;


public class GuiPractice {
    public static void main(String[] args) {
        JFrame window = new JFrame("My Window");
        window.setLayout(null);
        window.setSize(600, 400);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel();
        label.setText("Label");
        label.setBounds(0, 0, 200, 50);
        Font f1 = new Font("Arial", Font.PLAIN, 20);
        label.setFont(f1);
        label.setForeground(Color.BLACK);

        JTextField tf = new JTextField();
        tf.setBounds(0, 50, 100, 25);

        JButton btn = new JButton();
        btn.setText("Click me");
        btn.setBounds(0, 100, 100, 20);

        window.add(label);
        window.add(tf);
        window.add(btn);
        window.setVisible(true);


    }
}
