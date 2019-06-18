public class Word
{
	private String english;
	private String turkish;
	private int level;
	private int lesson;
	
	public Word(String english, String turkish, int level, int lesson)
	{
		this.english = english;
		this.turkish = turkish;
		this.level = level;
		this.lesson = lesson;
	}


	public String getEnglish() {
		return english;
	}


	public void setEnglish(String english) {
		this.english = english;
	}


	public String getTurkish() {
		return turkish;
	}


	public void setTurkish(String turkish) {
		this.turkish = turkish;
	}
	
	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public int getLesson() {
		return lesson;
	}


	public void setLesson(int lesson) {
		this.lesson = lesson;
	}
}
