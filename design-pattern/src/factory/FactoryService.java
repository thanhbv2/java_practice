package factory;

public class FactoryService {

  public static ServiceProvider getService(PartnerCode code) {
    switch (code){
      case WUN:
        return new WUNServiceImpl();
      case THUNES:
        return new ThunesServiceImpl();
    }
    return null;
  }
}
