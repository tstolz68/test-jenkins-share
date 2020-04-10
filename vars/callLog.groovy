#!groovy
import groovy.transform.Field

@Field logLevels = params.env_loglevel

//LogHandler = new LogHandleMessages()

def testOne() {

    println "MADE IT TO testOne()"
    //LogHandleMessages.info("This is an INFO message", logLevels)
    //LogHandleMessages.error("This is an ERROR message", logLevels)
    LogHandleMessages.call()

}

testOne()