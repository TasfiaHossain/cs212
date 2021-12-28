import java.io.File;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;


//@import all the necessary libraries that will be used here
//@we start with declaring the input file and bringing in the data and connecting it to the rest of the files - allowing readLine
//@we then declare new variables names for sorted and unsorted list to seperate what will happen to them when we print
//@we have a while loop so that when there is no null value, we will print the statement line by line
//@we then put the add method to this file so that each line can print and be added to be sorted in the lists (unsorted and sorted) - it will also add a new node to the list
//@then we stop the loop and under it we connect the GUI so that the panel will show and print the strings


public class Project2 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		TextFileInput myInput = new TextFileInput("InputData.txt"); //will connect program to the input data and read
	    String line = myInput.readLine();
	    	
		SortedBulbList mySB = new SortedBulbList();
	    UnsortedBulbList myUB = new UnsortedBulbList();
	    
	    while(line!=null){
	  
	    	String [] array = new String[4];
	        StringTokenizer tokens = new StringTokenizer(line,",");
	    	
	        int count = 0;
	        count = tokens.countTokens();
	        for(int i=0; i<count; i++){ array[i] = tokens.nextToken();
	        }
	        
	        Bulb newBulb = new Bulb(array[0], array[1], Integer.parseInt(array[2]), Integer.parseInt(array[3]));
	        
	        myUB.add(newBulb);
	        mySB.add(newBulb);
	        line = myInput.readLine();
	        
	    } //while loop

	    BulbGUI myGUI = new BulbGUI();
	    myGUI.ShowGUI(myUB, mySB);
	    
	} //main

} //class project2