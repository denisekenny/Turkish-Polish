import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Lessons
{
	
	public static Lesson getLevelFromTextFile(String textFileNameWithoutDefault, String username, int level, int lesson)
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
				lessonWordList.add(new Word(wordParameters[0], wordParameters[1], level, lesson));
			}
			preferredFileBufferedReader.close();
			return new Lesson(lessonWordList);
		}
		catch(FileNotFoundException fnfe)
		{
			if(createUserSpecificFileFromTheDefaultFileAndReturnWhetherYouSucceded(textFileNameWithoutDefault, username))
			{
				return getLevelFromTextFile(textFileNameWithoutDefault, username, level, lesson);
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
	
	
	public static ArrayList<Word> worstWords(String username)
	{
		ArrayList<Word> incorrectWords = new ArrayList<Word>();
		int count10 = 0;
		
		String userSpecificTextFileName = "level_one_lesson_one" + "_" + username + ".txt";
		try
		{
			BufferedReader preferredFileBufferedReader = new BufferedReader(new FileReader(new File("lesson_text_files/" + userSpecificTextFileName)));
			while(preferredFileBufferedReader.ready())
			{
				String currentLine = preferredFileBufferedReader.readLine();
				String[] wordParameters = currentLine.split("-");
				if (Integer.parseInt(wordParameters[2]) > Integer.parseInt(wordParameters[3]))
				{
					incorrectWords.add(new Word(wordParameters[0], wordParameters[1], 1, 1));
					count10++;
				}
				
			}
			preferredFileBufferedReader.close();
			if (count10 >= 10)
			{
				return incorrectWords;
			}
		}
		catch(FileNotFoundException fnfe){ /*the user hasn't taken the test for this yet*/ }
		catch(IOException ioe){System.out.println("Io exception");}
		
		userSpecificTextFileName = "level_one_lesson_two" + "_" + username + ".txt";
		try
		{
			BufferedReader preferredFileBufferedReader = new BufferedReader(new FileReader(new File("lesson_text_files/" + userSpecificTextFileName)));
			while(preferredFileBufferedReader.ready())
			{
				String currentLine = preferredFileBufferedReader.readLine();
				String[] wordParameters = currentLine.split("-");
				if (Integer.parseInt(wordParameters[2]) > Integer.parseInt(wordParameters[3]))
				{
					incorrectWords.add(new Word(wordParameters[0], wordParameters[1], 1, 2));
					count10++;
				}
				
			}
			preferredFileBufferedReader.close();
			if (count10 >= 10)
			{
				return incorrectWords;
			}
		}
		catch(FileNotFoundException fnfe){ /*the user hasn't taken the test for this yet*/ }
		catch(IOException ioe){System.out.println("Io exception");}
		
		userSpecificTextFileName = "level_one_lesson_three" + "_" + username + ".txt";
		try
		{
			BufferedReader preferredFileBufferedReader = new BufferedReader(new FileReader(new File("lesson_text_files/" + userSpecificTextFileName)));
			while(preferredFileBufferedReader.ready())
			{
				String currentLine = preferredFileBufferedReader.readLine();
				String[] wordParameters = currentLine.split("-");
				if (Integer.parseInt(wordParameters[2]) > Integer.parseInt(wordParameters[3]))
				{
					incorrectWords.add(new Word(wordParameters[0], wordParameters[1], 1, 3));
					count10++;
				}
				
			}
			preferredFileBufferedReader.close();
			if (count10 >= 10)
			{
				return incorrectWords;
			}
		}
		catch(FileNotFoundException fnfe){ /*the user hasn't taken the test for this yet*/ }
		catch(IOException ioe){System.out.println("Io exception");}
		
		userSpecificTextFileName = "level_one_lesson_four" + "_" + username + ".txt";
		try
		{
			BufferedReader preferredFileBufferedReader = new BufferedReader(new FileReader(new File("lesson_text_files/" + userSpecificTextFileName)));
			while(preferredFileBufferedReader.ready())
			{
				String currentLine = preferredFileBufferedReader.readLine();
				String[] wordParameters = currentLine.split("-");
				if (Integer.parseInt(wordParameters[2]) > Integer.parseInt(wordParameters[3]))
				{
					incorrectWords.add(new Word(wordParameters[0], wordParameters[1], 1, 4));
					count10++;
				}
				
			}
			preferredFileBufferedReader.close();
			if (count10 >= 10)
			{
				return incorrectWords;
			}
		}
		catch(FileNotFoundException fnfe){ /*the user hasn't taken the test for this yet*/ }
		catch(IOException ioe){System.out.println("Io exception");}
		
		userSpecificTextFileName = "level_one_lesson_five" + "_" + username + ".txt";
		try
		{
			BufferedReader preferredFileBufferedReader = new BufferedReader(new FileReader(new File("lesson_text_files/" + userSpecificTextFileName)));
			while(preferredFileBufferedReader.ready())
			{
				String currentLine = preferredFileBufferedReader.readLine();
				String[] wordParameters = currentLine.split("-");
				if (Integer.parseInt(wordParameters[2]) > Integer.parseInt(wordParameters[3]))
				{
					incorrectWords.add(new Word(wordParameters[0], wordParameters[1], 1, 5));
					count10++;
				}
				
			}
			preferredFileBufferedReader.close();
			if (count10 >= 10)
			{
				return incorrectWords;
			}
		}
		catch(FileNotFoundException fnfe){ /*the user hasn't taken the test for this yet*/ }
		catch(IOException ioe){System.out.println("Io exception");}
		
		userSpecificTextFileName = "level_one_lesson_six" + "_" + username + ".txt";
		try
		{
			BufferedReader preferredFileBufferedReader = new BufferedReader(new FileReader(new File("lesson_text_files/" + userSpecificTextFileName)));
			while(preferredFileBufferedReader.ready())
			{
				String currentLine = preferredFileBufferedReader.readLine();
				String[] wordParameters = currentLine.split("-");
				if (Integer.parseInt(wordParameters[2]) > Integer.parseInt(wordParameters[3]))
				{
					incorrectWords.add(new Word(wordParameters[0], wordParameters[1], 1, 6));
					count10++;
				}
				
			}
			preferredFileBufferedReader.close();
			if (count10 >= 10)
			{
				return incorrectWords;
			}
		}
		catch(FileNotFoundException fnfe){ /*the user hasn't taken the test for this yet*/ }
		catch(IOException ioe){System.out.println("Io exception");}
		
		userSpecificTextFileName = "level_two_lesson_one" + "_" + username + ".txt";
		try
		{
			BufferedReader preferredFileBufferedReader = new BufferedReader(new FileReader(new File("lesson_text_files/" + userSpecificTextFileName)));
			while(preferredFileBufferedReader.ready())
			{
				String currentLine = preferredFileBufferedReader.readLine();
				String[] wordParameters = currentLine.split("-");
				if (Integer.parseInt(wordParameters[2]) > Integer.parseInt(wordParameters[3]))
				{
					incorrectWords.add(new Word(wordParameters[0], wordParameters[1], 2, 1));
					count10++;
				}
				
			}
			preferredFileBufferedReader.close();
			if (count10 >= 10)
			{
				return incorrectWords;
			}
		}
		catch(FileNotFoundException fnfe){ /*the user hasn't taken the test for this yet*/ }
		catch(IOException ioe){System.out.println("Io exception");}
		
		userSpecificTextFileName = "level_two_lesson_two" + "_" + username + ".txt";
		try
		{
			BufferedReader preferredFileBufferedReader = new BufferedReader(new FileReader(new File("lesson_text_files/" + userSpecificTextFileName)));
			while(preferredFileBufferedReader.ready())
			{
				String currentLine = preferredFileBufferedReader.readLine();
				String[] wordParameters = currentLine.split("-");
				if (Integer.parseInt(wordParameters[2]) > Integer.parseInt(wordParameters[3]))
				{
					incorrectWords.add(new Word(wordParameters[0], wordParameters[1], 2, 2));
					count10++;
				}
				
			}
			preferredFileBufferedReader.close();
			if (count10 >= 10)
			{
				return incorrectWords;
			}
		}
		catch(FileNotFoundException fnfe){ /*the user hasn't taken the test for this yet*/ }
		catch(IOException ioe){System.out.println("Io exception");}
		
		userSpecificTextFileName = "level_two_lesson_three" + "_" + username + ".txt";
		try
		{
			BufferedReader preferredFileBufferedReader = new BufferedReader(new FileReader(new File("lesson_text_files/" + userSpecificTextFileName)));
			while(preferredFileBufferedReader.ready())
			{
				String currentLine = preferredFileBufferedReader.readLine();
				String[] wordParameters = currentLine.split("-");
				if (Integer.parseInt(wordParameters[2]) > Integer.parseInt(wordParameters[3]))
				{
					incorrectWords.add(new Word(wordParameters[0], wordParameters[1], 2, 3));
					count10++;
				}
				
			}
			preferredFileBufferedReader.close();
			if (count10 >= 10)
			{
				return incorrectWords;
			}
		}
		catch(FileNotFoundException fnfe){ /*the user hasn't taken the test for this yet*/ }
		catch(IOException ioe){System.out.println("Io exception");}
		
		userSpecificTextFileName = "level_two_lesson_four" + "_" + username + ".txt";
		try
		{
			BufferedReader preferredFileBufferedReader = new BufferedReader(new FileReader(new File("lesson_text_files/" + userSpecificTextFileName)));
			while(preferredFileBufferedReader.ready())
			{
				String currentLine = preferredFileBufferedReader.readLine();
				String[] wordParameters = currentLine.split("-");
				if (Integer.parseInt(wordParameters[2]) > Integer.parseInt(wordParameters[3]))
				{
					incorrectWords.add(new Word(wordParameters[0], wordParameters[1], 2, 4));
					count10++;
				}
				
			}
			preferredFileBufferedReader.close();
			if (count10 >= 10)
			{
				return incorrectWords;
			}
		}
		catch(FileNotFoundException fnfe){ /*the user hasn't taken the test for this yet*/ }
		catch(IOException ioe){System.out.println("Io exception");}
		
		userSpecificTextFileName = "level_two_lesson_five" + "_" + username + ".txt";
		try
		{
			BufferedReader preferredFileBufferedReader = new BufferedReader(new FileReader(new File("lesson_text_files/" + userSpecificTextFileName)));
			while(preferredFileBufferedReader.ready())
			{
				String currentLine = preferredFileBufferedReader.readLine();
				String[] wordParameters = currentLine.split("-");
				if (Integer.parseInt(wordParameters[2]) > Integer.parseInt(wordParameters[3]))
				{
					incorrectWords.add(new Word(wordParameters[0], wordParameters[1], 2, 5));
					count10++;
				}
				
			}
			preferredFileBufferedReader.close();
			if (count10 >= 10)
			{
				return incorrectWords;
			}
		}
		catch(FileNotFoundException fnfe){ /*the user hasn't taken the test for this yet*/ }
		catch(IOException ioe){System.out.println("Io exception");}
		
		userSpecificTextFileName = "level_two_lesson_six" + "_" + username + ".txt";
		try
		{
			BufferedReader preferredFileBufferedReader = new BufferedReader(new FileReader(new File("lesson_text_files/" + userSpecificTextFileName)));
			while(preferredFileBufferedReader.ready())
			{
				String currentLine = preferredFileBufferedReader.readLine();
				String[] wordParameters = currentLine.split("-");
				if (Integer.parseInt(wordParameters[2]) > Integer.parseInt(wordParameters[3]))
				{
					incorrectWords.add(new Word(wordParameters[0], wordParameters[1], 2, 6));
					count10++;
				}
				
			}
			preferredFileBufferedReader.close();
			if (count10 >= 10)
			{
				return incorrectWords;
			}
		}
		catch(FileNotFoundException fnfe){ /*the user hasn't taken the test for this yet*/ }
		catch(IOException ioe){System.out.println("Io exception");}
		
		userSpecificTextFileName = "level_three_lesson_one" + "_" + username + ".txt";
		try
		{
			BufferedReader preferredFileBufferedReader = new BufferedReader(new FileReader(new File("lesson_text_files/" + userSpecificTextFileName)));
			while(preferredFileBufferedReader.ready())
			{
				String currentLine = preferredFileBufferedReader.readLine();
				String[] wordParameters = currentLine.split("-");
				if (Integer.parseInt(wordParameters[2]) > Integer.parseInt(wordParameters[3]))
				{
					incorrectWords.add(new Word(wordParameters[0], wordParameters[1], 3, 1));
					count10++;
				}
				
			}
			preferredFileBufferedReader.close();
			if (count10 >= 10)
			{
				return incorrectWords;
			}
		}
		catch(FileNotFoundException fnfe){ /*the user hasn't taken the test for this yet*/ }
		catch(IOException ioe){System.out.println("Io exception");}
		
		userSpecificTextFileName = "level_three_lesson_two" + "_" + username + ".txt";
		try
		{
			BufferedReader preferredFileBufferedReader = new BufferedReader(new FileReader(new File("lesson_text_files/" + userSpecificTextFileName)));
			while(preferredFileBufferedReader.ready())
			{
				String currentLine = preferredFileBufferedReader.readLine();
				String[] wordParameters = currentLine.split("-");
				if (Integer.parseInt(wordParameters[2]) > Integer.parseInt(wordParameters[3]))
				{
					incorrectWords.add(new Word(wordParameters[0], wordParameters[1], 3, 2));
					count10++;
				}
				
			}
			preferredFileBufferedReader.close();
			if (count10 >= 10)
			{
				return incorrectWords;
			}
		}
		catch(FileNotFoundException fnfe){ /*the user hasn't taken the test for this yet*/ }
		catch(IOException ioe){System.out.println("Io exception");}
		
		userSpecificTextFileName = "level_three_lesson_three" + "_" + username + ".txt";
		try
		{
			BufferedReader preferredFileBufferedReader = new BufferedReader(new FileReader(new File("lesson_text_files/" + userSpecificTextFileName)));
			while(preferredFileBufferedReader.ready())
			{
				String currentLine = preferredFileBufferedReader.readLine();
				String[] wordParameters = currentLine.split("-");
				if (Integer.parseInt(wordParameters[2]) > Integer.parseInt(wordParameters[3]))
				{
					incorrectWords.add(new Word(wordParameters[0], wordParameters[1], 3, 3));
					count10++;
				}
				
			}
			preferredFileBufferedReader.close();
			if (count10 >= 10)
			{
				return incorrectWords;
			}
		}
		catch(FileNotFoundException fnfe){ /*the user hasn't taken the test for this yet*/ }
		catch(IOException ioe){System.out.println("Io exception");}
		
		userSpecificTextFileName = "level_three_lesson_four" + "_" + username + ".txt";
		try
		{
			BufferedReader preferredFileBufferedReader = new BufferedReader(new FileReader(new File("lesson_text_files/" + userSpecificTextFileName)));
			while(preferredFileBufferedReader.ready())
			{
				String currentLine = preferredFileBufferedReader.readLine();
				String[] wordParameters = currentLine.split("-");
				if (Integer.parseInt(wordParameters[2]) > Integer.parseInt(wordParameters[3]))
				{
					incorrectWords.add(new Word(wordParameters[0], wordParameters[1], 3, 4));
					count10++;
				}
				
			}
			preferredFileBufferedReader.close();
			if (count10 >= 10)
			{
				return incorrectWords;
			}
		}
		catch(FileNotFoundException fnfe){ /*the user hasn't taken the test for this yet*/ }
		catch(IOException ioe){System.out.println("Io exception");}
		
		userSpecificTextFileName = "level_three_lesson_five" + "_" + username + ".txt";
		try
		{
			BufferedReader preferredFileBufferedReader = new BufferedReader(new FileReader(new File("lesson_text_files/" + userSpecificTextFileName)));
			while(preferredFileBufferedReader.ready())
			{
				String currentLine = preferredFileBufferedReader.readLine();
				String[] wordParameters = currentLine.split("-");
				if (Integer.parseInt(wordParameters[2]) > Integer.parseInt(wordParameters[3]))
				{
					incorrectWords.add(new Word(wordParameters[0], wordParameters[1], 3, 5));
					count10++;
				}
				
			}
			preferredFileBufferedReader.close();
			if (count10 >= 10)
			{
				return incorrectWords;
			}
		}
		catch(FileNotFoundException fnfe){ /*the user hasn't taken the test for this yet*/ }
		catch(IOException ioe){System.out.println("Io exception");}
		
		userSpecificTextFileName = "level_three_lesson_six" + "_" + username + ".txt";
		try
		{
			BufferedReader preferredFileBufferedReader = new BufferedReader(new FileReader(new File("lesson_text_files/" + userSpecificTextFileName)));
			while(preferredFileBufferedReader.ready())
			{
				String currentLine = preferredFileBufferedReader.readLine();
				String[] wordParameters = currentLine.split("-");
				if (Integer.parseInt(wordParameters[2]) > Integer.parseInt(wordParameters[3]))
				{
					incorrectWords.add(new Word(wordParameters[0], wordParameters[1], 3, 6));
					count10++;
				}
				
			}
			preferredFileBufferedReader.close();
			if (count10 >= 10)
			{
				return incorrectWords;
			}
		}
		catch(FileNotFoundException fnfe){ /*the user hasn't taken the test for this yet*/ }
		catch(IOException ioe){System.out.println("Io exception");}
		
		userSpecificTextFileName = "level_four_lesson_one" + "_" + username + ".txt";
		try
		{
			BufferedReader preferredFileBufferedReader = new BufferedReader(new FileReader(new File("lesson_text_files/" + userSpecificTextFileName)));
			while(preferredFileBufferedReader.ready())
			{
				String currentLine = preferredFileBufferedReader.readLine();
				String[] wordParameters = currentLine.split("-");
				if (Integer.parseInt(wordParameters[2]) > Integer.parseInt(wordParameters[3]))
				{
					incorrectWords.add(new Word(wordParameters[0], wordParameters[1], 4, 1));
					count10++;
				}
				
			}
			preferredFileBufferedReader.close();
			if (count10 >= 10)
			{
				return incorrectWords;
			}
		}
		catch(FileNotFoundException fnfe){ /*the user hasn't taken the test for this yet*/ }
		catch(IOException ioe){System.out.println("Io exception");}
		
		userSpecificTextFileName = "level_four_lesson_two" + "_" + username + ".txt";
		try
		{
			BufferedReader preferredFileBufferedReader = new BufferedReader(new FileReader(new File("lesson_text_files/" + userSpecificTextFileName)));
			while(preferredFileBufferedReader.ready())
			{
				String currentLine = preferredFileBufferedReader.readLine();
				String[] wordParameters = currentLine.split("-");
				if (Integer.parseInt(wordParameters[2]) > Integer.parseInt(wordParameters[3]))
				{
					incorrectWords.add(new Word(wordParameters[0], wordParameters[1], 4, 2));
					count10++;
				}
				
			}
			preferredFileBufferedReader.close();
			if (count10 >= 10)
			{
				return incorrectWords;
			}
		}
		catch(FileNotFoundException fnfe){ /*the user hasn't taken the test for this yet*/ }
		catch(IOException ioe){System.out.println("Io exception");}
		
		userSpecificTextFileName = "level_four_lesson_three" + "_" + username + ".txt";
		try
		{
			BufferedReader preferredFileBufferedReader = new BufferedReader(new FileReader(new File("lesson_text_files/" + userSpecificTextFileName)));
			while(preferredFileBufferedReader.ready())
			{
				String currentLine = preferredFileBufferedReader.readLine();
				String[] wordParameters = currentLine.split("-");
				if (Integer.parseInt(wordParameters[2]) > Integer.parseInt(wordParameters[3]))
				{
					incorrectWords.add(new Word(wordParameters[0], wordParameters[1], 4, 3));
					count10++;
				}
				
			}
			preferredFileBufferedReader.close();
			if (count10 >= 10)
			{
				return incorrectWords;
			}
		}
		catch(FileNotFoundException fnfe){ /*the user hasn't taken the test for this yet*/ }
		catch(IOException ioe){System.out.println("Io exception");}
		
		userSpecificTextFileName = "level_four_lesson_four" + "_" + username + ".txt";
		try
		{
			BufferedReader preferredFileBufferedReader = new BufferedReader(new FileReader(new File("lesson_text_files/" + userSpecificTextFileName)));
			while(preferredFileBufferedReader.ready())
			{
				String currentLine = preferredFileBufferedReader.readLine();
				String[] wordParameters = currentLine.split("-");
				if (Integer.parseInt(wordParameters[2]) > Integer.parseInt(wordParameters[3]))
				{
					incorrectWords.add(new Word(wordParameters[0], wordParameters[1], 4, 4));
					count10++;
				}
				
			}
			preferredFileBufferedReader.close();
			if (count10 >= 10)
			{
				return incorrectWords;
			}
		}
		catch(FileNotFoundException fnfe){ /*the user hasn't taken the test for this yet*/ }
		catch(IOException ioe){System.out.println("Io exception");}
		
		userSpecificTextFileName = "level_four_lesson_five" + "_" + username + ".txt";
		try
		{
			BufferedReader preferredFileBufferedReader = new BufferedReader(new FileReader(new File("lesson_text_files/" + userSpecificTextFileName)));
			while(preferredFileBufferedReader.ready())
			{
				String currentLine = preferredFileBufferedReader.readLine();
				String[] wordParameters = currentLine.split("-");
				if (Integer.parseInt(wordParameters[2]) > Integer.parseInt(wordParameters[3]))
				{
					incorrectWords.add(new Word(wordParameters[0], wordParameters[1], 4, 5));
					count10++;
				}
				
			}
			preferredFileBufferedReader.close();
			if (count10 >= 10)
			{
				return incorrectWords;
			}
		}
		catch(FileNotFoundException fnfe){ /*the user hasn't taken the test for this yet*/ }
		catch(IOException ioe){System.out.println("Io exception");}
		
		userSpecificTextFileName = "level_four_lesson_six" + "_" + username + ".txt";
		try
		{
			BufferedReader preferredFileBufferedReader = new BufferedReader(new FileReader(new File("lesson_text_files/" + userSpecificTextFileName)));
			while(preferredFileBufferedReader.ready())
			{
				String currentLine = preferredFileBufferedReader.readLine();
				String[] wordParameters = currentLine.split("-");
				if (Integer.parseInt(wordParameters[2]) > Integer.parseInt(wordParameters[3]))
				{
					incorrectWords.add(new Word(wordParameters[0], wordParameters[1], 4, 6));
					count10++;
				}
				
			}
			preferredFileBufferedReader.close();
			if (count10 >= 10)
			{
				return incorrectWords;
			}
		}
		catch(FileNotFoundException fnfe){ /*the user hasn't taken the test for this yet*/ }
		catch(IOException ioe){System.out.println("Io exception");}
		
		return incorrectWords;
		
	}
	
	public static void updateCorrectAndIncorrect(int level, int lesson, String turkishWord, String username, boolean correct)
	{
		String levelWord = EnglishNumberToWords.convertLessThanOneThousand(level);
		String lessonWord = EnglishNumberToWords.convertLessThanOneThousand(lesson);
		String fileName = "level_" + levelWord + "_lesson_" + lessonWord + "_" + username + ".txt";
		try
		{
	        BufferedReader file = new BufferedReader(new FileReader("lesson_text_files/" + fileName));
	        StringBuffer inputBuffer = new StringBuffer();
	        String currentLine;

	        while ((currentLine = file.readLine()) != null)
	        {
	        	String[] lineParts = currentLine.split("-");
				if(lineParts[1].equals(turkishWord))
				{
					currentLine = lineParts[0] + ", " + lineParts[1] + ", ";
					if (correct == false)
					{
						int incorrectNum = Integer.parseInt(lineParts[2]);
						incorrectNum++;
						currentLine = currentLine + Integer.toString(incorrectNum) + ", " + lineParts[3];
					}
					else
					{
						int correctNum = Integer.parseInt(lineParts[3]);
						correctNum++;
						currentLine = currentLine + lineParts[2] + ", " + Integer.toString(correctNum);
					}
					
					inputBuffer.append(currentLine);
					inputBuffer.append('\n');
					
					file.close();

			        FileOutputStream fileOut = new FileOutputStream("lesson_text_files/" + fileName);
			        fileOut.write(inputBuffer.toString().getBytes());
			        fileOut.close();
			        break;
				}
	        }
		}
	    catch (Exception e)
		{
	        System.out.println("Problem reading file.");
	    }
	}
	
}