package project1.automatedessayeval;

import edu.stanford.nlp.ling.HasWord;
import edu.stanford.nlp.ling.TaggedWord;
import edu.stanford.nlp.tagger.maxent.MaxentTagger;
import java.awt.List;
import java.io.*;
import java.util.ArrayList;
public class numberofPOS
{
	public numberofPOS() throws Exception
	{
		int nouns=0,adj=0,propnouns=0,pronoun=0,adverb=0,verb=0,to=0,interjection=0,extra=0;
		int POS=0;


		File k1=new File("src/main/java/project1/automatedessayeval/Results.txt");
		FileWriter fw=new FileWriter(k1,true);
		BufferedWriter f1=new BufferedWriter(fw);

		FileReader fr=new FileReader("src/main/java/project1/automatedessayeval/input.txt");
		BufferedReader br=new BufferedReader(fr);
		String s;
		s=br.readLine() ;
		//System.out.println("the input is "+s);

		String sample =s;// "cat is an animal";

		//String sample1 = "computers will benefit";

		// The tagged string
		MaxentTagger tagger = new MaxentTagger("taggers/english-left3words-distsim.tagger");
		String tagged = tagger.tagString(sample);
		ArrayList sentence =  (ArrayList) MaxentTagger.tokenizeText(new StringReader(sample)).get(0);
		for(int i=0;i<sentence.size();i++)
		{
			if(i==sentence.size()-1)
			{

			}
			else
			{
			TaggedWord taggedWord = tagger.tagSentence((java.util.List<? extends HasWord>) sentence).get(i);//VBZ VBP
			TaggedWord taggedWord1 = tagger.tagSentence((java.util.List<? extends HasWord>) sentence).get(i+1);
			//i=i-1;
			if((taggedWord.tag().equals("NNS"))&&(taggedWord1.tag().equals("VBP")))
				nouns++;
			if((taggedWord.tag().equals("NN"))&&(taggedWord1.tag().equals("VBZ")))
				nouns++;
			if((taggedWord.tag().equals("NNS"))&&(taggedWord1.tag().equals("MD")))
				nouns++;
			if((taggedWord.tag().equals("NN"))&&(taggedWord1.tag().equals("MD")))
				nouns++;
			if((taggedWord.tag().equals("PRP"))&&(taggedWord1.tag().equals("VBP")))
				nouns++;
			if((taggedWord.tag().equals("MD"))&&(taggedWord1.tag().equals("VB")))
				nouns++;
			if((taggedWord.tag().equals("VBG"))&&(taggedWord1.tag().equals("NNS")))
				nouns++;
			if((taggedWord.tag().equals("VBG"))&&(taggedWord1.tag().equals("NN")))
				nouns++;
			if((taggedWord.tag().equals("VB"))&&(taggedWord1.tag().equals("VBZ")))
				nouns++;
			if((taggedWord.tag().equals("JJS"))&&(taggedWord1.tag().equals("NN")))
				nouns++;
			if((taggedWord.tag().equals("PRP"))&&(taggedWord1.tag().equals("NNS")))
				nouns++;
			if((taggedWord.tag().equals("VB"))&&(taggedWord1.tag().equals("PRP")))
				nouns++;
			if((taggedWord.tag().equals("FW"))&&(taggedWord1.tag().equals("VBP")))
				nouns++;
			if((taggedWord.tag().equals("PRP$"))&&(taggedWord1.tag().equals("NNS")))
				nouns++;
			if((taggedWord.tag().equals("VBP"))&&(taggedWord1.tag().equals("VBN")))
				nouns++;
			System.out.println(taggedWord.tag());

			}
		}
		POS=nouns+adj+propnouns+pronoun+adverb+verb+to+interjection;
		System.out.println("Output: "+ tagged);
		System.out.println("total POS="+nouns);
		f1.write(Integer.toString(POS));
		f1.newLine();
		f1.write("total POS="+Integer.toString(POS));
		f1.newLine();
		f1.close();
	}
	public static void main(String args[])throws Exception
	{
		new numberofPOS();
	}

}
