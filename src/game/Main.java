package game;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class Main {
    
    
    
    public static ArrayList<Question> questions = new ArrayList<Question>();
    public static Random randomGenerator = new Random();
	public static void main(String[] argv) {
	 	
            String fileUrl = "C:\\Users\\AGITS\\Desktop\\entrada.csv";
            BufferedReader br = null;
            String line = "";
            String separator = ";";
            try{
                br = new BufferedReader(new FileReader(fileUrl));
                br.readLine();
                while((line = br.readLine()) != null)
                {
                    String[] data = line.split(separator);
     //               System.out.println("data[1]:"+data[0]+"-data[3]:"+data[1]);
                    questions.add(new Question(data[0], data[1], data[2], Integer.parseInt(data[3])));
                }
                
            }
             catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
          catch(ArrayIndexOutOfBoundsException e){
              e.printStackTrace();
          }
            finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
            
            
            //questions.add( new Question("P1", "R11", "R21",1));
            //questions.add( new Question("P2", "R12", "R22",1));
            //questions.add( new Question("P2", "R13", "R23",1));
            //questions.add( new Question("P2", "R14", "R24",1));
		DotsAndBoxes instance = new DotsAndBoxes();
	instance.newGame(2, 2);
	}
}
