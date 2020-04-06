#!groovy
import java.util.logging.Level
import java.util.logging.Logger
//import java.util.logging.ConsoleHandler
//import java.util.logging.FileHandler
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

def logInfoMessage(String message, String logLevels) {
    Logger logger = Logger.getLogger(this.class.name)

    if (logLevels.contains('INFO')) {
        logger.log(LogLevel.INFO, message)
    }
}

def logDebugMessage(String message, String logLevels) {
    Logger logger = Logger.getLogger(this.class.name)

    if (logLevels.contains('DEBUG')) {
        logger.log(LogLevel.DEBUG, message)
    }
}

def logWarnMessage(String message, String logLevels) {
    Logger logger = Logger.getLogger(this.class.name)

    if (logLevels.contains('WARN')) {
        logger.log(LogLevel.WARN, message)
    }
}

def logErrorMessage(String message, String logLevels) {
    Logger logger = Logger.getLogger(this.class.name)

    if (logLevels.contains('ERROR')) {
        logger.log(LogLevel.ERROR, message)
    }
}
