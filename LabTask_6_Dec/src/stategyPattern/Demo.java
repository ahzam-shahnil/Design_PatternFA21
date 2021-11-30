package stategyPattern;

public class Demo {
    public static void main(String[] args) {
        SocialMediaContext context = new SocialMediaContext();
        //Setting Facebook Strategy
        context.setSocialMediaStrategy(new FacebookStrategy());
        context.connect("Lokesh");
        System.out.println("========================");

        //Setting GooglePLus Strategy
        context.setSocialMediaStrategy(new GooglePlusStrategy());
        context.connect("ALi");
        System.out.println("========================");
        //Setting Twitter Strategy
        context.setSocialMediaStrategy(new TwitterStrategy());
        context.connect("ALi");
        System.out.println("========================");
        //Setting Orkut Strategy
        context.setSocialMediaStrategy(new OrkutStrategy());
        context.connect("Ali");
        System.out.println("========================");
    }
}
