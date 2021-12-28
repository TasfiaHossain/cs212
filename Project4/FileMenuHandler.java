import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

//@ActionListener tells the programs what to do when it opens it up
//

public class FileMenuHandler implements ActionListener {
	
    BulbGUI jframe;
	   
    public FileMenuHandler (BulbGUI jf) { 
       
    	jframe = jf;
    	
    	TreeMap<String, Bulb> sortedTree;
    	
    } //FileMenuHandler
    
//@Actionevent will check if the open or quit button has been clicked and then return the proper function
//@if open is clicked, it will open up the text file
//@if quit is hit, the program will terminate

   
	public void actionPerformed(ActionEvent event){
		
		String  menuName;
		
		menuName = event.getActionCommand(); 
		
		if (menuName.equals("Open"))
			
			openFile(); 
		
		else if (menuName.equals("Quit"))
			
			System.exit(0); 
		
	} //actionPerformed
    
//@openFile will serve to go to the directory where the file is stored
//it will get the selected file and read through each line which will be used to be sorted and displayed
//@import all the necessary libraries that will be used here
//@we start with declaring the input file and bringing in the data and connecting it to the rest of the files - allowing readLine
//@we then declare new variables names for sorted and unsorted list to seperate what will happen to them when we print
//@we have a while loop so that when there is no null value, we will print the statement line by line
//@we then put the add method to this file so that each line can print and be added to be sorted in the lists (unsorted and sorted) 
//@then we stop the loop and under it we connect the GUI so that the panel will show and print the strings
  
	private void openFile() {
	    
	    JFileChooser chooser = new JFileChooser("./");        
		chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		chooser.showOpenDialog(null);
	    
	    String selectfile = chooser.getSelectedFile().getAbsolutePath();
	    TextFileInput textinput = new TextFileInput(selectfile);
	    String line = textinput.readLine();
	    
	    while(line!=null) {
	        
	    	int counter;
	    	String [] array = new String[4];
	        StringTokenizer tokens = new StringTokenizer(line,",");
	            counter = tokens.countTokens();
	            
	            for(int i=0; i<counter; i++) {
	            	
	            	array[i] = tokens.nextToken();
	            }
	 
	            Bulb newb = new Bulb(array[0], array[1], Integer.parseInt(array[2]), Integer.parseInt(array[3])); 
	            Project4.unsortbulbs.add(newb); 
	            Project4.sort.put(newb.getPartnumber(), newb);
	            line = textinput.readLine(); 
	            
	        }
	   
	        Project4.mainGUI.show(Project4.unsortbulbs,Project4.sort); 
	    
	} //openFile
	
}



