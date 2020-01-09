package creational.ServiceLocator._01;

import java.util.ArrayList;
import java.util.List;

class Cache {
	List<Service> listService;

	public Cache() {
		listService = new ArrayList<Service>();
	}

	public Service getService(String name) {
		for (Service service : listService) {
			if (service.getName().equalsIgnoreCase(name)) {
				System.out.println("Loading service from cache");
				return service;
			}
		}
		return null;
	}

	public void addService(Service newService) {
		boolean exists = false;
		for (Service service : listService) {

			if (service.getName().equalsIgnoreCase(newService.getName())) {
				System.out.println("Service exists from cache");
				exists = true;
			}

		}

		if (!exists) {
			System.out.println("adding service from cache");
			listService.add(newService);
		}

	}
}