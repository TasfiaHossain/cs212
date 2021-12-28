import java.util.ArrayList;
import java.util.TreeMap;

//@make a new BulbGui to display data from the list
//@declare the treemaps and declare the arraylist to use in the other files

public class Project4 {
    
    public static TreeMap<String,Bulb> sort = new TreeMap<String,Bulb>(); 
    public static ArrayList<Bulb> unsortbulbs = new ArrayList<Bulb>(); 
	static BulbGUI mainGUI; 
   
    public static void main(String[] args) {   
        
       mainGUI = new BulbGUI(); 
      
    }
}
