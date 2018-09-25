import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
public class CoinTossSimulator 
{
	
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		String output ="";
		int val1,val2,val3,val4,numEntries,numOfOnes;
		Random rand = new Random();
		System.out.println("Welcome to the Coin Toss Simulator");
		System.out.println("Enter the number of data entries");
		numEntries = kb.nextInt();
		//System.out.println("Printing out "+ numEntries +" data points");
		numOfOnes =0;
		
		//1 == heads, 0 == tails. if sum >= 2 then x = 1
		for(int i=0;i<numEntries;i++)
		{
			int x = 0;
			val1 = rand.nextInt(2);
			if(val1 == 1)
				output += "H";
			else
				output += "T";
			val2 = rand.nextInt(2);
			if(val2 == 1)
				output += "H";
			else
				output += "T";
			val3 = rand.nextInt(2);
			if(val3 == 1)
				output += "H";
			else
				output += "T";
			val4 = rand.nextInt(2);
			if(val4 == 1)
				output += "H";
			else
				output += "T";
			int sum = val1+val2+val3+val4;
			if(sum>=2)
			{
				x = 1;
				numOfOnes++;
			}
			else
				x = 0;
			output += "\t"+x+"\n";
		} //end of for loop
		System.out.println(numEntries);
		System.out.println(numOfOnes);
		double temp = (double) numOfOnes/numEntries;
		temp = temp*100;
		System.out.println("The calculated probability of x being equal to one was: " + temp+"%");
		//recordToFile(output,"Coin_Toss_Results.txt",true);
	}
	public static void recordToFile(String text, String fileName, boolean append)
	{
		try
		{
			PrintWriter f = new PrintWriter(new FileOutputStream(fileName),append); //Creates new file
			f.println(text); 
			f.close(); //You must always close a file at the end.
		}
		catch(IOException e) //exceptions
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
