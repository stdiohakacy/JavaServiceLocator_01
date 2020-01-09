package creational.ServiceLocator._01;

class InitialContext{
	public Service lookup(String name) {
		if(name.equalsIgnoreCase("ServiceOne"))
		{
			System.out.println("Creating new service one");
			return new ServiceOne();
		}
			
		else if(name.equalsIgnoreCase("ServiceTwo"))
		{
			System.out.println("Creating new service two");
			return new ServiceTwo();
		}
			
		return null;
	}
}