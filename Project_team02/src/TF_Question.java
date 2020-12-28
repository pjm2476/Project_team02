import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class TF_Question implements Quiz {
	
	ArrayList<String> question = new ArrayList<String>(Question());
	ArrayList<String> answer = new ArrayList<String>(Answer());

	@Override
	public ArrayList<String> Question() {
		ArrayList<String> TF_Q = new ArrayList<String>();
		
		BufferedReader br = null;
		try{
			br = new BufferedReader(new FileReader("TF_question.txt"));
			
			String line = br.readLine();
			
			while(line != null){
				TF_Q.add(line);
				line = br.readLine();
			}
		
		br.close();
		
		}catch(FileNotFoundException e){
			System.out.println("TF_question.txt File is not found.");
		}catch(IOException e){
			System.out.println("TF_question.txt File I/0 error.");
		}
		
		return TF_Q;
	}

	@Override
	public ArrayList<String> Answer() {
		ArrayList<String> TF_A = new ArrayList<String>();
		
		BufferedReader br = null;
		try{
			br = new BufferedReader(new FileReader("TF_answer.txt"));
			String line = br.readLine();
			
			while(line != null){
				TF_A.add(line);
				line = br.readLine();
			}
			
			
		br.close();
		
		}catch(FileNotFoundException e){
			System.out.println("TF_answer.txt File is not found.");
		}catch(IOException e){
			System.out.println("TF_answer.txt File I/0 error.");
		}
		return TF_A;
	}
	
	
	
}
