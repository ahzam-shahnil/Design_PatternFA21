package templatePattern;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Going to build Concrete WALL House");
        House house = new ConcreteWallHouse();
        house.buildHouse();
        System.out.println("Concrete Wall House constructed successfully");

        System.out.println("==========================");

        System.out.println("Going to build Glass WALL House");
        house = new GlassWallHouse();
        house.buildHouse();
        System.out.println("Glass Wall House constructed successfully");

    }
}
