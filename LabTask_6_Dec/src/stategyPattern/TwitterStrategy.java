package stategyPattern;

public class TwitterStrategy implements ISocialMediaStrategy{
    @Override
    public void connectTo(String name) {
        System.out.println("Connecting with "+name+" through Twitter");
    }
}
