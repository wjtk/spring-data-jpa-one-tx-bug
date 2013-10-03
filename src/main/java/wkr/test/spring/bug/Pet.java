package wkr.test.spring.bug;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pet {

    @Id
    @GeneratedValue
    Long id;

    public Long getId() {
        return id;
    }
}
