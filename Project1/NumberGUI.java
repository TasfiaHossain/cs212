
import javax.swing.*;
import java.awt.*;

//@parm: NumberGUI extends JFrame - NumbersGUI will inherit all the properties that Jframe can do
//@parm: public NumbersGUI() - setting up the JFrame and how the pop up and grid will look 
public class NumbersGUI extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Component display;

	public NumbersGUI() { //layout the popup
		
		setLayout(new GridLayout(3,3));
		setSize(1000, 500);
		setLocation(200, 100);
		setTitle("Project1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		JScrollPane scroll = new JScrollPane(display);
		
	}
	
//@ printarray will actually make the text areas and content panels in the pop up
//@ TextArea will declare the variable myTextArea[] which will make the area where the numbers will be displayed
public static void printarray(NumbersGUI GUI) {
	Container myContentPane = GUI.getContentPane();
	TextArea myTextArea = new TextArea();
	
	TextArea myTextArea1 = new TextArea();
	TextArea myTextArea2 = new TextArea();
	TextArea myTextArea3 = new TextArea();
	TextArea myTextArea4 = new TextArea();
	TextArea myTextArea5 = new TextArea();
	TextArea myTextArea6 = new TextArea();
	TextArea myTextArea7 = new TextArea();
	TextArea myTextArea8 = new TextArea();
	TextArea myTextArea9 = new TextArea();
	
	myContentPane.add(myTextArea1);
	myContentPane.add(myTextArea2);
	myContentPane.add(myTextArea3);
	myContentPane.add(myTextArea4);
	myContentPane.add(myTextArea5);
	myContentPane.add(myTextArea6);
	myContentPane.add(myTextArea7);
	myContentPane.add(myTextArea8);
	myContentPane.add(myTextArea9);
	
//@ the for loop will go through the first 1-100 numbers and for each if statement, find the numbers that are divisible by each other. 
//@ .append - If the remainder of the number you divisible by is equal to 0, then it will add to the sequence in the appropriate box
	
	for(int i=1;i<100;i++) {
		
		if(i%2 == 0)
			myTextArea1.append(i+"\n"); //\n will break the numbers so they go to the next line 
		
		if(i%3 == 0)
			myTextArea2.append(i+"\n");
		
		if(i%4 == 0)
			myTextArea3.append(i+"\n");
		
		if(i%5 == 0)
			myTextArea4.append(i+"\n");
		
		if(i%6 == 0)
			myTextArea5.append(i+"\n");
		
		if(i%7 == 0)
			myTextArea6.append(i+"\n");
		
		if(i%8 == 0)
			myTextArea7.append(i+"\n");
		
		if(i%9 == 0)
			myTextArea8.append(i+"\n");
		
		if(i%10 == 0)
			myTextArea9.append(i+"\n");
	 }
	
	GUI.setVisible(true); //make the frame appear
	
  }
}


