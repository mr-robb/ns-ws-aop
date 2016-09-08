package nearsoft.ws.aop.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import nearsoft.ws.aop.repository.WorkshopRepository;
import nearsoft.ws.aop.service.WorkshopService;
import nearsoft.ws.aop.service.impl.WorkshopServiceImpl;

@Configuration
@EnableAspectJAutoProxy // <aop:aspec-autoproxy/>
@ComponentScan(basePackages= {"nearsoft.ws.aop"})
public class AppConfig {

//	@Bean
//	public WorkshopRepository quotationRepository() {
//		return new JdbcWorkshopRepository();
//	}
//
//	@Bean(name="quotationService")
//	public WorkshopService quotationService() {
//		return new WorkshopServiceImpl(quotationRepository());
//	}
//
//	@Bean // es un tipo de bean post processor
//	public QuotationRepositoryAspect quotationRepositoryAspect(){
//		return new QuotationRepositoryAspect();
//	}
}
