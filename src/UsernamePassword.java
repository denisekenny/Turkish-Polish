import java.util.ArrayList;

public class UsernamePassword
{
	private ArrayList<Account> allAccounts;
	
	public UsernamePassword()
	{
		allAccounts = new ArrayList<Account>();
	}
	
	public void setAccounts(ArrayList<Account> accounts)
	{
		allAccounts = accounts;
	}
	
	public void addAccount(Account account)
	{
		if (this.usernameExists(account.getUsername()))
		{
			System.out.println("That username is taken. How about " + this.getSuggestedUsername(account.getUsername()) + "?");
		}
		else
		{
			allAccounts.add(account);
		}
	}
	
	public void addAccount(String username, String password, String answer)
	{
		Account newAccount = new Account(username, password, answer);
		this.addAccount(newAccount);
	}
	
	public String getSuggestedUsername(String originalUsername)
	{
		String username = originalUsername;
		String suggestedUsername = "";
		
		Character lastChar = username.charAt(username.length() - 1);
		if (Character.isDigit(lastChar))
		{
			int numberOfNumbers = 0;
			String numbers = "";
			for (int i = username.length() - 1; i >= 0; i--)
			{
				Character charr = username.charAt(i);
				if (Character.isDigit(charr))
				{
					numberOfNumbers++;
					int number = Character.getNumericValue(charr);
					String stringNumber = Integer.toString(number);
					numbers = stringNumber + numbers;
				}
				else
				{
					break;
				}
			}
			int intNumber = Integer.parseInt(numbers);
			intNumber++;
			String newNumber = Integer.toString(intNumber);
			suggestedUsername = username.substring(0, username.length() - numberOfNumbers) + newNumber;
		}
		else
		{
			suggestedUsername = username + "1";
		}
		if (this.usernameExists(suggestedUsername))
		{
			suggestedUsername = this.getSuggestedUsername(suggestedUsername);
		}
		return suggestedUsername;
	}
	
	public boolean usernameExists(String username)
	{
		boolean exists = true;
		if (this.getIndex(username) == -1)
		{
			exists = false;
		}
		return exists;
	}
	
	private int getIndex(String username)
	{
		int index = -1;
		for (int i = 0; i < allAccounts.size(); i++)
		{
			if ((allAccounts.get(i).getUsername()).equals(username))
			{
				index =  i;
				return index;
			}
		}
		return index;
	}
	
	public Account getAccount(String username)
	{
		int index = this.getIndex(username);
		return allAccounts.get(index);
	}
	
	public String getOriginalSecurityQuestionAnswer(String username)
	{
		return this.getAccount(username).getAnswer();
	}
	
	//upper case and lower case matters for usernames and passwords
	public boolean checkPassword(String username, String password)
	{
		int index = this.getIndex(username);
		if (index == -1)
		{
			return false;
		}
		boolean correct = false;
		
		if ((allAccounts.get(index).getPassword()).equals(password))
		{
			correct = true;
		}
		
		return correct;
	}
	
	public void setPassword(String username, String newPassword, String answer)
	{
		if (this.canItGiveANewPassword(answer))
		{
			if (this.usernameExists(username))
			{
				int i = this.getIndex(username);
				
				if ((allAccounts.get(i).getAnswer()).equals(answer))
				{
					allAccounts.get(i).setPassword(newPassword);
				}
				else
				{
					System.out.println("That's not the answer. Try again!");
					System.out.println("Unless it's not your account. In that case, PLEASE STOP!");
				}
			}
			else
			{
				System.out.println("This username doesn't exist. Remember, case matters.");
			}
		}
		else
		{
			System.out.println("I told you, if you don't answer the security question...");
			System.out.println("YOU BETTER REMEMBER THE PASSWORD!");
		}
	}
	
	public boolean canItSetPassword(String username, String newPassword, String answer)
	{
		boolean didItWork = true;
		
		if (this.canItGiveANewPassword(answer))
		{
			if (this.usernameExists(username))
			{
				int i = this.getIndex(username);
				
				if ((allAccounts.get(i).getAnswer()).equals(answer))
				{
					didItWork = true;
				}
				else
				{
					didItWork = false;
				}
			}
			else
			{
				didItWork = false;
			}
		}
		else
		{
			didItWork = false;
		}
		
		return didItWork;
	}
	
	public boolean canItGiveANewPassword(String answer)
	{
		boolean canIt = false;
		
		if ((!(answer.equals(""))) && (!(answer.equals("answer was not given"))))
		{
			canIt = true;
		}
		
		return canIt;
	}
}
