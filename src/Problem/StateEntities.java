package Problem;

public abstract class StateEntities implements CountryEntities {


  private String name;
  private long population;

  public StateEntities(String name, long population) {
    this.name = name;
    this.population = population;
  }

  @Override
  public long getPopulation() {
    return population;
  }

  @Override
  public String getName() {
    return name;
  }
}
