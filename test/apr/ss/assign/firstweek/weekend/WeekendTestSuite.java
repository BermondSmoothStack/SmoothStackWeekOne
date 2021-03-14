package apr.ss.assign.firstweek.weekend;


import apr.ss.assign.firstweek.weekend.doubleint.DoubleIntTestSuite;
import apr.ss.assign.firstweek.weekend.lbdop.OperationTestSuite;
import apr.ss.assign.firstweek.weekend.nox.NoXTestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({DoubleIntTestSuite.class, OperationTestSuite.class, NoXTestSuite.class})
public class WeekendTestSuite {
}
