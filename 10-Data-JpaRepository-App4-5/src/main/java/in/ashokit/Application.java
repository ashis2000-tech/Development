package in.ashokit;


import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import in.ashokit.entity.User;
import in.ashokit.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		UserRepository repository =	context.getBean(UserRepository.class);
		
		User u5 = new User(105,"Sanu","Male",82,"Cuttack");
		User u6 = new User(106,"Kunu","Male",92,"Zimbwae");
		User u7 = new User(107,"Banu","Male",62,"Lambia");
		User u8 = new User(108,"Tanu","Male",32,"Cuttack");
		User u9 = new User(109,"Vanu","Male",42,"Canada");
	/*	repository.saveAll(Arrays.asList(u5,u6,u7,u8,u9));
		//List<User> users = repository.findAll();
		List<User> users = repository.findAll(Sort.by("Age").ascending());
		List<User> users = repository.findAll(Sort.by("Age").descending());
		List<User> users = repository.findAll(Sort.by("Username","Age").ascending());
		List<User> users = repository.findAll(Sort.by("Username","Age","Country").ascending());
		users.forEach(user-> {
			System.out.println(user);
		});*/
		
		
	/*int pageSize =2;
	int pageNo= 2;
	PageRequest pagerequest = PageRequest.of(pageNo, pageSize);
	Page<User> pagedata = 	 repository.findAll(pagerequest);
		int totalPages = pagedata.getTotalPages();
		System.out.println("Total Pages::"+ totalPages);
		List<User> users = pagedata.getContent();
		users.forEach(user-> {
			System.out.println(user);
		});*/
		
		User entity = new User();
		entity.setGender("Male");
		entity.setCountry("Cuttack");
		entity.setAge(32);
		Example<User> example = Example.of(entity);
		List<User> users = repository.findAll(example);
		users.forEach(user-> {
			System.out.println(user);
		});
	}

}
