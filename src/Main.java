import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

public class Main {
    public static boolean checkText(String userName, String userPassword){
        //checking if the username and password equals

        if (userName.equals("java") && userPassword.equals("123")){
            return true;
        } else {
            return false;
        }
    }
    public static void addComponentsToFrame(JPanel panel){

        //adding labels and text fields
        JLabel userid = new JLabel("user id :");
        JTextField textField = new JTextField();

        JLabel userPassword = new JLabel("password :");
        JPasswordField passwordField = new JPasswordField();

        //adding buttons
        JButton button1 = new JButton("Cancel");
        JButton button2 = new JButton("Login");

        //adding components to panel
        panel.add(userid);
        panel.add(textField);
        panel.add(userPassword);
        panel.add(passwordField);
        panel.add(button1);
        panel.add(button2);

        //adding eventlistner control on buttons

        //login button
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(checkText(textField.getText(), passwordField.getText())){
                    JOptionPane.showMessageDialog(panel, "Hellow" + textField.getText() + "Welecome to java Swing");
                } else{
                    JOptionPane.showMessageDialog(panel, "Invalid username or password", "login message", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
                //cancel button
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

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