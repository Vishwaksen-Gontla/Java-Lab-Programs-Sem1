package e5;

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener; 
   
class DialogExample {  
    private static JDialog d;  
    DialogExample() {  
        JFrame f= new JFrame();  
        d = new JDialog(f , "Dialog Example", true);  
        d.setLayout( new FlowLayout() );  
        JButton b = new JButton ("OK");  
        b.addActionListener ( new ActionListener()  
        {  
            public void actionPerformed( ActionEvent e )  
            {  
                DialogExample.d.setVisible(false);  
            }  
        });  
        d.add( new JLabel ("Click button to continue."));  
        d.add(b);   
        d.setSize(300,300);    
        d.setVisible(true);  
    }
}
    
public class SwingDemo implements ActionListener { 
  JLabel jlab; 
  JTextField jtf1;
  public SwingDemo() { 
 
    // Set up the JFrame.
    JFrame jfrm = new JFrame("JRadioButtonDemo");
    jfrm.setLayout(new FlowLayout());
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jfrm.setSize(500, 500); 
 // Display the frame.
    jfrm.setVisible(true);
 
    // Create radio buttons and add them to content pane. 
    JRadioButton b1 = new JRadioButton("A"); 
    b1.addActionListener(this); 
    jfrm.add(b1); 
 
    JRadioButton b2 = new JRadioButton("B"); 
    b2.addActionListener(this); 
    jfrm.add(b2); 
 
    JRadioButton b3 = new JRadioButton("C"); 
    b3.addActionListener(this); 
    jfrm.add(b3); 
       
    // Define a button group. 
    ButtonGroup bg = new ButtonGroup(); 
    bg.add(b1); 
    bg.add(b2); 
    bg.add(b3); 
    

   
// Create the label and add it to the content pane. 
   jlab = new JLabel("Select languages"); 
   jfrm.add(jlab);
    
// Add check boxes to the content pane. 
   JCheckBox cb1 = new JCheckBox("C");  
   cb1.addActionListener(this); 
   jfrm.add(cb1); 

   JCheckBox cb2 = new JCheckBox("C++"); 
   cb2.addActionListener(this);  
   jfrm.add(cb2); 

   
 
   // Create text files and add to content pane. 
   jtf1 = new JTextField(15);
   jfrm.add(jtf1);
   
   b1.addActionListener(new ActionListener() {
	   public void actionPerformed(ActionEvent ae) { 		   
		    jtf1.setText(ae.getActionCommand());}});
    
   b2.addActionListener(new ActionListener() {
	   public void actionPerformed(ActionEvent ae) { 		   
		    jtf1.setText(ae.getActionCommand());}});
   
   b3.addActionListener(new ActionListener() {
	   public void actionPerformed(ActionEvent ae) { 		   
		    jtf1.setText(ae.getActionCommand());}});
   
   cb1.addActionListener(new ActionListener() {
	   public void actionPerformed(ActionEvent ae) { 		   
		    jtf1.setText(ae.getActionCommand());}});
   
   cb2.addActionListener(new ActionListener() {
	   public void actionPerformed(ActionEvent ae) { 		   
		    jtf1.setText(ae.getActionCommand());}});
   
   // Create an array of cities. 
   String Cities[] = { "New York", "Chicago", "Houston", 
                       "Denver", "Los Angeles", "Seattle", 
                       "London", "Paris", "New Delhi", 
                       "Hong Kong", "Tokyo", "Sydney" }; 
   // Create a JList. 
   JList<String> jlst = new JList<String>(Cities); 

   // Set the list selection mode to single-selection. 
   jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 

   // Add the list to a scroll pane. 
   JScrollPane jscrlp = new JScrollPane(jlst); 

   // Set the preferred size of the scroll pane. 
   jscrlp.setPreferredSize(new Dimension(120, 90)); 

   // Make a label that displays the selection. 
   JLabel jlab = new JLabel("Choose a City"); 

   jfrm.add(jscrlp); 
   jfrm.add(jlab);
   
   // Add selection listener for the list. 
   jlst.addListSelectionListener(new ListSelectionListener() {  
     public void valueChanged(ListSelectionEvent le) {  
       // Get the index of the changed item. 
    	 jtf1.setText(jlst.getSelectedValue()); 
     }});

   String timepieces[] = { "Hourglass", "Analog", "Digital", "Stopwatch" }; 
// Instantiate a combo box and add it to the content pane. 
   JComboBox<String> jcb = new JComboBox<String>(timepieces); 
   jfrm.add(jcb); 

   // Create a label and add it to the content pane. 
    

   // Handle selections. 
   jcb.addActionListener(new ActionListener() { 
     public void actionPerformed(ActionEvent ae) { 
      jtf1.setText((String) jcb.getSelectedItem()); 
     
     } 
   }); 
   
   JButton jb = new JButton("Clear"); 
   jb.addActionListener(this); 
   jfrm.add(jb); 
   
   jb.addActionListener(new ActionListener() {
	   public void actionPerformed(ActionEvent ae) { 		   
		    jtf1.setText("");
		        
	   }});
   
   JButton jb1 = new JButton("Submit"); 
   jb1.addActionListener(this); 
   jfrm.add(jb1);
   
   jb1.addActionListener(new ActionListener() {
	   public void actionPerformed(ActionEvent ae) { 		   
		   new DialogExample();}});
   
  } 
 
 

  /*Handle item events for the check boxes. 
  public void itemStateChanged(ItemEvent ie) { 
    //JCheckBox cb = (JCheckBox)ie.getItem(); 
	  JRadioButton cb = (JRadioButton)ie.getItem(); 
 
    if(cb.isSelected()) 
    	jtf1.setText(cb.getText() + " is selected"); 
    else 
    	jtf1.setText(cb.getText() + " is cleared"); 
  } */
  
  public static void main(String[] args) { 

    // Create the frame on the event dispatching thread.
    SwingUtilities.invokeLater( 
      new Runnable() { 
        public void run() { 
          new SwingDemo();}} ); 
  }

  


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
