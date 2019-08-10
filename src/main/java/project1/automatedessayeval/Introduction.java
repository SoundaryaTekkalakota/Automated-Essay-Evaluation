package project1.automatedessayeval;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Introduction {
public Introduction()throws Exception
{

	File k1=new File("src/main/java/project1/automatedessayeval/Results.txt");
	FileWriter fw=new FileWriter(k1,true);
	BufferedWriter f1=new BufferedWriter(fw);

	ArrayList<String> wordsList = new ArrayList<String>();
	ArrayList<String> wordsList1 = new ArrayList<String>();
	FileReader fr=new FileReader("src/main/java/project1/automatedessayeval/stopwordstokens.txt");//stopwordstokens.txt 2.txt
	BufferedReader br=new BufferedReader(fr);
	FileReader fr1=new FileReader("src/main/java/project1/automatedessayeval/Synonymswithoutduplicates.txt");//Synonymswithoutduplicates.txt 1.txt
	BufferedReader br1=new BufferedReader(fr1);
	String s,s1;
	int fullstops=0;
	int flag=0;///
	while(((s=br.readLine())!=null) && fullstops!=3)
	{
		//System.out.println("word ="+s);
		wordsList.add(s);

			if(s.contains("."))
			{
				fullstops++;
			}
	}

	while((s1=br1.readLine())!=null)
	{
		//System.out.println("the string 1 is "+s1);
		for(int i=0;i<wordsList.size();i++)
		{
			//System.out.println("the string in for loop is"+wordsList.get(i));
			if(s1.equals(wordsList.get(i)))
			{
				wordsList1.add(s1);
				break;
			}
		}
	}

	/*System.out.println("the list is");//the list of words after a Introduction word is found
	for (int i = 0; i < wordsList.size(); i++) {
		System.out.println(wordsList.get(i));
	}*/
	//System.out.println("the second list is");//wordslist1 matching with the keywords
	/*for (int i = 0; i < wordsList1.size(); i++) {
		System.out.println(wordsList1.get(i));
	}*/
	System.out.println("the number of kwywords in the Introduction is"+wordsList1.size());
	if(wordsList1.size()>=5)
	{
		System.out.println("Introduction is given by the student");
		flag=1;
		f1.write(Integer.toString(flag));
		f1.newLine();
		//f1.write(Integer.toString(flag));
		f1.write("Introduction is given by the student");
		f1.newLine();
		f1.close();
	}
	else
	{
		System.out.println("Introduction is not given by the student");
				flag=0;

				f1.write(Integer.toString(flag));
				f1.newLine();
				f1.write("Introduction is not given by the student");
				f1.newLine();
				f1.close();
	}
}

public static void main(String args[])throws Exception
{
	new Introduction();
}
}
