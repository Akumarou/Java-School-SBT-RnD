package PluginCL.PluginCLImpl;

import PluginCL.Interfaces.Plugin;
import PluginCL.Interfaces.PluginManager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PluginManagerImpl extends ClassLoader implements PluginManager {
    private Map classesHash = new HashMap();
    private String pluginRootDirectory;

    public PluginManagerImpl(String pluginRootDirectory) {
        this.pluginRootDirectory = pluginRootDirectory;
    }

    public synchronized Plugin load(String pluginName, String pluginClassName) throws ClassAlreadyExistsException, ClassIsNotAPlugin, ClassNotFoundException, IllegalAccessException, InstantiationException, FileNotFoundException {
        Class result= (Class)classesHash.get(pluginClassName);
        if (result!=null) throw new ClassAlreadyExistsException("Class Already Exists");
        if(!pluginName.contains(".class")) pluginName+=".class";
        File f = new File(pluginRootDirectory + "/" + pluginName);
        try {
            byte[] classBytes= loadFileAsBytes(f);
            result= defineClass(pluginClassName, classBytes, 0, classBytes.length);
        } catch (IOException e) {
            throw new ClassNotFoundException( "Cannot load class " + pluginClassName + ": " + e);
        } catch (ClassFormatError e) {
            throw new ClassNotFoundException("Format of class file incorrect for class " + pluginClassName + " : " + e); }
        classesHash.put(pluginClassName,result);
        if (!(result.newInstance() instanceof Plugin))
            throw new ClassIsNotAPlugin("Class is not a plugin!");
        return (Plugin)result.newInstance();
    }

    private static byte[] loadFileAsBytes(File file) throws IOException {
        byte[] result = new byte[(int)file.length()];
        FileInputStream f = new FileInputStream(file);
        try {
            f.read(result,0,result.length);
        } finally {
            try {
                f.close();
            } catch (Exception e) {
                //Do nothing
            };
        }
        return result;
    }
}
