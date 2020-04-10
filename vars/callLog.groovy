#!groovy
import groovy.transform.Field

@Field logLevels = params.env_loglevel

//LogHandler = new LogHandleMessages()

def testOne() {

    LogHandleMessages.info("This is an INFO message", logLevels)
    LogHandleMessages.error("This is an ERROR message", logLevels)

}

testOne()