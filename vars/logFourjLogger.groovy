import org.apache.logging.log4j.Logger
import org.apache.logging.log4j.LogManager
import groovy.transform.Field

def logInfo(String logMessage) {

    logger.info(logMessage)

}

def logWarn(String logMessage) {

    logger.warn(logMessage)

}
