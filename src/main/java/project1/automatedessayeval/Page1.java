package project1.automatedessayeval;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;
public class Page1 extends Frame implements ActionListener
{
	public Page1()
	{
		setVisible(true);
		setSize(1500,1500);
		setLayout(new BorderLayout());
		Button b1=new Button("TAKE THE TEST");
		b1.setFont(new Font("Serif", Font.PLAIN, 22));
		String msg="\t\t\t\t\t\t\t\t\t\t\t\t\t ESSAY EVALUATION"+"\n\n\nWelcome to your Essay Portal! Below you will find an essay prompt to describe how computers are a boon to the world.Please enter your response to receive an automated Grading evaluation \n"+"of your essay answer.The essay should have a minimum of 400 words. The essay will be graded into .\n\n"+"1-high\n\n"+"2-medium\n\n"+"0-low levels based on your response in terms of relevant content, supporting points, sentence construct and grammar.";
		TextArea t=new TextArea(msg);
		t.setFont(new Font("Serif", Font.PLAIN, 24));
		add(t,BorderLayout.CENTER);
		add(b1,BorderLayout.SOUTH);
		b1.addActionListener(this);
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
		String temp=ae.getActionCommand();
		try
		{
			if(temp=="TAKE THE TEST")
			new Page2();

		}
		catch(Exception e)
		{
		}
	}
	public static void main(String args[])
	{
		new Page1();
	}
}
