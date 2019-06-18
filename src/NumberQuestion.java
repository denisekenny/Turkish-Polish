public class NumberQuestion extends Question
{
	public NumberQuestion(String question, String answer)
	{
		super(question, answer);
	}
	
	public boolean checkAnswer(String inputResponse)
	{
		if(inputResponse.equals("0"))
		{
			return super.checkAnswer("zero");
		}
		
		try
		{
			int response = Integer.parseInt(inputResponse);
			
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
		catch (NumberFormatException e)
		{
			return super.checkAnswer(inputResponse);
		}
		
	}	
}
