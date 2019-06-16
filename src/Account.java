public class Account
{
	private String username;
	private String password;
	private String answer;
	
	public Account(String username, String password, String answer)
	{
		this.username = username;
		this.password = password;
		this.answer = answer;
	}
	
	public String getUsername()
	{
		return username;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public String getAnswer()
	{
		return answer;
	}
	
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public void setAnswer(String answer)
	{
		this.answer = answer;
	}
}
