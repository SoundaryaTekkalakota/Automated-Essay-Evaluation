package project1.automatedessayeval;
import java.io.*;

public class Evaluation
{
	//public static void main(String args[]) throws Exception
	public void Evaluation1()throws Exception
	{

		new Token();
		new StopWordsRemoval();//also calling Token.java in StopWordsRemoval.java
		new EssayLength();
		new Keywordscount();//essay length
		new Spellcheck();
		new Punctuations();
		new Capitalization();
		new Introduction();
		new Conclusion();
		new numberofPOS();
		LVQ lvq = new LVQ();
		lvq.RunLVQ();
	}
	public static void main(String args[]) throws Exception
	{
		Evaluation e=new Evaluation();
		e.Evaluation1();
	}
}
