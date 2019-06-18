import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class WrongSignInInfo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	
	private JLabel lblMessageLineOne;
	private JLabel lblSuggestedUsername;
	private JLabel lblMessageLineTwo;
	private JPanel buttonPane;
	private JButton btnOk;

	/**
	 * Create the dialog.
	 */
	public WrongSignInInfo(String line1, String line2, String suggestedUsername) {
		setBounds(100, 100, 480, 188);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.activeCaption);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblMessageLineOne = new JLabel(line1);
			lblMessageLineOne.setFont(new Font("Dialog", Font.PLAIN, 13));
			lblMessageLineOne.setBounds(10, 11, 444, 25);
			contentPanel.add(lblMessageLineOne);
		}
		{
			lblSuggestedUsername = new JLabel(suggestedUsername);
			lblSuggestedUsername.setFont(new Font("Dialog", Font.PLAIN, 15));
			lblSuggestedUsername.setBounds(10, 85, 274, 20);
			contentPanel.add(lblSuggestedUsername);
		}
		{
			lblMessageLineTwo = new JLabel(line2);
			lblMessageLineTwo.setFont(new Font("Dialog", Font.PLAIN, 13));
			lblMessageLineTwo.setBounds(10, 38, 444, 25);
			contentPanel.add(lblMessageLineTwo);
		}
		{
			buttonPane = new JPanel();
			buttonPane.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				btnOk = new JButton("OK");
				btnOk.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						okClicked(e);
					}
				});
				btnOk.setActionCommand("OK");
				buttonPane.add(btnOk);
				getRootPane().setDefaultButton(btnOk);
			}
		}
	}
	
	protected void okClicked(MouseEvent e)
	{
		this.setVisible(false);
	}
}
