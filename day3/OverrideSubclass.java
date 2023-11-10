package week3.day3;

public class OverrideSubclass extends JavaOverriding
{

	
	public void blueColour()
	{
		System.out.println("Blue Color Overriding Method from subclass");
		
	}

	public static void main(String[] args) 
	{
		OverrideSubclass override= new OverrideSubclass();
		override.blueColour();
		override.redColour();
				
	}
}
