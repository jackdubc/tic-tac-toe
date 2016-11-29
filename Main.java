/* 

   name: TicTacToe
   author: Pseupier Coders
   date: 11/22/16
   description: a simple game of tic-tac-toe

*/

import java.util.Scanner;

public class Main{
	
	private final static int WIDTH = 3;
	private final static int HEIGHT = 3;
	
	//if board space is blank
	private final static int BLANK = 0;
	
	//board stores characters
	static char[][]board = new char[WIDTH][HEIGHT];
	
	// the main method is the entry point for a program
    // inside methods the statements get executed in the order they appear in the code
	public static void main(String[] args){
		//while (booleanexpression) {
			gameRules();
			userInput1();
			userInput2();
			setupBoard();
			gameLogic();
			checkWin();
			gameAI();
			checkWin();
			clearBoard();
			displayBoard();
		//}
    }
	
	private static void gameRules(){
		System.out.println("------------------------------");
		System.out.println("Tic Tac Toe Game Rules:");
		System.out.println("In order to win, you must connect 3");
		System.out.println("of x's or o's vertically, ");
		System.out.println("horizontally, or diagonally. You, the user,");
		System.out.println("are given the choice of 'X' ");
		System.out.println("or 'O' for your your symbol. ");
		System.out.println("If you pick an invalid column,");
		System.out.println("(one that is full or non-existent),");
		System.out.println("your will be asked to pick a new column.");
		System.out.println("Lastly, the program will clear itself");
		System.out.println("as you continue throughout the game");
		System.out.println("so that your game space does not");
		System.out.println("become over crowded.");
		System.out.println("That's all, enjoy the game!");
		System.out.println("------------------------------");
	}
	
	//the first of two user input methods used to take user's starting input
	// written by jack de la motte
	// inputs: ready to begin, not ready to begin
	// outputs: gamerules, waiting for user to be ready to begin
	public static boolean userInput1()
	{
		String a; 
		// setting boolean used in while loop to false
		
		boolean flag = false;
		
		//prompting
		System.out.println("Now that you know how to play, are you ready to begin? (yes or no)");
		
		//taking user's input
		Scanner input = new Scanner(System.in);
		
		// initializing string 'a' variable to users input
		a = input.nextLine();
  
		// while loop used to continue prompting user until they are ready to play
		while(flag == false){
			
			// set of if else statments to determine based off of user's input when they are ready to play
			if (a.equals("yes")){
				return true;
			}
			else if(a.equals("no")) {
				System.out.println("enter 'yes' when you are ready to begin.");
				a = input.nextLine();
			}
			else {
				System.out.println("that didn't work, try entering 'yes' or 'no' ");
				a = input.nextLine();
			}
		}
		// when they enter yes it while break out of the loop and to this statement which by returning true ends the while loop
		return true; 
	}
	// the second of two user input methods used to take user's input for column and row token placements
	// written by jack de la motte
	// inputs: 
	// outputs: 
	public static void userInput2() 
	{
		int a;
		int b;
		int column;
		int row;
		
		System.out.println("enter a column in which you would like to place your token (1-3)");
		Scanner input = new Scanner(System.in);
		
		a = input.nextInt();
		boolean flag = false;
		while(flag == false)
		{
			if (a == 1)
			{
				column = 1;
				break;
			}
		
			if (a == 2)
			{
				column = 2;
				break;
			}
		
			if (a == 3)
			{
				column = 3;
				break;
			} else  {
					System.out.println("that's not a vaild column, try entering a number 1-3");
					a = input.nextInt();
					return;
				}
		}
	}
	
	private static void setupBoard(){
		for(int width=0; width < WIDTH; width++){
			for(int height=0; height < HEIGHT; height++){
				board[width][height]='-';
			}
		}	
	}

	private static void gameLogic(){
		for(int width=0; width < WIDTH; width++){
			for(int height=0; height < HEIGHT; height++){
				System.out.print(board[width][height]);
			}
			System.out.println("");
		}	
	}
	
	private static void checkWin(){
		;
	}
	private static void gameAI(){
		;
	}
	private static void clearBoard(){
		;
	}
	private static void displayBoard(){
		;
	}
}
