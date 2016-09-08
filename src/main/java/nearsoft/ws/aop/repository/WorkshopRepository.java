package nearsoft.ws.aop.repository;


import nearsoft.ws.aop.domain.Workshop;

public interface WorkshopRepository {

	Workshop find(Integer id);

	void save(Workshop Workshop);

	void update(Workshop Workshop);

	void delete(Workshop Workshop);

}
