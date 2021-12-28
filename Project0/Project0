
import javax.swing.JOptionPane;

public class Project0 {
	public static void main(String[] args){
		
//@param: declare variables that will start the e and E count at 0
//@param: declare variables that will hold the value of e and E and count it in the method below 
		
		String inputWord; //declare the variables to ask user input
		int bige = 0;
		int littlee = 0;
		
		char bE = 'E'; //assign this value to be uppercase E
		char le = 'e'; //assign this value to be lowercase e

//@check if the user input is in the array or not 
//@param: while loop: user can continuously do input functions without having to run the program after one execution 
//@param inputWord: asks for user input and stores it
//@param charAt: counts the character at the specific index
//@return: return if the user input is in the array and show the number of letters E and e appears, and how many times. 
//@return: use loops to check through string value to count the upper and lowercase letters, store it, and then return that in the dialog box, then reset the variable count to 0 so it doesnt continue the count from last time


		while(true){ 
			inputWord = JOptionPane.showInputDialog(null, "Please enter a sentence: "); //ask for user input
			if (inputWord.equalsIgnoreCase("STOP")){ //when user types in STOP
				System.exit(0); //terminate the program
			}
			for (int i = 0; i < inputWord.length(); i++){ //check for uppercase & lowercase e
				if (inputWord.charAt(i) == bE){ //if user input has uppercase E
					bige++; //count those number of uppercase E's
				}
				else if (inputWord.charAt(i) == le){ //if user input has lowercase e
					littlee++;  //count those number of lowercase's
				}
			}
			
			//dosplay both solutions 
			JOptionPane.showMessageDialog(null, "Number of lowercase e's " + littlee + "\n" + "Number of uppercase E's " + bige);
			
			//reset the while loop - so it doesnt store the numbers from before
			bige = 0;
			littlee = 0;
			
		}
	}
}





