package creational.ServiceLocator._01;

interface Service{
	public String getName();
	public String execute();
}

class ServiceOne implements Service{

	@Override
	public String getName() {
		return "ServiceOne";
	}

	@Override
	public String execute() {
		return "Executing service one ... ";
	}
	
}

class ServiceTwo implements Service{

	@Override
	public String getName() {
		return "ServiceTwo";
	}

	@Override
	public String execute() {
		return "Executing service two ... ";
	}
	
}