public class Question
{
	private String question;
	private String answer;
	
	public Question(String question, String answer)
	{
		this.question = question;
		this.answer = answer;
	}
	
	public String giveQuestion()
	{
		return question;
	}
	
	public boolean checkAnswer(String response)
	{
		String responseLC = response.toLowerCase();
		return responseLC.equals(this.answer);
	}
	
	public String getAnswer()
	{
		return answer;
	}
}
