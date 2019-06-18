import java.awt.EventQueue;
import java.awt.Dialog.ModalityType;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import javax.swing.event.CaretListener;
import javax.swing.event.CaretEvent;
import javax.swing.UIManager;

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
	private JLabel lblWarningSecurityOne;
	private JLabel lblWarningSecurityTwo;
	
	private JButton btnSignIn;
	private JButton btnSignUpButton;
	private JButton btnNewPassSignIn;
	
	private SelectLevel selectingLevel;
	private WrongSignInInfo incorrectPopUp;
	private UsernamePassword accounts;

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
		
		accounts = new UsernamePassword();
		getAccountsFromTextFile();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 825, 500);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("FormattedTextField.selectionBackground"));
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
		txtUsernameSignIn.addCaretListener(new CaretListener()
		{
			public void caretUpdate(CaretEvent e)
			{
				textFieldTextChanged(e);
			}
		});
		txtUsernameSignIn.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		txtUsernameSignIn.setBounds(88, 116, 252, 20);
		contentPane.add(txtUsernameSignIn);
		txtUsernameSignIn.setColumns(10);
		
		txtPasswordSignIn = new JTextField();
		txtPasswordSignIn.addCaretListener(new CaretListener()
		{
			public void caretUpdate(CaretEvent e)
			{
				textFieldTextChanged(e);
			}
		});
		txtPasswordSignIn.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		txtPasswordSignIn.setBounds(88, 142, 252, 20);
		contentPane.add(txtPasswordSignIn);
		txtPasswordSignIn.setColumns(10);
		
		txtUsernameSignUp = new JTextField();
		txtUsernameSignUp.addCaretListener(new CaretListener()
		{
			public void caretUpdate(CaretEvent e)
			{
				textFieldTextChanged(e);
			}
		});
		txtUsernameSignUp.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		txtUsernameSignUp.setBounds(527, 116, 267, 20);
		contentPane.add(txtUsernameSignUp);
		txtUsernameSignUp.setColumns(10);
		
		txtPasswordSignUp = new JTextField();
		txtPasswordSignUp.addCaretListener(new CaretListener()
		{
			public void caretUpdate(CaretEvent e)
			{
				textFieldTextChanged(e);
			}
		});
		txtPasswordSignUp.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		txtPasswordSignUp.setBounds(527, 142, 267, 20);
		contentPane.add(txtPasswordSignUp);
		txtPasswordSignUp.setColumns(10);
		
		txtSecurityQuestionAnswer = new JTextField();
		txtSecurityQuestionAnswer.addCaretListener(new CaretListener()
		{
			public void caretUpdate(CaretEvent e)
			{
				textFieldTextChanged(e);
			}
		});
		txtSecurityQuestionAnswer.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		txtSecurityQuestionAnswer.setBounds(443, 221, 351, 20);
		contentPane.add(txtSecurityQuestionAnswer);
		txtSecurityQuestionAnswer.setColumns(10);
		
		txtUsernameForgotPass = new JTextField();
		txtUsernameForgotPass.addCaretListener(new CaretListener()
		{
			public void caretUpdate(CaretEvent e)
			{
				textFieldTextChanged(e);
			}
		});
		txtUsernameForgotPass.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		txtUsernameForgotPass.setBounds(118, 277, 222, 20);
		contentPane.add(txtUsernameForgotPass);
		txtUsernameForgotPass.setColumns(10);
		
		txtNewPasswordForgotPass = new JTextField();
		txtNewPasswordForgotPass.addCaretListener(new CaretListener()
		{
			public void caretUpdate(CaretEvent e)
			{
				textFieldTextChanged(e);
			}
		});
		txtNewPasswordForgotPass.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		txtNewPasswordForgotPass.setColumns(10);
		txtNewPasswordForgotPass.setBounds(118, 303, 222, 20);
		contentPane.add(txtNewPasswordForgotPass);
		
		txtSecurityQuestionAnswerForgotPass = new JTextField();
		txtSecurityQuestionAnswerForgotPass.addCaretListener(new CaretListener()
		{
			public void caretUpdate(CaretEvent e)
			{
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
		btnSignIn.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				btnSignInMouseClicked(e);
			}
		});
		btnSignIn.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		btnSignIn.setBounds(118, 171, 157, 34);
		btnSignIn.setEnabled(false);
		contentPane.add(btnSignIn);
		
		btnSignUpButton = new JButton("Let's get started!");
		btnSignUpButton.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		btnSignUpButton.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				btnSignUpButtonMouseClicked(e);
			}
		});
		btnSignUpButton.setBounds(527, 253, 194, 34);
		btnSignUpButton.setEnabled(false);
		contentPane.add(btnSignUpButton);
		
		btnNewPassSignIn = new JButton("I'll try not to forget again!");
		btnNewPassSignIn.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
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
	}
	
	protected void getAccountsFromTextFile()
	{
		ArrayList<Account> accountsFromTextFile = new ArrayList<Account>();
		try
		{
			BufferedReader preferredFileBufferedReader = new BufferedReader(new FileReader(new File("accounts/" + "all_the_accounts.txt")));
			while(preferredFileBufferedReader.ready())
			{
				String currentLine = preferredFileBufferedReader.readLine();
				String[] wordParameters = currentLine.split("-");
				accountsFromTextFile.add(new Account(wordParameters[0], wordParameters[1], wordParameters[2]));
			}
			preferredFileBufferedReader.close();
			accounts.setAccounts(accountsFromTextFile);
		}
		catch (FileNotFoundException fnfe)
		{
			System.out.println("A file not found exception in the getAccountsFromTextFile method from the lock screen class");
		}
		catch(IOException ioe)
		{
			System.out.println("An IO exception in the getAccountsFromTextFile method from the lock screen class");
		}
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
		if (makeThePopUp(2))
		{
			return;
		}
		else
		{
			Account accountToAdd = new Account(txtUsernameSignUp.getText(), txtPasswordSignUp.getText(), txtSecurityQuestionAnswer.getText());
			accounts.addAccount(accountToAdd);
			updateTextFileSignUp(accountToAdd);
			
			selectingLevel = new SelectLevel(accountToAdd);
			selectingLevel.setLocationRelativeTo(this);
			selectingLevel.setVisible(true);
			this.setVisible(false);
			
		}
	}
	
	private void updateTextFileSignUp(Account accountToAdd)
	{
		//Resource used:
		//https://stackoverflow.com/questions/4614227/how-to-add-a-new-line-of-text-to-an-existing-file-in-java/9377891
		String securityQA = accountToAdd.getAnswer();
		if (securityQA.equals(""))
		{
			securityQA = "answer was not given";
		}
		String lineToAdd = accountToAdd.getUsername() + "-" + accountToAdd.getPassword() + "-" + securityQA;
		try
		{
			Writer output = new BufferedWriter(new FileWriter("accounts/" + "all_the_accounts.txt", true));
			output.append('\n');
			output.append(lineToAdd);
			output.close();
		}
		catch (Exception e)
		{
			System.out.println("Could not access the file");
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
			
			updateTextFileNewPass(txtUsernameForgotPass.getText(), txtNewPasswordForgotPass.getText(), txtSecurityQuestionAnswerForgotPass.getText());
			
			selectingLevel = new SelectLevel(accounts.getAccount(txtUsernameForgotPass.getText()));
			selectingLevel.setLocationRelativeTo(this);
			selectingLevel.setVisible(true);
			this.setVisible(false);
		}
	}
	
	private void updateTextFileNewPass(String username, String newPassword, String answer)
	{
		//Resource used to change a line in a text file:
		//https://stackoverflow.com/questions/20039980/java-replace-line-in-text-file
		try
		{
	        BufferedReader file = new BufferedReader(new FileReader("accounts/" + "all_the_accounts.txt"));
	        StringBuffer inputBuffer = new StringBuffer();
	        String currentLine;

	        while (file.ready())
	        {
	        	currentLine = file.readLine();
	        	String[] lineParts = currentLine.split("-");
				if(lineParts[0].equals(username))
				{
					currentLine = username + "-" + newPassword + "-" + answer;
				}
				inputBuffer.append(currentLine);
	        }	
			file.close();

			FileOutputStream fileOut = new FileOutputStream("accounts/" + "all_the_accounts.txt");
			fileOut.write(inputBuffer.toString().getBytes());
			fileOut.close();
		}
	    catch (Exception e)
		{
	        System.out.println("Could not access the file");
	    }
	}
	
	private boolean makeThePopUp(int logInCase)
	{
		String line1 = "";
		String line2 = "" ;
		String suggestedUsername = "";
		boolean needsThePopUp = false;
		
		if (logInCase == 1)
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
		else if (logInCase == 2)
		{
			String inputUsername = txtUsernameSignUp.getText();
			if (accounts.usernameExists(inputUsername))
			{
				needsThePopUp = true;
				line1 = "That username was already chosen.";
				line2 = "How about this one as an alternative?";
				suggestedUsername = accounts.getSuggestedUsername(inputUsername);
			}
		}
		else if (logInCase == 3)
		{
			String inputUsername = txtUsernameForgotPass.getText();
			String inputPassword = txtNewPasswordForgotPass.getText();
			String securityQuestionAnswer = txtSecurityQuestionAnswerForgotPass.getText();
			
			if (!(accounts.canItGiveANewPassword(accounts.getOriginalSecurityQuestionAnswer(inputUsername))))
			{
				needsThePopUp = true;
				line1 = "I told you! If you don't answer the security question,";
				line2 = "You better answer the security question!";
			}
			else if (!(accounts.usernameExists(inputUsername)))
			{
				needsThePopUp = true;
				line1 = "There isn't an account with that username.";
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
