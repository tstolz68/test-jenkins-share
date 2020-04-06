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

class LogHandleMessages {

    //String logLevels = "INFO,WARN,ERROR" //params.env_loglevel
    @NonCPS
    def logInfoMessage(String message, String logLevels) {
        Logger logger = Logger.getLogger(this.class.name)

        if (logLevels.contains('INFO')) {
            logger.log(LogLevel.INFO, message)
        }
    }

    @NonCPS
    def logDebugMessage(String message, String logLevels) {
        Logger logger = Logger.getLogger(this.class.name)

        if (logLevels.contains('DEBUG')) {
            logger.log(LogLevel.DEBUG, message)
        }
    }

    @NonCPS
    def logWarnMessage(String message, String logLevels) {
        Logger logger = Logger.getLogger(this.class.name)

        if (logLevels.contains('WARN')) {
            logger.log(LogLevel.WARN, message)
        }
    }
    
    @NonCPS
    def logErrorMessage(String message, String logLevels) {
        Logger logger = Logger.getLogger(this.class.name)

        if (logLevels.contains('ERROR')) {
            logger.log(LogLevel.ERROR, message)
        }
    }

}

//logProc = new LogConsoleHandler()
//logProc.logInfoMessage("This is a test!")

//return this