package project1.automatedessayeval;
import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Page3 extends Frame implements ActionListener
{
	int score;
	public Page3(int score) throws Exception
	{
		this.score=score;
		setVisible(true);
		setSize(1500,1500);
		Label l=new Label("                                                                                         Your Grade is :"+score);
	    l.setFont(new Font("Serif", Font.PLAIN, 28));
	    this.add(l);

		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent w)
			{
				System.exit(0);
			}
		});
	}
	public static void main(String args[]) throws Exception
	{
		//new Page3();
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
