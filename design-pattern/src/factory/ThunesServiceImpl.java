package factory;

public class ThunesServiceImpl implements ServiceProvider {

  @Override
  public String get() {
    return "THUNES";
  }
}
