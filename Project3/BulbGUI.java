import javax.swing.*;
import java.awt.*;

//@parm: BulbGUI extends JFrame - NumbersGUI will inherit all the properties that Jframe can do
//@parm: public BulbGUI() - setting up the JFrame and how the pop up and grid will look, making it 2x2 and printing it
//@TextArea will declare the variable myTextArea[] which will make the area where the text will be displayed
//@myContentPane will basically display the text areas
//@FileMenuHandler will connect this GUI to the file

public class BulbGUI extends JFrame {

Container myContentPane;
FileMenuHandler myFileHandler;
    
public BulbGUI() { //declare all the panel settings
    	
        setTitle("Project 3");
        setSize(700, 700);
		setLocation(150, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        myContentPane = getContentPane();
        myFileHandler = new FileMenuHandler(this);
        setVisible(true);
    }

    private void createMenu() {
    	
        MenuBar mbMain = new MenuBar();
        setMenuBar(mbMain);
        Menu MenuFile = new Menu("File");
        MenuItem mItem = new MenuItem("Open");
        mItem.addActionListener(myFileHandler);
        MenuFile.add(mItem);
        mItem = new MenuItem("Quit");
        mItem.addActionListener(myFileHandler);
        MenuFile.add(mItem);
        mbMain.add(MenuFile);
    }

    public void showGUI() { //display
    	
        createMenu();
        setVisible(true);
    }
}