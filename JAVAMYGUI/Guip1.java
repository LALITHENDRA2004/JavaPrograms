package JAVAMYGUI;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class Guip1 {
    public static void main(String[] args) {
        // creation of a window
        JFrame window = new JFrame("Sample");

        // setting size of the window
        window.setSize(400, 300);  

        // creation of a label
        JLabel label = new JLabel();

        label.setText("Label");

        label.setBounds(10, 10, 50, 10);

        window.add(label);

        window.setLayout(null);

        window.setResizable(false);

        // to stop the running of program when window is closed
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // make the window visible
        window.setVisible(true); 
    }
}

