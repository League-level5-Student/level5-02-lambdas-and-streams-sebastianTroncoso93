package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	Random ran = new Random();
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		
		// Noticed that we only can call for a method instead of an operation
		addNumbers.addActionListener(e -> addNumbers());
		randNumber.addActionListener(e-> randomNumber());
		tellAJoke.addActionListener(e -> tellAJoke());
		
		window.setVisible(true);
		window.pack();
	}
	
	private Object tellAJoke() {
		
		System.out.println(" Not in the mood for a joke...");
		// TODO Auto-generated method stub
		return null;
	}

	private Object randomNumber() {
		
		int next = ran.nextInt(11);
		
		System.out.println(" Random number " + next );
		// TODO Auto-generated method stub
		return null;
	}

	private Object addNumbers() {
		
		int a = 7;
		int b = 6;
		
		System.out.println( "Adding " + a + " and " + b + " to equal " + (a + b) );
		
		
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
