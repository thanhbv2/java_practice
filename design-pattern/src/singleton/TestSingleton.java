package singleton;

public class TestSingleton {
    public static void main(String[] args) {
//        DatabaseConnection databaseConnection;
//        databaseConnection = DatabaseConnection.getInstance("staging");
//
//        System.out.println(databaseConnection.getName());
//        databaseConnection = DatabaseConnection.getInstance("dev");
//        System.out.println(databaseConnection.getName());
//        databaseConnection = DatabaseConnection.getInstance("p");
//        System.out.println(databaseConnection.getName());
        DatabaseConnection database = DatabaseConnection.getInstance("products");
        Thread thread = new Thread();
        thread.start();
        System.out.println("This is database " + database.getName());

    }

    public void run() {
        DatabaseConnection databaseConnection = DatabaseConnection.getInstance("employees");
        System.out.println("This is database " + databaseConnection.getName());
    }
}
