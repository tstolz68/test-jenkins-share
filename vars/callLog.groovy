#!groovy
//***** Import Log Processor to handle log requests ****
def script = new GroovyScriptEngine( '.' ).with {
  loadScriptByName( 'Log4jLogger.groovy' )
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