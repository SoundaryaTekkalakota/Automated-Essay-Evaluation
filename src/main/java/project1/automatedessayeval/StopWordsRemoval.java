package project1.automatedessayeval;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.*;
import java.util.*;
public class StopWordsRemoval {

public static String[] stopWordsofwordnet = {"a", "about", "above", "across", "after", "afterwards", "again", "against", "all", "almost",
                "alone", "along", "already", "also","although","always","am","among", "amongst", "amount",  "an", "and",
                "another", "any","anyhow","anyone","anything","anyway", "anywhere", "are", "around", "as",  "at", "back","be","became",
                "because","become","becomes", "becoming", "been", "before", "beforehand", "behind", "being", "below", "beside", "besides",
                "between", "beyond", "bill", "both", "bottom","but", "by", "call", "can", "cannot", "cant", "co", "con", "could", "couldnt",
                "cry", "de", "describe", "detail", "do", "done", "down", "due", "during", "each", "eg", "eight", "either", "eleven","else",
                "elsewhere", "empty", "enough", "etc", "even", "ever", "every", "everyone", "everything", "except", "few",
                "fifteen", "fify", "fill", "find", "fire", "first", "five", "for", "former", "formerly", "forty", "found", "four", "from",
                "front", "full", "further", "get", "give", "go", "had", "has", "hasnt",
                "have", "he", "hence", "her", "here", "hereafter", "hereby", "herein", "hereupon", "hers", "herself",
                "him", "himself", "his", "how", "however", "hundred", "ie", "if", "in", "inc", "indeed", "interest", "into",
                "is", "it", "its", "itself", "keep", "last", "latter", "latterly", "least", "less", "ltd", "made", "many",
                "may", "me", "meanwhile", "might", "mill", "mine", "more", "moreover", "most", "mostly", "move", "much", "must",
                "my", "myself", "name", "namely", "neither", "never", "nevertheless", "next", "nine", "no", "nobody", "none",
                "noone", "nor", "not", "nothing", "now", "nowhere", "of", "off", "often", "on", "once", "one", "only", "onto",
                "or", "other", "others", "otherwise", "our", "ours", "ourselves", "out", "over", "own","part", "per", "perhaps",
                "please", "put", "rather", "re", "same", "see", "seem", "seemed", "seeming", "seems", "serious", "several", "she",
                "should", "show", "side", "since", "sincere", "six", "sixty", "so", "some", "somehow", "someone", "something",
                "sometime", "sometimes", "somewhere", "still", "such", "system", "take", "ten", "than", "that", "the", "their",
                "them", "themselves", "then", "thence", "there", "thereafter", "thereby", "therefore", "therein", "thereupon",
                "these", "they", "thickv", "thin", "third", "this", "those", "though", "three", "through", "throughout", "thru",
                "thus", "to", "together", "too", "top", "toward", "towards", "twelve", "twenty", "two", "under", "until",
                "up", "upon", "us", "very", "via", "was", "we", "well", "were", "what", "whatever", "when", "whenever",
                "where", "whereafter", "whereas", "whereby", "wherein", "whereupon", "wherever", "whether", "which", "while",
                "whither", "who", "whoever", "whole", "whom", "whose", "why", "will", "with", "within", "without", "would", "yet",
                "you", "your", "yours","1","2","3","4","5","6","7","8","9","10","1.","2.","3.","4.","5.","6.","11",
                "7.","8.","9.","12","13","14","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z",
                "terms","CONDITIONS","conditions","values","interested.","care","sure",".","!","@","#","$","%","^","&","*","(",")","{","}","[","]",":",";",",","<",".",">","/","?","_","-","+","=",
                "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","grounds","buyers","tried","said,","plan","value","principle.","forces","sent:","is,","was","like",
                "discussion","tmus","diffrent.","layout","ARE","area.","thanks","thankyou","hello","bye","rise","fell","fall","psqft.","http://","km","miles","A", "ABOUT", "ABOVE", "ACROSS", "AFTER", "AFTERWARDS", "AGAIN", "AGAINST", "ALL", "ALMOST",
                "ALONE", "ALONG", "ALREADY", "ALSO","ALTHOUGH","ALWAYS","AM","AMONG", "AMONGST", "AMOUNT",  "AN", "AND",
                "ANOTHER", "ANY","ANYHOW","ANYONE","ANYTHING","ANYWAY", "ANYWHERE", "ARE", "AROUND", "AS",  "AT", "BACK","BE","BECAME",
                "BECAUSE","BECOME","BECOMES", "BECOMING", "BEEN", "BEFORE", "BEFOREHAND", "BEHIND", "BEING", "BELOW", "BESIDE", "BESIDES",
                "BETWEEN", "BEYOND", "BILL", "BOTH", "BOTTOM","BUT", "BY", "CALL", "CAN", "CANNOT", "CANT", "CO", "CON", "COULD", "COULDNT",
                "CRY", "DE", "DESCRIBE", "DETAIL", "DO", "DONE", "DOWN", "DUE", "DURING", "EACH", "EG", "EIGHT", "EITHER", "ELEVEN","ELSE",
                "ELSEWHERE", "EMPTY", "ENOUGH", "ETC", "EVEN", "EVER", "EVERY", "EVERYONE", "EVERYTHING", "EXCEPT", "FEW",
                "FIFTEEN", "FIFY", "FILL", "FIND", "FIRE", "FIRST", "FIVE", "FOR", "FORMER", "FORMERLY", "FORTY", "FOUND", "FOUR", "FROM",
                "FRONT", "FULL", "FURTHER", "GET", "GIVE", "GO", "HAD", "HAS", "HASNT",
                "HAVE", "HE", "HENCE", "HER", "HERE", "HEREAFTER", "HEREBY", "HEREIN", "HEREUPON", "HERS", "HERSELF",
                "HIM", "HIMSELF", "HIS", "HOW", "HOWEVER", "HUNDRED", "IE", "IF", "IN", "INC", "INDEED", "INTEREST", "INTO",
                "IS", "IT", "ITS", "ITSELF", "KEEP", "LAST", "LATTER", "LATTERLY", "LEAST", "LESS", "LTD", "MADE", "MANY",
                "MAY", "ME", "MEANWHILE", "MIGHT", "MILL", "MINE", "MORE", "MOREOVER", "MOST", "MOSTLY", "MOVE", "MUCH", "MUST",
                "MY", "MYSELF", "NAME", "NAMELY", "NEITHER", "NEVER", "NEVERTHELESS", "NEXT", "NINE", "NO", "NOBODY", "NONE",
                "NOONE", "NOR", "NOT", "NOTHING", "NOW", "NOWHERE", "OF", "OFF", "OFTEN", "ON", "ONCE", "ONE", "ONLY", "ONTO",
                "OR", "OTHER", "OTHERS", "OTHERWISE", "OUR", "OURS", "OURSELVES", "OUT", "OVER", "OWN","PART", "PER", "PERHAPS",
                "PLEASE", "PUT", "RATHER", "RE", "SAME", "SEE", "SEEM", "SEEMED", "SEEMING", "SEEMS", "SERIOUS", "SEVERAL", "SHE",
                "SHOULD", "SHOW", "SIDE", "SINCE", "SINCERE", "SIX", "SIXTY", "SOME", "SOMEHOW", "SOMEONE", "SOMETHING",
                "SOMETIME", "SOMETIMES", "SOMEWHERE", "STILL", "SUCH", "SYSTEM", "TAKE", "TEN", "THAN", "THAT", "THE", "THEIR",
                "THEM", "THEMSELVES", "THEN", "THENCE", "THERE", "THEREAFTER", "THEREBY", "THEREFORE", "THEREIN", "THEREUPON",
                "THESE", "THEY", "THICKV", "THIN", "THIRD", "THIS", "THOSE", "THOUGH", "THREE", "THROUGH", "THROUGHOUT", "THRU",
                "THUS", "TO", "TOGETHER", "TOO", "TOP", "TOWARD", "TOWARDS", "TWELVE", "TWENTY", "TWO", "UNDER", "UNTIL",
                "UP", "UPON", "US", "VERY", "VIA", "WAS", "WE", "WELL", "WERE", "WHAT", "WHATEVER", "WHEN", "WHENEVER",
                "WHERE", "WHEREAFTER", "WHEREAS", "WHEREBY", "WHEREIN", "WHEREUPON", "WHEREVER", "WHETHER", "WHICH", "WHILE",
                "WHITHER", "WHO", "WHOEVER", "WHOLE", "WHOM", "WHOSE", "WHY", "WILL", "WITH", "WITHIN", "WITHOUT", "WOULD", "YET",
                "YOU", "YOUR", "YOURS","1","2","3","4","5","6","7","8","9","10","1.","2.","3.","4.","5.","6.","11",
                "7.","8.","9.","12","13","14","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z",
                "TERMS","CONDITIONS","CONDITIONS","VALUES","INTERESTED.","CARE","SURE",".","!","@","#","$","%","^","&","*","(",")","{","}","[","]",":",";",",","<",".",">","/","?","_","-","+","=",
                "A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","GROUNDS","BUYERS","TRIED","SAID,","PLAN","VALUE","PRINCIPLE.","FORCES","SENT:","IS,","WAS","LIKE",
                "DISCUSSION","TMUS","DIFFRENT.","LAYOUT","ARE","AREA.","THANKS","THANKYOU","HELLO","BYE","RISE","FELL","FALL","PSQFT.","HTTP://","KM","MILES" };


public static ArrayList<String> wordsList = new ArrayList<String>();
//public static void main(String[] args) throws Exception
public StopWordsRemoval()throws Exception
{


	File r = new File("src/main/java/project1/automatedessayeval/stopwordstokens.txt");
	FileReader fr=new FileReader("src/main/java/project1/automatedessayeval/tokensfile.txt");
	BufferedReader br=new BufferedReader(fr);
	FileWriter fw=new FileWriter(r);
	PrintWriter pw=new PrintWriter(fw);
	String s;
	while((s=br.readLine())!=null)
	{
			wordsList.add(s);
	}
for (int i = 0; i < wordsList.size(); i++)
{
	//System.out.println("hello");
	//System.out.println("the word is"+wordsList.get(i));
	for (int j = 0; j < stopWordsofwordnet.length; j++)
	{
		//System.out.println("the array word is "+stopWordsofwordnet[i]);
		if((stopWordsofwordnet[j].equals(wordsList.get(i))))
		{
			//System.out.println("hello");
			wordsList.remove(i);
		}
	}
}

/*System.out.print("the input is "+s);
System.out.println("the output is");*/
for (int i = 0; i < wordsList.size(); i++) {
//System.out.println(wordsList.get(i));
pw.write(wordsList.get(i));
pw.write("\n");
}
pw.close();
}
public static void main(String[] args) throws Exception
{
	new Token();
	new StopWordsRemoval();

}
}
