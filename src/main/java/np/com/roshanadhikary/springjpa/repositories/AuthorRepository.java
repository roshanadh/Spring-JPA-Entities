package np.com.roshanadhikary.springjpa.repositories;

import np.com.roshanadhikary.springjpa.model.Author;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
