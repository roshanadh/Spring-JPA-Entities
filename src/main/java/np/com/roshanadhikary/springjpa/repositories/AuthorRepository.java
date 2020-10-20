package np.com.roshanadhikary.springjpa.repositories;

import np.com.roshanadhikary.springjpa.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
