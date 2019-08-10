package project1.automatedessayeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import net.didion.jwnl.JWNL;
import net.didion.jwnl.JWNLException;
import net.didion.jwnl.data.IndexWord;
//import net.didion.jwnl.data.IndexWord;
import net.didion.jwnl.data.POS;
import net.didion.jwnl.data.Synset;
import net.didion.jwnl.data.Word;
import net.didion.jwnl.dictionary.Dictionary;
/*
import net.didion.jwnl.JWNL;
import net.didion.jwnl.JWNLException;
import net.didion.jwnl.data.IndexWord;
import net.didion.jwnl.data.POS;
import net.didion.jwnl.data.Synset;
import net.didion.jwnl.data.Word;
import net.didion.jwnl.dictionary.Dictionary;
*/
public class JWNLTutorial
{
    public static void main(final String[] args) throws IOException
    {
        try {

            JWNL.initialize(new FileInputStream("src/main/resources/properties.xml"));
            final Dictionary dictionary = Dictionary.getInstance();
            	FileReader fr=new FileReader("src/main/java/project1/automatedessayeval/sample.txt");
            	BufferedReader br=new BufferedReader(fr);
            	String s;
            	while((s=br.readLine())!=null)
            	{
            String lemma = s;
            final POS pos = POS.VERB;
            final POS pos1 = POS.NOUN;
            final POS pos2=POS.ADJECTIVE;
            final POS pos3 = POS.ADVERB;

            final IndexWord indexWord = dictionary.lookupIndexWord(pos, lemma);
            if (null != indexWord) {

                final Synset[] senses = indexWord.getSenses();

                int i = 1;
                for (final Synset synset : senses) {

                    final String gloss = synset.getGloss();

                    final List<String> words = new ArrayList<String>();
                    for (final Word word : synset.getWords())
                    {
                        words.add(word.getLemma() /*+ "/" + word.getPOS().getKey()*/);
                    }

                    //System.out.println(String.format("%2d Lemmas: %s (Gloss: %s)", i++, words, gloss));
                    System.out.println(words);
                }
            }
            else
            {
                /*System.out.println("No synsets found for '" + lemma
                         + "/" + pos.getKey() + "'");*/
            }

            System.out.println("niharika");
            final IndexWord indexWord1 = dictionary.lookupIndexWord(pos1, lemma);
            if (null != indexWord1) {

                final Synset[] senses = indexWord1.getSenses();

                int i = 1;
                for (final Synset synset : senses) {

                    final String gloss = synset.getGloss();

                    final List<String> words = new ArrayList<String>();
                    for (final Word word : synset.getWords())
                    {
                        //words.add(word.getLemma() + "/" + word.getPOS().getKey());
                    	  words.add(word.getLemma() /*+ "/" + word.getPOS().getKey()*/);
                    }

                    //System.out.println(String.format("%2d Lemmas: %s (Gloss: %s)", i++, words, gloss));
                    System.out.println(words);
                }
            }
            else
            {
                /*System.out.println("No synsets found for '" + lemma
                         + "/" + pos1.getKey() + "'");*/
            }

            final IndexWord indexWord2 = dictionary.lookupIndexWord(pos2, lemma);
            if (null != indexWord2) {

                final Synset[] senses = indexWord2.getSenses();

                int i = 1;
                for (final Synset synset : senses) {

                    final String gloss = synset.getGloss();

                    final List<String> words = new ArrayList<String>();
                    for (final Word word : synset.getWords())
                    {
                        //words.add(word.getLemma() + "/" + word.getPOS().getKey());
                    	  words.add(word.getLemma() /*+ "/" + word.getPOS().getKey()*/);
                    }

                    //System.out.println(String.format("%2d Lemmas: %s (Gloss: %s)", i++, words, gloss));
                    System.out.println(words);
                }
            }
            else
            {
                /*System.out.println("No synsets found for '" + lemma
                         + "/" + pos2.getKey() + "'");*/
            }

            final IndexWord indexWord3 = dictionary.lookupIndexWord(pos3, lemma);
            if (null != indexWord3) {

                final Synset[] senses = indexWord3.getSenses();

                int i = 1;
                for (final Synset synset : senses) {

                    final String gloss = synset.getGloss();

                    final List<String> words = new ArrayList<String>();
                    for (final Word word : synset.getWords())
                    {
                        words.add(word.getLemma() /*+ "/" + word.getPOS().getKey()*/);
                    }

                    //System.out.println(String.format("%2d Lemmas: %s (Gloss: %s)", i++, words, gloss));
                   // words.add(word.getLemma() /*+ "/" + word.getPOS().getKey()*/);
                    System.out.println(words);
                }
            }
            else
            {
               /* System.out.println("No synsets found for '" + lemma
                         + "/" + pos3.getKey() + "'");*/
            }
        }
        }
        catch (final FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (final JWNLException e) {
            e.printStackTrace();
        }
    }
}
