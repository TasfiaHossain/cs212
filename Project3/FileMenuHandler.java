import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FileMenuHandler implements ActionListener {
  
	BulbGUI jframe;
   
	public FileMenuHandler (BulbGUI jf) {
       
		jframe = jf;
    }
    
//@allows program to have the option of opening and quitting when display box is present
//@upon command if the action of open is clicked, then the file will open
//we apply try and catch at this point because we want generate an exception (try) and it will execute it if an exception occurs (catch)
//in this case its if you open the file and it terminates the program if you hit quick
    
    
    public void actionPerformed(ActionEvent event) {
       
    	String menuName = event.getActionCommand();
       
       if (menuName.equals("Open")) {
          
    	   try {
			
    		   openFile();
		} 
    	   
    	   catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
       }
       else if (menuName.equals("Quit")) {
           
    	   System.exit(0); 
       }
    }
    
//@param: JFileChooser will idenitify the giles within a directory 
//in this case we are trying to show the files within a directory and display them
//once clicked on we will be able to readSource (otherwise known as reading the file)

	private void openFile() throws IOException{
       
    	JFileChooser JFchoose = new JFileChooser("./");
        int status = JFchoose.showOpenDialog(null);
        if(status == JFileChooser.APPROVE_OPTION)
           
        	readSource(JFchoose.getSelectedFile());
    }

        
//@param: readSource will read the file line by line and end up printing it on the textarea display
//@param: getAbsolutePath() is used so we can find the pathname to the file within the directory
//@parm: arraylist will be created for the bulb data and then scanner will read it line by line
//@we add text area and content pane for the display of the data
//@we start the while loop to read each line and then we try for an exception
//@when there are wattage > 5 we add a line to the array and then append and create a break for the next line to print - if not it will print the exception statement


    @SuppressWarnings("resource")
	private void readSource(File fC) throws FileNotFoundException {
       	String findFileName = fC.getAbsolutePath();
        ArrayList<Bulb> BulbList = new ArrayList<Bulb>();
        TextArea textArea1 = new TextArea();
        jframe.getContentPane().add(textArea1);
        Scanner chooseFile = null;    
        chooseFile = new Scanner(fC);
        
        while (chooseFile.hasNextLine()) {
            
        	String line = chooseFile.nextLine();

            try {
            	
            	BulbList.add(new Bulb(line)); 
                textArea1.append(line + "\n");
            }
            
            catch (IllegalBulbException e) {
            
                System.out.println(e.getMessage());
            }
            
            catch (NumberFormatException e) {
            
                System.out.println("Invalid number format (" + line + ")");
            }
        }

        jframe.setVisible(true);
    }
}