import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.*;

public class hgFour
{
	public static void main (String [] args) throws IOException
	{
		Scanner words = new Scanner (new File("words.dat")); //establishing the key files
		Scanner hints = new Scanner (new File("hints.dat"));
		Scanner letters = new Scanner(new File("letters.dat"));
		ArrayList<String> model = new ArrayList<String>();
		ArrayList<String> comparison = new ArrayList<String>();
		ArrayList<String> alphabet = new ArrayList<String>();
		boolean stillPlaying= true;

		while(stillPlaying)
		{
			System.out.println("Hangman: __ __ __ __ __ __\n");//header
			String name= MyLibrary.getWord("name:");
			System.out.println();
			boolean round = true;

			while(round)
			{
				int random= (int)(Math.random()*40)+1; //random generation of words
				for(int k=0;k<random;k++)
				{
					words.nextLine();
					hints.nextLine();
				}
				while(words.hasNextLine())
				{
					String phrase = words.nextLine().toUpperCase();
					System.out.println("Hint: "+hints.nextLine()+" ");

					for(int b=0;b<phrase.length();b++) //creates model array and prints initial spaces
					{
						if(phrase.substring(b,b+1).equals(" "))
						{
							comparison.add("  ");
							System.out.print("  ");
						}

						else
						{
							comparison.add("___ ");
							System.out.print("___ ");
						}
					}
					System.out.println();

					System.out.println("    ____"); //first scaffold
					System.out.println("   |    |");
					System.out.println("   |     ");
					System.out.println("   |     ");
					System.out.println("   |     ");
					System.out.println("   |     ");
					System.out.println("   |     ");
					System.out.println("   |     ");
					System.out.println("__________");
					System.out.println();

					for(int d=0;d<26;d++) //letter block part 1

						alphabet.add(letters.nextLine().toUpperCase());
					for(int e=0;e<alphabet.size();e++)
						System.out.print(alphabet.get(e)+" ");
					System.out.println();

					String bank="";
					int counter=1;
					for( int c=0; c<phrase.length();c++)
					{
						while(counter<8 && comparison.indexOf("___ ")!= -1)
						{
							String letter= MyLibrary.getWord("Enter a letter: "); //letter block part 2
							System.out.println();
							bank+=letter;
							for(int f=0;f<bank.length()-1;f++)
							{
								if(bank.substring(f,f+1).equals(letter))
									System.out.println("Letter has already been used, try again");
							}
							for(int g=0;g<alphabet.size();g++)
							{
								if(letter.equalsIgnoreCase(alphabet.get(g)))
									alphabet.set(g," ");
								System.out.print(alphabet.get(g)+" ");
							}
							System.out.println();

							 //dashes
							for(int h=0;h<phrase.length();h++)
							{
								if(phrase.substring(h,h+1).equalsIgnoreCase(letter))
									comparison.set(h,letter.toUpperCase());

								else if(comparison.get(h)!="___ ")
									comparison.set(h,phrase.substring(h,h+1));
								else
									comparison.set(h,"___ ");
							}
							for(int i=0;i<phrase.length();i++)
								System.out.print(comparison.get(i)+"  ");
							System.out.println();

							//
							String answer="";
							String three="";
							for(int j=0;j<comparison.size();j++)
							three+=comparison.get(j);
							//scaffold, but need to figure out how to make replace include blank spaces from phrase
							if(phrase.indexOf(letter.toUpperCase())!=-1)
								scaffold(counter);
							else
							{
								counter++;
								scaffold(counter);
								if(counter==7)
								{
									System.out.println("You lost! \n The phrase was \""+phrase.toLowerCase()+"\"");
								}

							}
							if(three.equalsIgnoreCase(phrase))
							{
								System.out.println("You win!");
								System.out.println("The phrase was \""+phrase.toLowerCase()+"\"");
							}

						}
					}

				}

			}

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