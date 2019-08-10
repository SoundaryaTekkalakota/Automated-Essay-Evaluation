package project1.automatedessayeval;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.*;
import java.util.*;
import edu.stanford.nlp.ling.HasWord;
import edu.stanford.nlp.ling.TaggedWord;
import edu.stanford.nlp.tagger.maxent.MaxentTagger;
public class Capitalization {


	File k1=new File("src/main/java/project1/automatedessayeval/Results.txt");
	FileWriter fw=new FileWriter(k1,true);
	BufferedWriter f1=new BufferedWriter(fw);


	public static ArrayList<String> wordsList = new ArrayList<String>();
	static MaxentTagger tagger = new MaxentTagger("taggers/english-left3words-distsim.tagger");
	//public static void main(String[] args) throws Exception
	public Capitalization()throws Exception
	{
		int countinitletter=0,countpropernouns=0;
		FileReader fr=new FileReader("src/main/java/project1/automatedessayeval/input.txt");
		BufferedReader br=new BufferedReader(fr);
		String s1;
		char x;
		int s=-1,j=-1;
		String noun;
		while((s=fr.read())>-1)
		{
			char c=(char)s;
			if(c=='.')
			 {
				j=fr.read();
				char c1=(char)j;
				if(c1>='a' && c1<='z')
				{
					countinitletter++;
				}
			 }
		}

System.out.println("wrong capitalized sentences="+countinitletter);
f1.write(Integer.toString(countinitletter));
f1.newLine();
f1.write("wrong capitalized sentences="+Integer.toString(countinitletter));
f1.newLine();
f1.close();
	}
	public static void main(String[] args) throws Exception
	{
		new Capitalization();
	}
}
