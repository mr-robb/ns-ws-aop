package nearsoft.ws.aop.repository.impl;


import org.springframework.stereotype.Component;

import nearsoft.ws.aop.domain.Workshop;
import nearsoft.ws.aop.repository.WorkshopRepository;

@Component
public class JdbcWorkshopRepository implements WorkshopRepository {

	public Workshop find(Integer id) {
		return new Workshop();
	}

	public void save(Workshop Workshop) {
		// throw new IllegalArgumentException();
	}

	public void update(Workshop Workshop) {
		// TODO Auto-generated method stub
	}

	public void delete(Workshop Workshop) {
		throw new RuntimeException();
	}

}
