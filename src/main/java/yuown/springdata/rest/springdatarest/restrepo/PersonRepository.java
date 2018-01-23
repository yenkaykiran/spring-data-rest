package yuown.springdata.rest.springdatarest.restrepo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import yuown.springdata.rest.springdatarest.PersonNoLastName;
import yuown.springdata.rest.springdatarest.entities.Person;

@RepositoryRestResource(collectionResourceRel = "people", path = "people", excerptProjection = PersonNoLastName.class)
public interface PersonRepository extends PagingAndSortingRepository<Person, Integer> {

	List<Person> findByLastName(@Param("name") String name);

}
