package project1.automatedessayeval;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class CalculateGrade {

		public CalculateGrade() throws Exception
	{
		try
		{

			Scanner sc1=new Scanner(new BufferedReader(new FileReader("src/main/java/project1/automatedessayeval/Results.txt")));
			Scanner sc2=new Scanner(new BufferedReader(new FileReader("src/main/java/project1/automatedessayeval/weights.txt")));

			//System.out.println("hello");
			String s;
		sc1.nextLine();
		sc1.nextLine();
		s=sc1.nextLine();
		int a1=Integer.parseInt(s);
		//System.out.println(a1);
		sc1.nextLine();
		s=sc1.nextLine();
		int a2=Integer.parseInt(s);
		//System.out.println(a2);
		sc1.nextLine();
		sc1.nextLine();
		s=sc1.nextLine();
		int a3=Integer.parseInt(s);
		//System.out.println(a3);
		sc1.nextLine();
		s=sc1.nextLine();
		int a4=Integer.parseInt(s);
		//System.out.println(a4);
		sc1.nextLine();
		s=sc1.nextLine();
		int a5=Integer.parseInt(s);
		//System.out.println(a5);

		sc1.nextLine();
		s=sc1.nextLine();
		int a6=Integer.parseInt(s);
		//System.out.println(a6);



		String s1;
		s1=sc2.nextLine();
		float w1=Float.parseFloat(s1);
		//System.out.println(w1);

		s1=sc2.nextLine();
		float w2=Float.parseFloat(s1);
		//System.out.println(w2);

		s1=sc2.nextLine();
		float w3=Float.parseFloat(s1);
		//System.out.println(w3);

		s1=sc2.nextLine();
		float w4=Float.parseFloat(s1);
		//System.out.println(w4);

		s1=sc2.nextLine();
		float w5=Float.parseFloat(s1);
		//System.out.println(w5);

		s1=sc2.nextLine();
		float w6=Float.parseFloat(s1);
		//System.out.println(w6);


		float total=a1*w1+a2*w2+a3*w3+a4*w4+a5*w5+a6*w6;

		int grade;
		if(total>=40 &&total<=60)
			grade=5;
		else if(total>=30 && total<40)
			grade=4;
		else
			grade=3;
		System.out.println(total);
		System.out.println("GRADE="+grade);
		new Page3(grade);
		}
		catch(Exception e)
		{

		}
	}

	public static void main(String args[]) throws Exception
	{
		new CalculateGrade();
	}

}
