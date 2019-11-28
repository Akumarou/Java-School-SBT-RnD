import java.io.*;

public class Test
{
    public static void main(String[] argv) throws Exception
    {
        ClassLoader loader;
        for (;;) {
            loader= new DynamicClassOverloader( new String[] {"./test"});
            Class clazz = Class.forName("TestModule", true, loader);
            Object object = clazz.newInstance();
            System.out.println(object);
            new BufferedReader(new InputStreamReader(System.in)).readLine();
        }
    }
}
