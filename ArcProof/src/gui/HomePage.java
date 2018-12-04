package gui;
import javax.swing.*;  
import java.awt.event.*;  
public class HomePage implements ActionListener{  
 
    JButton forum,tracker;  
    public HomePage(){  
        JFrame f= new JFrame();     
        forum=new JButton("Forum");  
        forum.setBounds(50,200,50,50);  
        tracker=new JButton("-");  
        tracker.setBounds(120,200,50,50);  
        forum.addActionListener(this);  
        forum.addActionListener(this);  
        f.add(forum);f.add(tracker);  
        f.setSize(330,640);  
        f.setLayout(null);  
        f.setVisible(true);  
    }         
    public void actionPerformed(ActionEvent e) {  
 
        if(e.getSource()==forum){  
        	new HomePage(); 
        }else if(e.getSource()==tracker){  
        	new HomePage();  
        }  
    } 
}