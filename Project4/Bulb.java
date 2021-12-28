import java.util.StringTokenizer;

//@declare the instance variables and the get - set methods so each class can store the data used in all the files
//we will use it to override the string and equals method as well as calling the if statment in the sorted list

public class Bulb {
	
    String manufacturer; //instance variables
    String partnumber;
    int wattage;
    int lumens;
    
    public String getManufacturer() {
        
    	return manufacturer;
    }
    
    public void setManufacturer(String manufacturer) {
       
    	this.manufacturer = manufacturer;
    }
    
    public String getPartnumber() {
       
    	return partnumber;
    }
    
    public void setPartnumber(String partnumber) {
     
    	this.partnumber = partnumber;
    }
    
    public int getWattage() {
        
    	return wattage;
    }
    
    public void setWattage(int wattage)  {
        
    	this.wattage = wattage;
    }
    
    public int getLumens() {
      
    	return lumens;
    }
    
    public void setLumens(int lumens) {
    	
        this.lumens = lumens;
    }
  
    //override the string method
    
    public String toString() {
       
    	return manufacturer + "," + partnumber + "," + wattage + "," + lumens + "\n";
        
    }
    
  //@we override the equals method here to make sure that two objects will not end up having the same data
  //@same for the toString method, we override that so the value of the object can be returned to string 
    
      //override the equals method
    
    public boolean equals(Object o) {
        
   	 if (this == o) 
   		 
   		 return true;

        if((o!= null) && o.getClass().equals(o.getClass())) {
       	 
       	 Bulb bb = (Bulb(o));            
            
            if(manufacturer == bb.manufacturer) {
               
           	 return true;
            }
            
            if(partnumber == bb.partnumber) {
           	 
           	 return true;
            }
            
            if(wattage == bb.wattage) {
           	 
           	 return true;
            }
            
            if(wattage == bb.lumens) {
           	 
           	 return true;
            }

            return false;
        }
        
        return false;
    }
   	
    
 //@gets the value of the wattage of each item in list and throws an exception when the wattage is less than 5
 //@rename the instance variables 

    private Bulb Bulb(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	public Bulb(String manufacturer, String partnumber, int wattage, int lumens) {
     
    	super(); //add a super class

        this.manufacturer = manufacturer;
        this.partnumber = partnumber;
        this.wattage = wattage;
        this.lumens = lumens;
    }
    
//@used to print out the read in file line by line, and split it using the StringTokenizer
//@will continue to read and then we rename the values of the instance variables so they can be parse and return an integer    

	public Bulb(String line) {
		// TODO Auto-generated constructor stub
		
		int counter = 0;
        String[] array = new String[4];
        StringTokenizer tokens = new StringTokenizer(line, ",");
        
        while(tokens.hasMoreTokens()){ 
        
        	array[counter] = tokens.nextToken();
            counter++;
        }

        manufacturer = array[0];
        partnumber = array[1];
        wattage = Integer.parseInt(array[2]);
        lumens = Integer.parseInt(array[3]);
      
  
}
}