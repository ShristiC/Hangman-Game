import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.*;


public class hangmanTryTwo
{

    public static void main (String [] args) throws IOException
    {
    	Scanner words = new Scanner (new File ("words.dat"));
    	Scanner hints = new Scanner (new File ("hints.dat"));
    	ArrayList<String> array = new ArrayList<String>();
    	boolean stillPlaying = true;

    	System.out.println("Hangman __ __ __ __ __ __ __ ");
    	System.out.println();

    	String name = MyLibrary.getWord("Enter your name:: ");
    	while(stillPlaying)
    	{
    		String phrase=words.nextLine().toUpperCase();
    		Scanner chopper = new Scanner (phrase);
			String split="";
			String wordComparison="";

    		System.out.println("Hints: "+hints.nextLine()+"...");
    		System.out.println();
    		scaffold(1);
    		System.out.println();
    		alphabet("");

			while (chopper.hasNext())
			{
				String one =chopper.next();
				for(int a=0;a<one.length();a++)
					split+="___ ";
				System.out.print (split +"   ");
				System.out.println();
				System.out.println();
			}
			for(int b=0;b<phrase.length();b++)
				array.add(phrase.substring(b,b+1));

			int list=array.size();
			for(int c=0;c<list;c++)
			{
				String letter = MyLibrary.getWord("Enter a letter: ");
				alphabet(letter);
				System.out.println();
				for(int d=0;d<array.size();d++)
				{
					if(letter.compareTo(array.get(d))==32)
					{
						array.set(d,letter);
						list++;
					}
					else
						list--;

				}
				for(int e=0;e<phrase.length();e++)
				{
					if(array.get(e).compareTo(phrase.substring(e,e+1))==32)
						System.out.print(phrase.substring(e,e+1)+" ");
					else if(array.get(e).equals(" "))
						System.out.print("  ");
					else
						System.out.print("___ ");

				}
				System.out.println();
			}
				if(counter==1)
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
				if(counter==2)
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
				if(counter==3)
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
				if(counter==4)
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
				if(counter==5)
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
				if(counter==6)
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
				if(counter==7)
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
			System.out.println();
			System.out.println();

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

	public static void alphabet (String a) throws IOException
	{
		ArrayList<String> bank=new ArrayList<String>();
		Scanner letters = new Scanner (new File ("letters.dat"));
		for(int b=0;b<26;b++)
			bank.add(letters.nextLine());
		for(int c=0;c<bank.size();c++)
		{
			if(a.equalsIgnoreCase(bank.get(c)))
				bank.set(c,"   ");
			System.out.print(bank.get(c)+"   ");
		}
		System.out.println();
	}



}