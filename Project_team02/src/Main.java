import java.io.IOException;
import java.util.*;
public class Main {
	
	 public static int count;

	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.println("JAVA, OOP Quiz Program.\nIf you want to run the quiz program input 'yes', or if you want to finish the program input 'exit'");
		String RunorNot;
		RunorNot = in.nextLine();
		
		
		if(RunorNot.equals("yes") || RunorNot.equals("Yes") || RunorNot.equals("YES") ) 
		{
			System.out.println("choose level of difficulty. 1.Hard 2.Easy\n(Hard mode's time limit for each problem is 10sec. Easy mode's time limit for each problem is 30sec)");
			String selecteddifficulty = in.nextLine();
			int difficulty = 0;
			if(selecteddifficulty.equals("1")) {difficulty = 2; System.out.println("You seleceted Hard mode. Time limits for each problem is \"10\" sec.");} 
			if(selecteddifficulty.equals("2")) {difficulty = 6; System.out.println("You seleceted Easy mode. Time limits for each problem is \"30\" sec.");} 
			else if(!selecteddifficulty.equals("1") && !selecteddifficulty.equals("2")){
				System.out.println("wrong input. Back to main menu.");
				main(args);
			}
			System.out.println("Run the quiz program.");
			RunQuizProgram(difficulty);
		}
		else if(RunorNot.equals("exit") || RunorNot.equals("Exit") || RunorNot.equals("EXIT") ) 
		{
			System.out.println("Exit the quiz program");
			System.exit(0);
		}
		else {
			System.out.println("wrong input. Back to main menu.");
			main(args);
		}
		in.close();
	
	}
	public static void RunQuizProgram(int difficulty) {
		
		TF_Game TF = new TF_Game();
		SA_Game SA = new SA_Game();
		MC_Game MC = new MC_Game();

		HeartPoint Player = new HeartPoint(3);
		HeartPoint Monster1 = new HeartPoint(5);
		HeartPoint Monster2 = new HeartPoint(5);
		HeartPoint Monster3 = new HeartPoint(5);
		
		try {		
			
			System.out.println("True of False quiz starts. Please input T of F.");
			TF.MakeRandom();
			TF.Run_Game(Player, Monster1, 0, difficulty);
			if(Monster1.getHeartPoint() == 0) {
				System.out.println("Congratulations! You won the True or False Quiz Monster.");
			}
			
		}catch(IOException e){
			System.out.println("T/F file I/O Exception");
		}
		
		try {
			
			System.out.println("\nShort Answer quiz starts.");
			SA.MakeRandom();
			SA.Run_Game(Player, Monster2, 0, difficulty);
			if(Monster1.getHeartPoint() == 0) {
				System.out.println("Congratulations! You won the Short Answer Quiz Monster.");
			}
		}catch(IOException e){
			System.out.println("S/A file I/O Exception");
		}
		
		try {
			
			System.out.println("\nMultiple Choice quiz starts.");
			MC.MakeRandom();
			MC.Run_Game(Player, Monster3, 0, difficulty);
			if(Monster1.getHeartPoint() == 0) {
				System.out.println("Congratulations! You won the Multiple Choice Quiz Monster.\nYou cleared all stage. If you want to go main menu enter 'yes' or if you want to exit, enter 'exit'.");
				Scanner in = new Scanner(System.in);
				String input = in.nextLine();
				if(input.equals("yes")) main(null);
				if(input.equals("exit")) System.exit(0);
				else {
					System.out.println("wrong input.");
					main(null);
				}
				in.close();
			}
		}catch(IOException e){
			System.out.println("MC file I/O Exception");
		}
			
	}
}


