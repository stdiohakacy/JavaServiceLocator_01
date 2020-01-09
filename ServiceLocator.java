package creational.ServiceLocator._01;

public class ServiceLocator{
	private static Cache cache;
	static {
		cache = new Cache();
	}
	
	public static Service getService(String name) {
		Service cacheService = cache.getService(name);
		
		if(cacheService != null)
			return cacheService;
		InitialContext context = new InitialContext();
		Service service = context.lookup(name);
		cache.addService(service);
		return service;
	}
}