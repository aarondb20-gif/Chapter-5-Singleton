import javax.xml.transform.Source;
import java.net.StandardSocketOptions;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        ConfigurationManager config1 = ConfigurationManager.getInstance();
        ConfigurationManager config2 = ConfigurationManager.getInstance();
        AudioSystem ad1 = new AudioSystem(ConfigurationManager.getInstance());
        GraphicsRenderer gr2 = new GraphicsRenderer(ConfigurationManager.getInstance());
        config1.setVolume(100);
        config1.setResolution(1080);
        config1.setDisplayMode("Full Screen");

        //System.out.println(ad1.volumeMessage());
        //System.out.println(gr2.renderingMessage());

        while(!exit){
            System.out.println("Type 1. to see current settings");
            System.out.println("Type 2. Change Volume");
            System.out.println("Type 3. Run System Configuration");
            System.out.println("Type 4. Exit");
            int choice = scanner.nextInt();

            switch(choice){
                case 1:
                    System.out.println(config1.getVolume());
                    System.out.println(config1.getResolution());
                    System.out.println(config1.getDisplayMode());
                    break;
                case 2:
                    System.out.println("Set Volume to: ");
                    int volume = scanner.nextInt();
                    config1.setVolume(volume);
                    break;
                case 3:
                    System.out.println(ad1.volumeMessage());
                    System.out.println(gr2.renderingMessage());
                    break;
                case 4:
                    System.out.println("Exiting Menu...");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid Option. Please try again.");


            }
        }
        scanner.close();





    }
}
