@Grab(group='org.apache.logging.log4j', module='log4j', version='2.13.1')
import org.apache.log4j.*

@Log4j
class LogLevels{

  def logInfo(String logMessage) {

      logger.info(logMessage)

  }

  def logWarn(String logMessage) {

      logger.warn(logMessage)

  }

}

def logWrapper = new LogLevels()
logWrapper.logInfo()
