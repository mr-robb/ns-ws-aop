package nearsoft.ws.aop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nearsoft.ws.aop.domain.Workshop;
import nearsoft.ws.aop.repository.WorkshopRepository;
import nearsoft.ws.aop.service.WorkshopService;

@Service
public class WorkshopServiceImpl implements WorkshopService {

	@Autowired
	private WorkshopRepository workshopRepository;
	
	public Workshop find(Integer id) {
		return workshopRepository.find(id);
	}

	public void save(Workshop Workshop) {
		workshopRepository.save(Workshop);
	}

	public void update(Workshop Workshop) {
		workshopRepository.update(Workshop);
	}

	public void delete(Workshop Workshop) {
		workshopRepository.delete(Workshop);
	}

}
