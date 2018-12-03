package intermediary;

import gui.AppFrame;

public class Main {
	
public static void main(String args) {
	//Initialise the UI
	AppFrame panel=new AppFrame();
	
	//Initialise and start the main thread
	Manager start=new Manager(panel);
	start.start();
}
}
