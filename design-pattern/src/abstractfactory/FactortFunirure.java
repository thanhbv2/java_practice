package abstractfactory;

public class FactortFunirure {

  AbstractFurnitureFactory getFactory(MaterialType type){
    switch (type){
      case PLASTIC:
        return new FactoryPlastic();
      case WOOD:
        return new FactoryWood();
      default:
        return  null;
    }
  }
}
