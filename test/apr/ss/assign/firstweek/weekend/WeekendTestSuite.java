package apr.ss.assign.firstweek.weekend;


import apr.ss.assign.firstweek.weekend.doubleint.DoubleIntTestSuite;
import apr.ss.assign.firstweek.weekend.lbdop.OperationTestSuite;
import apr.ss.assign.firstweek.weekend.nox.NoXTestSuite;
import apr.ss.assign.firstweek.weekend.ones.OnesTestSuite;
import apr.ss.assign.firstweek.weekend.recursion.RecursionTestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({DoubleIntTestSuite.class, OperationTestSuite.class, NoXTestSuite.class, RecursionTestSuite.class, OnesTestSuite.class})
public class WeekendTestSuite {
}
