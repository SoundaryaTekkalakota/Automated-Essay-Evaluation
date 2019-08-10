package project1.automatedessayeval;
import java.util.StringTokenizer;
import java.io.*;
public class Token
{
	public Token() throws Exception
 {
	 File r = new File("src/main/java/project1/automatedessayeval/tokensfile.txt");
     FileReader fr=new FileReader("src/main/java/project1/automatedessayeval/input.txt");
     BufferedReader br=new BufferedReader(fr);
     String s;
     FileWriter fw=new FileWriter(r);
     PrintWriter pw=new PrintWriter(fw);
     while((s=br.readLine())!=null)
     {
    		 StringTokenizer st = new StringTokenizer(s," ");
    		 while (st.hasMoreTokens())
    		 {
    			 String s1=st.nextToken();
    			 System.out.println(s1);
    			 pw.write(s1.toUpperCase());
    			 pw.write("\n");
    		 }
    	 }
     pw.close();
     fr.close();
 }
	public static void main(String args[]) throws Exception
	{
		new Token();
	}
}
