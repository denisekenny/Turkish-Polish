import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ResetAllDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ResetAllDialog dialog = new ResetAllDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ResetAllDialog() {
		setBounds(100, 100, 300, 200);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblReset = new JLabel("Reset all accounts and progres?");
		lblReset.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		lblReset.setBounds(29, 21, 217, 21);
		contentPanel.add(lblReset);
		
		txtPassword = new JTextField();
		txtPassword.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		txtPassword.setBounds(100, 48, 130, 26);
		contentPanel.add(txtPassword);
		txtPassword.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		lblPassword.setBounds(29, 54, 69, 21);
		contentPanel.add(lblPassword);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				resetAll(txtPassword.getText());
			}
		});
		btnReset.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		btnReset.setBounds(81, 86, 117, 34);
		contentPanel.add(btnReset);
	}
	
	protected void resetAll(String password)
	{
		if (password.toLowerCase().equals("guava"))
		{
			//reset all
		}
	}
}
