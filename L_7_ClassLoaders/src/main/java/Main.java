import PluginCL.Interfaces.PluginManager;
import PluginCL.PluginCLImpl.PluginManagerImpl;

public class Main {
    private static final String PLUGIN_PATH = "lesson7/src/main/java/pluginRootDirectory";

    public static void main(String[] args){
        PluginManager pManager = new PluginManagerImpl(PLUGIN_PATH);
        try {
            pManager.load("HelloPlugin","HelloPlugin").doUsefull();
            pManager.load("GoodByePlugin", "GoodByePlugin").doUsefull();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
