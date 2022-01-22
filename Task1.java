package e5;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Task1 implements ActionListener {

	Task1(){
		JFrame jfrm = new JFrame("Arithmetic Operations");
	    jfrm.setLayout(new FlowLayout());
	    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    jfrm.setSize(500, 500); 
	    jfrm.setVisible(true);
	    
	    JTextField jtf1 = new JTextField(15);
	    jfrm.add(jtf1);
	    
	    String operations[] = { "+","-","*" }; 
// Create a JList. 
JList<String> jlst = new JList<String>(operations); 

// Set the list selection mode to single-selection. 
jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 

// Add the list to a scroll pane. 
JScrollPane jscrlp = new JScrollPane(jlst); 

// Set the preferred size of the scroll pane. 
jscrlp.setPreferredSize(new Dimension(120, 90)); 

jfrm.add(jscrlp);

	    JTextField jtf2 = new JTextField(15);
	    jfrm.add(jtf2);
	    
	    JLabel jlab = new JLabel();  
	    jfrm.add(jlab);
	    
	    JButton jb = new JButton("Submit"); 
	    jb.addActionListener(this); 
	    jfrm.add(jb); 
	    
	    jb.addActionListener(new ActionListener() {
	 	   public void actionPerformed(ActionEvent ae) {
	 		   
	 		   int a = Integer.parseInt(jtf1.getText());
	 		  int b = Integer.parseInt(jtf2.getText());
	 		  int c;
	 		  String s=jlst.getSelectedValue();
	 		  if(s=="+")
	 			  c=a+b;
	 		  else if(s=="*")
	 			  c=a*b;
	 		  else
	 			  c=a-b;
	 		  jlab.setText(String.valueOf(c));
	 		  
	 		  
	 		   
	 		        
	 	   }});
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater( 
			      new Runnable() { 
			        public void run() { 
			          new Task1();}} ); 
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
