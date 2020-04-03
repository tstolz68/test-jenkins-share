#!groovy
import java.util.logging.Level
import java.util.logging.Logger
import java.util.logging.ConsoleHandler
import java.util.logging.FileHandler
import groovy.transform.Field

//customize error levels 
class LogLevel extends Level {
    public static final Level INFO = new LogLevel("INFO", 5000);
    public static final Level DEBUG = new LogLevel("DEBUG", 6000);
    public static final Level WARN = new LogLevel("WARN", 7000);
    public static final Level ERROR = new LogLevel("ERROR", 8000);

    public LogLevel(String name, int value) {
        super(name, value)
    }
}

Logger logger = Logger.getLogger(this.class.name)

def logInfoLevel(message) {     
    Logger logger = Logger.getLogger(this.class.name)
    
    logger.log(LogLevel.INFO, message)
}

/*
class Log4jLogger {

    public void logInfoLevel(String message) {        
        logger.removeAllAppenders()
        logger.addHandler(new ConsoleHandler());
        logger.log(LogLevel.INFO, message)
    }

    //new PatternLayout("[%-p] %d %c: - %m%n")

    public void logDebugLevel(String message) {
        logger.removeAllAppenders()
        logger.addHandler(new ConsoleHandler());
        logger.log(LogLevel.DEBUG, message)
    }

    public void logWarnLevel(String message) {
        logger.removeAllAppenders()
        logger.addHandler(new ConsoleHandler());
        logger.log(LogLevel.WARN, message)
    }

    public void logErrorLevel(String message) {
        logger.removeAllAppenders()
        logger.addHandler(new ConsoleHandler());
        logger.log(LogLevel.ERROR, message)
    }

}
*/
logInfoLevel("This is an INFO message") 

