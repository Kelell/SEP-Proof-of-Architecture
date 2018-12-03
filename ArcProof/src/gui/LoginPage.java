package gui;

import javax.swing.*;  
import java.awt.event.*;  
public class LoginPage implements ActionListener{  
    JTextField ufield,pfield;
    JLabel value,user,pword;
    JButton b;  
    LoginPage(){  
    	JFrame f= new JFrame("LoginPage");
    	JLabel user=new JLabel("Username:");    
        user.setBounds(10, 110, 110, 100);
        ufield=new JTextField();  
        ufield.setBounds(110, 150, 200, 30);
        JLabel pword=new JLabel("Password:");    
        pword.setBounds(10, 165, 110, 100); 
        pfield=new JTextField();  
        pfield.setBounds(110, 200, 200, 30);   
        value=new JLabel();  
        value.setBounds(10,300,320,40);    
        b=new JButton("Login");  
        b.setBounds(110,250,140,40);    
        b.addActionListener(this);   
        f.add(user);f.add(ufield);f.add(pword);f.add(pfield);f.add(value);f.add(b);  
        f.setSize(330,640);   
        f.setLayout(null);  
        f.setVisible(true);  
    }         
    public void actionPerformed(ActionEvent e) {  
        String s1=ufield.getText();  
        String s2=pfield.getText();   
        String result="Username: " +s1+ ", Password: "   
        +s2;
        value.setText(result);  
    } 
}
