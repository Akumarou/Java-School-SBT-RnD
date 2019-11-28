package testing;

import java.util.HashMap;

public class NeverSleepingEye implements java.lang.reflect.InvocationHandler {
    private Object obj;
    private HashMap<Object,Object> cache = new HashMap<>();

    public NeverSleepingEye(Object f1){ obj = f1; }

    public Object invoke(Object proxy, java.lang.reflect.Method method, Object[] args)throws Throwable {
                if(cache.isEmpty() || (!(cache.containsKey(obj)))) cache.put(obj,method.invoke(obj, args));
                return cache.get(obj);
    }
}