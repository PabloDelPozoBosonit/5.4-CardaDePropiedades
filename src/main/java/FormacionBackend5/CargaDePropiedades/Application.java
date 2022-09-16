package FormacionBackend5.CargaDePropiedades;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Value("${greeting}")
	private String greeting;

	@Value("${my.number}")
	private String myNumber;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("El valor de greeting es " + greeting + "\nEl valor de myNumber es es " + myNumber);

	}



}
