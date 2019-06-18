import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class QuestionsDialogCustomized extends JDialog {

	private final JPanel contentPanel = new JPanel();
	
	private JTextField txtAOne;
	private JTextField txtATwo;
	private JTextField txtAThree;
	private JTextField txtAFour;
	private JTextField txtAFive;
	private JTextField txtASix;
	private JTextField txtASeven;
	private JTextField txtAEight;
	private JTextField txtANine;
	private JTextField txtATen;
	
	private JButton btnDone;
	
	private JLabel lblCustomTest;
	private JLabel lblQOne;
	private JLabel lblQTwo;
	private JLabel lblQThree;
	private JLabel lblQFour;
	private JLabel lblQFive;
	private JLabel lblQSix;
	private JLabel lblQSeven;
	private JLabel lblQEight;
	private JLabel lblQNine;
	private JLabel lblQTen;
	
	private Question qOne;
	private Question qTwo;
	private Question qThree;
	private Question qFour;
	private Question qFive;
	private Question qSix;
	private Question qSeven;
	private Question qEight;
	private Question qNine;
	private Question qTen;
	
	private JLabel lblCorrectionOne;
	private JLabel lblCorrectionTwo;
	private JLabel lblCorrectionThree;
	private JLabel lblCorrectionFour;
	private JLabel lblCorrectionFive;
	private JLabel lblCorrectionSix;
	private JLabel lblCorrectionSeven;
	private JLabel lblCorrectionEight;
	private JLabel lblCorrectionNine;
	private JLabel lblCorrectionTen;
	
	private ArrayList<Word> tenBadWords;
	private int sizeOfArray;
	private String username;

	/**
	 * Create the dialog.
	 */
	public QuestionsDialogCustomized(Account paramUserAttemptingThisLesson)
	{
		username = paramUserAttemptingThisLesson.getUsername();
		createQuestions(username);
		
		setBounds(100, 100, 400, 650);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblCustomTest = new JLabel("Custom Test: ");
			lblCustomTest.setFont(new Font("Dialog", Font.PLAIN, 20));
			lblCustomTest.setBounds(10, 9, 364, 26);
			contentPanel.add(lblCustomTest);
			
			if (sizeOfArray > 0)
			{
				lblQOne = new JLabel("1. " + qOne.giveQuestion());
				lblQOne.setFont(new Font("Dialog", Font.PLAIN, 13));
				lblQOne.setBounds(10, 50, 198, 14);
				contentPanel.add(lblQOne);
			}
			
			txtAOne = new JTextField();
			txtAOne.setFont(new Font("Dialog", Font.PLAIN, 13));
			txtAOne.setBounds(10, 70, 198, 20);
			contentPanel.add(txtAOne);
			txtAOne.setColumns(10);
			
			if (sizeOfArray > 1)
			{
				lblQTwo = new JLabel("2. " + qTwo.giveQuestion());
				lblQTwo.setFont(new Font("Dialog", Font.PLAIN, 13));
				lblQTwo.setBounds(10, 100, 198, 14);
				contentPanel.add(lblQTwo);
			}
			
			if (sizeOfArray > 2)
			{
				lblQThree = new JLabel("3. " + qThree.giveQuestion());
				lblQThree.setFont(new Font("Dialog", Font.PLAIN, 13));
				lblQThree.setBounds(10, 150, 198, 14);
				contentPanel.add(lblQThree);
			}
			
			if (sizeOfArray > 3)
			{
				lblQFour = new JLabel("4. " + qFour.giveQuestion());
				lblQFour.setFont(new Font("Dialog", Font.PLAIN, 13));
				lblQFour.setBounds(10, 200, 198, 14);
				contentPanel.add(lblQFour);
			}
			
			if (sizeOfArray > 4)
			{
				lblQFive = new JLabel("5. " + qFive.giveQuestion());
				lblQFive.setFont(new Font("Dialog", Font.PLAIN, 13));
				lblQFive.setBounds(10, 250, 198, 14);
				contentPanel.add(lblQFive);
			}
			
			if (sizeOfArray > 5)
			{
				lblQSix = new JLabel("6. " + qSix.giveQuestion());
				lblQSix.setFont(new Font("Dialog", Font.PLAIN, 13));
				lblQSix.setBounds(10, 300, 198, 14);
				contentPanel.add(lblQSix);	
			}
			
			if (sizeOfArray > 6)
			{
				lblQSeven = new JLabel("7. " + qSeven.giveQuestion());
				lblQSeven.setFont(new Font("Dialog", Font.PLAIN, 13));
				lblQSeven.setBounds(10, 350, 198, 14);
				contentPanel.add(lblQSeven);
			}
			
			if (sizeOfArray > 7)
			{
				lblQEight = new JLabel("8. " + qEight.giveQuestion());
				lblQEight.setFont(new Font("Dialog", Font.PLAIN, 13));
				lblQEight.setBounds(10, 400, 198, 14);
				contentPanel.add(lblQEight);
			}
			
			if (sizeOfArray > 8)
			{
				lblQNine = new JLabel("9. " + qNine.giveQuestion());
				lblQNine.setFont(new Font("Dialog", Font.PLAIN, 13));
				lblQNine.setBounds(10, 450, 198, 14);
				contentPanel.add(lblQNine);
			}
			
			if (sizeOfArray > 9)
			{
				lblQTen = new JLabel("10. " + qTen.giveQuestion());
				lblQTen.setFont(new Font("Dialog", Font.PLAIN, 13));
				lblQTen.setBounds(10, 500, 198, 14);
				contentPanel.add(lblQTen);
			}
			
			txtATwo = new JTextField();
			txtATwo.setFont(new Font("Dialog", Font.PLAIN, 13));
			txtATwo.setColumns(10);
			txtATwo.setBounds(10, 120, 198, 20);
			contentPanel.add(txtATwo);
			
			txtAThree = new JTextField();
			txtAThree.setFont(new Font("Dialog", Font.PLAIN, 13));
			txtAThree.setColumns(10);
			txtAThree.setBounds(10, 170, 198, 20);
			contentPanel.add(txtAThree);
			
			txtAFour = new JTextField();
			txtAFour.setFont(new Font("Dialog", Font.PLAIN, 13));
			txtAFour.setColumns(10);
			txtAFour.setBounds(10, 220, 198, 20);
			contentPanel.add(txtAFour);
			
			txtAFive = new JTextField();
			txtAFive.setFont(new Font("Dialog", Font.PLAIN, 13));
			txtAFive.setColumns(10);
			txtAFive.setBounds(10, 270, 198, 20);
			contentPanel.add(txtAFive);
			
			txtASix = new JTextField();
			txtASix.setFont(new Font("Dialog", Font.PLAIN, 13));
			txtASix.setColumns(10);
			txtASix.setBounds(10, 320, 198, 20);
			contentPanel.add(txtASix);
			
			txtASeven = new JTextField();
			txtASeven.setFont(new Font("Dialog", Font.PLAIN, 13));
			txtASeven.setColumns(10);
			txtASeven.setBounds(10, 370, 198, 20);
			contentPanel.add(txtASeven);
			
			txtAEight = new JTextField();
			txtAEight.setFont(new Font("Dialog", Font.PLAIN, 13));
			txtAEight.setColumns(10);
			txtAEight.setBounds(10, 420, 198, 20);
			contentPanel.add(txtAEight);
			
			txtANine = new JTextField();
			txtANine.setFont(new Font("Dialog", Font.PLAIN, 13));
			txtANine.setColumns(10);
			txtANine.setBounds(10, 470, 198, 20);
			contentPanel.add(txtANine);
			
			txtATen = new JTextField();
			txtATen.setFont(new Font("Dialog", Font.PLAIN, 13));
			txtATen.setColumns(10);
			txtATen.setBounds(10, 520, 198, 20);
			contentPanel.add(txtATen);
			
			lblCorrectionOne = new JLabel("");
			lblCorrectionOne.setFont(new Font("Dialog", Font.PLAIN, 13));
			lblCorrectionOne.setBounds(220, 72, 121, 16);
			contentPanel.add(lblCorrectionOne);
			
			lblCorrectionTwo = new JLabel("");
			lblCorrectionTwo.setFont(new Font("Dialog", Font.PLAIN, 13));
			lblCorrectionTwo.setBounds(220, 120, 121, 16);
			contentPanel.add(lblCorrectionTwo);
			
			lblCorrectionThree = new JLabel("");
			lblCorrectionThree.setFont(new Font("Dialog", Font.PLAIN, 13));
			lblCorrectionThree.setBounds(220, 172, 121, 16);
			contentPanel.add(lblCorrectionThree);
			
			lblCorrectionFour = new JLabel("");
			lblCorrectionFour.setFont(new Font("Dialog", Font.PLAIN, 13));
			lblCorrectionFour.setBounds(220, 222, 121, 16);
			contentPanel.add(lblCorrectionFour);
			
			lblCorrectionFive = new JLabel("");
			lblCorrectionFive.setFont(new Font("Dialog", Font.PLAIN, 13));
			lblCorrectionFive.setBounds(220, 272, 121, 16);
			contentPanel.add(lblCorrectionFive);
			
			lblCorrectionSix = new JLabel("");
			lblCorrectionSix.setFont(new Font("Dialog", Font.PLAIN, 13));
			lblCorrectionSix.setBounds(220, 322, 121, 16);
			contentPanel.add(lblCorrectionSix);
			
			lblCorrectionSeven = new JLabel("");
			lblCorrectionSeven.setFont(new Font("Dialog", Font.PLAIN, 13));
			lblCorrectionSeven.setBounds(220, 372, 121, 16);
			contentPanel.add(lblCorrectionSeven);
			
			lblCorrectionEight = new JLabel("");
			lblCorrectionEight.setFont(new Font("Dialog", Font.PLAIN, 13));
			lblCorrectionEight.setBounds(220, 422, 121, 16);
			contentPanel.add(lblCorrectionEight);
			
			lblCorrectionNine = new JLabel("");
			lblCorrectionNine.setFont(new Font("Dialog", Font.PLAIN, 13));
			lblCorrectionNine.setBounds(220, 472, 121, 16);
			contentPanel.add(lblCorrectionNine);
			
			lblCorrectionTen = new JLabel("");
			lblCorrectionTen.setFont(new Font("Dialog", Font.PLAIN, 13));
			lblCorrectionTen.setBounds(220, 522, 121, 16);
			contentPanel.add(lblCorrectionTen);
			
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				btnDone = new JButton("Done!");
				btnDone.addMouseListener(new MouseAdapter()
				{
					public void mouseClicked(MouseEvent e)
					{
						if (btnDone.isEnabled())
						{
							buttonClicked(e);
						}
					}
				});
				btnDone.setActionCommand("OK");
				buttonPane.add(btnDone);
				getRootPane().setDefaultButton(btnDone);
			}
		}
	}
	
	protected void buttonClicked(MouseEvent e)
	{
		if (sizeOfArray > 0)
		{
			checkQOne();
		}
		if (sizeOfArray > 1)
		{
			checkQTwo();
		}
		if (sizeOfArray > 2)
		{
			checkQThree();
		}
		if (sizeOfArray > 3)
		{
			checkQFour();
		}
		if (sizeOfArray > 4)
		{
			checkQFive();
		}
		if (sizeOfArray > 5)
		{
			checkQSix();
		}
		if (sizeOfArray > 6)
		{
			checkQSeven();
		}
		if (sizeOfArray > 7)
		{
			checkQEight();
		}
		if (sizeOfArray > 8)
		{
			checkQNine();
		}
		if (sizeOfArray > 9)
		{
			checkQTen();
		}
		btnDone.setEnabled(false);
	}
	
	protected void checkQOne()
	{
		if ((txtAOne.getText().equals("")) || (!(qOne.checkAnswer(txtAOne.getText()))))
		{
			lblCorrectionOne.setText(qOne.getAnswer());
			lblCorrectionOne.setBorder(new LineBorder(Color.RED, 1));
			Lessons.updateCorrectAndIncorrect(tenBadWords.get(0).getLevel(), tenBadWords.get(0).getLesson(), lblQOne.getText().substring(3), this.username, false);
		}
		else
		{
			lblCorrectionOne.setText("correct");
			Lessons.updateCorrectAndIncorrect(tenBadWords.get(0).getLevel(), tenBadWords.get(0).getLesson(), lblQOne.getText().substring(3), this.username, true);
		}
	}
	
	protected void checkQTwo()
	{
		if ((txtATwo.getText().equals("")) || (!(qTwo.checkAnswer(txtATwo.getText()))))
		{
			lblCorrectionTwo.setText(qTwo.getAnswer());
			lblCorrectionTwo.setBorder(new LineBorder(Color.RED, 1));
			Lessons.updateCorrectAndIncorrect(tenBadWords.get(1).getLevel(), tenBadWords.get(1).getLesson(), lblQTwo.getText().substring(3), this.username, false);
		}
		else
		{
			lblCorrectionTwo.setText("correct");
			Lessons.updateCorrectAndIncorrect(tenBadWords.get(1).getLevel(), tenBadWords.get(1).getLesson(), lblQTwo.getText().substring(3), this.username, true);
		}
	}
	
	protected void checkQThree()
	{
		if ((txtAThree.getText().equals("")) || (!(qThree.checkAnswer(txtAThree.getText()))))
		{
			lblCorrectionThree.setText(qThree.getAnswer());
			lblCorrectionThree.setBorder(new LineBorder(Color.RED, 1));
			Lessons.updateCorrectAndIncorrect(tenBadWords.get(2).getLevel(), tenBadWords.get(2).getLesson(), lblQThree.getText().substring(3), this.username, false);
		}
		else
		{
			lblCorrectionThree.setText("correct");
			Lessons.updateCorrectAndIncorrect(tenBadWords.get(2).getLevel(), tenBadWords.get(2).getLesson(), lblQThree.getText().substring(3), this.username, true);
		}
	}
	
	protected void checkQFour()
	{
		if ((txtAFour.getText().equals("")) || (!(qFour.checkAnswer(txtAFour.getText()))))
		{
			lblCorrectionFour.setText(qFour.getAnswer());
			lblCorrectionFour.setBorder(new LineBorder(Color.RED, 1));
			Lessons.updateCorrectAndIncorrect(tenBadWords.get(3).getLevel(), tenBadWords.get(3).getLesson(), lblQFour.getText().substring(3), this.username, false);
		}
		else
		{
			lblCorrectionFour.setText("correct");
			Lessons.updateCorrectAndIncorrect(tenBadWords.get(3).getLevel(), tenBadWords.get(3).getLesson(), lblQFour.getText().substring(3), this.username, true);
		}
	}
	
	protected void checkQFive()
	{
		if ((txtAFive.getText().equals("")) || (!(qFive.checkAnswer(txtAFive.getText()))))
		{
			lblCorrectionFive.setText(qFive.getAnswer());
			lblCorrectionFive.setBorder(new LineBorder(Color.RED, 1));
			Lessons.updateCorrectAndIncorrect(tenBadWords.get(4).getLevel(), tenBadWords.get(4).getLesson(), lblQFive.getText().substring(3), this.username, false);
		}
		else
		{
			lblCorrectionFive.setText("correct");
			Lessons.updateCorrectAndIncorrect(tenBadWords.get(4).getLevel(), tenBadWords.get(4).getLesson(), lblQFive.getText().substring(3), this.username, true);
		}
	}
	
	protected void checkQSix()
	{
		if ((txtASix.getText().equals("")) || (!(qSix.checkAnswer(txtASix.getText()))))
		{
			lblCorrectionSix.setText(qSix.getAnswer());
			lblCorrectionSix.setBorder(new LineBorder(Color.RED, 1));
			Lessons.updateCorrectAndIncorrect(tenBadWords.get(5).getLevel(), tenBadWords.get(5).getLesson(), lblQSix.getText().substring(3), this.username, false);
		}
		else
		{
			lblCorrectionSix.setText("correct");
			Lessons.updateCorrectAndIncorrect(tenBadWords.get(5).getLevel(), tenBadWords.get(5).getLesson(), lblQSix.getText().substring(3), this.username, true);
		}
	}
	
	protected void checkQSeven()
	{
		if ((txtASeven.getText().equals("")) || (!(qSeven.checkAnswer(txtASeven.getText()))))
		{
			lblCorrectionSeven.setText(qSeven.getAnswer());
			lblCorrectionSeven.setBorder(new LineBorder(Color.RED, 1));
			Lessons.updateCorrectAndIncorrect(tenBadWords.get(6).getLevel(), tenBadWords.get(6).getLesson(), lblQSeven.getText().substring(3), this.username, false);
		}
		else
		{
			lblCorrectionSeven.setText("correct");
			Lessons.updateCorrectAndIncorrect(tenBadWords.get(6).getLevel(), tenBadWords.get(6).getLesson(), lblQSeven.getText().substring(3), this.username, true);
		}
	}
	
	protected void checkQEight()
	{
		if ((txtAEight.getText().equals("")) || (!(qEight.checkAnswer(txtAEight.getText()))))
		{
			lblCorrectionEight.setText(qEight.getAnswer());
			lblCorrectionEight.setBorder(new LineBorder(Color.RED, 1));
			Lessons.updateCorrectAndIncorrect(tenBadWords.get(7).getLevel(), tenBadWords.get(7).getLesson(), lblQEight.getText().substring(3),this.username, false);
		}
		else
		{
			lblCorrectionEight.setText("correct");
			Lessons.updateCorrectAndIncorrect(tenBadWords.get(7).getLevel(), tenBadWords.get(7).getLesson(), lblQEight.getText().substring(3), this.username, true);
		}
	}
	
	protected void checkQNine()
	{
		if ((txtANine.getText().equals("")) || (!(qNine.checkAnswer(txtANine.getText()))))
		{
			lblCorrectionNine.setText(qNine.getAnswer());
			lblCorrectionNine.setBorder(new LineBorder(Color.RED, 1));
			Lessons.updateCorrectAndIncorrect(tenBadWords.get(8).getLevel(), tenBadWords.get(8).getLesson(), lblQNine.getText().substring(3), this.username, false);
		}
		else
		{
			lblCorrectionNine.setText("correct");
			Lessons.updateCorrectAndIncorrect(tenBadWords.get(8).getLevel(), tenBadWords.get(8).getLesson(), lblQNine.getText().substring(3), this.username, true);
		}
	}
	
	protected void checkQTen()
	{
		if ((txtATen.getText().equals("")) || (!(qTen.checkAnswer(txtATen.getText()))))
		{
			lblCorrectionTen.setText(qTen.getAnswer());
			lblCorrectionTen.setBorder(new LineBorder(Color.RED, 1));
			Lessons.updateCorrectAndIncorrect(tenBadWords.get(9).getLevel(), tenBadWords.get(9).getLesson(), lblQTen.getText().substring(3), this.username, false);
		}
		else
		{
			lblCorrectionTen.setText("correct");
			Lessons.updateCorrectAndIncorrect(tenBadWords.get(9).getLevel(), tenBadWords.get(9).getLesson(), lblQTen.getText().substring(3), this.username, true);
		}
	}
	
	private void createQuestions(String username)
	{
		tenBadWords = Lessons.worstWords(username);
		sizeOfArray = tenBadWords.size();
		
		try {
			if ((tenBadWords.get(0).getLevel() == 1) && (tenBadWords.get(0).getLesson() == 3) && (sizeOfArray > 0))
			{
				qOne = new NumberQuestion(tenBadWords.get(0).getTurkish(), tenBadWords.get(0).getEnglish());
			}
			else
			{
				qOne = new Question(tenBadWords.get(0).getTurkish(), tenBadWords.get(0).getEnglish());
			}
			if ((tenBadWords.get(1).getLevel() == 1) && (tenBadWords.get(1).getLesson() == 3) && (sizeOfArray > 1))
			{
				qTwo = new NumberQuestion(tenBadWords.get(1).getTurkish(), tenBadWords.get(1).getEnglish());
			}
			else
			{
				qTwo = new Question(tenBadWords.get(1).getTurkish(), tenBadWords.get(1).getEnglish());
			}
			if ((tenBadWords.get(2).getLevel() == 1) && (tenBadWords.get(2).getLesson() == 3) && (sizeOfArray > 2))
			{
				qThree = new NumberQuestion(tenBadWords.get(2).getTurkish(), tenBadWords.get(2).getEnglish());
			}
			else
			{
				qThree = new Question(tenBadWords.get(2).getTurkish(), tenBadWords.get(2).getEnglish());
			}
			if ((tenBadWords.get(3).getLevel() == 1) && (tenBadWords.get(3).getLesson() == 3) && (sizeOfArray > 3))
			{
				qFour = new NumberQuestion(tenBadWords.get(3).getTurkish(), tenBadWords.get(3).getEnglish());
			}
			else
			{
				qFour = new Question(tenBadWords.get(3).getTurkish(), tenBadWords.get(3).getEnglish());
			}
			
			if ((tenBadWords.get(4).getLevel() == 1) && (tenBadWords.get(4).getLesson() == 3) && (sizeOfArray > 4))
			{
				qFive = new NumberQuestion(tenBadWords.get(4).getTurkish(), tenBadWords.get(4).getEnglish());
			}
			else
			{
				qFive = new Question(tenBadWords.get(4).getTurkish(), tenBadWords.get(4).getEnglish());
			}
			
			if ((tenBadWords.get(5).getLevel() == 1) && (tenBadWords.get(5).getLesson() == 3) && (sizeOfArray > 5))
			{
				qSix = new NumberQuestion(tenBadWords.get(5).getTurkish(), tenBadWords.get(5).getEnglish());
			}
			else
			{
				qSix = new Question(tenBadWords.get(5).getTurkish(), tenBadWords.get(5).getEnglish());
			}
			
			if ((tenBadWords.get(6).getLevel() == 1) && (tenBadWords.get(6).getLesson() == 3) && (sizeOfArray > 6))
			{
				qSeven = new NumberQuestion(tenBadWords.get(6).getTurkish(), tenBadWords.get(6).getEnglish());
			}
			else
			{
				qSeven = new Question(tenBadWords.get(6).getTurkish(), tenBadWords.get(6).getEnglish());
			}
			
			if ((tenBadWords.get(7).getLevel() == 1) && (tenBadWords.get(7).getLesson() == 3) && (sizeOfArray > 7))
			{
				qEight = new NumberQuestion(tenBadWords.get(7).getTurkish(), tenBadWords.get(7).getEnglish());
			}
			else
			{
				qEight = new Question(tenBadWords.get(7).getTurkish(), tenBadWords.get(7).getEnglish());
			}
			
			if ((tenBadWords.get(8).getLevel() == 1) && (tenBadWords.get(8).getLesson() == 3) && (sizeOfArray > 8))
			{
				qNine = new NumberQuestion(tenBadWords.get(8).getTurkish(), tenBadWords.get(8).getEnglish());
			}
			else
			{
				qNine = new Question(tenBadWords.get(8).getTurkish(), tenBadWords.get(8).getEnglish());
			}
			
			if ((tenBadWords.get(9).getLevel() == 1) && (tenBadWords.get(9).getLesson() == 3) && (sizeOfArray > 9))
			{
				qTen = new NumberQuestion(tenBadWords.get(9).getTurkish(), tenBadWords.get(9).getEnglish());
			}
			else
			{
				qTen = new Question(tenBadWords.get(9).getTurkish(), tenBadWords.get(9).getEnglish());
			}
		}
		catch (Exception e)
		{
			System.out.println("error in the QuestionsDialogCustomized class");
		}
	}
}
