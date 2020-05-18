package ie.tudublin;

import C18336951.*;


public class Main
{	

	public void startUI()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new AssignmentVisuals());		
	}

	public static void main(String[] args)
	{
		Main main = new Main();

		main.startUI();			
	}
}