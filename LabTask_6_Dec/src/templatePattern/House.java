package templatePattern;

public abstract class House {
    final void buildHouse() {
        constructBase();
        constructRoof();
        constructWall();
        constructWindows();
        constructDoors();
        paintHouse();
        decorateHouse();

    }

    abstract void decorateHouse();

    abstract void paintHouse();

    abstract void constructDoors();

    abstract void constructWindows();

    abstract void constructWall();

    final void constructRoof() {
        System.out.println("Roof has been constructed");
    }

    final void constructBase() {
        System.out.println("Base has been constructed");
    }
}
