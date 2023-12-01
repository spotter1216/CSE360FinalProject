package application;

import java.io.IOException;
import java.util.logging.*;

public class DataLogger {
    private Logger logger;

    public DataLogger() {
        logger = Logger.getLogger("DataLogger");
        FileHandler fh;

        try {
            // This block configures the logger with handler and formatter
            fh = new FileHandler("DataLog.log", true);
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }

    public void logSave(String data) {
        logger.info("Saved data: " + data);
    }

    public void logLoad(String data) {
        logger.info("Loaded data: " + data);
    }
}




