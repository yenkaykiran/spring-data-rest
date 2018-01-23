package yuown.springdata.rest.springdatarest;

import org.springframework.data.rest.core.config.Projection;

import yuown.springdata.rest.springdatarest.entities.Person;

@Projection(name = "noLastNames", types = { Person.class })
public interface PersonNoLastName {

	String getFirstName();
	
}
