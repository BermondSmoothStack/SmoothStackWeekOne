package apr.ss.assign.firstweek.dayfive;

import apr.ss.assign.firstweek.dayfive.arrayfilter.ArrayFilterTestSuite;
import apr.ss.assign.firstweek.dayfive.arrayjoin.ArrayJoinTestSuite;
import apr.ss.assign.firstweek.dayfive.basiclambdas.BasicLambdasTestSuite;
import apr.ss.assign.firstweek.dayfive.dateapi.DateAPIHelperTestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({BasicLambdasTestSuite.class, ArrayFilterTestSuite.class, ArrayJoinTestSuite.class, DateAPIHelperTestSuite.class})
public class DayFiveTestSuite {
}
