package src;

import javax.swing.*;
import java.awt.*;

public class Main {
    JFrame secureFr;
    JPanel panelsec;
    JTextField loginField;
    JPasswordField passField;
    String programName = "No Title";
    JLabel secLabel;
    JButton enter;
    public static void main(String[] args) {
        Main mm = new Main();

    }
    Main() {
        createWindow();
    }
    public void createWindow(){

        secureFr = new JFrame(programName);
        secureFr.setSize(400, 300);
        secureFr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        secureFr.setLocationRelativeTo(null);
        secureFr.setResizable(false);

        panelsec = new JPanel();
        panelsec.setBackground(Color.WHITE);
        GridLayout layout = new GridLayout(4,1);
        panelsec.setLayout(layout);

        secLabel = new JLabel("Вход:");
        secLabel.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));

        loginField = new JTextField();


        passField = new JPasswordField();

        enter = new JButton("Войти");
        enter.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        secureFr.add(panelsec);
        panelsec.add(secLabel);
        panelsec.add(loginField);
        panelsec.add(passField);
        panelsec.add(enter);

        secureFr.setVisible(true);

    }
}
