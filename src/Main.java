public class Main {
    public static void main(String[] args) {
        ConfigurationManager config1 = ConfigurationManager.getInstance();
        ConfigurationManager config2 = ConfigurationManager.getInstance();

        config2.setResolution(720);

        System.out.println(config1.getVolume());
        System.out.println(config1.getResolution());
        System.out.println(config1.getDisplayMode());
        System.out.println("Config 2:");
        System.out.println(config2.getResolution());
    }
}
