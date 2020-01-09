package creational.ServiceLocator._01;

public class Client {
	public static void main(String[] args) {
		Service service = ServiceLocator.getService("ServiceOne");
		service.execute();
		
		service = ServiceLocator.getService("ServiceTwo");
		service.execute();
		
		service = ServiceLocator.getService("ServiceOne");
		service.execute();
		
		service = ServiceLocator.getService("ServiceTwo");
		service.execute();
		
	}
}