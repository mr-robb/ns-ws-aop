import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import nearsoft.ws.aop.domain.Workshop;
import nearsoft.ws.aop.service.WorkshopService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {nearsoft.ws.aop.config.AppConfig.class})
public class WorkshopServiceTest {

	@Autowired
	private WorkshopService workshopService;

	@Test
	public void testFind() {
		Workshop workshop = workshopService.find(1);
		assertNotNull(workshop);
	}

	@Test
	public void testSave() {
		try {
			workshopService.save(new Workshop());
		} catch (IllegalArgumentException e) {
			fail("IllegalArgumentException");
		} catch (RuntimeException e) {
			fail("RuntimeException");
		} catch (Exception e) {
			fail("Exception");
		}

	}

	@Test
	public void testUpdate() {
		try {
			workshopService.update(new Workshop());
		} catch (IllegalArgumentException e) {
			fail("IllegalArgumentException");
		} catch (RuntimeException e) {
			fail("RuntimeException");
		} catch (Exception e) {
			fail("Exception");
		}
	}

	@Test
	public void testDelete() {
		try {
			workshopService.delete(new Workshop());
		} catch (IllegalArgumentException e) {
			fail("IllegalArgumentException");
		} catch (RuntimeException e) {
			//fail("RuntimeException");
		} catch (Exception e) {
			fail("Exception");
		}
	}

}