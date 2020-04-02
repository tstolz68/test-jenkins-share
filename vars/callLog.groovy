#!groovy
//TODO: Put this in the header for shared library files
//Class Log4J = ((GroovyClassLoader) this.class.classLoader).parseClass new File("Log4JLogger.groovy")
//logger = Log4J.newInstance()
//***

def call(Map args) {
    testOne()
}

def testOne() {
    Log4JLogger.logInfoLevel("This is an INFO message") 
}

//Test output here
//logger.logInfoLevel("This is an INFO message") 
//logger.logDebugLevel("This is an DEBUG message") 
//logger.logWarnLevel("This is an WARN message") 
//logger.logErrorLevel("This is an ERROR message") 