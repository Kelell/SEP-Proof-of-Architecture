package gui;
import javax.swing.*;  
import java.awt.event.*;  
public class HomePage implements ActionListener{  
 
    JButton forum,tracker;  
    JLabel user;
    public HomePage(){  
    	JFrame f= new JFrame("HomePage");  
    	user=new JLabel("Welcome: Test");    
        user.setBounds(100, 110, 110, 100);
        forum=new JButton("Forum");  
        forum.setBounds(50,250,200,60);
        tracker=new JButton("Tracker");  
        tracker.setBounds(50,350,200,60);  
        forum.addActionListener(this);
        tracker.addActionListener(this); 
        f.add(user);f.add(forum);f.add(tracker);  
        f.setSize(330,640);  
        f.setLayout(null);  
        f.setVisible(true);  
    }         
    public void actionPerformed(ActionEvent e) {  
 
        if(e.getSource()==forum){  
        	new ForumPage();;
        }else if(e.getSource()==tracker){ 
        	new TrackerPage();  
        }  
    } 
}