#!groovy
import groovy.transform.Field

@Field logLevels = "INFO,ERROR" //params.env_loglevel

LogHandler = new LogHandleMessages()

def testOne() {

    LogHandler.info("This is an INFO message", logLevels)
    LogHandler.error("This is an ERROR message", logLevels)

}

testOne()