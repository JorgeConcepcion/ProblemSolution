package Problem;

public class Country extends EntityContainer{

  public Country(String name, CountryEntities... entities) {
    super(name, entities);
  }

}