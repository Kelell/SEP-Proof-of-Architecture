package gui;

import java.awt.Toolkit;
import javax.swing.JFrame;

//The main frame of the app
public class AppFrame extends JFrame{
	private static final long serialVersionUID= 1L;
	
	public AppFrame(AppPanel appPanel) {
		
		//set frame to appear in the centre
		this.setLocation((int)((Toolkit.getDefaultToolkit().getScreenSize().getWidth()-WIDTH)/2),
				((int)(Toolkit.getDefaultToolkit().getScreenSize().getHeight()-HEIGHT)/2));
		
		//set the size of the frame
		this.setSize(WIDTH, HEIGHT);
		
		//Set the title of the frame
		this.setTitle("Prototype");
		
		//make the frame visible
		this.setVisible(true);
		
		//keep the frame at the size of a smartphone screen
		this.setResizable(false);
		
		this.add(appPanel);
		
		appPanel.grabFocus();
		appPanel.requestFocusInWindow();
	}
	
	public static final int WIDTH=360;
	public static final int HIGHT=640;
	
}
