import javax.swing.*;

public class BalanceFrame extends JFrame {

    public BalanceFrame(Account account) {

        setTitle("Balance");
        setSize(300, 180);
        setLayout(null);

        JLabel balanceLabel = new JLabel(
                "Current Balance: ₹" +
                        account.getBalance());

        balanceLabel.setBounds(50, 50, 200, 30);

        add(balanceLabel);

        setLocationRelativeTo(null);
        setVisible(true);
    }
}