package project1.automatedessayeval;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.languagetool.JLanguageTool;
import org.languagetool.language.BritishEnglish;
import org.languagetool.rules.RuleMatch;

public class Spellcheck {
	//public static void main(String args[]) throws FileNotFoundException
	public Spellcheck()throws Exception
	{

	     FileReader fr=new FileReader("src/main/java/project1/automatedessayeval/tokensfile.txt");
	     File k1=new File("src/main/java/project1/automatedessayeval/Results.txt");
			FileWriter fw=new FileWriter(k1,true);
			BufferedWriter f1=new BufferedWriter(fw);
	     BufferedReader br=new BufferedReader(fr);
	BritishEnglish n = new BritishEnglish();
	JLanguageTool langTool;
	int err=0;
	String s;

	try {
		while((s=br.readLine())!=null)
		{
		langTool = new JLanguageTool(n);
		List<RuleMatch> matches = langTool.check(s);
		if((matches.size())!=0)
			err++;
		/*for (RuleMatch match : matches)
		{
			System.out.println("Potential error at characters " +
				match.getFromPos() + "-" + match.getToPos() + ": " + match.getMessage());
			System.out.println("Suggested correction(s): " +
					match.getSuggestedReplacements());
		}*/
		}
	System.out.println("Number of spelling mistakes ="+err);
	f1.write(Integer.toString(err));
	f1.newLine();
	f1.write("Number of spelling mistakes ="+Integer.toString(err));
	f1.newLine();
	f1.close();
	}
catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	//System.out.println("Number of spelling mistakes "+matches.size());

	}
	public static void main(String args[]) throws Exception
	{
		new Spellcheck();
	}
}
