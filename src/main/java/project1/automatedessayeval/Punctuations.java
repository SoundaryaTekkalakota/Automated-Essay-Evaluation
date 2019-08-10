package project1.automatedessayeval;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.*;
import java.util.*;
public class Punctuations {


	File k1=new File("src/main/java/project1/automatedessayeval/Results.txt");
	FileWriter fw=new FileWriter(k1,true);
	BufferedWriter f1=new BufferedWriter(fw);

	public static String[] stopWordsofwordnet = {".",",","?","!",":",";","(",")","{","}","-","_","/","@","*","&","#"};

	public static ArrayList<String> wordsList = new ArrayList<String>();
	//public static void main(String[] args) throws Exception
	public Punctuations()throws Exception
	{

		int punctuations,count=0;
		//File r = new File("src/main/java/project1/automatedessayeval/stopwordstokens.txt");
		FileReader fr=new FileReader("src/main/java/project1/automatedessayeval/studentanswer.txt");
		//BufferedReader br=new BufferedReader(fr);
		//FileWriter fw=new FileWriter(r);
		//PrintWriter pw=new PrintWriter(fw);
		int s=-1;
		while((s=fr.read())>-1)
		{
			char c=(char)s;
			String c1=c+"";
			wordsList.add(c1);
		}
	for (int i = 0; i < wordsList.size(); i++)
	{
		//System.out.println("hello");
		for (int j = 0; j < stopWordsofwordnet.length; j++)
		{
			if((stopWordsofwordnet[j].contains(wordsList.get(i))))
			{
				count++;
				//wordsList.remove(i);
			}
		}
	}
	/*System.out.print("the input is "+s);
	System.out.println("the output is");*/
	for (int i = 0; i < wordsList.size(); i++) {
	//System.out.println(wordsList.get(i));

	//pw.write(wordsList.get(i));
	//pw.write("\n");
	}
	System.out.println("punctuations="+count);
	f1.write("Number of punctuations="+Integer.toString(count));
	f1.newLine();
	f1.close();
	//pw.close();
	}

	//}
	public static void main(String[] args) throws Exception
	{
		new Punctuations();
	}
}
