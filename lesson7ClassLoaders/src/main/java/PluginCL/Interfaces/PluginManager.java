package PluginCL.Interfaces;

import PluginCL.PluginCLImpl.ClassAlreadyExistsException;
import PluginCL.PluginCLImpl.ClassIsNotAPlugin;

import java.io.FileNotFoundException;

public interface PluginManager {
    public Plugin load(String pluginName, String pluginClassName) throws ClassAlreadyExistsException, ClassIsNotAPlugin, ClassNotFoundException, IllegalAccessException, InstantiationException, FileNotFoundException;
}
