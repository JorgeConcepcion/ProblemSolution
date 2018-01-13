package Problem;

public abstract class EntityContainer implements CountryEntities{

  private CountryEntities [] entities;
  private String name;
  private long population = 0;

  public EntityContainer(String name, CountryEntities... entities ) {
    this.name = name;
    this.entities = entities;
  }


  public String getName() {

    for (CountryEntities entity : entities) {
      name = name + ", " + entity.getName();
    }
    return name;
  }


  public long getPopulation() {
    for (CountryEntities entity : entities) {
      population += entity.getPopulation();
    }
    return population;
  }
}
