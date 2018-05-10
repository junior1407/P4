package game;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class Main {
    
    
    
    public static ArrayList<Question> questions = new ArrayList<Question>();
    public static Random randomGenerator = new Random();
	public static void main(String[] argv) {
	 	
            questions.add( new Question("P1", "R11", "R21",1));
            questions.add( new Question("P2", "R12", "R22",1));
            questions.add( new Question("P2", "R13", "R23",1));
            questions.add( new Question("P2", "R14", "R24",1));
		DotsAndBoxes instance = new DotsAndBoxes();
	instance.newGame(2, 2);
	}
}
