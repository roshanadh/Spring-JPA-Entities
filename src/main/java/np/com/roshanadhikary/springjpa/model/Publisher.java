package np.com.roshanadhikary.springjpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Publisher {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;
	private String city;
	private String country;

	public Publisher() {}

	public Publisher(String name) {
		this.name = name;
	}

	public Publisher(String name, String city, String country) {
		this.name = name;
		this.city = city;
		this.country = country;
	}
}
