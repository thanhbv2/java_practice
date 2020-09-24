import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {

  public static void main(String[] args) {
    String url = "jdbc:postgresql://localhost:5432/partner_management?currentSchema=orbitmaster";
    String username = "username";
    String password = "PAssw0rd";
    try {
      Connection connection = DriverManager.getConnection(url, username, password);
      System.out.println("connection success");
    } catch (Exception e) {
    }
  }

}
