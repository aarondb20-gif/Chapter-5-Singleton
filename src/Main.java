import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConfigurationManager config1 = ConfigurationManager.getInstance();
        ConfigurationManager config2 = ConfigurationManager.getInstance();
        AudioSystem ad1 = new AudioSystem(ConfigurationManager.getInstance());
        GraphicsRenderer gr2 = new GraphicsRenderer(ConfigurationManager.getInstance());
        config1.setVolume(100);
        config1.setResolution(1080);
        config1.setDisplayMode("Full Screen");
        System.out.println(ad1.volumeMessage());
        System.out.println(gr2.renderingMessage());





    }
}
