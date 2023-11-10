package week3.day3;

public class BasePage {
	
	/*
	 * : - Create a Java class named BasePage - 
	 * Create methods like findElement(),
	 * clickElement(), enterText() and performCommonTasks(). 
	 * - Create a subclass named LoginPage. - Override the performCommonTasks() method in the LoginPage
	 * class. - Demonstrate the concept by creating objects for both classes and
	 * calling their methods.
	 */
	
	public void findElement()
	{
	System.out.println("Find Element Method");	
	}
	public void clickElement()
	{
		System.out.println("Click Element Method");	
	}
	public void enterText()
	{
		System.out.println("Enter Text  Method");	
	}
	public void performCommonTasks()
	{
		System.out.println("Perform Common Task Method from Base Page");	
	}
}
