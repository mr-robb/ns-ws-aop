package nearsoft.ws.aop.aspect;


import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import nearsoft.ws.aop.domain.Workshop;

@Aspect
@Component
public class WorkshopRepositoryAspect {

	private static final Logger LOGGER = Logger.getLogger(WorkshopRepositoryAspect.class);
	
	// Antes de la ejecucion de cualquier clase JdbcWorkshopRepository que no tenga valor
	// de retorno y que este dentro de cualquier paquete, para todos los metodos con cualquier
	// tipo de parametros
	// *.. significa que puede haber mas de un paquete antes del nombre de la clase
	/**
	 * Method PATTERN
	 * - [Modifiers] ReturnType [classType] MethodName ([Arguments]) [throws Exception Type]
	 */
	/**
	 * If the advice throws an exception the tarjet object will never be called
	 */
	
	@Before("execution(void *..JdbcWorkshopRepository.*(..))") // Pointcut
	public void logVoidMethods(JoinPoint jp){ // Advice
		String name = jp.getSignature().getName();
		Object args = jp.getArgs()[0]; // En la posicion cero vienen los parametros
		LOGGER.info("@Before method:" + name + " about to change to "+args + " on " + jp.getTarget());
	}
	
	@AfterReturning(pointcut="execution(nearsoft.ws.aop.domain.Workshop *..JdbcWorkshopRepository.find*(*))",returning="workshop")
	public void audit(JoinPoint jp, Workshop workshop){
		String name = jp.getSignature().getName();
		Object args = jp.getArgs()[0]; // En la posicion cero vienen los parametros
		LOGGER.info("@AfterReturning method:" + name + " with arguments "+args + " return " + workshop.toString());
	}
	
	/**
	 * Will not stop the exception propagation It can throw different exception
	 * 
	 */
	@AfterThrowing(pointcut = "execution(* *..JdbcWorkshopRepository.*(..))" , throwing = "e")
	public void report(JoinPoint jp, RuntimeException e){
		LOGGER.info("@AfterThrowing Exception in repository:" + jp + e);
	}
	
	/**
	 * Called regardless of whether an exception has been throw by the target or not
	 */
	@After("execution(void *..JdbcWorkshopRepository.delete(*))")
	public void trackDelete(){

		LOGGER.info("@After A delete has been attempted...");
	}
	

	@Around("execution(void *..JdbcWorkshopRepository.update(*))")
	public Object someAdvice(ProceedingJoinPoint pjp) throws Throwable{
		LOGGER.info("============================================================");
		LOGGER.info("@Around Before Update");
		Object obj = pjp.proceed();
		LOGGER.info("@Around After Update");
		LOGGER.info("============================================================");
		return obj;
	}

}
