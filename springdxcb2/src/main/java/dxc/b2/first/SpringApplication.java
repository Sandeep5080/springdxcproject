package dxc.b2.first;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


public class SpringApplication {
	@SpringBootApplication
	public class Springdxcb2Application {

		public void main(String[] args) {
			SpringApplication.run(Springdxcb2Application.class, args);
			ApplicationContext vehiclesFactory = ClassPathXmlApplicationContext("settingsconfig.xml");
			Vehicle vehicle = (Vehicle) vehiclesFactory.getBean("car");
			vehicle.drive();
			
			
		}

		private ApplicationContext ClassPathXmlApplicationContext(String string) {
			// TODO Auto-generated method stub
			return null;
		}
	}

	public static void run(Class<Springdxcb2Application> class1, String[] args) {
		// TODO Auto-generated method stub
		
	}
}


		
		
	
	
	

	





	

	