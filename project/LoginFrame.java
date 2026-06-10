import javax.swing.*;

public class LoginFrame extends JFrame {

    private static final int PIN = 1234;
    private Account account;

    public LoginFrame(Account account) {
        this.account = account;

        setTitle("ATM Login");
        setSize(350, 200);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel pinLabel = new JLabel("Enter PIN:");
        pinLabel.setBounds(50, 40, 100, 30);

        JPasswordField pinField = new JPasswordField();
        pinField.setBounds(130, 40, 120, 30);

        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(110, 100, 100, 30);

        add(pinLabel);
        add(pinField);
        add(loginBtn);

        loginBtn.addActionListener(e -> {
            String enteredPin = new String(pinField.getPassword());

            if (enteredPin.equals(String.valueOf(PIN))) {
                JOptionPane.showMessageDialog(this, "Login Successful");
                new DashboardFrame(account);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid PIN");
            }
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }
}