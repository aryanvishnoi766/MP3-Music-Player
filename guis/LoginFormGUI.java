package guis;
import constants.CommonConstants;
import db.MyJDBC;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class LoginFormGUI extends Form {
    public LoginFormGUI() {
        super("Login");
        addGuiComponents();
    }

    //    private void addGuiComponents() {
//    // Set JFrame size
//    setSize(400, 600);
//    setLayout(null); // Use null layout to specify absolute positions
//
//    // create login label
//    JLabel loginLabel = new JLabel("Login");
//    loginLabel.setBounds(50, 25, 300, 50);
//    loginLabel.setForeground(CommonConstants.TEXT_COLOR);
//    loginLabel.setFont(new Font("Dialog", Font.BOLD, 40));
//    loginLabel.setHorizontalAlignment(SwingConstants.CENTER);
//    add(loginLabel);
//
//    // create username label
//    JLabel usernameLabel = new JLabel("Username:");
//    usernameLabel.setBounds(50, 100, 100, 25);
//    usernameLabel.setForeground(CommonConstants.TEXT_COLOR);
//    usernameLabel.setFont(new Font("Dialog", Font.PLAIN, 20));
//    add(usernameLabel);
//
//    // create username text field
//    JTextField usernameField = new JTextField();
//    usernameField.setBounds(50, 130, 300, 40);
//    usernameField.setBackground(CommonConstants.SECONDARY_COLOR);
//    usernameField.setForeground(CommonConstants.TEXT_COLOR);
//    usernameField.setFont(new Font("Dialog", Font.PLAIN, 24));
//    add(usernameField);
//
//    // create password label
//    JLabel passwordLabel = new JLabel("Password:");
//    passwordLabel.setBounds(50, 200, 100, 25);
//    passwordLabel.setForeground(CommonConstants.TEXT_COLOR);
//    passwordLabel.setFont(new Font("Dialog", Font.PLAIN, 20));
//    add(passwordLabel);
//
//    // create password text field
//    JPasswordField passwordField = new JPasswordField();
//    passwordField.setBounds(50, 230, 300, 40);
//    passwordField.setBackground(CommonConstants.SECONDARY_COLOR);
//    passwordField.setForeground(CommonConstants.TEXT_COLOR);
//    passwordField.setFont(new Font("Dialog", Font.PLAIN, 24));
//    add(passwordField);
//
//    // create login button
//    JButton loginButton = new JButton("Login");
//    loginButton.setBounds(125, 300, 150, 40);
//    loginButton.setFont(new Font("Dialog", Font.BOLD, 18));
//    loginButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//    loginButton.setBackground(CommonConstants.TEXT_COLOR);
//    loginButton.addActionListener(new ActionListener() {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            String username = usernameField.getText();
//            String password = new String(passwordField.getPassword());
//
//            if (MyJDBC.validateLogin(username, password)) {
//                JOptionPane.showMessageDialog(LoginFormGUI.this, "Login Successful!");
//                LoginFormGUI.this.dispose();
//                new MusicPlayerGUI().setVisible(true);
//            } else {
//                JOptionPane.showMessageDialog(LoginFormGUI.this, "Login Failed...");
//            }
//        }
//    });
//    add(loginButton);
//
//    // create register label
//    JLabel registerLabel = new JLabel("Not a user? Register Here");
//    registerLabel.setBounds(125, 360, 150, 30);
//    registerLabel.setHorizontalAlignment(SwingConstants.CENTER);
//    registerLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//    registerLabel.setForeground(CommonConstants.TEXT_COLOR);
//    registerLabel.addMouseListener(new MouseAdapter() {
//        @Override
//        public void mouseClicked(MouseEvent e) {
//            LoginFormGUI.this.dispose();
//            new RegisterFormGUI().setVisible(true);
//        }
//    });
//    add(registerLabel);
    private void addGuiComponents() {
        // Set JFrame size
        setSize(400, 600);
        setLayout(null);

        // create login label
        JLabel loginLabel = new JLabel("Login");
        loginLabel.setBounds(50, 30, 300, 50);
        loginLabel.setForeground(CommonConstants.TEXT_COLOR);
        loginLabel.setFont(new Font("Dialog", Font.BOLD, 40));
        loginLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(loginLabel);

        // create username label
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(50, 100, 100, 25);
        usernameLabel.setForeground(CommonConstants.TEXT_COLOR);
        usernameLabel.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(usernameLabel);

        // create username text field
        JTextField usernameField = new JTextField();
        usernameField.setBounds(50, 130, 300, 40);
        usernameField.setBackground(CommonConstants.SECONDARY_COLOR);
        usernameField.setForeground(CommonConstants.TEXT_COLOR);
        usernameField.setFont(new Font("Dialog", Font.PLAIN, 24));
        usernameField.setMargin(new Insets(5, 5, 5, 5)); // Add padding inside the text field
        add(usernameField);

        // create password label
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 200, 100, 25);
        passwordLabel.setForeground(CommonConstants.TEXT_COLOR);
        passwordLabel.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(passwordLabel);

        // create password text field
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(50, 230, 300, 40);
        passwordField.setBackground(CommonConstants.SECONDARY_COLOR);
        passwordField.setForeground(CommonConstants.TEXT_COLOR);
        passwordField.setFont(new Font("Dialog", Font.PLAIN, 24));
        passwordField.setMargin(new Insets(5, 5, 5, 5)); // Add padding inside the text field
        add(passwordField);

        // create login button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(125, 300, 150, 40);
        loginButton.setFont(new Font("Dialog", Font.BOLD, 18));
        loginButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        loginButton.setBackground(CommonConstants.SECONDARY_COLOR);
        loginButton.setForeground(CommonConstants.TEXT_COLOR);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (MyJDBC.validateLogin(username, password)) {
                    JOptionPane.showMessageDialog(LoginFormGUI.this, "Login Successful!");
                    LoginFormGUI.this.dispose();
                    new MusicPlayerGUI().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(LoginFormGUI.this, "Login Failed...");
                }
            }
        });
        add(loginButton);

        // create register label
        JLabel registerLabel = new JLabel("Not a user? Register Here");
        registerLabel.setBounds(100, 480, 200, 30);
        registerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        registerLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        registerLabel.setForeground(CommonConstants.TEXT_COLOR);
        registerLabel.setFont(new Font("Dialog", Font.PLAIN, 16));
        registerLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                LoginFormGUI.this.dispose();
                new RegisterFormGUI().setVisible(true);
            }
        });
        add(registerLabel);
    }
}

















