import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class SA_Question implements Quiz {
	
	ArrayList<String> question = new ArrayList<String>(Question());
	ArrayList<String> answer = new ArrayList<String>(Answer());

	@Override
	public ArrayList<String> Question() {
		ArrayList<String> SA_Q = new ArrayList<String>();
		
		BufferedReader br = null;
		try{
			br = new BufferedReader(new FileReader("SA_question.txt"));
			
			String line = br.readLine();
			
			while(line != null){
				SA_Q.add(line);
				line = br.readLine();
			}
		
		br.close();
		
		}catch(FileNotFoundException e){
			System.out.println("SA_question.txt File is not found.");
		}catch(IOException e){
			System.out.println("SA_question.txt File I/0 error.");
		}
		
		return SA_Q;
	}

	@Override
	public ArrayList<String> Answer() {
		ArrayList<String> SA_A = new ArrayList<String>();
		
		BufferedReader br = null;
		try{
			br = new BufferedReader(new FileReader("SA_answer.txt"));
			String line = br.readLine();
			
			while(line != null){
				SA_A.add(line);
				line = br.readLine();
			}
			
			
		br.close();
		
		}catch(FileNotFoundException e){
			System.out.println("SA_answer.txt File is not found.");
		}catch(IOException e){
			System.out.println("SA_answer.txt File I/0 error.");
		}
		return SA_A;
	}
	
	
	
}
