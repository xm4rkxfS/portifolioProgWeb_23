package unopar.progweb.portifolio;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class PortifolioApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortifolioApplication.class, args);
	}

}
