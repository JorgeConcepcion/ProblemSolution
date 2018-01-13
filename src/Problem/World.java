package Problem;

public class World {
  private Country[] entities;

  public World(Country... entities) {
    this.entities = entities;

  }

  public long getPopulation() {
    //TODO: Implement
    long worldPopulation = 0;

    for (Country country : entities) {
      worldPopulation += country.getPopulation();
    }

    return worldPopulation;
  }

  public void printWorld() {
    //TODO: Implement

    String worldEntitiesNames = "";

    for (Country country : entities) {
      worldEntitiesNames = (country == entities[0]? worldEntitiesNames : (worldEntitiesNames +", ") )+ country.getName();
    }


    System.out.println("\n" + worldEntitiesNames);

  }
}