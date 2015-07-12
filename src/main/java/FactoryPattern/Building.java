package FactoryPattern;


public class Building implements Processes {

    private BuildingType type;

    public Building(BuildingType type) {
        this.type = type;
    }

    public void build() {
        System.out.println(type.toString()+" is built");
    }

    public void destroy() {
        System.out.println(type.toString()+" is destroyed");
    }
}
