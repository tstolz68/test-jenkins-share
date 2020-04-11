#!groovy
import groovy.transform.Field

@Field logLevels = params.env_loglevel

def testOne() {
    //LogHandleMessages.info("This is an INFO message", logLevels)
    //LogHandleMessages.error("This is an ERROR message", logLevels)
    //LogHandler.info("This is an INFO message", "INFO")
    anotherLogTest.info("This is an INFO message", "INFO", logLevels)
    anotherLogTest("This is an DEBUG message", "DEBUG", logLevels)
    anotherLogTest("This is an WARN message", "WARN", logLevels)
    anotherLogTest("This is an ERROR message", "ERROR", logLevels)

}

testOne()