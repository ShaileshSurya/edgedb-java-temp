package edgedb.client;

import java.sql.*;
import java.sql.Connection;
import java.util.Properties;
import java.util.logging.Logger;

// TODO Rename to edgeDriver
public class Driver implements java.sql.Driver{

    @Override
    public Connection connect(String url, Properties info) throws SQLException {
        if (url == null){

        }
        return null;
    }

    @Override
    public boolean acceptsURL(String url) throws SQLException {
        return false;
    }

    @Override
    public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
        return new DriverPropertyInfo[0];
    }

    @Override
    public int getMajorVersion() {
        return 0;
    }

    @Override
    public int getMinorVersion() {
        return 0;
    }

    @Override
    public boolean jdbcCompliant() {
        return false;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }
}
