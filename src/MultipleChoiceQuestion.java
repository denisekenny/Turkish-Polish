public class MultipleChoiceQuestion extends Question
{
	private String optionA;
	private String optionB;
	private String optionC;
	private String optionD;
	
	public MultipleChoiceQuestion(String question, String answer, String a, String b, String c)
	{
		super(question, answer);
		int randomNumber = (int) (Math.random() * 4 + 1);
		if (randomNumber == 1)
		{
			optionA = answer;
			optionB = a;
			optionC = b;
			optionD = c;
		}
		else if (randomNumber == 2)
		{
			optionA = a;
			optionB = answer;
			optionC = b;
			optionD = c;
		}
		else if (randomNumber == 3)
		{
			optionA = a;
			optionB = b;
			optionC = answer;
			optionD = c;
		}
		else if (randomNumber == 4)
		{
			optionA = a;
			optionB = b;
			optionC = c;
			optionD = answer;
		}
	}
	
	public String giveQuestion()
	{
		String line1 = super.giveQuestion();
		String line2 = "A. " + optionA;
		String line3 = "B. " + optionB;
		String line4 = "C. " + optionC;
		String line5 = "D. " + optionD;
		String theQuestion = line1 + "\r\n" + line2 + "\r\n" + line3 + "\r\n" + line4 + "\r\n" + line5;
		return theQuestion;
	}
	
	public boolean checkAnswer(String response)
	{
		String theResponse = response.toLowerCase().substring(0, 1);
		if (theResponse.equals("a"))
		{
			theResponse = optionA;
		}
		else if (theResponse.equals("b"))
		{
			theResponse = optionB;
		}
		else if (theResponse.equals("c"))
		{
			theResponse = optionC;
		}
		else if (theResponse.equals("d"))
		{
			theResponse = optionD;
		}
		return super.checkAnswer(theResponse);
	}
	
}
