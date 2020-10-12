package connection;
import java.sql.*;
public class Connection {

    public static void main(String []args){

        try {
            java.sql.Connection conn = DriverManager
                    .getConnection("jdbc:edgedb://10.199.198.56:5656/tutorial?option=value",
                            "edgedb", "edgedb");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
