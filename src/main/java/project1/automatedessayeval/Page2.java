package project1.automatedessayeval;
//front page
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;

public class Page2 extends Frame implements ActionListener
{
	TextArea t1=new TextArea();
	 TextArea t=new TextArea();
	 File f=new File("src/main/java/project1/automatedessayeval/input.txt");
		BufferedWriter bw=new BufferedWriter(new FileWriter(f,false));
		PrintWriter pw=new PrintWriter(bw);

		File f1=new File("src/main/java/project1/automatedessayeval/studentanswer.txt");
		BufferedWriter bw1=new BufferedWriter(new FileWriter(f1,false));
		PrintWriter pw1=new PrintWriter(bw1);
	public Page2() throws Exception
	{

	setVisible(true);
    setSize(2000,2000);
    setLayout(new GridLayout(2,1));

    /*Panel jp0 = new Panel();
    jp0.setLayout(new FlowLayout());
    add(jp0);
    Button b0=new Button("GRADE THE ESSAY");
    b0.setFont(new Font("Serif", Font.PLAIN, 24));
	b0.setSize(new Dimension(200,60));
    jp0.add(b0);
    b0.addActionListener(this);*/
    //----------------------------------------------------
    Panel jp = new Panel();
    jp.setLayout(new BorderLayout());
    add(jp);
    Label l=new Label("Write an essay on the advantages of computers");
    l.setFont(new Font("Serif", Font.PLAIN, 24));
    jp.add(l,BorderLayout.NORTH);

	t.setFont(new Font("Serif", Font.PLAIN, 24));
	t.setSize(new Dimension(60,100));
	jp.add(t,BorderLayout.CENTER);
	//t.addTextListener(this);

	Button b0=new Button("     GRADE    ");
    b0.setFont(new Font("Serif", Font.PLAIN, 24));
	b0.setSize(new Dimension(200,60));
    jp.add(b0,BorderLayout.EAST);
    b0.addActionListener(this);

    Button b11=new Button("EVALUATE");
    b11.setFont(new Font("Serif", Font.PLAIN, 24));
	b11.setSize(new Dimension(200,60));
    jp.add(b11,BorderLayout.WEST);
    b11.addActionListener(this);

	//-------------------------------------------------
    Panel jp1 = new Panel();
    jp1.setLayout(new BorderLayout());
    add(jp1);


    Button b=new Button("PREPROCESS");
    b.setFont(new Font("Serif", Font.PLAIN, 22));
    b.setSize(new Dimension(20,10));
    jp1.add(b,BorderLayout.EAST);
    b.addActionListener(this);

	Button b1=new Button("    TRAIN     ");
	b1.setFont(new Font("Serif", Font.PLAIN, 22));
	String msg="TRAIN";
	jp1.add(b1,BorderLayout.WEST);
    b1.addActionListener(this);


	t1.setFont(new Font("Serif", Font.PLAIN, 24));
	t1.setSize(new Dimension(60,60));
	jp1.add(t1,BorderLayout.CENTER);
    //-----------------------------------------------
    this.addWindowListener(new WindowAdapter()
	{
		public void windowClosing(WindowEvent w)
		{
			System.exit(0);
		}
	});

	}
	public void paint(Graphics g)
	{

	}
public void actionPerformed(ActionEvent ae)
{
	try {
		String s=t.getText();
		pw.write(s);
		pw1.write(s);
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	String temp=ae.getActionCommand();
	try
	{
		if(temp=="     GRADE    ")
		{
			new CalculateGrade();
		}
		else if(temp=="PREPROCESS")
		{
			Scanner sc1=new Scanner(new BufferedReader(new FileReader("/automatedessayeval/src/main/java/project1/automatedessayeval/Results.txt")));
			while(sc1.hasNextLine())
			{
				String s=sc1.nextLine();
				//t1.append("hello");
				t1.append(s);
				t1.append("\n");
			}
		}
		else if(temp=="    TRAIN     ")
		{

			Scanner sc1=new Scanner(new BufferedReader(new FileReader("/automatedessayeval/src/main/java/project1/automatedessayeval/Winners.txt")));
			while(sc1.hasNextLine())
			{
				String s=sc1.nextLine();
				//t1.append("hello");
				t1.append(s);
				t1.append("\n");
			}
		}
		else if(temp=="EVALUATE")
		{
			Evaluation e=new Evaluation();
			e.Evaluation1();
		}


	}
	catch(Exception e)
	{
	}
	pw.close();
	pw1.close();
}

	public static void main(String args[]) throws Exception
	{
		//new Page2();
	}


}
