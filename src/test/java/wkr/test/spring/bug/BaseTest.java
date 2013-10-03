package wkr.test.spring.bug;

import org.fest.assertions.api.Assertions;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.transaction.PlatformTransactionManager;
import org.testng.annotations.Test;

import java.util.Map;

import static org.fest.assertions.api.Assertions.*;


@ContextConfiguration("/spring-context.xml")
public abstract class BaseTest extends AbstractTestNGSpringContextTests{

    @Test
    public void should_be_exactly_one_transaction_manager() {
        Map<String,PlatformTransactionManager> beans = applicationContext.getBeansOfType(PlatformTransactionManager.class);

        assertThat(beans.size()).isEqualTo(1);
    }

    @Test void should_save_entity_through_data_jpa_repository() {
        PetDao dao = applicationContext.getBean(PetDao.class);
        Pet p = new Pet();
        dao.save(p);
        p = dao.findOne(p.getId());

        assertThat(p).isNotNull();

    }
}
