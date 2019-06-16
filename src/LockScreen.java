import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Dialog.ModalityType;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.JTextComponent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Dialog.ModalityType;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.CaretEvent;
import javax.swing.JSeparator;

public class LockScreen extends JFrame {

	private JPanel contentPane;
	private JTextField txtPasswordSignIn;
	private JTextField txtUsernameSignUp;
	private JTextField txtPasswordSignUp;
	private JTextField txtSecurityQuestionAnswer;
	private JTextField txtUsernameForgotPass;
	private JTextField txtNewPasswordForgotPass;
	private JTextField txtSecurityQuestionAnswerForgotPass;
	private JTextField txtUsernameSignIn;
	
	private JLabel lblTurkishPolish;
	private JLabel lblProgramExplication;
	private JLabel lblInstructionLogIn;
	private JLabel lblUsernameSignIn;
	private JLabel lblSignIn;
	private JLabel lblSignUp;
	private JLabel lblPasswordSignIn;
	private JLabel lblUsernameSignUp;
	private JLabel lblPasswordSignUp;
	private JLabel lblForgotYourPassword;
	private JLabel lblSecurityQuestionIndicator;
	private JLabel lblSecurityQuestion;
	private JLabel lblUsernameForgotPass;
	private JLabel lblNewPasswordForgotPass;
	private JLabel lblAnswerSecurityQuestionIndicator;
	private JButton btnSignIn;
	private JButton btnSignUpButton;
	private JButton btnNewPassSignIn;
	private JLabel lblWarningSecurityOne;
	private JLabel lblWarningSecurityTwo;
	
	private SelectLevel selectingLevel;
	
	private WrongSignInInfo incorrectPopUp;
	private UsernamePassword accounts = new UsernamePassword();
	private JButton btnReset = new JButton("Reset");
	
	private ResetAllDialog resetAllDialog;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LockScreen frame = new LockScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LockScreen() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 825, 500);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTurkishPolish = new JLabel("Turkish Polish");
		lblTurkishPolish.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 22));
		lblTurkishPolish.setBounds(324, 6, 161, 28);
		contentPane.add(lblTurkishPolish);
		
		lblProgramExplication = new JLabel("A language learning program by Denise Kenny");
		lblProgramExplication.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		lblProgramExplication.setBounds(250, 30, 335, 28);
		contentPane.add(lblProgramExplication);
		
		lblInstructionLogIn = new JLabel("To begin, log in or create an account");
		lblInstructionLogIn.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		lblInstructionLogIn.setBounds(284, 54, 304, 21);
		contentPane.add(lblInstructionLogIn);
		
		lblUsernameSignIn = new JLabel("Username: ");
		lblUsernameSignIn.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		lblUsernameSignIn.setBounds(10, 112, 106, 28);
		contentPane.add(lblUsernameSignIn);
		
		lblSignIn = new JLabel("Sign in:");
		lblSignIn.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		lblSignIn.setBounds(10, 87, 92, 21);
		contentPane.add(lblSignIn);
		
		lblSignUp = new JLabel("Sign up:");
		lblSignUp.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		lblSignUp.setBounds(443, 87, 60, 21);
		contentPane.add(lblSignUp);
		
		lblPasswordSignIn = new JLabel("Password: ");
		lblPasswordSignIn.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		lblPasswordSignIn.setBounds(10, 138, 106, 28);
		contentPane.add(lblPasswordSignIn);
		
		lblUsernameSignUp = new JLabel("Username: ");
		lblUsernameSignUp.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		lblUsernameSignUp.setBounds(443, 103, 77, 46);
		contentPane.add(lblUsernameSignUp);
		
		lblPasswordSignUp = new JLabel("Password: ");
		lblPasswordSignUp.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		lblPasswordSignUp.setBounds(443, 128, 77, 48);
		contentPane.add(lblPasswordSignUp);
		
		lblForgotYourPassword = new JLabel("Forgot your password?");
		lblForgotYourPassword.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		lblForgotYourPassword.setBounds(10, 238, 320, 40);
		contentPane.add(lblForgotYourPassword);
		
		lblSecurityQuestionIndicator = new JLabel("Security Question (Optional): ");
		lblSecurityQuestionIndicator.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		lblSecurityQuestionIndicator.setBounds(443, 174, 304, 28);
		contentPane.add(lblSecurityQuestionIndicator);
		
		lblSecurityQuestion = new JLabel("What is the weirdest object in your possession?");
		lblSecurityQuestion.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		lblSecurityQuestion.setBounds(443, 198, 339, 28);
		contentPane.add(lblSecurityQuestion);
		
		txtUsernameSignIn = new JTextField();
		txtUsernameSignIn.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				textFieldTextChanged(e);
			}
		});
		txtUsernameSignIn.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		txtUsernameSignIn.setBounds(88, 116, 252, 20);
		contentPane.add(txtUsernameSignIn);
		txtUsernameSignIn.setColumns(10);
		
		txtPasswordSignIn = new JTextField();
		txtPasswordSignIn.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				textFieldTextChanged(e);
			}
		});
		txtPasswordSignIn.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		txtPasswordSignIn.setBounds(88, 142, 252, 20);
		contentPane.add(txtPasswordSignIn);
		txtPasswordSignIn.setColumns(10);
		
		txtUsernameSignUp = new JTextField();
		txtUsernameSignUp.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				textFieldTextChanged(e);
			}
		});
		txtUsernameSignUp.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		txtUsernameSignUp.setBounds(527, 116, 267, 20);
		contentPane.add(txtUsernameSignUp);
		txtUsernameSignUp.setColumns(10);
		
		txtPasswordSignUp = new JTextField();
		txtPasswordSignUp.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				textFieldTextChanged(e);
			}
		});
		txtPasswordSignUp.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		txtPasswordSignUp.setBounds(527, 142, 267, 20);
		contentPane.add(txtPasswordSignUp);
		txtPasswordSignUp.setColumns(10);
		
		txtSecurityQuestionAnswer = new JTextField();
		txtSecurityQuestionAnswer.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				textFieldTextChanged(e);
			}
		});
		txtSecurityQuestionAnswer.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		txtSecurityQuestionAnswer.setBounds(443, 221, 351, 20);
		contentPane.add(txtSecurityQuestionAnswer);
		txtSecurityQuestionAnswer.setColumns(10);
		
		txtUsernameForgotPass = new JTextField();
		txtUsernameForgotPass.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				textFieldTextChanged(e);
			}
		});
		txtUsernameForgotPass.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		txtUsernameForgotPass.setBounds(118, 277, 222, 20);
		contentPane.add(txtUsernameForgotPass);
		txtUsernameForgotPass.setColumns(10);
		
		txtNewPasswordForgotPass = new JTextField();
		txtNewPasswordForgotPass.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				textFieldTextChanged(e);
			}
		});
		txtNewPasswordForgotPass.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		txtNewPasswordForgotPass.setColumns(10);
		txtNewPasswordForgotPass.setBounds(118, 303, 222, 20);
		contentPane.add(txtNewPasswordForgotPass);
		
		txtSecurityQuestionAnswerForgotPass = new JTextField();
		txtSecurityQuestionAnswerForgotPass.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				textFieldTextChanged(e);
			}
		});
		txtSecurityQuestionAnswerForgotPass.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		txtSecurityQuestionAnswerForgotPass.setColumns(10);
		txtSecurityQuestionAnswerForgotPass.setBounds(118, 358, 222, 20);
		contentPane.add(txtSecurityQuestionAnswerForgotPass);
		
		lblUsernameForgotPass = new JLabel("Username: ");
		lblUsernameForgotPass.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		lblUsernameForgotPass.setBounds(10, 277, 106, 20);
		contentPane.add(lblUsernameForgotPass);
		
		lblNewPasswordForgotPass = new JLabel("New Password: ");
		lblNewPasswordForgotPass.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		lblNewPasswordForgotPass.setBounds(10, 299, 106, 28);
		contentPane.add(lblNewPasswordForgotPass);
		
		lblAnswerSecurityQuestionIndicator = new JLabel("Answer to your Security Question:");
		lblAnswerSecurityQuestionIndicator.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		lblAnswerSecurityQuestionIndicator.setBounds(10, 335, 320, 21);
		contentPane.add(lblAnswerSecurityQuestionIndicator);
		
		btnSignIn = new JButton("Welcome Back");
		btnSignIn.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				btnSignInMouseClicked(e);
			}
		});
		btnSignIn.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		btnSignIn.setBounds(118, 171, 157, 34);
		btnSignIn.setEnabled(false);
		contentPane.add(btnSignIn);
		
		btnSignUpButton = new JButton("Let's get started!");
		btnSignUpButton.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		btnSignUpButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				btnSignUpButtonMouseClicked(e);
			}
		});
		btnSignUpButton.setBounds(527, 253, 194, 34);
		btnSignUpButton.setEnabled(false);
		contentPane.add(btnSignUpButton);
		
		btnNewPassSignIn = new JButton("I'll try not to forget again!");
		btnNewPassSignIn.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				btnNewPassSignInMouseClicked(e);
			}
		});
		btnNewPassSignIn.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		btnNewPassSignIn.setBounds(75, 401, 199, 34);
		btnNewPassSignIn.setEnabled(false);
		contentPane.add(btnNewPassSignIn);
		
		lblWarningSecurityOne = new JLabel("If you don't answer the security question,");
		lblWarningSecurityOne.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblWarningSecurityOne.setBounds(478, 298, 275, 30);
		lblWarningSecurityOne.setBorder(new LineBorder(Color.RED, 1));
		lblWarningSecurityOne.setVisible(false);
		contentPane.add(lblWarningSecurityOne);
		
		lblWarningSecurityTwo = new JLabel("you better remember your password");
		lblWarningSecurityTwo.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblWarningSecurityTwo.setBounds(478, 330, 275, 30);
		lblWarningSecurityTwo.setBorder(new LineBorder(Color.RED, 1));
		lblWarningSecurityTwo.setVisible(false);
		contentPane.add(lblWarningSecurityTwo);
		btnReset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				resetBtnClick(e);
				
			}
		});
		btnReset.setBounds(663, 438, 130, 34);
		contentPane.add(btnReset);
		btnReset.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
	}
	
	protected void resetBtnClick(MouseEvent e)
	{
		resetAllDialog = new ResetAllDialog();
		resetAllDialog.setLocationRelativeTo(this);
		resetAllDialog.setVisible(true);
	}
	
	protected void btnSignInMouseClicked(MouseEvent e)
	{
		if(!(btnSignIn.isEnabled()))
		{
			return;
		}
		
		if (makeThePopUp(1))
		{
			return;
		}
		else
		{
			selectingLevel = new SelectLevel(accounts.getAccount(txtUsernameSignIn.getText()));
			selectingLevel.setLocationRelativeTo(this);
			selectingLevel.setVisible(true);
			this.setVisible(false);
		}
	}
	
	protected void btnSignUpButtonMouseClicked(MouseEvent e)
	{
		if(!(btnSignUpButton.isEnabled()))
		{
			return;
		}
		
		boolean cannotGetIn = makeThePopUp(2);
		if (cannotGetIn)
		{
			return;
		}
		else
		{
			Account accountToAdd = new Account(txtUsernameSignUp.getText(), txtPasswordSignUp.getText(), txtSecurityQuestionAnswer.getText());
			accounts.addAccount(accountToAdd);
			selectingLevel = new SelectLevel(accountToAdd);
			selectingLevel.setLocationRelativeTo(this);
			selectingLevel.setVisible(true);
			this.setVisible(false);
		}
	}
	
	protected void btnNewPassSignInMouseClicked(MouseEvent e)
	{
		if(!(btnNewPassSignIn.isEnabled()))
		{
			return;
		}
		
		if (makeThePopUp(3))
		{
			return;
		}
		else
		{
			accounts.setPassword(txtUsernameForgotPass.getText(), txtNewPasswordForgotPass.getText(), txtSecurityQuestionAnswerForgotPass.getText());
			selectingLevel = new SelectLevel(accounts.getAccount(txtUsernameForgotPass.getText()));
			selectingLevel.setLocationRelativeTo(this);
			selectingLevel.setVisible(true);
			this.setVisible(false);
		}
	}
	
	private boolean makeThePopUp(int number)
	{
		String line1 = "";
		String line2 = "" ;
		String suggestedUsername = "";
		boolean needsThePopUp = false;
		
		if (number == 1)
		{
			String inputUsername = txtUsernameSignIn.getText();
			String inputPassword = txtPasswordSignIn.getText();
			boolean usernameExists = accounts.usernameExists(inputUsername);
			if (!usernameExists)
			{
				needsThePopUp = true;
				line1 = "There is not an account with that username. Usernames are case sensitive.";
				line2 = "If you'd like to create an account, sign up!";
			}
			else if (!accounts.checkPassword(inputUsername, inputPassword))
			{
				needsThePopUp = true;
				line1 = "Incorrect Password!";
				line2 = "Remember passwords are case sensitive.";
			}
		}
		else if (number == 2)
		{
			String inputUsername = txtUsernameSignUp.getText();
			String inputPassword = txtPasswordSignUp.getText();
			String securityQuestionAnswer = txtSecurityQuestionAnswer.getText();
			if (accounts.usernameExists(inputUsername))
			{
				needsThePopUp = true;
				line1 = "That username was already chosen.";
				line2 = "How about this one as an alternative?";
				suggestedUsername = accounts.getSuggestedUsername(inputUsername);
				
			}
		}
		else if (number == 3)
		{
			String inputUsername = txtUsernameForgotPass.getText();
			String inputPassword = txtNewPasswordForgotPass.getText();
			String securityQuestionAnswer = txtSecurityQuestionAnswerForgotPass.getText();
			
			if (!(accounts.canItGiveANewPassword(securityQuestionAnswer)))
			{
				needsThePopUp = true;
				line1 = "I told you! If you don't answer the security question,";
				line2 = "You better answer the security question!";
			}
			else if (!(accounts.usernameExists(inputUsername)))
			{
				needsThePopUp = true;
				line1 = "There isn't an account with that username so...";
			}
			else if (!(accounts.canItSetPassword(inputUsername, inputPassword, securityQuestionAnswer)))
			{
				needsThePopUp = true;
				line1 = "Your answer to the security question isn't right";
				line2 = "Unless you're trying to break into someone's account, try again!";
			}
		}
		
		if (needsThePopUp)
		{
			incorrectPopUp = new WrongSignInInfo(line1, line2, suggestedUsername);
			incorrectPopUp.setLocationRelativeTo(this);
			incorrectPopUp.setModalityType(ModalityType.APPLICATION_MODAL);
			incorrectPopUp.setVisible(true);
		}
		
		return needsThePopUp;
	}
	
	protected void textFieldTextChanged(CaretEvent e)
	{
		if (!(txtUsernameSignIn.getText().equals("")) && !(txtPasswordSignIn.getText().equals("")))
		{
			btnSignIn.setEnabled(true);
		}
		else
		{
			btnSignIn.setEnabled(false);
		}
		
		if (!(txtUsernameSignUp.getText().equals("")) && !(txtPasswordSignUp.getText().equals("")))
		{
			btnSignUpButton.setEnabled(true);
			if (txtSecurityQuestionAnswer.getText().equals(""))
			{
				lblWarningSecurityOne.setVisible(true);
				lblWarningSecurityTwo.setVisible(true);
			}
			else
			{
				lblWarningSecurityOne.setVisible(false);
				lblWarningSecurityTwo.setVisible(false);
			}
		}
		else
		{
			btnSignUpButton.setEnabled(false);
			lblWarningSecurityOne.setVisible(false);
			lblWarningSecurityTwo.setVisible(false);
		}
		
		if (!(txtUsernameForgotPass.getText().equals("")) && !(txtNewPasswordForgotPass.getText().equals("")) && !(txtSecurityQuestionAnswerForgotPass.getText().equals("")))
		{
			btnNewPassSignIn.setEnabled(true);
		}
		else
		{
			btnNewPassSignIn.setEnabled(false);
		}
		
	}
}
