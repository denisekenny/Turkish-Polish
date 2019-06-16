public class NumberQuestion extends Question
{
	public NumberQuestion(String question, String answer)
	{
		super(question, answer);
	}
	
	public boolean checkAnswer(int response)
	{
		String strResponse = "";
		
		if (response < 0)
		{
			return false;
		}
		else if (response < 1000)
		{
			strResponse = EnglishNumberToWords.convertLessThanOneThousand(response);
		}
		else
		{
			strResponse = EnglishNumberToWords.convert(response);
		}
		
		if (strResponse.substring(0, 1).equals(" "))
		{
			strResponse = strResponse.substring(1);
		}
		if (strResponse.substring(strResponse.length() - 1).equals(" "))
		{
			strResponse = strResponse.substring(0, strResponse.length() - 1);
		}
		
		return super.checkAnswer(strResponse);
	}	
}
