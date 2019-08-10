package project1.automatedessayeval;
import java.io.*;
import java.util.HashSet;

public class FileOperation
{
    public static void main(String[] args) throws IOException
    {
        // PrintWriter object for output.txt
        PrintWriter pw = new PrintWriter("src/main/java/project1/automatedessayeval/keywordswithoutduplicates.txt");

        // BufferedReader object for input.txt
        BufferedReader br = new BufferedReader(new FileReader("src/main/java/project1/automatedessayeval/keywords.txt"));

        String line = br.readLine();

        // set store unique values
        HashSet<String> hs = new HashSet<String>();

        // loop for each line of input.txt
        while(line != null)
        {
            // write only if not
            // present in hashset
            if(hs.add(line))
                pw.println(line.toUpperCase());

            line = br.readLine();

        }

        pw.flush();

        // closing resources
        br.close();
        pw.close();

        System.out.println("File operation performed successfully");
    }
}
