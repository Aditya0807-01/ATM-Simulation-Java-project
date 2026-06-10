import javax.swing.*;

public class WithdrawFrame extends JFrame {

    private Account account;

    public WithdrawFrame(Account account) {
        this.account = account;

        setTitle("Withdraw Money");
        setSize(350, 220);
        setLayout(null);

        JLabel amountLabel = new JLabel("Enter Amount:");
        amountLabel.setBounds(40, 40, 100, 30);

        JTextField amountField = new JTextField();
        amountField.setBounds(150, 40, 120, 30);

        JButton withdrawBtn = new JButton("Withdraw");
        withdrawBtn.setBounds(110, 100, 120, 30);

        add(amountLabel);
        add(amountField);
        add(withdrawBtn);

        withdrawBtn.addActionListener(e -> {
            try {
                double amount =
                        Double.parseDouble(amountField.getText());

                account.withdraw(amount);

                JOptionPane.showMessageDialog(this,
                        "Withdrawal Successful!");

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this,
                        "Please enter a valid amount.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this,
                        ex.getMessage());
            }
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }
}