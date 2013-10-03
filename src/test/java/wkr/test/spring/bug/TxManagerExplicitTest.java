package wkr.test.spring.bug;

import org.springframework.test.context.ActiveProfiles;


@ActiveProfiles("explicit_txManager")
public class TxManagerExplicitTest extends BaseTest {
}
