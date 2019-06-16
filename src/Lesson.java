import java.util.ArrayList;

public class Lesson
{
	private ArrayList<Word> wordsLesson = new ArrayList<Word>();
	
	public Lesson(ArrayList<Word> lessonLists)
	{
		this.wordsLesson = lessonLists;
	}
	
	public ArrayList<Word> getArray()
	{
		return wordsLesson;
	}
}
