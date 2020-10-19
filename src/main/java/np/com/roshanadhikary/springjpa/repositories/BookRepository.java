package np.com.roshanadhikary.springjpa.repositories;

import np.com.roshanadhikary.springjpa.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
