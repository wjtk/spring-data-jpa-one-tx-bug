package wkr.test.spring.bug;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface PetDao extends CrudRepository<Pet, Long> {
}
