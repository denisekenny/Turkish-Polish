import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class LevelTwoLessonSelect extends JFrame {

	private JPanel contentPane;
	private LessonText lessonText;
	private Account userAttemptingThisLesson;

	private QuestionsDialog questionsDialog;

	/**
	 * Create the frame.
	 */
	public LevelTwoLessonSelect(Account paramUserAttemptingThisLesson) {
		
		userAttemptingThisLesson = paramUserAttemptingThisLesson;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSelectALesson = new JLabel("Select a Lesson!");
		lblSelectALesson.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 20));
		lblSelectALesson.setBounds(139, 17, 203, 31);
		contentPane.add(lblSelectALesson);
		
		JButton btnLessonOne = new JButton("Lesson One:");
		btnLessonOne.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)
			{
				lessonButtonClicked("lessons/levelTwoLessonOneAdjectives.txt");
			}

		});
		btnLessonOne.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		btnLessonOne.setBounds(6, 81, 117, 33);
		contentPane.add(btnLessonOne);
		
		JButton btnLessonTwo = new JButton("Lesson Two");
		btnLessonTwo.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				lessonButtonClicked("lessons/levelTwoLessonTwoConjugatingAdjectives.txt");
			}
		});
		btnLessonTwo.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		btnLessonTwo.setBounds(6, 150, 117, 33);
		contentPane.add(btnLessonTwo);
		
		JButton btnLessonThree = new JButton("Lesson Three");
		btnLessonThree.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				lessonButtonClicked("lessons/levelTwoLessonThreeVerbsOne.txt");
			}
		});
		btnLessonThree.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		btnLessonThree.setBounds(6, 223, 117, 33);
		contentPane.add(btnLessonThree);
		
		JButton btnLessonFour = new JButton("Lesson Four");
		btnLessonFour.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				lessonButtonClicked("lessons/levelTwoLessonFourDaysOfTheWeek.txt");
			}
		});
		btnLessonFour.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		btnLessonFour.setBounds(230, 81, 117, 33);
		contentPane.add(btnLessonFour);
		
		JButton btnLessonFive = new JButton("Lesson Five");
		btnLessonFive.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lessonButtonClicked("lessons/levelTwoLessonFiveFamily.txt");
			}
		});
		btnLessonFive.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		btnLessonFive.setBounds(230, 150, 117, 33);
		contentPane.add(btnLessonFive);
		
		JButton btnLessonSix = new JButton("Lesson Six");
		btnLessonSix.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				lessonButtonClicked("lessons/levelTwoLessonSixFamilyTwo.txt");
			}
		});
		btnLessonSix.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		btnLessonSix.setBounds(230, 223, 117, 33);
		contentPane.add(btnLessonSix);
		
		JLabel lblNumbers = new JLabel("Verbs One:");
		lblNumbers.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		lblNumbers.setBounds(6, 195, 109, 16);
		contentPane.add(lblNumbers);
		
		JLabel lblFood = new JLabel("Family Two:");
		lblFood.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		lblFood.setBounds(230, 195, 109, 16);
		contentPane.add(lblFood);
		
		JLabel lblPhrases = new JLabel("Conjugating Adjectives:");
		lblPhrases.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		lblPhrases.setBounds(6, 122, 175, 16);
		contentPane.add(lblPhrases);
		
		JLabel lblPronouns = new JLabel("Adjectives:");
		lblPronouns.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		lblPronouns.setBounds(6, 60, 109, 16);
		contentPane.add(lblPronouns);
		
		JLabel lblColours = new JLabel("Days of the Week:");
		lblColours.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		lblColours.setBounds(230, 60, 130, 16);
		contentPane.add(lblColours);
		
		JLabel lblAnimals = new JLabel("Family:");
		lblAnimals.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		lblAnimals.setBounds(230, 126, 109, 16);
		contentPane.add(lblAnimals);
		
		JLabel lblLevel = new JLabel("Level 2:");
		lblLevel.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		lblLevel.setBounds(6, 6, 61, 16);
		contentPane.add(lblLevel);
		
		JButton btnLessonOneTest = new JButton("Test");
		btnLessonOneTest.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				testButtonClicked(1);
			}
		});
		btnLessonOneTest.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		btnLessonOneTest.setBounds(120, 80, 81, 34);
		contentPane.add(btnLessonOneTest);
		
		JButton btnLessonTwoTest = new JButton("Test");
		btnLessonTwoTest.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				testButtonClicked(2);
			}
		});
		btnLessonTwoTest.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		btnLessonTwoTest.setBounds(120, 149, 81, 34);
		contentPane.add(btnLessonTwoTest);
		
		JButton btnLessonThreeTest = new JButton("Test");
		btnLessonThreeTest.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				testButtonClicked(3);
			}
		});
		btnLessonThreeTest.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		btnLessonThreeTest.setBounds(120, 222, 81, 34);
		contentPane.add(btnLessonThreeTest);
		
		JButton btnLessonFourTest = new JButton("Test");
		btnLessonFourTest.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				testButtonClicked(4);
			}
		});
		btnLessonFourTest.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		btnLessonFourTest.setBounds(344, 80, 81, 34);
		contentPane.add(btnLessonFourTest);
		
		JButton btnLessonFiveTest = new JButton("Test");
		btnLessonFiveTest.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				testButtonClicked(5);
			}
		});
		btnLessonFiveTest.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		btnLessonFiveTest.setBounds(344, 149, 81, 34);
		contentPane.add(btnLessonFiveTest);
		
		JButton btnLessonSixTest = new JButton("Test");
		btnLessonSixTest.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				testButtonClicked(6);
			}
		});
		btnLessonSixTest.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		btnLessonSixTest.setBounds(344, 222, 81, 34);
		contentPane.add(btnLessonSixTest);
	}
	
	protected void lessonButtonClicked(String fileName)
	{
		ArrayList<String> lesson = SelectLevel.openFile(fileName);
		lessonText = new LessonText(lesson);
		lessonText.setLocationRelativeTo(this);
		lessonText.setVisible(true);
	}
	
	protected void testButtonClicked(int lesson)
	{
		if (lesson == 1)
		{
			questionsDialog = new QuestionsDialog("Adjectives", 2, 1, userAttemptingThisLesson);
		}
		else if (lesson == 2)
		{
			questionsDialog = new QuestionsDialog("Conjugating Adjectives", 2, 2, userAttemptingThisLesson);
		}
		else if (lesson == 3)
		{
			questionsDialog = new QuestionsDialog("Verbs One", 2, 3, userAttemptingThisLesson);
		}
		else if (lesson == 4)
		{
			questionsDialog = new QuestionsDialog("Days of the Week", 2, 4, userAttemptingThisLesson);
		}
		else if (lesson == 5)
		{
			questionsDialog = new QuestionsDialog("Family", 2, 5, userAttemptingThisLesson);
		}
		else if (lesson == 6)
		{
			questionsDialog = new QuestionsDialog("Family Two", 2, 6, userAttemptingThisLesson);
		}
		questionsDialog.setLocationRelativeTo(this);
		questionsDialog.setVisible(true);
	}
}
