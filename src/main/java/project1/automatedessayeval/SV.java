package project1.automatedessayeval;
import edu.stanford.nlp.ling.HasWord;
import edu.stanford.nlp.ling.TaggedWord;
import edu.stanford.nlp.tagger.maxent.MaxentTagger;

import java.awt.List;
import java.io.*;
import java.util.ArrayList;
public class SV
{
	public static void main(String args[])throws Exception
	{
		int nouns=0,adj=0,propnouns=0,pronoun=0,adverb=0,verb=0,to=0,interjection=0,extra=0;
		int nouSingc=0,nouPluc=0,verSingc=0,verPluc=0;
		Boolean nouSing=false,nouPlu=false,verSing=false,verPlu=false;
		Boolean nouSingMain=false,nouPluMain=false,verSingMain=false,verPluMain=false;
		int POS=0;

		MaxentTagger tagger = new MaxentTagger("taggers/english-left3words-distsim.tagger");
		String sample = "cats are an animals";
		String tagged = tagger.tagString(sample);
		ArrayList sentence =  (ArrayList) MaxentTagger.tokenizeText(new StringReader(sample)).get(0);
		for(int i=0;i<sentence.size();i++)
		{
			TaggedWord taggedWord = tagger.tagSentence((java.util.List<? extends HasWord>) sentence).get(i);
			if((nouSingc==0)&&(((taggedWord.tag().equals("NN"))||(taggedWord.tag().equals("NNP")))))
			{
				nouSingMain=true;
				nouSingc++;
			}
			else if((nouSingc==0)&&((taggedWord.tag().equals("PRP"))&&(taggedWord.tag()=="I"||taggedWord.tag()=="he"||taggedWord.tag()=="she"||taggedWord.tag()=="it")))
			{
				nouSingMain=true;
				nouSingc++;
			}
			else if((nouPluc==0)&&((taggedWord.tag().equals("NNS"))||(taggedWord.tag().equals("NNPS"))))
			{
				nouPluMain=true;
				nouPluc++;
			}
			else if((nouPluc==0)&&((taggedWord.tag().equals("PRP"))&&(taggedWord.tag()=="you"||taggedWord.tag()=="we"||taggedWord.tag()=="they")))
			{
				nouPluMain=true;
				nouPluc++;
			}
			else if((taggedWord.tag().equals("NN"))||(taggedWord.tag().equals("NNP")))
			{
				nouSing=true;
				nouSingc++;
			}

			else if((taggedWord.tag().equals("NNS"))||(taggedWord.tag().equals("NNPS")))
			{
				nouPlu=true;
				nouPluc++;
			}
			else if((taggedWord.tag().equals("PRP"))&&(taggedWord.tag()=="I"||taggedWord.tag()=="he"||taggedWord.tag()=="she"||taggedWord.tag()=="it"))
			{
				nouSing=true;
				nouSingc++;
			}
			else if((taggedWord.tag().equals("PRP"))&&(taggedWord.tag()=="you"||taggedWord.tag()=="we"||taggedWord.tag()=="they"))
			{
				nouPlu=true;
				nouPluc++;
			}
			else if ((verSingc==0)&&((taggedWord.tag().equals("VBD"))&&(taggedWord.tag()=="was")))
			{
				verSingMain=true;
				verSingc++;
			}

			else if ((verPluc==0)&&((taggedWord.tag().equals("VBD"))&&(taggedWord.tag()=="were")))
			{
				verPluMain=true;
				verPluc++;
			}

			else if ((verSingc==0)&&((taggedWord.tag().equals("VBZ"))&&(taggedWord.tag()=="has")))
			{
				verSingMain=true;
				verSingc++;
			}

			else if ((verPluc==0)&&((taggedWord.tag().equals("VBP"))&&(taggedWord.tag()=="have")))
			{
				verPluMain=true;
				verPluc++;
			}
			else if ((verSingc==0)&&(taggedWord.tag().equals("VBZ")))
			{
				verSingMain=true;
				verSingc++;
			}
			else if ((verPluc==0)&&(taggedWord.tag().equals("VBP")))
			{
				verPluMain=true;
				verPluc++;
			}
			else if ((taggedWord.tag().equals("VBD"))&&(taggedWord.tag()=="was"))
			{
				verSing=true;
				verSingc++;
			}

			else if ((taggedWord.tag().equals("VBD"))&&(taggedWord.tag()=="were"))
			{
				verPlu=true;
				verPluc++;
			}
			else if ((taggedWord.tag().equals("VBZ")))
			{
				verSing=true;
				verSingc++;
			}
			else if((taggedWord.tag().equals("VBP")))
			{
				verPlu=true;
				verPluc++;
			}

			else if ((taggedWord.tag().equals("VBZ"))&&(taggedWord.tag()=="has"))
			{
				verSing=true;
				verSingc++;
			}

			else if ((taggedWord.tag().equals("VBP"))&&(taggedWord.tag()=="have"))
			{
				verPlu=true;
				verPluc++;
			}

		}
		System.out.println(nouSingc);
		//System.out.println(nouSingc);
		System.out.println(nouPluc);
		System.out.println(verSingc);
		System.out.println(verPluc);
		System.out.println(nouSing);
		System.out.println(nouPlu);
		System.out.println(verSing);
		System.out.println(verPlu);
		System.out.println(nouSingMain);
		System.out.println(verSingMain);
		System.out.println(nouPluMain);
		System.out.println(verPluMain);
		if(nouSingMain&&verSingMain)
			System.out.println("s-v singular agreed");
		else if(nouPluMain&&verPluMain)
			System.out.println("s-v plural agreed");
		else
			System.out.println("s-v not agreed");

		POS=nouns+adj+propnouns+pronoun+adverb+verb+to+interjection;
		System.out.println("total POS="+POS);
		//System.out.println("Input: " + s);
		//System.out.println("Output: "+ tagged);


	}
}
