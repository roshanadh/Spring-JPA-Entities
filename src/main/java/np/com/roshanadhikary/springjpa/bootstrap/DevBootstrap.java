package np.com.roshanadhikary.springjpa.bootstrap;

import np.com.roshanadhikary.springjpa.model.Author;
import np.com.roshanadhikary.springjpa.model.Book;
import np.com.roshanadhikary.springjpa.model.Publisher;
import np.com.roshanadhikary.springjpa.repositories.AuthorRepository;
import np.com.roshanadhikary.springjpa.repositories.BookRepository;
import np.com.roshanadhikary.springjpa.repositories.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

	private AuthorRepository authorRepository;
	private BookRepository bookRepository;
	private PublisherRepository publisherRepository;

	@Autowired
	public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
		initData();
	}

	private void initData() {
		Author eric = new Author("Eric", "Evans");
		Publisher harperCollins = new Publisher("Harper Collins", "New York", "USA");
		Book ddd = new Book("Domain Driven Design", "1234", harperCollins);
		eric.getBooks().add(ddd);
		ddd.getAuthors().add(eric);
		authorRepository.save(eric);
		publisherRepository.save(harperCollins);
		bookRepository.save(ddd);

		Author rod = new Author("Rod", "Johnson");
		Publisher wroxPress = new Publisher("Wrox Press", "Birmingham", "UK");
		Book noEJB = new Book("J2EE Development without EJB", "23444", wroxPress);
		rod.getBooks().add(noEJB);
		noEJB.getAuthors().add(rod);
		authorRepository.save(rod);
		publisherRepository.save(wroxPress);
		bookRepository.save(noEJB);
	}
}
