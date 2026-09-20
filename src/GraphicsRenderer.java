public class GraphicsRenderer {
    private final ConfigurationManager configM;

    public GraphicsRenderer( ConfigurationManager configM){
        this.configM = configM;


    }

    public String renderingMessage(){
        return "Rendering. " + configM.getResolution() + " " + configM.getDisplayMode();
    }

}
