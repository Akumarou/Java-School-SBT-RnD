import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BeanUtils {
    /**
     * Scans object "from" for all getters. If object "to"
     * contains correspondent setter, it will invoke it
     * to set property value for "to" which equals to the property
     * of "from".
     * <p/>
     * The type in setter should be compatible to the value returned
     * by getter (if not, no invocation performed).
     * Compatible means that parameter type in setter should
     * be the same or be superclass of the return type of the getter.
     * <p/>
     * The method takes care only about public methods.
     *
     * @param to   Object which properties will be set.
     * @param from Object which properties will be used to get values.
     */
    public static void assign(Object to, Object from) {
        for (Method methodFrom : from.getClass().getMethods()) {
            for (Method methodTo : to.getClass().getMethods()) {
                if((!methodFrom.getName().equals("getClass")) &&
                        (methodFrom.getName().contains("get")) &&
                        (methodTo.getName().substring(3)).equals((methodFrom.getName().substring(3)))&&
                        (methodFrom.getReturnType().equals((methodTo.getParameterTypes())[0]))){
                    try {
                        methodTo.invoke(to,methodFrom.invoke(from));
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        }
    }
}

