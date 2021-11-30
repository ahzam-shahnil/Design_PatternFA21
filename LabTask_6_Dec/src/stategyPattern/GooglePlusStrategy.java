package stategyPattern;

public class GooglePlusStrategy implements ISocialMediaStrategy{
    @Override
    public void connectTo(String name) {
        System.out.println("Connecting with "+name+" through Google Plus");
    }
}
