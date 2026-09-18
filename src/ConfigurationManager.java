public class ConfigurationManager {

    // setup Singleton Instance
    private static final ConfigurationManager uniqueInstance = new ConfigurationManager();

    //Constructor is closed
    private ConfigurationManager() {}

    public static ConfigurationManager getInstance(){

        return uniqueInstance;
    }

    //Initialize variables, getters, and setters
    private int volume;
    private int resolution;
    private String displayMode;


    public String getVolume(){
        return "Volume: " + volume;
    }
    public String getResolution(){
        return "Resolution: " + resolution;
    }
    public String getDisplayMode(){
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
