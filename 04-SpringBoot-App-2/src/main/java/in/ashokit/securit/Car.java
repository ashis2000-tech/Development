package in.ashokit.securit;


import org.springframework.context.annotation.Configuration;

@Configuration
public class Car {

	public Car() {
		System.out.println("Car::constructor");
	}

public Car createInstance() {
	Car c1 = new Car();
	return c1;
}
}
