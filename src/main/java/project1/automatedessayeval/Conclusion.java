package project1.automatedessayeval;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Conclusion {
public Conclusion()throws Exception
{

	File k1=new File("src/main/java/project1/automatedessayeval/Results.txt");
	FileWriter fw=new FileWriter(k1,true);
	BufferedWriter f1=new BufferedWriter(fw);

	ArrayList<String> wordsList = new ArrayList<String>();
	ArrayList<String> wordsList1 = new ArrayList<String>();
	String[] Twords = {"THEREFORE","WHEREFORE","CONCLUDE","ENTAILS","HENCE","THUS","CONSEQUENTLY","INFER","WHENCE","SO"};
	FileReader fr=new FileReader("src/main/java/project1/automatedessayeval/stopwordstokens.txt");//stopwordstokens.txt 2.txt
	BufferedReader br=new BufferedReader(fr);
	FileReader fr1=new FileReader("src/main/java/project1/automatedessayeval/Synonymswithoutduplicates.txt");//Synonymswithoutduplicates.txt
	BufferedReader br1=new BufferedReader(fr1);
	String s,s1;
	int flag=0;///
	while((s=br.readLine())!=null)
	{
		//System.out.println("word ="+s);

		for(int i=0;i<Twords.length;i++)
		{
			if((Twords[i]).equals(s))
			{
				flag=1;
				System.out.println("flag is one"+s+"index as "+Twords[i]);
				break;
			}
		}

		if(flag==1)
		{
			wordsList.add(s);

		}
	}

	//wordsList.remove(0);

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

	/*System.out.println("the list is");//the list of words after a conclusion word is found
	for (int i = 0; i < wordsList.size(); i++) {
		System.out.println(wordsList.get(i));
	}
	System.out.println("the second list is");//wordslist1 matching with the keywords
	for (int i = 0; i < wordsList1.size(); i++) {
		System.out.println(wordsList1.get(i));
	}*/
	System.out.println("the number of kwywords in the conclusion is"+wordsList1.size());
	if(wordsList1.size()==0)
	{
		System.out.println("Conclusion is not given by the student");
		flag=0;
		f1.write(Integer.toString(flag));
		f1.newLine();
		//f1.write(Integer.toString(flag));
		f1.write("Conclusion is not given by the student");
		f1.newLine();
		f1.close();
	}
		else
		{
			flag=1;

		System.out.println("Conclusion is given by the student");
		f1.write(Integer.toString(flag));
		f1.newLine();
		f1.write("Conclusion is given by the student");
		f1.newLine();
		f1.close();
		}
}

public static void main(String args[])throws Exception
{

	new Conclusion();

}
}
