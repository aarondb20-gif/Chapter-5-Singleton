public class AudioSystem{

    private final ConfigurationManager configM;

    public AudioSystem(ConfigurationManager configM){
        this.configM = configM;

    }
    public String volumeMessage(){
        return "Playing Audio. " + configM.getVolume();
    }


}
