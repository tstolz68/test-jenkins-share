#!groovy

def loadColors() {
    NC='\033[0m'
    RED='\033[0;31m'
    GREEN='\033[0;32m'
    BLUE='\033[0;34m'
    CYAN='\033[0;36m'
}

def info(String message, String logLevels) {
    if (logLevels.contains('INFO')) {
        loadColors()
        println(NC + "[INFO] - $message" + NC) 
    }
}

def debug(String message, String logLevels) {
    if (logLevels.contains('DEBUG')) {
       loadColors()
       println(GREEN + "[DEBUG] - $message" + NC)
    }
}

def warn(String message, String logLevels) {
    if (logLevels.contains('WARN')) {
       loadColors()
       println(CYAN + "[WARN] - $message" + NC)
    }
}

def error(String message, String logLevels) {
    if (logLevels.contains('ERROR')) {
       loadColors()
       println(RED + "[ERROR] - $message" + NC)
    }
}

this.info("This is an info message", "INFO,DEBUG,WARN,ERROR")
this.debug("This is an debug message", "INFO,DEBUG,WARN,ERROR")
this.warn("This is an warning message", "INFO,DEBUG,WARN,ERROR")
this.error("This is an error message", "INFO,DEBUG,WARN,ERROR")
