package in.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
