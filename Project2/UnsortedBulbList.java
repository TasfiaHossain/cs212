//@we start by calling the Unsorted method and making the class so it has a super class - this will make the super class be inherited from the unsorted list
//@we were instructed to put an add method where it we will add it to the end of the list by calling the append method in the super class

public class UnsortedBulbList extends BulbList {

   public UnsortedBulbList() {
	   
      super();
   
   }
   
   public void add(Bulb b) {
	   
       super.append(b); //appending the super class since thats where the information will be for unsort
   }

}