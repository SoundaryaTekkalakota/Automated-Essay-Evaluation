package project1.automatedessayeval;
import java.io.*;
import java.util.*;
public class Keywordscount
{
	//public static void main(String args[])throws Exception
	public Keywordscount()throws Exception
	{


		File r = new File("src/main/java/project1/automatedessayeval/featurescount.txt");
	     FileWriter fw=new FileWriter(r);
	     BufferedWriter pw1=new BufferedWriter(fw);

	     File k1=new File("src/main/java/project1/automatedessayeval/Results.txt");
			FileWriter fw1=new FileWriter(k1,true);
			BufferedWriter f1=new BufferedWriter(fw1);

		String word1, word2;
		int keywords = 0;
		try {
		    Scanner sc = new Scanner(new FileInputStream("src/main/java/project1/automatedessayeval/stopwordstokens.txt"));

		    while (sc.hasNext()) {
		        word1 = sc.next();
		        //System.out.println(word1);
		        Scanner sc2 = new Scanner(new FileInputStream("src/main/java/project1/automatedessayeval/Synonymswithoutduplicates.txt"));
		        while(sc2.hasNext()){
		           word2 = sc2.next();
		           //System.out.println(word2);
		           if(word2.equals(word1))
		              keywords++;
		        }
		    }
		    System.out.println("keywords="+keywords);
		    f1.write(Integer.toString(keywords));
			f1.newLine();
		    f1.write("Number of Keywords="+Integer.toString(keywords));
			f1.newLine();
			f1.close();

		} catch (Exception e) {
		    e.printStackTrace();
		}

		pw1.write(new Integer(keywords).toString());
		pw1.close();

	}
	public static void main(String args[])throws Exception
	{

		new Keywordscount();

	}
}
