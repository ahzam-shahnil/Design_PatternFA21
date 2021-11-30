package templatePattern;

public class GlassWallHouse extends House
{
    @Override
    void decorateHouse() {
        System.out.println("Decorating Glass Wall House");
    }

    @Override
    void paintHouse() {
        System.out.println("Painting Glass Wall House");
    }

    @Override
    void constructDoors() {
        System.out.println("Constructing Doors for Glass Wall House");
    }

    @Override
    void constructWindows() {
        System.out.println("Constructing windows for Glass Wall House");

    }

    @Override
    void constructWall() {
        System.out.println("Constructing Glass Wall for my House");

    }
}
