package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		
		// 1. Ask the user if they know how to write code.
String yes = JOptionPane.showInputDialog("CAN U CODE???");
		// 2. If they say "yes", tell them they will rule the world.
if(yes.equals("yes")) {
JOptionPane.showMessageDialog(null,"U R GUD");		
	}
//3. Otherwise, tell them to sign up for classes at The League.
if(yes.equals("no")) {
JOptionPane.showMessageDialog(null,"U R BAD");		
	}
	}
	}
