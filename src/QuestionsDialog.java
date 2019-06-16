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
import java.lang.reflect.Array;
import java.util.ArrayList;

public class QuestionsDialog extends JDialog {

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
	
	private JLabel lblLessonReview;
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
	
	private int level;
	private int lesson;
	private Lesson theLessonForTheQuestions;
	
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
	
	private Account userAttemptingThisLesson;

	/**
	 * Create the dialog.
	 */
	public QuestionsDialog(String lessonName, int level, int lesson, Account paramUserAttemptingThisLesson) {
		
		userAttemptingThisLesson = paramUserAttemptingThisLesson;
		
		this.level = level;
		this.lesson = lesson;
		getLesson();
		createQuestions();
		
		setBounds(100, 100, 400, 650);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			
			lblLessonReview = new JLabel("Lesson Review: " + lessonName);
			lblLessonReview.setFont(new Font("Dialog", Font.PLAIN, 20));
			lblLessonReview.setBounds(10, 9, 364, 26);
			contentPanel.add(lblLessonReview);
			
			lblQOne = new JLabel("1. " + qOne.giveQuestion());
			lblQOne.setFont(new Font("Dialog", Font.PLAIN, 13));
			lblQOne.setBounds(10, 50, 198, 14);
			contentPanel.add(lblQOne);
			
			txtAOne = new JTextField();
			txtAOne.setFont(new Font("Dialog", Font.PLAIN, 13));
			txtAOne.setBounds(10, 70, 198, 20);
			contentPanel.add(txtAOne);
			txtAOne.setColumns(10);
			
			lblQTwo = new JLabel("2. " + qTwo.giveQuestion());
			lblQTwo.setFont(new Font("Dialog", Font.PLAIN, 13));
			lblQTwo.setBounds(10, 100, 198, 14);
			contentPanel.add(lblQTwo);
			
			lblQThree = new JLabel("3. " + qThree.giveQuestion());
			lblQThree.setFont(new Font("Dialog", Font.PLAIN, 13));
			lblQThree.setBounds(10, 150, 198, 14);
			contentPanel.add(lblQThree);
			
			lblQFour = new JLabel("4. " + qFour.giveQuestion());
			lblQFour.setFont(new Font("Dialog", Font.PLAIN, 13));
			lblQFour.setBounds(10, 200, 198, 14);
			contentPanel.add(lblQFour);
			
			lblQFive = new JLabel("5. " + qFive.giveQuestion());
			lblQFive.setFont(new Font("Dialog", Font.PLAIN, 13));
			lblQFive.setBounds(10, 250, 198, 14);
			contentPanel.add(lblQFive);
			
			lblQSix = new JLabel("6. " + qSix.giveQuestion());
			lblQSix.setFont(new Font("Dialog", Font.PLAIN, 13));
			lblQSix.setBounds(10, 300, 198, 14);
			contentPanel.add(lblQSix);
			
			lblQSeven = new JLabel("7. " + qSeven.giveQuestion());
			lblQSeven.setFont(new Font("Dialog", Font.PLAIN, 13));
			lblQSeven.setBounds(10, 350, 198, 14);
			contentPanel.add(lblQSeven);
			
			lblQEight = new JLabel("8. " + qEight.giveQuestion());
			lblQEight.setFont(new Font("Dialog", Font.PLAIN, 13));
			lblQEight.setBounds(10, 400, 198, 14);
			contentPanel.add(lblQEight);
			
			lblQNine = new JLabel("9. " + qNine.giveQuestion());
			lblQNine.setFont(new Font("Dialog", Font.PLAIN, 13));
			lblQNine.setBounds(10, 450, 198, 14);
			contentPanel.add(lblQNine);
			
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
			
			lblQTen = new JLabel("10. " + qTen.giveQuestion());
			lblQTen.setFont(new Font("Dialog", Font.PLAIN, 13));
			lblQTen.setBounds(10, 500, 198, 14);
			contentPanel.add(lblQTen);

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
				JButton btnDone = new JButton("Done!");
				btnDone.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						buttonClicked(e);
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
		checkQOne();
		checkQTwo();
		checkQThree();
		checkQFour();
		checkQFive();
		checkQSix();
		checkQSeven();
		checkQEight();
		checkQNine();
		checkQTen();
		
	}
	
	protected void checkQOne()
	{
		if ((txtAOne.getText().equals("")) || (!(qOne.checkAnswer(txtAOne.getText()))))
		{
			lblCorrectionOne.setText(qOne.getAnswer());
			lblCorrectionOne.setBorder(new LineBorder(Color.RED, 1));
		}
	}
	
	protected void checkQTwo()
	{
		if ((txtATwo.getText().equals("")) || (!(qTwo.checkAnswer(txtATwo.getText()))))
		{
			lblCorrectionTwo.setText(qTwo.getAnswer());
			lblCorrectionTwo.setBorder(new LineBorder(Color.RED, 1));
		}
	}
	
	protected void checkQThree()
	{
		if ((txtAThree.getText().equals("")) || (!(qThree.checkAnswer(txtAThree.getText()))))
		{
			lblCorrectionThree.setText(qThree.getAnswer());
			lblCorrectionThree.setBorder(new LineBorder(Color.RED, 1));
		}
	}
	
	protected void checkQFour()
	{
		if ((txtAFour.getText().equals("")) || (!(qFour.checkAnswer(txtAFour.getText()))))
		{
			lblCorrectionFour.setText(qFour.getAnswer());
			lblCorrectionFour.setBorder(new LineBorder(Color.RED, 1));
		}
	}
	
	protected void checkQFive()
	{
		if ((txtAFive.getText().equals("")) || (!(qFive.checkAnswer(txtAFive.getText()))))
		{
			lblCorrectionFive.setText(qFive.getAnswer());
			lblCorrectionFive.setBorder(new LineBorder(Color.RED, 1));
		}
	}
	
	protected void checkQSix()
	{
		if ((txtASix.getText().equals("")) || (!(qSix.checkAnswer(txtASix.getText()))))
		{
			lblCorrectionSix.setText(qSix.getAnswer());
			lblCorrectionSix.setBorder(new LineBorder(Color.RED, 1));
		}
	}
	
	protected void checkQSeven()
	{
		if ((txtASeven.getText().equals("")) || (!(qSeven.checkAnswer(txtASeven.getText()))))
		{
			lblCorrectionSeven.setText(qSeven.getAnswer());
			lblCorrectionSeven.setBorder(new LineBorder(Color.RED, 1));
		}
	}
	
	protected void checkQEight()
	{
		if ((txtAEight.getText().equals("")) || (!(qEight.checkAnswer(txtAEight.getText()))))
		{
			lblCorrectionEight.setText(qEight.getAnswer());
			lblCorrectionEight.setBorder(new LineBorder(Color.RED, 1));
		}
	}
	
	protected void checkQNine()
	{
		if ((txtANine.getText().equals("")) || (!(qNine.checkAnswer(txtANine.getText()))))
		{
			lblCorrectionNine.setText(qNine.getAnswer());
			lblCorrectionNine.setBorder(new LineBorder(Color.RED, 1));
		}
	}
	
	protected void checkQTen()
	{
		if ((txtATen.getText().equals("")) || (!(qTen.checkAnswer(txtATen.getText()))))
		{
			lblCorrectionTen.setText(qTen.getAnswer());
			lblCorrectionTen.setBorder(new LineBorder(Color.RED, 1));
		}
	}
	
	
	protected void getLesson()
	{
		Lesson lessonArray = null;
		if (level == 1)
		{
			if (lesson == 1)
			{
				lessonArray = Lessons.getLevelFromTextFile("level_one_lesson_one", userAttemptingThisLesson.getUsername());
			}
			else if (lesson == 2)
			{
				lessonArray = Lessons.getLevelFromTextFile("level_one_lesson_two", userAttemptingThisLesson.getUsername());
			}
			else if (lesson == 3)
			{
				lessonArray = Lessons.getLevelFromTextFile("level_one_lesson_three", userAttemptingThisLesson.getUsername());
			}
			else if (lesson == 4)
			{
				lessonArray = Lessons.getLevelFromTextFile("level_one_lesson_four", userAttemptingThisLesson.getUsername());
			}
			else if (lesson == 5)
			{
				lessonArray = Lessons.getLevelFromTextFile("level_one_lesson_five", userAttemptingThisLesson.getUsername());
			}
			else if (lesson == 6)
			{
				lessonArray = Lessons.getLevelFromTextFile("level_one_lesson_six", userAttemptingThisLesson.getUsername());
			}
		}
		else if (level == 2)
		{
			if (lesson == 1)
			{
				lessonArray = Lessons.getLevelFromTextFile("level_two_lesson_one", userAttemptingThisLesson.getUsername());
			}
			else if (lesson == 2)
			{
				lessonArray = Lessons.getLevelFromTextFile("level_two_lesson_two", userAttemptingThisLesson.getUsername());
			}
			else if (lesson == 3)
			{
				lessonArray = Lessons.getLevelFromTextFile("level_two_lesson_three", userAttemptingThisLesson.getUsername());
			}
			else if (lesson == 4)
			{
				lessonArray = Lessons.getLevelFromTextFile("level_two_lesson_four", userAttemptingThisLesson.getUsername());
			}
			else if (lesson == 5)
			{
				lessonArray = Lessons.getLevelFromTextFile("level_two_lesson_five", userAttemptingThisLesson.getUsername());
			}
			else if (lesson == 6)
			{
				lessonArray = Lessons.getLevelFromTextFile("level_two_lesson_six", userAttemptingThisLesson.getUsername());
			}
		}
		else if (level == 3)
		{
			if (lesson == 1)
			{
				lessonArray = Lessons.getLevelFromTextFile("level_three_lesson_one", userAttemptingThisLesson.getUsername());
			}
			else if (lesson == 2)
			{
				lessonArray = Lessons.getLevelFromTextFile("level_three_lesson_two", userAttemptingThisLesson.getUsername());
			}
			else if (lesson == 3)
			{
				lessonArray = Lessons.getLevelFromTextFile("level_three_lesson_three", userAttemptingThisLesson.getUsername());
			}
			else if (lesson == 4)
			{
				lessonArray = Lessons.getLevelFromTextFile("level_three_lesson_four", userAttemptingThisLesson.getUsername());
			}
			else if (lesson == 5)
			{
				lessonArray = Lessons.getLevelFromTextFile("level_three_lesson_five", userAttemptingThisLesson.getUsername());
			}
			else if (lesson == 6)
			{
				lessonArray = Lessons.getLevelFromTextFile("level_three_lesson_six", userAttemptingThisLesson.getUsername());
			}
		}
		else if (level == 4)
		{
			if (lesson == 1)
			{
				lessonArray = Lessons.getLevelFromTextFile("level_four_lesson_one", userAttemptingThisLesson.getUsername());
			}
			else if (lesson == 2)
			{
				lessonArray = Lessons.getLevelFromTextFile("level_four_lesson_two", userAttemptingThisLesson.getUsername());
			}
			else if (lesson == 3)
			{
				lessonArray = Lessons.getLevelFromTextFile("level_four_lesson_three", userAttemptingThisLesson.getUsername());
			}
			else if (lesson == 4)
			{
				lessonArray = Lessons.getLevelFromTextFile("level_four_lesson_four", userAttemptingThisLesson.getUsername());
			}
			else if (lesson == 5)
			{
				lessonArray = Lessons.getLevelFromTextFile("level_four_lesson_five", userAttemptingThisLesson.getUsername());
			}
			else if (lesson == 6)
			{
				lessonArray = Lessons.getLevelFromTextFile("level_four_lesson_six", userAttemptingThisLesson.getUsername());
			}
		}
		
		theLessonForTheQuestions = lessonArray;
	}
	
	private void createQuestions()
	{
		ArrayList<Integer> numUsed = new ArrayList<>();
		int numWord = theLessonForTheQuestions.getArray().size();
		
		int randomOne = (int) (Math.random() * numWord); //gives a number between 0 and the last index
		qOne = new Question(theLessonForTheQuestions.getArray().get(randomOne).getTurkish(), theLessonForTheQuestions.getArray().get(randomOne).getEnglish());
		numUsed.add(randomOne);
		
		int randomTwo = (int) (Math.random() * numWord);
		int newNum = this.checkIfUsed(numUsed, randomTwo, numWord);
		if (newNum != -1)
		{
			randomTwo = newNum;
		}
		qTwo = new Question(theLessonForTheQuestions.getArray().get(randomTwo).getTurkish(), theLessonForTheQuestions.getArray().get(randomTwo).getEnglish());
		numUsed.add(randomTwo);
		
		int randomThree = (int) (Math.random() * numWord);
		newNum = this.checkIfUsed(numUsed, randomThree, numWord);
		if (newNum != -1)
		{
			randomThree = newNum;
		}
		qThree = new Question(theLessonForTheQuestions.getArray().get(randomThree).getTurkish(), theLessonForTheQuestions.getArray().get(randomThree).getEnglish());
		numUsed.add(randomThree);
		
		int randomFour = (int) (Math.random() * numWord);
		newNum = this.checkIfUsed(numUsed, randomFour, numWord);
		if (newNum != -1)
		{
			randomFour = newNum;
		}
		qFour = new Question(theLessonForTheQuestions.getArray().get(randomFour).getTurkish(), theLessonForTheQuestions.getArray().get(randomFour).getEnglish());
		numUsed.add(randomFour);
		
		int randomFive = (int) (Math.random() * numWord);
		newNum = this.checkIfUsed(numUsed, randomFive, numWord);
		if (newNum != -1)
		{
			randomFive = newNum;
		}
		qFive = new Question(theLessonForTheQuestions.getArray().get(randomFive).getTurkish(), theLessonForTheQuestions.getArray().get(randomFive).getEnglish());
		numUsed.add(randomFive);
		
		int randomSix = (int) (Math.random() * numWord);
		newNum = this.checkIfUsed(numUsed, randomSix, numWord);
		if (newNum != -1)
		{
			randomSix = newNum;
		}
		qSix = new Question(theLessonForTheQuestions.getArray().get(randomSix).getTurkish(), theLessonForTheQuestions.getArray().get(randomSix).getEnglish());
		numUsed.add(randomSix);
		
		int randomSeven = (int) (Math.random() * numWord);
		newNum = this.checkIfUsed(numUsed, randomSeven, numWord);
		if (newNum != -1)
		{
			randomSeven = newNum;
		}
		qSeven = new Question(theLessonForTheQuestions.getArray().get(randomSeven).getTurkish(), theLessonForTheQuestions.getArray().get(randomSeven).getEnglish());
		numUsed.add(randomSeven);
		
		int randomEight = (int) (Math.random() * numWord);
		newNum = this.checkIfUsed(numUsed, randomEight, numWord);
		if (newNum != -1)
		{
			randomEight = newNum;
		}
		qEight = new Question(theLessonForTheQuestions.getArray().get(randomEight).getTurkish(), theLessonForTheQuestions.getArray().get(randomEight).getEnglish());
		numUsed.add(randomEight);
		
		int randomNine = (int) (Math.random() * numWord);
		newNum = this.checkIfUsed(numUsed, randomNine, numWord);
		if (newNum != -1)
		{
			randomNine = newNum;
		}
		qNine = new Question(theLessonForTheQuestions.getArray().get(randomNine).getTurkish(), theLessonForTheQuestions.getArray().get(randomNine).getEnglish());
		numUsed.add(randomNine);
		
		int randomTen = (int) (Math.random() * numWord);
		newNum = this.checkIfUsed(numUsed, randomTen, numWord);
		if (newNum != -1)
		{
			randomTen = newNum;
		}
		qTen = new Question(theLessonForTheQuestions.getArray().get(randomTen).getTurkish(), theLessonForTheQuestions.getArray().get(randomTen).getEnglish());
		numUsed.add(randomTen);
	}
	
	//returns -1 if the randomNumber is new or an alternate new number if it was used
	private int checkIfUsed(ArrayList<Integer> numUsed, int possible, int size)
	{
		int newValue = -1;
		if (numUsed.size() == 1)
		{
			boolean needNew = true;
			while (needNew)
			{
				if (possible == numUsed.get(0))
				{
					newValue = (int) (Math.random() * size);
				}
				else
				{
					needNew = false;
				}
			}
			
			return newValue;
		}
		else
		{
			boolean needNew = true;
			newValue = possible;
			int count = 0;
			while(needNew)
			{
				for (int i = 0; i < numUsed.size(); i++)
				{
					if (newValue == numUsed.get(i))
					{
						newValue = (int) (Math.random() * size);
						count = 0;
					}
					else
					{
						count++;
					}
					if (count == numUsed.size())
					{
						needNew = false;
						return newValue;
					}
				}
			}
		}
		return newValue;
	}
}
