package factory;

public class SqlServerConnection extends Connection {
    public SqlServerConnection() {
    }

    public String description() {
        return "SQL server";
    }
}
