package gui;

import java.awt.Color;

import javax.swing.JPanel;

public class AppPanel extends JPanel{
	private static final long serialVersionUID= 1L;
	public AppPanel() {
		this.setRequestFocusEnabled(true);
		this.setSize(WIDTH, HEIGHT);
		this.setLayout(null);
		this.setBackground(Color.GRAY);
		
		this.add(loginPage);
		loginPage.setLocation(0,0);
		
	}
	
	private LoginPage loginPage= new LoginPage();

}
