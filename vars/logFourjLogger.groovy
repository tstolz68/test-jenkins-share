//
    @Grab(group='org.apache.logging.log4j', module='log4j-api', version='2.0.2')
//)
import org.apache.logging.log4j.Logger
import org.apache.logging.log4j.LogManager
import groovy.transform.Field

def logInfo(String logMessage) {

    logger.info(logMessage)

}

def logWarn(String logMessage) {

    logger.warn(logMessage)

}
