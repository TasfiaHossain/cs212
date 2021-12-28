//@creating an abstract class that will have protected access to instance variables
//@declare the instance variables and declare their value, first, last and a length of 0
//@include an append method in this class to use to when we sort the list the following files, we want it to be in an order
//@we have toString method to add breaks and lines to when we print the text

public abstract class BulbList {

	protected BulbNode first = new BulbNode(null); //first node
	protected BulbNode last = first; //last node
	protected int length = 0; //number of data items on the list 
	
	
//@append: we declare the variables within the method 
//BulbNode(appNode): we declare a new node
//the rest of variables declare will create a new node and add values to the end of the list (which is why we call this append)
//as we go down the list we continuously update the field and check for the length and bounds
	
	public void append(Bulb appNode) {
		
	    BulbNode ap = new BulbNode(appNode); 
	    last.next = ap; 
	    last = ap; 
	    length++; 
	
	} //append Bulb b
	
	
//@toString(): this will serve to print the input elements into our GUI, this allows us to seperate each line so theres a break.
	
   public String toString() {
       
	   String st = "";
       BulbNode blb = first.next;
        
      while(blb != null) {
    	  
            st += blb.data.toString() + "\n";
            
            blb = blb.next;
        }

        return st;
    }

} //class BulbList
