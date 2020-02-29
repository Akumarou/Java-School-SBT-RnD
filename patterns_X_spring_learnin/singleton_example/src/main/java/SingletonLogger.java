import java.util.Date;

public class SingletonLogger {
    private static int counterOfInstances = 0;
    private static volatile SingletonLogger singletonLogger = null;
    private static StringBuilder log = new StringBuilder();

    public static SingletonLogger getInstance() {
        if (singletonLogger == null) {
            synchronized (SingletonLogger.class) {
                if (singletonLogger == null)
                    singletonLogger = new SingletonLogger();
            }
        }
        counterOfInstances++;
        return singletonLogger;
    }

    private SingletonLogger() {
        log.append("This is log class...\n\n");
    }

    public void addLog(String logInfo) {
        Date date = new Date();
        String result = "[" + date.toString() + "] " + logInfo + "\n";
        log.append(result);
    }

    public String showLogs() {
        return log.toString();
    }

    public int getCounter() {
        return counterOfInstances;
    }
}
