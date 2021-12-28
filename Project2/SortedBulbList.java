//@ we start with calling the sorted class and putting a super class within it
//@this  super class will be used to call the constructor 
//@add: use the add method to add a new node to the sorted list when we print
//@we declare the instance variables which will be used when we call the variables for the sort method
//@while: declare the while loop so when we dont have a null value we deploy the if statement that will ask if there are more nodes in the wattage get method, then to break;
//@we end the if statement by making the nodes equal and increasing the length as we go, later returning those values so they can print

public class SortedBulbList extends BulbList {
    
	public SortedBulbList() {
    
        super();
    }

    public void add(Bulb b) {
    
        BulbNode a = new BulbNode(b);
        BulbNode B1 = first;
        BulbNode B2 = this.first.next;
        
       
        while(B2 != null) {
        
            if(b.getWattage() < B2.data.getWattage()) {
            
                B1.next = a; //assigns value to the node after the first node
            	a.next = B2; // after a, this points B2 to the node
                length++; //increase the value
                return; //return the elements 
            }
            
            B1 = B1.next;
            B2 = B1.next;
            
            
        }//while loop

        append(a);
        return;

    } //add bulb
    
 //@append: we add a method for the append because above, we are appending the sorted elements onto the display
 //@this method is needed so nodes can point to the right place and be sorted
 //@declared the protected values again in case it didnt work from bulblist
    
    
    //from bulb list
    protected BulbNode last = first; //last node
	protected int length = 0; //number of data items on the list 

	public void append(BulbNode a) {
	
	last.next = a;
	last = a;
	length++;
	
	} //append bulbnode
	
    
} //class sortedbulblist
