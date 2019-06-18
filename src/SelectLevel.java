import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class SelectLevel extends JFrame {

	private JPanel contentPane;
	
	private JLabel lblInstruction1;
	private JLabel lblInstruction2;
	private JLabel lblInstruction3;
	private JButton btnWelcome;
	private JButton btnLevel1;
	private JButton btnLevel2;
	private JButton btnLevel3;
	private JButton btnLevel4;
	private JButton btncongratulations;
	private JLabel lblCustomizedLesson;
	private JButton btnCustomizedLesson;
	
	private LessonText lessonText;
	private LevelOneLessonSelect levelOneSelect;
	private LevelTwoLessonSelect levelTwoSelect;
	private LevelThreeLessonSelect levelThreeSelect;
	private LevelFourLessonSelect levelFourSelect;
	
	private QuestionsDialogCustomized customTest;
	
	private Account user;

	/**
	 * Create the frame.
	 */
	public SelectLevel(Account userAttemptingThisLesson) 
	{
		user = userAttemptingThisLesson;
		
		levelOneSelect = new LevelOneLessonSelect(userAttemptingThisLesson);
		levelTwoSelect = new LevelTwoLessonSelect(userAttemptingThisLesson);
		levelThreeSelect = new LevelThreeLessonSelect(userAttemptingThisLesson);
		levelFourSelect = new LevelFourLessonSelect(userAttemptingThisLesson);
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 475, 475);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblInstruction1 = new JLabel("Select the level you would like to work on.");
		lblInstruction1.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		lblInstruction1.setBounds(98, 6, 310, 16);
		contentPane.add(lblInstruction1);
		
		lblInstruction2 = new JLabel("If you're just starting, click on welcome to learn about the program.");
		lblInstruction2.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		lblInstruction2.setBounds(23, 23, 463, 16);
		contentPane.add(lblInstruction2);
		
		lblInstruction3 = new JLabel("If you're done all the levels, click on congratulations.");
		lblInstruction3.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		lblInstruction3.setBounds(60, 40, 434, 16);
		contentPane.add(lblInstruction3);
		
		btnWelcome = new JButton("Welcome");
		btnWelcome.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				btnWelcomeMouseClicked(e);
			}
		});
		btnWelcome.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		btnWelcome.setBounds(174, 68, 130, 33);
		contentPane.add(btnWelcome);
		
		btnLevel1 = new JButton("Level 1");
		btnLevel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnLevel1MouseClicked(e);
			}
		});
		btnLevel1.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		btnLevel1.setBounds(174, 109, 130, 33);
		contentPane.add(btnLevel1);
		
		btnLevel2 = new JButton("Level 2");
		btnLevel2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnLevel2MouseClicked(e);
			}
		});
		btnLevel2.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		btnLevel2.setBounds(174, 148, 130, 33);
		contentPane.add(btnLevel2);
		
		btnLevel3 = new JButton("Level 3");
		btnLevel3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnLevel3MouseClicked(e);
			}
		});
		btnLevel3.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		btnLevel3.setBounds(174, 190, 130, 33);
		contentPane.add(btnLevel3);
		
		btnLevel4 = new JButton("Level 4");
		btnLevel4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnLevel4MouseClicked(e);
			}
		});
		btnLevel4.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		btnLevel4.setBounds(174, 231, 130, 33);
		contentPane.add(btnLevel4);
		
		btncongratulations = new JButton("Congratulations");
		btncongratulations.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btncongratulationsMouseClicked(e);
			}
		});
		btncongratulations.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		btncongratulations.setBounds(174, 272, 130, 33);
		contentPane.add(btncongratulations);
		
		lblCustomizedLesson = new JLabel("Alternativerly, here is a customized lesson:");
		lblCustomizedLesson.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		lblCustomizedLesson.setBounds(98, 333, 325, 21);
		contentPane.add(lblCustomizedLesson);
		
		btnCustomizedLesson = new JButton("Customized Lesson");
		btnCustomizedLesson.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnCustomizedLessonMouseClicked(e);
			}
		});
		btnCustomizedLesson.setFont(new Font("Toppan Bunkyu Gothic", Font.PLAIN, 13));
		btnCustomizedLesson.setBounds(166, 366, 150, 33);
		contentPane.add(btnCustomizedLesson);
	}
	
	protected void btnWelcomeMouseClicked(MouseEvent e)
	{
		if(!(btnWelcome.isEnabled()))
		{
			return;
		}
		
		ArrayList<String> welcomeText = openFile("lessons/Welcome.txt");
		lessonText = new LessonText(welcomeText);
		lessonText.setLocationRelativeTo(this);
		lessonText.setVisible(true);
	}
	
	public static ArrayList<String> openFile(String fileName)
	{
		ArrayList<String> textFile = new ArrayList<String>();
		try
		{
			BufferedReader textReader = new BufferedReader(new FileReader(new File(fileName)));
			String firstLine = textReader.readLine();
			while (firstLine != null)
			{
				textFile.add(firstLine);
				firstLine = textReader.readLine();
			}
			textReader.close();
		}
		catch(FileNotFoundException fnfe)
		{
			
		}
		catch(IOException ioe)
		{
			
		}
		
		return textFile;
	}
	
	protected void btnLevel1MouseClicked(MouseEvent e)
	{
		if(!(btnLevel1.isEnabled()))
		{
			return;
		}
		levelOneSelect.setLocationRelativeTo(this);
		levelOneSelect.setVisible(true);
	}
	
	protected void btnLevel2MouseClicked(MouseEvent e)
	{
		if(!(btnLevel2.isEnabled()))
		{
			return;
		}
		levelTwoSelect.setLocationRelativeTo(this);
		levelTwoSelect.setVisible(true);
	}
	
	protected void btnLevel3MouseClicked(MouseEvent e)
	{
		if(!(btnLevel3.isEnabled()))
		{
			return;
		}
		levelThreeSelect.setLocationRelativeTo(this);
		levelThreeSelect.setVisible(true);
	}
	
	protected void btnLevel4MouseClicked(MouseEvent e)
	{
		if(!(btnLevel4.isEnabled()))
		{
			return;
		}
		levelFourSelect.setLocationRelativeTo(this);
		levelFourSelect.setVisible(true);
	}
	
	protected void btncongratulationsMouseClicked(MouseEvent e)
	{
		if(!(btncongratulations.isEnabled()))
		{
			return;
		}
		
		ArrayList<String> end = openFile("lessons/EndingRemarks.txt");
		lessonText = new LessonText(end);
		lessonText.setLocationRelativeTo(this);
		lessonText.setVisible(true);
	}
	
	protected void btnCustomizedLessonMouseClicked(MouseEvent e)
	{
		if(!(btnCustomizedLesson.isEnabled()))
		{
			return;
		}
		
		customTest = new QuestionsDialogCustomized(user);
		customTest.setLocationRelativeTo(this);
		customTest.setVisible(true);
	}
}

