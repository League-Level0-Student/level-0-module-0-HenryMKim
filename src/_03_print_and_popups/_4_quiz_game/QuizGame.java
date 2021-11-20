package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER

				// 2.  Ask the user a question 
		String yes = JOptionPane.showInputDialog("ARE YOU GOOD AT BEING A SOCCER MOM???");
				// 3.  Use an if statement to check if their answer is correct
		if(yes.equals("yaaa")) {
			JOptionPane.showMessageDialog(null,"U R GUD");
				// 4.  if the user's answer was correct, add one to their score 
		score += 1;
		}
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		String life = JOptionPane.showInputDialog("ARE YOU GOOD AT LIFE???");
		
		if(life.equals("yaaa")) { 
		// After all the questions have been asked, tell the user their final score 
			JOptionPane.showMessageDialog(null,"U R GUD-ISH");
			score += 1;
	}
		
		
		
		JOptionPane.showMessageDialog(null,"UR SCORE IS..." + score);
		
		
		

		
}
}