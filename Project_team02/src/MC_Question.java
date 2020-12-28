import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class MC_Question implements Quiz{
	
	 ArrayList<String> question = new ArrayList<String>(Question());
	 ArrayList<String> answer = new ArrayList<String>(Answer());
	    
	 ArrayList<String> choice1 = new ArrayList<String>(Choice1());
	 ArrayList<String> choice2 = new ArrayList<String>(Choice2());
	 ArrayList<String> choice3 = new ArrayList<String>(Choice3());
	 
	
	@Override
	public ArrayList<String> Question() {
		
		ArrayList<String> MC_quiz = new ArrayList<String>();
		
			  BufferedReader br = null;;
		     		        
		      try {
		    	  br =  new BufferedReader(new FileReader("MC_question.txt"));
					String line;			
					
					while ((line = br.readLine()) != null) {	
						MC_quiz.add(line);
					}br.close();
					
					
		      }catch(FileNotFoundException e){
					System.out.println("MC_question.txt File is not found.");
				}catch(IOException e){
					System.out.println("MC_question.txt File I/0 error.");
				}
				
		        
		 
		return MC_quiz;
	}
	
	@Override
	public ArrayList<String> Answer() {
		
		ArrayList<String> MC_quiz = new ArrayList<String>();
		
		  BufferedReader br = null;;
	     		        
	      try {
	    	  br =  new BufferedReader(new FileReader("MC_answer.txt"));
				String line;
				
				while ((line = br.readLine()) != null) {	
					MC_quiz.add(line);
				}br.close();
				
				
	      } catch(FileNotFoundException e){
				System.out.println("MC_answer.txt File is not found.");
			}catch(IOException e){
				System.out.println("MC_answer.txt File I/0 error.");
			}
			
	        
	 
	return MC_quiz;
	}
	
	
	public ArrayList<String> Choice1() {
		
		ArrayList<String> MC_quiz = new ArrayList<String>();
		
		  BufferedReader br = null;;
	     		        
	      try {
	    	  br =  new BufferedReader(new FileReader("MC_choice1.txt"));
				String line;
				
				while ((line = br.readLine()) != null) {	
					MC_quiz.add(line);
				}br.close();
				
				
	      } catch(FileNotFoundException e){
				System.out.println("MC_choice1.txt File is not found.");
			}catch(IOException e){
				System.out.println("MC_choice1.txt File I/0 error.");
			}
			
	        
	 
	return MC_quiz;
	}
	
public ArrayList<String> Choice2() {
		
		ArrayList<String> MC_quiz = new ArrayList<String>();
		
		  BufferedReader br = null;;
	     		        
	      try {
	    	  br =  new BufferedReader(new FileReader("MC_choice2.txt"));
				String line;
				
				while ((line = br.readLine()) != null) {	
					MC_quiz.add(line);
				}br.close();
				
				
	      } catch(FileNotFoundException e){
				System.out.println("MC_choice2.txt File is not found.");
			}catch(IOException e){
				System.out.println("MC_choice2.txt File I/0 error.");
			}
	        
	 
	return MC_quiz;
	}
	
public ArrayList<String> Choice3() {
	
	ArrayList<String> MC_quiz = new ArrayList<String>();
	
	  BufferedReader br = null;;
     		        
      try {
    	  br =  new BufferedReader(new FileReader("MC_choice3.txt"));
			String line;
			
			while ((line = br.readLine()) != null) {	
				MC_quiz.add(line);
			}br.close();
			
			
      } catch(FileNotFoundException e){
			System.out.println("MC_choice3.txt File is not found.");
		}catch(IOException e){
			System.out.println("MC_choice3.txt File I/0 error.");
		}
		
        
 
return MC_quiz;
}
}