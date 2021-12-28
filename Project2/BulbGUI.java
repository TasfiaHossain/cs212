import javax.swing.*;
import java.awt.*;

//@parm: BulbGUI extends JFrame - NumbersGUI will inherit all the properties that Jframe can do
//@parm: public BulbGUI() - setting up the JFrame and how the pop up and grid will look, making it 2x2 and printing it

public class BulbGUI extends JFrame {
Container myContentPane;

    public BulbGUI() {
    	
        setLayout(new GridLayout(1, 2));
        setTitle("Project 2");
        setSize(3000, 1000);
//		setLocation(500, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    
  //@ TextArea will declare the variable myTextArea[] which will make the area where the text will be displayed
  //@myContentPane will basically display the text areas

    public void ShowGUI(UnsortedBulbList UBL, SortedBulbList SBL){
    	
        myContentPane = getContentPane();
       
        TextArea TextArea1 = new TextArea(UBL.toString());
    	TextArea TextArea2 = new TextArea(SBL.toString());

        myContentPane.add(TextArea1);
    	myContentPane.add(TextArea2);

    }
}
