package templatePattern;

public class ConcreteWallHouse extends House{
    @Override
    void decorateHouse() {
        System.out.println("Decorating Concrete Wall House");
    }

    @Override
    void paintHouse() {
        System.out.println("Painting Concrete Wall House");
    }

    @Override
    void constructDoors() {
        System.out.println("Constructing Doors for Concrete Wall House");
    }

    @Override
    void constructWindows() {
        System.out.println("Constructing windows for Concrete Wall House");

    }

    @Override
    void constructWall() {
        System.out.println("Constructing Concrete Wall for my House");

    }
}
