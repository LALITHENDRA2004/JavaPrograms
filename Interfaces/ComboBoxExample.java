import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import java.awt.Color;

public class ComboBoxExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ComboBox Example");
        frame.setSize(500, 500);
        frame.setResizable(false);
        frame.setLayout(null);
        ImageIcon img = new ImageIcon("C:/Users/lalit/OneDrive/Pictures/images/myimg.jpg");
        frame.setIconImage(img.getImage());

        // ComboBox -> Create an object of class JComboBox
        
        String[] items = {"Apple", "Orange", "Mango"};
        JComboBox<String> box = new JComboBox<>(items);
        box.setBounds(100, 100, 150, 50);
        frame.add(box);


        JLabel lb3 = new JLabel();
        lb3.setBounds(150, 150, 150, 50);
        lb3.setOpaque(true);
        lb3.setBackground(Color.black);
        frame.add(lb3);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
