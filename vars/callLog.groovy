#!groovy
import groovy.transform.Field
/*
//***** Import Log Processor to handle log requests ****
def script = new GroovyScriptEngine( '.' ).with {
  loadScriptByName( 'Log4JLogger.groovy' )
} 
this.metaClass.mixin script
//*****

def testOne() {
    println("HERE WE ARE!!")
    logInfoLevel("This is an INFO message") 
}

//def NewLogger = new Log4JLogger()

//Test output here
logInfoLevel("This is an INFO message") 
//logger.logDebugLevel("This is an DEBUG message") 
//logger.logWarnLevel("This is an WARN message") 
//logger.logErrorLevel("This is an ERROR message") 
*/
//import Log4JLogger.groovy

@Field logLevels = "INFO,ERROR" //params.env_loglevel
//evaluate(new File("./Log4JLogger.groovy"))

//@BaseScript Log4JLogger 

def testOne() {
   
    //println("HERE WE ARE!! - parameter value is: " + logLevels)
    //def file = new File('Log4JLogger.groovy') 
    //println "File? ${file.isFile()}" 
    //evaluate(new File("./Log4JLogger.groovy"))

    LogHandleMessages.info("This is an INFO message", logLevels)
    LogHandleMessages.error("This is an ERROR message", logLevels)

}

testOne()