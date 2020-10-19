package np.com.roshanadhikary.springjpa.repositories;

import np.com.roshanadhikary.springjpa.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
