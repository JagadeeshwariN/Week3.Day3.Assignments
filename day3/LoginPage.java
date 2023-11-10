package week3.day3;

public class LoginPage extends BasePage{

	public void performCommonTasks()
	{
		System.out.println("Perform Common Task Method from Subclass LoginPage ");	
	}
	
	public static void main(String[] args) {
		LoginPage object= new LoginPage();
		object.findElement();
		object.clickElement();
		object.enterText();
		object.performCommonTasks();

	}

}
