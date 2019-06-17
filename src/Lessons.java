import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Lessons
{
	
	public static Lesson getLevelFromTextFile(String textFileNameWithoutDefault, String username)
	{
		String userSpecificTextFileName = textFileNameWithoutDefault + "_" + username + ".txt";
		try
		{
			ArrayList<Word> lessonWordList = new ArrayList<Word>();
			BufferedReader preferredFileBufferedReader = new BufferedReader(new FileReader(new File("lesson_text_files/" + userSpecificTextFileName)));
			while(preferredFileBufferedReader.ready())
			{
				String currentLine = preferredFileBufferedReader.readLine();
				String[] wordParameters = currentLine.split("-");
				for(int i = 0; i < 4; i++)
				{
					wordParameters[i] = wordParameters[i].trim();
				}
				lessonWordList.add(new Word(wordParameters[0], wordParameters[1], Integer.parseInt(wordParameters[2]), Integer.parseInt(wordParameters[3])));
			}
			preferredFileBufferedReader.close();
			return new Lesson(lessonWordList);
		}
		catch(FileNotFoundException fnfe)
		{
			if(createUserSpecificFileFromTheDefaultFileAndReturnWhetherYouSucceded(textFileNameWithoutDefault, username))
			{
				return getLevelFromTextFile(textFileNameWithoutDefault, username);
			}
			else
			{
				return null;
			}
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
			System.out.println("FATAL ERROR OCCURRED IN GETLEVELFROMTEXTFILE, AN IOEXCEPTION OCCURRED AND THIS BUG MUST BE ADDRESSED.");
			return null;
		}
	}
	
	public static boolean createUserSpecificFileFromTheDefaultFileAndReturnWhetherYouSucceded(String textFileNameWithoutDefault, String username)
	{
		try
		{
			String defaultTextFileName = textFileNameWithoutDefault + "_" + "default" + ".txt";
			String userSpecificTextFileName = textFileNameWithoutDefault + "_" + username + ".txt";
			
			BufferedReader defaultFileBufferedReader = new BufferedReader(new FileReader(new File("lesson_text_files/" + defaultTextFileName)));
			BufferedWriter preferredFileBufferedWriter = new BufferedWriter(new FileWriter(new File("lesson_text_files/" + userSpecificTextFileName)));
			
			while(defaultFileBufferedReader.ready())
			{
				preferredFileBufferedWriter.write(defaultFileBufferedReader.readLine());
				preferredFileBufferedWriter.newLine();
			}
			
			defaultFileBufferedReader.close();
			preferredFileBufferedWriter.close();
			
			return true;
		}
		catch(FileNotFoundException fnfe)
		{
			fnfe.printStackTrace();
			return false;
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
			return false;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	
	public static ArrayList<Word> worstWords()
	{
		return null;
		/*
		ArrayList<Word> incorrect = new ArrayList<Word>();
		int count10 = 0;
		
		ArrayList<Word> one = getLevelOneLessonOne().getArray();
		for (int i = 0; i < one.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((one.get(i).getIncorrect()) > (one.get(i).getCorrect()))
			{
				incorrect.add(one.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> two = getLevelOneLessonTwo().getArray();
		for (int i = 0; i < two.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((two.get(i).getIncorrect()) > (two.get(i).getCorrect()))
			{
				incorrect.add(two.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> three = getLevelOneLessonThree().getArray();
		for (int i = 0; i < three.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((three.get(i).getIncorrect()) > (three.get(i).getCorrect()))
			{
				incorrect.add(three.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> four = getLevelOneLessonFour().getArray();
		for (int i = 0; i < four.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((four.get(i).getIncorrect()) > (four.get(i).getCorrect()))
			{
				incorrect.add(four.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> five = getLevelOneLessonFive().getArray();
		for (int i = 0; i < five.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((five.get(i).getIncorrect()) > (five.get(i).getCorrect()))
			{
				incorrect.add(five.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> six = getLevelOneLessonSix().getArray();
		for (int i = 0; i < six.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((six.get(i).getIncorrect()) > (six.get(i).getCorrect()))
			{
				incorrect.add(six.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> seven = getLevelTwoLessonOne().getArray();
		for (int i = 0; i < seven.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((seven.get(i).getIncorrect()) > (seven.get(i).getCorrect()))
			{
				incorrect.add(seven.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> eight = getLevelTwoLessonTwo().getArray();
		for (int i = 0; i < eight.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((eight.get(i).getIncorrect()) > (eight.get(i).getCorrect()))
			{
				incorrect.add(eight.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> nine = getLevelTwoLessonThree().getArray();
		for (int i = 0; i < nine.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((nine.get(i).getIncorrect()) > (nine.get(i).getCorrect()))
			{
				incorrect.add(nine.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> ten = getLevelTwoLessonFour().getArray();
		for (int i = 0; i < ten.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((ten.get(i).getIncorrect()) > (ten.get(i).getCorrect()))
			{
				incorrect.add(ten.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> eleven = getLevelTwoLessonFive().getArray();
		for (int i = 0; i < eleven.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((eleven.get(i).getIncorrect()) > (eleven.get(i).getCorrect()))
			{
				incorrect.add(eleven.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> twelve = getLevelTwoLessonSix().getArray();
		for (int i = 0; i < twelve.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((twelve.get(i).getIncorrect()) > (twelve.get(i).getCorrect()))
			{
				incorrect.add(twelve.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> thirteen = getLevelThreeLessonOne().getArray();
		for (int i = 0; i < thirteen.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((thirteen.get(i).getIncorrect()) > (thirteen.get(i).getCorrect()))
			{
				incorrect.add(thirteen.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> fourteen = getLevelThreeLessonTwo().getArray();
		for (int i = 0; i < fourteen.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((fourteen.get(i).getIncorrect()) > (fourteen.get(i).getCorrect()))
			{
				incorrect.add(fourteen.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> fifteen = getLevelThreeLessonThree().getArray();
		for (int i = 0; i < fifteen.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((fifteen.get(i).getIncorrect()) > (fifteen.get(i).getCorrect()))
			{
				incorrect.add(fifteen.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> sixteen = getLevelThreeLessonFour().getArray();
		for (int i = 0; i < sixteen.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((sixteen.get(i).getIncorrect()) > (sixteen.get(i).getCorrect()))
			{
				incorrect.add(sixteen.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> seventeen = getLevelThreeLessonFive().getArray();
		for (int i = 0; i < seventeen.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((seventeen.get(i).getIncorrect()) > (seventeen.get(i).getCorrect()))
			{
				incorrect.add(seventeen.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> eighteen = getLevelThreeLessonSix().getArray();
		for (int i = 0; i < eighteen.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((eighteen.get(i).getIncorrect()) > (eighteen.get(i).getCorrect()))
			{
				incorrect.add(eighteen.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> nineteen = getLevelFourLessonOne().getArray();
		for (int i = 0; i < nineteen.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((nineteen.get(i).getIncorrect()) > (nineteen.get(i).getCorrect()))
			{
				incorrect.add(nineteen.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> twenty = getLevelFourLessonTwo().getArray();
		for (int i = 0; i < twenty.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((twenty.get(i).getIncorrect()) > (twenty.get(i).getCorrect()))
			{
				incorrect.add(twenty.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> twentyOne = getLevelFourLessonThree().getArray();
		for (int i = 0; i < twentyOne.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((twentyOne.get(i).getIncorrect()) > (twentyOne.get(i).getCorrect()))
			{
				incorrect.add(twentyOne.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> twentyTwo = getLevelFourLessonFour().getArray();
		for (int i = 0; i < twentyTwo.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((twentyTwo.get(i).getIncorrect()) > (twentyTwo.get(i).getCorrect()))
			{
				incorrect.add(twentyTwo.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> twentyThree = getLevelFourLessonFive().getArray();
		for (int i = 0; i < twentyThree.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((twentyThree.get(i).getIncorrect()) > (twentyThree.get(i).getCorrect()))
			{
				incorrect.add(twentyThree.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> twentyFour = getLevelFourLessonSix().getArray();
		for (int i = 0; i < twentyFour.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((twentyFour.get(i).getIncorrect()) > (twentyFour.get(i).getCorrect()))
			{
				incorrect.add(twentyFour.get(i));
				count10++;
				
			}
		}
		
		return incorrect;
		*/
	}
	
}