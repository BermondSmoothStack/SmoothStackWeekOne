package apr.ss.assign.firstweek;

import apr.ss.assign.firstweek.consumerproducer.ConsumerProducerTestSuite;
import apr.ss.assign.firstweek.linetest.LineTestSuite;
import apr.ss.assign.firstweek.starpattern.StarPatternsTestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({StarPatternsTestSuite.class, LineTestSuite.class, ConsumerProducerTestSuite.class})
public class FirstWeekTestSuite {
}
