package game;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class Main {
    
    
    
    public static ArrayList<Question> questions = new ArrayList<Question>();
    public static Random randomGenerator = new Random();
	public static void main(String[] argv) {
	 	
            questions.add( new Question("3-3*3+3 = ", "-3", "3",0));
            questions.add( new Question("45+2/0", "Indefiniçao", "45",0));
            questions.add( new Question("2 * (4 - 3) + 5 = ", "5", "7",1));
            questions.add( new Question("Qual o simbolo dos inteiros?", "Z", "I",0));
            questions.add( new Question("2/5 + 3/2 = ", "19/10", "5/7",0));
            questions.add( new Question("2/4 - 1/2 = ", "1/2", "0",1));
            questions.add( new Question("A reta 2x+1 é crescente ou decrescente?", "crescente", "decrescente",0));
            questions.add( new Question("Encontre o valor de X nessa expressão: 3x+5=2-x", "-4/3", "-3/4",1));

		DotsAndBoxes instance = new DotsAndBoxes();
	instance.newGame(2, 2);
	}
}
