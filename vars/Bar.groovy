import java.util.logging.Level
import java.util.logging.Logger
import groovy.transform.Field

//@Field logLevels = "INFO,ERROR" //params.env_loglevel

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

class Bar{

    String logLevels = "INFO,WARN,ERROR"

    def logInfoMessage(message){
        Logger logger = Logger.getLogger(this.class.name)
        
        if (this.logLevels.contains('INFO')) {
            logger.log(LogLevel.INFO, message)
        }
    }
    
     def logDebugMessage(message){
        Logger logger = Logger.getLogger(this.class.name)
        
        if (this.logLevels.contains('DEBUG')) {
            logger.log(LogLevel.DEBUG, message)
        }
    }
    
     def logWarnMessage(message){
        Logger logger = Logger.getLogger(this.class.name)
        
        if (this.logLevels.contains('WARN')) {
            logger.log(LogLevel.WARN, message)
        }
    }
    
     def logErrorMessage(message){
        Logger logger = Logger.getLogger(this.class.name)
        
        if (this.logLevels.contains('ERROR')) {
            logger.log(LogLevel.ERROR, message)
        }
    }
    
 
   
}