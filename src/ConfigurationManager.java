public class ConfigurationManager {

    // setup Singleton Instance
    private static ConfigurationManager instance;

    //Constructor is closed
    private ConfigurationManager() {
        System.out.println("Configuration Initialized: ");
    }

    public static ConfigurationManager getInstance(){
        if(instance == null){
            instance = new ConfigurationManager();
        }
        return instance;

    }

    //Initialize variables, getters, and setters
    private int volume;
    private int resolution;
    private String displayMode;

    public int getVolume(){
        return  volume;
    }

    public String getResolution(){
        return "Resolution: " + resolution;
    }
    public String getDisplayMode() {
        return "Display Mode: " + displayMode;
    }



    //Put values in setters instead of Constructor
    public void setVolume(int volume){
        this.volume = volume;

    }

    public void setResolution(int resolution){
        this.resolution = resolution;


    }

    public void setDisplayMode(String displayMode){
        this.displayMode = displayMode;
    }
}
