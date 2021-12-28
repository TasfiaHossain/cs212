import javax.swing.*;
import java.awt.event.*;
import java.util.TreeMap;

public class EditMenuHandler implements ActionListener {

	JFrame jframe;
	
	TreeMap<String, Bulb> sortedTree;
  
   public EditMenuHandler (JFrame jf) {
      
	   jframe = jf;
   
   }
   
 //@what happens when you click the button search
 
   public void actionPerformed(ActionEvent event)  {
      
	  String menuName;
     
	  menuName = event.getActionCommand(); 
	  
	  if (menuName.equals("Search")) 
		  
		  search(); 
	}
   
	TreeMap<String,Bulb> cp = Project4.sort;

      
//@after the search, there will be 3 options when the buttons are selected - actionevent
//@if clicked on search, the dialog message will be shown and when you type in the correct (or not) input, the following messages will show up
	
	
	public void search() {
					      
		String input = JOptionPane.showInputDialog(null," Enter a Bulb’s Part Number to search"); //having that person 
       
    
       if(cp.containsKey(input)) {
         
    	   JOptionPane.showMessageDialog(null,"This is in the treemap");
       }
      
       else {
       
           JOptionPane.showMessageDialog(null, "No matches found in the treemap");
      
       }
	       
	  
	}
	       
	
}
