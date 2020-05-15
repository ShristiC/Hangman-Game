import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.*;


public class hangmanGame
{
	public static void main (String [] args) throws IOException
	{
		Scanner words = new Scanner (new File("words.dat"));
		Scanner hints = new Scanner (new File("hints.dat"));
		ArrayList<String> array = new ArrayList<String>();
		boolean stillPlaying = true;
		String wordComparison ="";
		int c=1;

		System.out.println("Hangman _ _ _ _ _ _ _ ");
		String name = MyLibrary.getLine("Enter your name::");
		System.out.println();

		while(stillPlaying)
		{
			System.out.println("Hint: "+hints.nextLine()+"...");
			String word = words.nextLine().toUpperCase();

			for(int a=0;a<word.length();a++)
				array.add(word.substring(a,a+1));

			String [] dashes = new String [word.length()];
			for (int b=0;b<dashes.length;b++)
			{
				dashes[b]="__ ";
				System.out.print( dashes[b] );
			}
			System.out.println();
			System.out.println();
			scaffold(1);

			while (c<=7&&c>0)
			{
				String letter = MyLibrary.getWord("Enter a letter: ");
				for (int d=0;d<array.size();d++)
				{
					if(letter.compareTo(array.get(d))==32)
						dashes[d]=letter.toUpperCase();
				}
				for (int e=0;e<dashes.length;e++)
				{
					if (dashes[e].equals(array.get(e)))
						c=c-1;
					else
					{
						scaffold(c+1);
						if(c+1==7)
						{
							System.out.println("You Lost!");
							System.out.println("The phrase was \" "+word.toLowerCase()+" \" ");
						}
					}

				}
				System.out.println(dashes);
				for(int f=0;f<dashes.length;f++)
					wordComparison+=dashes[f];
				if(wordComparison.equalsIgnoreCase(word))
				{
					c=8;
					System.out.println("You win!");
				}
			}
			String answer = MyLibrary.getWord("Do you want to play again?");
			if(answer.equalsIgnoreCase("no"));
				stillPlaying = false;
		}
	}
	public static void scaffold (int a)
	{
		if(a==1)
		{
			System.out.println("    ____");
			System.out.println("   |    |");
			System.out.println("   |     ");
			System.out.println("   |     ");
			System.out.println("   |     ");
			System.out.println("   |     ");
			System.out.println("   |     ");
			System.out.println("   |     ");
			System.out.println("__________");
		}
		if(a==2)
		{
			System.out.println("    ____");
			System.out.println("   |    |");
			System.out.println("   |   / \\  ");
			System.out.println("   |   \\_/  ");
			System.out.println("   |     ");
			System.out.println("   |     ");
			System.out.println("   |     ");
			System.out.println("   |     ");
			System.out.println("__________");
		}
		if(a==3)
		{
			System.out.println("    ____");
			System.out.println("   |    |");
			System.out.println("   |   / \\  ");
			System.out.println("   |   \\_/  ");
			System.out.println("   |    |");
			System.out.println("   |    |");
			System.out.println("   |    |");
			System.out.println("   |     ");
			System.out.println("__________");
		}
		if(a==4)
		{
			System.out.println("    ____");
			System.out.println("   |    |");
			System.out.println("   |   / \\  ");
			System.out.println("   |   \\_/  ");
			System.out.println("   |    |");
			System.out.println("   |    |");
			System.out.println("   |    |");
			System.out.println("   |   /  ");
			System.out.println("__________");
		}
		if(a==5)
		{
			System.out.println("    ____");
			System.out.println("   |    |");
			System.out.println("   |   / \\  ");
			System.out.println("   |   \\_/   ");
			System.out.println("   |    |");
			System.out.println("   |    |");
			System.out.println("   |    |");
			System.out.println("   |   / \\  ");
			System.out.println("__________");
		}
		if(a==6)
		{
			System.out.println("    ____");
			System.out.println("   |    |");
			System.out.println("   |   / \\  ");
			System.out.println("   |   \\_/  ");
			System.out.println("   |    |");
			System.out.println("   |  --|");
			System.out.println("   |    |");
			System.out.println("   |   / \\  ");
			System.out.println("__________");
		}
		if(a==7)
		{
			System.out.println("    ____");
			System.out.println("   |    |");
			System.out.println("   |   / \\  ");
			System.out.println("   |   \\_/   ");
			System.out.println("   |    |");
			System.out.println("   |  --|--");
			System.out.println("   |    |");
			System.out.println("   |   / \\  ");
			System.out.println("__________");
		}
	}
}
