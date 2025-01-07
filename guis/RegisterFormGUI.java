//package guis;
//import constants.CommonConstants;
//import db.MyJDBC;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//public class RegisterFormGUI extends Form {
//    public RegisterFormGUI() {
//        super("Register");
//        setSize(400, 500);
//        setLayout(null);
//        addGuiComponents();
//    }
//
//    private void addGuiComponents() {
//        JLabel registerLabel = new JLabel("Register");
//        registerLabel.setBounds(50, 30, 300, 50);
//        registerLabel.setForeground(CommonConstants.TEXT_COLOR);
//        registerLabel.setFont(new Font("Dialog", Font.BOLD, 40));
//        registerLabel.setHorizontalAlignment(SwingConstants.CENTER);
//        add(registerLabel);
//        JLabel usernameLabel = new JLabel("Username:");
//        usernameLabel.setBounds(50, 100, 100, 25);
//        usernameLabel.setForeground(CommonConstants.TEXT_COLOR);
//        usernameLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
//        add(usernameLabel);
//
//        JTextField usernameField = new JTextField();
//        usernameField.setBounds(50, 130, 300, 40);
//        usernameField.setBackground(CommonConstants.SECONDARY_COLOR);
//        usernameField.setForeground(CommonConstants.TEXT_COLOR);
//        usernameField.setFont(new Font("Dialog", Font.PLAIN, 24));
//        add(usernameField);
//
//        JLabel emailLabel = new JLabel("E-Mail:");
//        emailLabel.setBounds(50, 100, 100, 25);
//        emailLabel.setForeground(CommonConstants.TEXT_COLOR);
//        emailLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
//        add(emailLabel);
//
//        JTextField emailField = new JTextField();
//        emailField.setBounds(50, 130, 300, 40);
//        emailField.setBackground(CommonConstants.SECONDARY_COLOR);
//        emailField.setForeground(CommonConstants.TEXT_COLOR);
//        emailField.setFont(new Font("Dialog", Font.PLAIN, 24));
//        add(emailField);
//
//        JLabel passwordLabel = new JLabel("Password:");
//        passwordLabel.setBounds(50, 180, 100, 25);
//        passwordLabel.setForeground(CommonConstants.TEXT_COLOR);
//        passwordLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
//        add(passwordLabel);
//
//        JPasswordField passwordField = new JPasswordField();
//        passwordField.setBounds(50, 210, 300, 40);
//        passwordField.setBackground(CommonConstants.SECONDARY_COLOR);
//        passwordField.setForeground(CommonConstants.TEXT_COLOR);
//        passwordField.setFont(new Font("Dialog", Font.PLAIN, 24));
//        add(passwordField);
//
//        JLabel rePasswordLabel = new JLabel("Re-enter Password:");
//        rePasswordLabel.setBounds(50, 260, 200, 25); // Adjusted position and width
//        rePasswordLabel.setForeground(CommonConstants.TEXT_COLOR);
//        rePasswordLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
//        add(rePasswordLabel);
//
//        JPasswordField rePasswordField = new JPasswordField();
//        rePasswordField.setBounds(50, 290, 300, 40);
//        rePasswordField.setBackground(CommonConstants.SECONDARY_COLOR);
//        rePasswordField.setForeground(CommonConstants.TEXT_COLOR);
//        rePasswordField.setFont(new Font("Dialog", Font.PLAIN, 24));
//        add(rePasswordField);
//
//        JButton registerButton = new JButton("Register");
//        registerButton.setFont(new Font("Dialog", Font.BOLD, 18));
//        registerButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//        registerButton.setBackground(CommonConstants.TEXT_COLOR);
//        registerButton.setBounds(75, 350, 250, 50);
//        registerButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//                String username = usernameField.getText();
//
//                String email = emailField.getText();
//
//                String password = new String(passwordField.getPassword());
//
//                String rePassword = new String(rePasswordField.getPassword());
//
//                if (validateUserInput(username, email, password, rePassword)) {
//
//                    if (MyJDBC.register(username, email, password)) {
//
//                        RegisterFormGUI.this.dispose();
//
//                        LoginFormGUI loginFormGUI = new LoginFormGUI();
//                        loginFormGUI.setVisible(true);
//
//                        JOptionPane.showMessageDialog(loginFormGUI,
//                                "Registered Account Successfully!");
//                    } else {
//
//                        JOptionPane.showMessageDialog(RegisterFormGUI.this,
//                                "Error: Username already taken");
//                    }
//                } else {
//                    JOptionPane.showMessageDialog(RegisterFormGUI.this,
//                            "Error: Username must be at least 6 characters \n" +
//                                    "and/or Passwords must match");
//                }
//            }
//        });
//        add(registerButton);
//
//        JLabel loginLabel = new JLabel("Have an account? Login Here");
//        loginLabel.setHorizontalAlignment(SwingConstants.CENTER);
//        loginLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//        loginLabel.setForeground(CommonConstants.TEXT_COLOR);
//        loginLabel.setBounds(75, 420, 250, 30);
//        loginLabel.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                // dispose of this GUI
//                RegisterFormGUI.this.dispose();
//
//                new LoginFormGUI().setVisible(true);
//            }
//        });
//        add(loginLabel);
//    }
//
//    private boolean validateUserInput(String username, String password, String rePassword, String s) {
//
//        if (username.length() == 0 || password.length() == 0 || rePassword.length() == 0) return false;
//
//        if (username.length() < 6) return false;
//
//        if (!password.equals(rePassword)) return false;
//
//        return true;
//    }
//}

//package guis;
//
//import constants.CommonConstants;
//import db.MyJDBC;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//
//public class RegisterFormGUI extends Form {
//    public RegisterFormGUI() {
//        super("Register");
//        setSize(400, 500);
//        setLayout(null);
//        addGuiComponents();
//    }
//
//    private void addGuiComponents() {
//        JLabel registerLabel = new JLabel("Register");
//        registerLabel.setBounds(50, 20, 300, 40);  // Adjusted position and size
//        registerLabel.setForeground(CommonConstants.TEXT_COLOR);
//        registerLabel.setFont(new Font("Dialog", Font.BOLD, 35));  // Adjusted font size
//        registerLabel.setHorizontalAlignment(SwingConstants.CENTER);
//        add(registerLabel);
//
//        JLabel usernameLabel = new JLabel("Username:");
//        usernameLabel.setBounds(50, 70, 100, 25);  // Adjusted position
//        usernameLabel.setForeground(CommonConstants.TEXT_COLOR);
//        usernameLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
//        add(usernameLabel);
//
//        JTextField usernameField = new JTextField();
//        usernameField.setBounds(50, 100, 300, 40);
//        usernameField.setBackground(CommonConstants.SECONDARY_COLOR);
//        usernameField.setForeground(CommonConstants.TEXT_COLOR);
//        usernameField.setFont(new Font("Dialog", Font.PLAIN, 24));
//        add(usernameField);
//
//        JLabel emailLabel = new JLabel("E-Mail:");
//        emailLabel.setBounds(50, 150, 100, 25);  // Adjusted position
//        emailLabel.setForeground(CommonConstants.TEXT_COLOR);
//        emailLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
//        add(emailLabel);
//
//        JTextField emailField = new JTextField();
//        emailField.setBounds(50, 180, 300, 40);
//        emailField.setBackground(CommonConstants.SECONDARY_COLOR);
//        emailField.setForeground(CommonConstants.TEXT_COLOR);
//        emailField.setFont(new Font("Dialog", Font.PLAIN, 24));
//        add(emailField);
//
//        JLabel passwordLabel = new JLabel("Password:");
//        passwordLabel.setBounds(50, 230, 100, 25);  // Adjusted position
//        passwordLabel.setForeground(CommonConstants.TEXT_COLOR);
//        passwordLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
//        add(passwordLabel);
//
//        JPasswordField passwordField = new JPasswordField();
//        passwordField.setBounds(50, 260, 300, 40);
//        passwordField.setBackground(CommonConstants.SECONDARY_COLOR);
//        passwordField.setForeground(CommonConstants.TEXT_COLOR);
//        passwordField.setFont(new Font("Dialog", Font.PLAIN, 24));
//        add(passwordField);
//
//        JLabel rePasswordLabel = new JLabel("Re-enter Password:");
//        rePasswordLabel.setBounds(50, 310, 200, 25);  // Adjusted position
//        rePasswordLabel.setForeground(CommonConstants.TEXT_COLOR);
//        rePasswordLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
//        add(rePasswordLabel);
//
//        JPasswordField rePasswordField = new JPasswordField();
//        rePasswordField.setBounds(50, 340, 300, 40);
//        rePasswordField.setBackground(CommonConstants.SECONDARY_COLOR);
//        rePasswordField.setForeground(CommonConstants.TEXT_COLOR);
//        rePasswordField.setFont(new Font("Dialog", Font.PLAIN, 24));
//        add(rePasswordField);
//
//        JButton registerButton = new JButton("Register");
//        registerButton.setFont(new Font("Dialog", Font.BOLD, 18));
//        registerButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//        registerButton.setBackground(CommonConstants.TEXT_COLOR);
//        registerButton.setBounds(75, 400, 250, 50);  // Adjusted position
//        registerButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String username = usernameField.getText();
//                String email = emailField.getText();
//                String password = new String(passwordField.getPassword());
//                String rePassword = new String(rePasswordField.getPassword());
//
//                if (validateUserInput(username, email, password, rePassword)) {
//                    if (MyJDBC.register(username, email, password)) {
//                        RegisterFormGUI.this.dispose();
//                        LoginFormGUI loginFormGUI = new LoginFormGUI();
//                        loginFormGUI.setVisible(true);
//
//                        JOptionPane.showMessageDialog(loginFormGUI,
//                                "Registered Account Successfully!");
//                    } else {
//                        JOptionPane.showMessageDialog(RegisterFormGUI.this,
//                                "Error: Username already taken");
//                    }
//                } else {
//                    JOptionPane.showMessageDialog(RegisterFormGUI.this,
//                            "Error: Username must be at least 6 characters \n" +
//                                    "and/or Passwords must match");
//                }
//            }
//        });
//        add(registerButton);
//
//        JLabel loginLabel = new JLabel("Have an account? Login Here");
//        loginLabel.setHorizontalAlignment(SwingConstants.CENTER);
//        loginLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//        loginLabel.setForeground(CommonConstants.TEXT_COLOR);
//        loginLabel.setBounds(75, 470, 250, 30);
//        loginLabel.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                RegisterFormGUI.this.dispose();
//                new LoginFormGUI().setVisible(true);
//            }
//        });
//        add(loginLabel);
//    }
//
//    private boolean validateUserInput(String username, String email, String password, String rePassword) {
//        if (username.length() == 0 || email.length() == 0 || password.length() == 0 || rePassword.length() == 0)
//            return false;
//
//        if (username.length() < 6) return false;
//
//        if (!password.equals(rePassword)) return false;
//
//        return true;
//    }
//}
package guis;

import constants.CommonConstants;
import db.MyJDBC;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RegisterFormGUI extends Form {
    public RegisterFormGUI() {
        super("Register");
        setSize(400, 550);
        setLayout(null);
        addGuiComponents();
    }

    private void addGuiComponents() {
        JLabel registerLabel = new JLabel("Register");
        registerLabel.setBounds(50, 20, 300, 40);  // Adjusted position and size
        registerLabel.setForeground(CommonConstants.TEXT_COLOR);
        registerLabel.setFont(new Font("Dialog", Font.BOLD, 35));  // Adjusted font size
        registerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(registerLabel);

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(50, 70, 100, 25);  // Adjusted position
        usernameLabel.setForeground(CommonConstants.TEXT_COLOR);
        usernameLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
        add(usernameLabel);

        JTextField usernameField = new JTextField();
        usernameField.setBounds(50, 100, 300, 40);
        usernameField.setBackground(CommonConstants.SECONDARY_COLOR);
        usernameField.setForeground(CommonConstants.TEXT_COLOR);
        usernameField.setFont(new Font("Dialog", Font.PLAIN, 24));
        add(usernameField);

        JLabel emailLabel = new JLabel("E-Mail:");
        emailLabel.setBounds(50, 150, 100, 25);  // Adjusted position
        emailLabel.setForeground(CommonConstants.TEXT_COLOR);
        emailLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
        add(emailLabel);

        JTextField emailField = new JTextField();
        emailField.setBounds(50, 180, 300, 40);
        emailField.setBackground(CommonConstants.SECONDARY_COLOR);
        emailField.setForeground(CommonConstants.TEXT_COLOR);
        emailField.setFont(new Font("Dialog", Font.PLAIN, 24));
        add(emailField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 230, 100, 25);  // Adjusted position
        passwordLabel.setForeground(CommonConstants.TEXT_COLOR);
        passwordLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
        add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(50, 260, 300, 40);
        passwordField.setBackground(CommonConstants.SECONDARY_COLOR);
        passwordField.setForeground(CommonConstants.TEXT_COLOR);
        passwordField.setFont(new Font("Dialog", Font.PLAIN, 24));
        add(passwordField);

        JLabel rePasswordLabel = new JLabel("Re-enter Password:");
        rePasswordLabel.setBounds(50, 310, 200, 25);  // Adjusted position
        rePasswordLabel.setForeground(CommonConstants.TEXT_COLOR);
        rePasswordLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
        add(rePasswordLabel);

        JPasswordField rePasswordField = new JPasswordField();
        rePasswordField.setBounds(50, 340, 300, 40);
        rePasswordField.setBackground(CommonConstants.SECONDARY_COLOR);
        rePasswordField.setForeground(CommonConstants.TEXT_COLOR);
        rePasswordField.setFont(new Font("Dialog", Font.PLAIN, 24));
        add(rePasswordField);

        JButton registerButton = new JButton("Register");
        registerButton.setFont(new Font("Dialog", Font.BOLD, 18));
        registerButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        registerButton.setBackground(CommonConstants.TEXT_COLOR);
        registerButton.setBounds(75, 400, 250, 50);  // Adjusted position
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());
                String rePassword = new String(rePasswordField.getPassword());

                if (validateUserInput(username, email, password, rePassword)) {
                    if (MyJDBC.register(username, email, password)) {
                        RegisterFormGUI.this.dispose();
                        LoginFormGUI loginFormGUI = new LoginFormGUI();
                        loginFormGUI.setVisible(true);

                        JOptionPane.showMessageDialog(loginFormGUI,
                                "Registered Account Successfully!");
                    } else {
                        JOptionPane.showMessageDialog(RegisterFormGUI.this,
                                "Error: Username already taken");
                    }
                } else {
                    JOptionPane.showMessageDialog(RegisterFormGUI.this,
                            "Error: Username must be at least 6 characters \n" +
                                    "and/or Passwords must match");
                }
            }
        });
        add(registerButton);

        JLabel loginLabel = new JLabel("Have an account? Login Here");
        loginLabel.setHorizontalAlignment(SwingConstants.CENTER);
        loginLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        loginLabel.setForeground(CommonConstants.TEXT_COLOR);
        loginLabel.setBounds(75, 450, 250, 30);  // Adjusted position
        loginLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                RegisterFormGUI.this.dispose();
                new LoginFormGUI().setVisible(true);
            }
        });
        add(loginLabel);
    }

    private boolean validateUserInput(String username, String email, String password, String rePassword) {
        if (username.length() == 0 || email.length() == 0 || password.length() == 0 || rePassword.length() == 0)
            return false;

        if (username.length() < 6) return false;

        if (!password.equals(rePassword)) return false;

        return true;
    }
}










