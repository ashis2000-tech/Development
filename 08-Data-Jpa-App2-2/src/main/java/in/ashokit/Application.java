package in.ashokit;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.User;
import in.ashokit.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		 UserRepository repository = context.getBean(UserRepository.class);
		
		/*User u1 = new User(101, "Ramu", "Male", 25, "India");
		repository.save(u1);*/
		
		
		/*User u2 = new User(102, "Bamu", "Male", 35, "Usa");
		User u3 = new User(103, "Mamu", "Male", 45, "Japan");
		User u4 = new User(104, "Samu", "Male", 55, "Canada");
		repository.saveAll(Arrays.asList(u2,u3,u4));*/
		
		/*Optional<User> findById = repository.findById(103);
		if(findById.isPresent()) {
			System.out.println(findById.get());
		}*/

		/*Iterable<User> allById = repository.findAllById(Arrays.asList(101,102,103));
		allById.forEach(user -> {
			System.out.println(user);
		});*/
 
	/*	Iterable<User> findAll = repository.findAll();
		findAll.forEach(user -> {
			System.out.println(user);
		});*/
		
		/*long count = repository.count();
		System.out.println("Total Records in table :: "+ count);*/
		
		/*boolean existsById = repository.existsById(101);
		System.out.println("Record Presence with id - 101 :: " + existsById);*/
		
	//	repository.deleteById(104);
		
		//repository.deleteAllById(Arrays.asList(102,103));
		
	/*	Optional<User> findById = repository.findById(101);
		if(findById.isPresent()) {
			System.out.println(findById.get());
		}*/
		
	/*	User u2 = new User(102, "Bamu", "Male", 35, "Usa");
		User u3 = new User(103, "Mamu", "Male", 45, "Japan");
		User u4 = new User(104, "Samu", "Male", 55, "Canada");
		repository.saveAll(Arrays.asList(u2,u3,u4));*/
		
	
	/*
	 * List<User> list = repository.findByCountry("India"); list.forEach(user -> {
	 * System.out.println(user); });
	 */
	  
	/*
	 * List<User> list1 = repository.findByAge(45); list1.forEach(user -> {
	 * System.out.println(user); });
	 */
	  
	/*
	 * List<User> list2 = repository.findByAgeGreaterThanEqual(30);
	 * list2.forEach(user -> { System.out.println(user); });
	 */
	/*
	 * List<User> list3 = repository.findByCountryIn(Arrays.asList("India","Usa"));
	 * list3.forEach(user -> { System.out.println(user); });
	 */
	 
	/*
	 * List<User> list4 = repository.findByCountryAndAge("Canada",55);
	 * list4.forEach(user -> { System.out.println(user); });
	 */
	  
	/*
	 * List<User> list5 =
	 * repository.findByCountryAndAgeAndGender("Japan",45,"Male");
	 * list5.forEach(user -> { System.out.println(user); });
	 */
	 
		
		List<User> users = repository.getAllUsersHql();
		users.forEach(user -> {
			System.out.println(user);
		});   
		
		System.out.println("*************************************");
		List<User> user1 =repository.getAllUsersSql();
		user1.forEach(user -> {
			System.out.println(user);
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
