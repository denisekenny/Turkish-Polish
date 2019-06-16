public class Word
{
	private String english;
	private String turkish;
	private boolean given;
	private int correctCount;
	private int incorrectCount;
	
	public Word(String english, String turkish, int correctCount, int incorrectCount)
	{
		this.english = english;
		this.turkish = turkish;
		this.given = false;
		this.correctCount = correctCount;
		this.incorrectCount = incorrectCount;
	}
	
	public int getCorrect() {
		return correctCount;
	}


	public void setCorrect(int correctCount) {
		this.correctCount = correctCount;
	}


	public int getIncorrect() {
		return incorrectCount;
	}


	public void setIncorrect(int incorrectCount) {
		this.incorrectCount = incorrectCount;
	}
	
	public boolean isGiven() {
		return given;
	}


	public void setGiven(boolean given) {
		this.given = given;
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
}
