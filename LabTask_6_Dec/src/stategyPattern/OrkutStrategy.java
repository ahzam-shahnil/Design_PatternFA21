package stategyPattern;

public class OrkutStrategy implements ISocialMediaStrategy{
    @Override
    public void connectTo(String name) {
        System.out.println("Connecting with "+name+" through Orkut [ not possible though 😐 ]");
    }
}
