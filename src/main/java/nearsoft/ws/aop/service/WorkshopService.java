package nearsoft.ws.aop.service;


import nearsoft.ws.aop.domain.Workshop;

public interface WorkshopService {

	Workshop find(Integer id);

	void save(Workshop Workshop);

	void update(Workshop Workshop);

	void delete(Workshop Workshop);
	
}
