package stategyPattern;

public class FacebookStrategy implements ISocialMediaStrategy{
    @Override
    public void connectTo(String name) {
        System.out.println("Connecting with "+name+" through Facebook");
    }
}
