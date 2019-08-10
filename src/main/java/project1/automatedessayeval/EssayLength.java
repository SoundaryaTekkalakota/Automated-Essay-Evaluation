package project1.automatedessayeval;
import java.io.*;
import java.util.*;
public class EssayLength
{
	//public static void main(String args[])throws Exception
	public EssayLength()throws Exception
	{
		FileReader fr=new FileReader("src/main/java/project1/automatedessayeval/tokensfile.txt");
		BufferedReader br=new BufferedReader(fr);

		File k1=new File("src/main/java/project1/automatedessayeval/Results.txt");
		FileWriter fw=new FileWriter(k1,false);
		BufferedWriter f1=new BufferedWriter(fw);

		String s;
		int length = 0;
		try {
			while((s=br.readLine())!=null)
			{
				length++;
		    }
		    System.out.println("EssayLength="+length+"words");
		    f1.write(Integer.toString(length));
			f1.newLine();
		    f1.write("Essay length="+Integer.toString(length));
			f1.newLine();
			f1.close();
		}

		catch (Exception e) {
		    e.printStackTrace();
		}

	}
	public static void main(String args[])throws Exception
	{

		new EssayLength();

	}
}
