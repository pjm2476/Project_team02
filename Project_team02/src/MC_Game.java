import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MC_Game {

    MC_Question MC = new MC_Question();

     private  ArrayList<String> question = new ArrayList<String>(MC.Question());
     private ArrayList<String> answer = new ArrayList<String>(MC.Answer());
	    
     private ArrayList<String> choice1 = new ArrayList<String>(MC.Choice1());
     private ArrayList<String> choice2 = new ArrayList<String>(MC.Choice2());
     private ArrayList<String> choice3 = new ArrayList<String>(MC.Choice3());
	 	
     private HeartPoint player;
     private HeartPoint monster;
	 static int count = 0;
	 private int ArrayListLength = question.size();
	 private int RandomNumber[] = new int[ArrayListLength];

    public MC_Game() {
        super();
    }
   
    public void MakeRandom() {
    	for(int i = 0; i < ArrayListLength; i++) {
        	RandomNumber[i] =(int)(Math.random()*ArrayListLength);
        	for(int j = 0; j < i; j++) {
        		if(RandomNumber[i] == RandomNumber[j]) {
        			i--;
        			break;
        		}
        	}
        }
    }
    
public void Run_Game(HeartPoint player, HeartPoint monster, int a, int d) throws IOException  {
	
			
		this.player = player;
		this.monster = monster;
			 		
		if((this.player.getHeartPoint())<=0 || (this.monster.getHeartPoint()<0)) return;
			 
		int RN = RandomNumber[a];
		
		String input_A;
		String str = question.get(RN);
		String Ans = answer.get(RN);
		String Ch1 = choice1.get(RN);
		String Ch2 = choice2.get(RN);
		String Ch3 = choice3.get(RN);
		
		System.out.println(str);	//���� ���
		System.out.printf("%s\n%s\n%s\n", Ch1, Ch2, Ch3);

		int x = 5; 

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		long startTime = System.currentTimeMillis();
		while ((System.currentTimeMillis() - startTime) < x * 1000 *d
		        && !in.ready()) {
		}

		if (in.ready()) {
		    input_A = in.readLine();
		
		if(Ans.equals(input_A)) {
			int hp = monster.getHeartPoint();
			monster.setHeartPoint(hp-1);
			System.out.println("Right answer. \nPlayer's HP : " + player.getHeartPoint());
			System.out.println("Monster's HP : " + monster.getHeartPoint());
			
		}
		else {
			int hp = player.getHeartPoint();
			player.setHeartPoint(hp-1);
			System.out.println("Wrong answer. Right answer is '" + Ans + "' \nPlayer's HP : " + player.getHeartPoint());
			System.out.println("Monster's HP : " + monster.getHeartPoint());
		}
		}else {
			System.out.println("Time out. Player's HP -1");
			int hp = player.getHeartPoint();
			player.setHeartPoint(hp-1);
			System.out.println("Player's HP : " + this.player.getHeartPoint());
			System.out.println("Monster's HP : " +this.monster.getHeartPoint());
		}
	
	
		count++;
		if(((this.player.getHeartPoint())>0 && (this.monster.getHeartPoint()>0) )&& count < 20){
			a++;
			Run_Game(player,monster,a,d);
		}
		if(this.player.getHeartPoint() == 0) {
			System.out.println("Game over. Player's HP is 0. Please input 'retry' or 'exit'.");
			
			Scanner sc = new Scanner(System.in);
			String retry = sc.nextLine();
			
			if(retry.equals("retry")) Main.RunQuizProgram(d);
			else if(retry.equals("exit")) {
				System.out.println("Exit the quiz program.");
				System.exit(0);
			}
			else if(!retry.equals("retry") && !retry.equals("exit")) {
				System.out.println("wrong input. Back to main menu.");
				Main.main(null);;
			}
			sc.close();
		} 
		
		else return;
	}
}