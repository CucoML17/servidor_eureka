package carlos.mejia.restaurantefondavuno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServidorRestauranteFondaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServidorRestauranteFondaApplication.class, args);
	}

}
