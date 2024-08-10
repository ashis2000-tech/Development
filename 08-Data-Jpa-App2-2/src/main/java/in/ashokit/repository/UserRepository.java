package in.ashokit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.User;

public interface UserRepository extends CrudRepository<User,Integer>{
 
	public List<User> findByCountry(String cname);
	public List<User> findByAge(Integer age);
	public List<User> findByAgeGreaterThanEqual(Integer age);
	public List<User> findByCountryIn(List<String> countries);
	public List<User> findByCountryAndAge(String cname, Integer age);
	public List<User> findByCountryAndAgeAndGender(String cname, Integer age, String gender);
	@Query(value = "From User")
	public List<User> getAllUsersHql();

	@Query(value = "select * from user_master", nativeQuery = true)
	public List<User> getAllUsersSql();

}
