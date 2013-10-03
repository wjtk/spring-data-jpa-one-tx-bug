package wkr.test.spring.bug;

import org.springframework.test.context.ActiveProfiles;


/*
    According to reference (http://docs.spring.io/spring-data/jpa/docs/1.4.1.RELEASE/reference/html/jpa.repositories.html#jpa.namespace-attributes)
    property "transaction-manager-ref" in element <jpa:repositories> can be omitted when there is
    only one PlatformTransactionManager in spring context.

    This is not true!

    look at "spring-context.xml" to see profiles configuration.
 */
@ActiveProfiles("txManager")
public class TxManagerTest extends BaseTest {
}
