package apr.ss.assign.firstweek.weekend;
import java.math.BigDecimal;
import java.sql.*;


public class SampleSingleton {

    private static SampleSingleton instance = null;

    private SampleSingleton() {
    }

    public static SampleSingleton getInstance() {
        if (null == instance) {
            synchronized (SampleSingleton.class) {
                if ( null == instance)
                    instance = new SampleSingleton();
            }
        }
        return instance;
    }

    public static void databaseQuery(BigDecimal input) throws SQLException {
        Connection conn = DriverManager.getConnection("url of database");
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select id from table");
        BigDecimal x = BigDecimal.ZERO;
        while(rs.next()) {
            x = input.multiply(BigDecimal.valueOf(rs.getInt(1)));
        }
    }
}
