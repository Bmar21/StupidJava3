package stupid.controller;

import java.util.Scanner; 

public class StupidController 
{
	private String myName;
	private Scanner readKeyboardInput; 
	
	public StupidController()
	{
		myName = "Brandon Marlor";
		readKeyboardInput = new Scanner(System.in);
	}
	
	public void start()
	{
		System.out.println("this is slightly less stupid :D");
		System.out.println(myName);
		askQuestions();
	}
	
	private void askQuestions()
	{
		System.out.println("What is your name?");
		String userInput1 = readKeyboardInput.nextLine();
		System.out.println("You said: " + userInput1);
		readKeyboardInput.nextLine(); // Used to consume the remainder of the text buffer
		
		System.out.println("What is your favorite animal? ");
		String userInput2 = readKeyboardInput.nextLine();
		System.out.println("You said: " + userInput2);
		readKeyboardInput.nextLine(); // Used to consume the remainder of the text buffer
		
		System.out.println("If you could go anywhere in the world where would it be? ");
		String userInput3 = readKeyboardInput.nextLine();
		System.out.println("You said: " + userInput3);
		readKeyboardInput.nextLine(); // Used to consume the remainder of the text buffer
		
		System.out.println("What is your favorite color? ");
		String userInput4 = readKeyboardInput.nextLine();
		System.out.println("You said: " + userInput4);
		readKeyboardInput.nextLine(); // Used to consume the remainder of the text buffer
		
		System.out.println("what is your most beloved Video Game? ");
		String userInput5 = readKeyboardInput.nextLine();
		System.out.println("You said: " + userInput5);
		readKeyboardInput.nextLine(); // Used to consume the remainder of the text buffer
		
		System.out.println("Who is your best friend? ");
		String userInput6 = readKeyboardInput.nextLine();
		System.out.println("You said: " + userInput6);
		readKeyboardInput.nextLine(); // Used to consume the remainder of the text buffer
		
		System.out.println("What is your dream job? ");
		String userInput7 = readKeyboardInput.nextLine();
		System.out.println("You said: " + userInput7);
		readKeyboardInput.nextLine(); // Used to consume the remainder of the text buffer
		
		System.out.println("what is your weigh in kilograms? ");
		double yourWeight = readKeyboardInput.nextDouble();
		System.out.println("You said: " + yourWeight);
		readKeyboardInput.nextLine(); // Used to consume the remainder of the text buffer
		
		System.out.println("How old are you? ");
		int yourAge = readKeyboardInput.nextInt();
		System.out.println("You said: " + yourAge);
		readKeyboardInput.nextLine(); // Used to consume the remainder of the text buffer
		
		System.out.println("What is your favorite food? ");
		String userInput10 = readKeyboardInput.nextLine();
		System.out.println("You said: " + userInput10);
		readKeyboardInput.nextLine(); // Used to consume the remainder of the text buffer
		
		
		
		
		
	}
}
