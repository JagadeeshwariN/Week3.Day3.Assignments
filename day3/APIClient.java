package week3.day3;

public class APIClient {

	
	public void sendRequest(String endpoint)
	{
		System.out.println("Given String : "+ endpoint);
	}

	public void sendRequest(String endpoint, String requestBody , String requestStatus)
	{
		System.out.println("Given String : "+ endpoint + " " + requestBody + " " + requestStatus);
	}

public static void main(String[] args) {
	
	APIClient object= new APIClient();
	object.sendRequest("EndPoint");
	object.sendRequest("EndPoint", "RequestBody", "RequestStatus");
}
}

