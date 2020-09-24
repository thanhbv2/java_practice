package factory;

public class FirstFactory {
    protected String type;

    public FirstFactory(String t) {
        this.type = t;
    }

    public Connection createConnection() {
        if (type.equals("Oracle")) {
            return new OracleConnection();
        } else if (type.equals("SQL server")) {
            return new SqlServerConnection();
        } else {
            return new MySqlConnection();
        }

    }

}
