package apr.ss.assign.firstweek;

import apr.ss.assign.firstweek.dayfive.DayFiveTestSuite;
import apr.ss.assign.firstweek.dayfour.consumerproducer.ConsumerProducerTestSuite;
import apr.ss.assign.firstweek.dayfour.linetest.LineTestSuite;
import apr.ss.assign.firstweek.dayone.starpattern.StarPatternsTestSuite;
import apr.ss.assign.firstweek.weekend.WeekendTestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({StarPatternsTestSuite.class, LineTestSuite.class, ConsumerProducerTestSuite.class, DayFiveTestSuite.class, WeekendTestSuite.class})
public class FirstWeekTestSuite {
}
