package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.*;    
import java.awt.event.*;  
public class frame {  
    public static void main(String[] args) {    
    JFrame f=new JFrame("Login Page");    
     final JLabel label = new JLabel();            
     label.setBounds(110,300,250,40);  
     final JPasswordField value = new JPasswordField();   
     value.setBounds(110, 200, 200, 30);     
     JLabel user=new JLabel("Username:");    
     user.setBounds(10, 110, 110, 100);    
        JLabel pword=new JLabel("Password:");    
        pword.setBounds(10, 165, 110, 100);   
        JButton b = new JButton("Login");  
        b.setBounds(110,250,140,40);   
        final JTextField text = new JTextField();  
        text.setBounds(110, 150, 200, 30);     
                f.add(value); f.add(user); f.add(label); f.add(pword); f.add(b); f.add(text);  
                f.setSize(360,640);    
                f.setLayout(null);    
                f.setVisible(true);     
                b.addActionListener(new ActionListener() {  
                public void actionPerformed(ActionEvent e) {       
                   String data = "Username: " + text.getText();  
                   data += ", Password: "   
                   + new String(value.getPassword());   
                   label.setText(data);          
                }  
             });   
}  
}  