import java.awt.Container;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.util.Map.Entry;

//@parm: BulbGUI extends JFrame - NumbersGUI will inherit all the properties that Jframe can do
//@parm: public BulbGUI() - setting up the JFrame and how the pop up and grid will look, making it 2x2 and printing it
//@create content pane and append text so that the unsorted will show up on one side and sorted list will show up on the other

public class BulbGUI extends JFrame  {
	
	Container myContentPane;
	FileMenuHandler myFileHandler;
    public JTextArea unsortedText;
    public JTextArea sortedText;

    public BulbGUI() {

        createFileMenu();
        unsortedText = new JTextArea();
        sortedText = new JTextArea();
        JScrollPane unsortedScroll = new JScrollPane(unsortedText);
        JScrollPane sortedScroll = new JScrollPane(sortedText);
        add(unsortedScroll);
        add(sortedScroll);

        setTitle("Project 4");
        setLayout(new GridLayout(1, 2));
        setSize(1000, 600);
        setLocation(100, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    private void createFileMenu() {
      
    	JMenuItem item;
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");

        FileMenuHandler fmh = new FileMenuHandler(this);
        EditMenuHandler emh = new EditMenuHandler(this);

        item = new JMenuItem("Open"); 
        item.addActionListener(fmh);
        fileMenu.add(item);

        fileMenu.addSeparator(); 

        item = new JMenuItem("Quit"); 
        item.addActionListener(fmh);
        fileMenu.add(item);

        item = new JMenuItem("Search"); 
        item.addActionListener(emh);
        editMenu.add(item);

        setJMenuBar(menuBar);
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

    }
    
//@in this treemap - we allow for the array list to be sorted
//@we set it so in the GUI we have the sorted and unsorted values show up 
//go through each string and append it to the sorted textbox

    public void show(ArrayList<Bulb> us, TreeMap<String, Bulb> sm) {
        
    	unsortedText.setText("");
        sortedText.setText("");
        
        for(int i=0; i<us.size(); i++) {
        	
            unsortedText.append(us.get(i).toString());
            
        }

        Set<Entry<String, Bulb>> set = sm.entrySet();
        Iterator<Entry<String, Bulb>> i = set.iterator();

        while (i.hasNext()) {
        	
            Entry<String, Bulb> me = i.next();
            sortedText.append(me.getValue().toString());
        
        }
        
    }
}