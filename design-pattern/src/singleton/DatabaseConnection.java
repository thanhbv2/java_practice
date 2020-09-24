package singleton;

public class DatabaseConnection {
    private int record;
    private String name;
    private static DatabaseConnection singleObject = new DatabaseConnection("products");

    private DatabaseConnection(String n) {
        this.name = n;
        record = 0;
    }

    public int getRecord() {
        return record;
    }

    public void setRecord(int record) {
        this.record = record;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static synchronized DatabaseConnection getInstance(String n) {
        return singleObject;
    }
}
