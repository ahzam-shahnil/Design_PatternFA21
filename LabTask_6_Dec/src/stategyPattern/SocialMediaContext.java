package stategyPattern;

public class SocialMediaContext {
    private ISocialMediaStrategy smStrategy;

    public void setSocialMediaStrategy(ISocialMediaStrategy smStrategy) {
        this.smStrategy = smStrategy;
    }

    public void connect(String name) {
        smStrategy.connectTo(name);
    }
}
