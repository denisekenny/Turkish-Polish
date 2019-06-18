import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestingFun
{
	public static void main(String args[])
	{
		Question q = new NumberQuestion("sifir", "zero");
		System.out.println(q.checkAnswer("0"));
	}
}
