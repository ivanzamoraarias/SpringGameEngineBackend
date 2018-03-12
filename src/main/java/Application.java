import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.engine.service.PlayerService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationContext.xml");
		PlayerService service = applicationContext.getBean("playerService",PlayerService.class);// new PlayerServiceImpl();
		System.out.println(service.findAll().get(0).getFirstName());
		
		PlayerService service2 = applicationContext.getBean("playerServiceWithParameters",PlayerService.class);// new PlayerServiceImpl();
		System.out.println(service2.findAll().get(0).getFirstName());

	}

}
