import javax.swing.*;
import java.awt.*;

public class Main {
    public static void addComponentsToFrame(JPanel panel){

        JLabel userid = new JLabel("user id :");
        JTextField textField = new JTextField("Enter user id");

        JLabel userPassword = new JLabel("password :");
        JPasswordField passwordField = new JPasswordField("Enter your password");

        JButton button1 = new JButton("Cancel");
        JButton button2 = new JButton("Login");

        panel.add(userid);
        panel.add(textField);
        panel.add(userPassword);
        panel.add(passwordField);
        panel.add(button1);
        panel.add(button2);
    }
    public static void main(String[] args){
        JFrame frame = new JFrame("Login Form");

        JPanel panel = new JPanel(new GridLayout(3, 2, 15, 15));

        addComponentsToFrame(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(300, 150);
        frame.getContentPane().add(panel);
        frame.setVisible(true);


    }
}