import javax.swing.*;

public class DashboardFrame extends JFrame {

    private Account account;

    public DashboardFrame(Account account) {
        this.account = account;

        setTitle("ATM Dashboard");
        setSize(350, 250);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton withdrawBtn = new JButton("Withdraw");
        JButton balanceBtn = new JButton("Check Balance");
        JButton exitBtn = new JButton("Exit");

        withdrawBtn.setBounds(90, 30, 150, 30);
        balanceBtn.setBounds(90, 80, 150, 30);
        exitBtn.setBounds(90, 130, 150, 30);

        add(withdrawBtn);
        add(balanceBtn);
        add(exitBtn);

        withdrawBtn.addActionListener(e -> new WithdrawFrame(account));

        balanceBtn.addActionListener(e ->
                new BalanceFrame(account));

        exitBtn.addActionListener(e -> {
            JOptionPane.showMessageDialog(this,
                    "Thank you for using ATM");
            System.exit(0);
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }
}