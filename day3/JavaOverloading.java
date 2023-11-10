package week3.day3;

public class JavaOverloading {

	public static void main(String[] args) {
		
		JavaOverloading obj= new JavaOverloading();
		obj.reportStep("Display Message", "Online Status");
		obj.reportStep("Message", "Offline", false);

	}

	public void reportStep(String msg, String status)
	{
	
		System.out.println("ReportStep with 2 Arguments:"  + msg +"  "+ status);
	
		
	}
	
	public void reportStep(String msg, String status,boolean snap)
	{
		System.out.println("\nReportStep with 3 Arguments:"  + msg + " "+ status+ " "+snap);
	}
	
	
	
}
