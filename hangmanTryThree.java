import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.*;


public class hangmanTryThree
{
	public static void main (String [] args)throws IOException
	{
		boolean stillPlaying=true;
		while(stillPlaying)
		{
			Scanner words = new Scanner(new File("words.dat"));
			Scanner hints = new Scanner(new File("hints.dat"));
			ArrayList<String> array = new ArrayList<String>();

			System.out.println("Hangman __ __ __ __ __ ___ "); //creates the header
			System.out.println();
			String name = MyLibrary.getLine("Enter your name:: ");
			System.out.println();
			boolean round=true;

			while(round)
			{
				int a = (int)(Math.random()*40)+1;//creates a random number for the next word to be played
				for(int b=0;b<a;b++)
				{
					words.nextLine();
					hints.nextLine();
				}
				System.out.println("Hint:"+hints.nextLine()+"...");
				String word= words.nextLine().toUpperCase();

				scaffold(1);
				System.out.println();

				for(int c=0;c<word.length();c++) //creates the array list of the word/phrase
					array.add(word.substring(c,c+1));

				Scanner chopper = new Scanner(word); //creates the initial dashes
				String split="";
				while(chopper.hasNext())
				{
					String one =chopper.next();
					for(int d=0;d<one.length();d++)
						split+="___ ";
					System.out.print (split +"   ");
					split="";
				}
				System.out.println();

				for(int e=1;e<=array.size();e++)//creates the input-comparison loop
				{
					String letter = MyLibrary.getWord("Enter a letter: ");
					for(int h=0;h<array.size();h++)
					{
						if(letter.compareTo(array.get(h))==32)
						{
							e--;
							System.out.print(letter.toUpperCase()+" ");
							array.set(h,letter);
						}
						else if(array.get(h).equals(" "))
							System.out.print("  ");
						else
						{
							e++;
							System.out.print("___ ");
						}
					}
					System.out.println();

				}
			}
		}
	}

		public static void scaffold (int a)
	{
		if(a==1)
		{
			System.out.println();
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
			System.out.println();
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
			System.out.println();
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
			System.out.println();
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
			System.out.println();
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
			System.out.println();
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
			System.out.println();
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