@Grab(group='log4j', module='log4j', version='1.2.17') 
import org.apache.log4j.*

@groovy.util.logging.Log4j
class Log4jLogger {

    static void logInfoLevel(String message) {
        log.level = Level.INFO
        log.removeAllAppenders()
        log.addAppender(new ConsoleAppender(new PatternLayout("[%-p] %d %c: - %m%n")))
        log.info message
    }

    static def logDebugLevel(String message) {
        log.level = Level.DEBUG
        log.removeAllAppenders()
        log.addAppender(new ConsoleAppender(new PatternLayout("[%-p] %d %c: - %m%n")))
        log.debug message
    }

    static def logWarnLevel(String message) {
        log.level = Level.WARN
        log.removeAllAppenders()
        log.addAppender(new ConsoleAppender(new PatternLayout("[%-p] %d %c: - %m%n")))
        log.warn message
    }

    static def logErrorLevel(String message) {
        log.level = Level.ERROR
        log.removeAllAppenders()
        log.addAppender(new ConsoleAppender(new PatternLayout("[%-p] %d %c: - %m%n")))
        log.error message
    }

}

