//@creating BulbNode which has protected access to data and next - instance variables 
//@these will be used when we sort our input list

public class BulbNode {
	
	protected Bulb data;
	protected BulbNode next; 
	
	public BulbNode(Bulb b) {
		
		data = b;
		next = null;
		
	} // BulbNode constructor 

} //class BulbNode
