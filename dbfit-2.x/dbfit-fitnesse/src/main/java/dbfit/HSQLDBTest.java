package dbfit;

import org.dbfit.hsqldb.HSQLDBEnvironment;
import org.dbfit.core.DBEnvironment;

/**
 * Provides support for testing HSQLDB databases.
 *
 * @author J�r�me Mirc, jerome.mirc@gmail.com
 */

public class HSQLDBTest extends DatabaseTest {

    public HSQLDBTest() {
        super(new HSQLDBEnvironment());
    }

    public HSQLDBTest(DBEnvironment environment) {
        super(environment);
    }
}
