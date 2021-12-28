
//@declare the instance variables and the get - set methods so each class can store the data used in all the files
//we will use it to override the string and equals method as well as calling the if statment in the sorted list

public class Bulb {
	
	//instance variables 
	
	String manufacturer;
    String partnumber;
    int wattage;
    int lumens;
    
    //get and set method
    
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
        
    	return manufacturer + "," + partnumber + "," + wattage + "," + lumens;
   
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
    	
    
    
   private Bulb Bulb(Object o) {
	// TODO Auto-generated method stub
	return null;
}

   
//rename the instance variables 

public Bulb(String mani, String part, int wat, int lum) {
        
    	manufacturer = mani;
        partnumber = part;
        wattage = wat;
        lumens = lum;
    
    }
    
    
} // class Bulb

