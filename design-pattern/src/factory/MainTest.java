package factory;

public class MainTest {
    public static void main(String[] args) {
        FirstFactory firstFactory;
        firstFactory = new FirstFactory("Oracle");
        Connection connection = firstFactory.createConnection();
        System.out.println(connection.description());

        ServiceProvider service = FactoryService.getService(PartnerCode.valueOf("WUN"));
        service.get();

    }
}
