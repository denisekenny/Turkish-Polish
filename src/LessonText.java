import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class LessonText extends JDialog {

	private final JPanel contentPanel = new JPanel();
	
	private JTextArea txtareaLesson;
	
	private ArrayList<String> text;

	/**
	 * Create the dialog.
	 */
	public LessonText(ArrayList<String> text)
	{
		setBounds(100, 100, 750, 735);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		txtareaLesson = new JTextArea();
		txtareaLesson.setBounds(10, 10, 730, 695);
		contentPanel.add(txtareaLesson);
		
		this.text = text;
		this.setTextArea();
	}
	
	private void setTextArea()
	{
		int count = 0;
		int numberOfLines = text.size();
		while(count < numberOfLines)
		{
			txtareaLesson.append(text.get(count));
			txtareaLesson.append("\n");
			count++;
		}
	}
}
