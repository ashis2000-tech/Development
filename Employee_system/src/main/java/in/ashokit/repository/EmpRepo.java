package in.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.Employee;
@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer> {

}
