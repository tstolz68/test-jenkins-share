def loadColors() {
    NC='\033[0m'
    RED='\033[0;31m'
    GREEN='\033[0;32m'
    BLUE='\033[0;34m'
    CYAN='\033[0;36m'
}

def call(String message, String msgType, String logLevel) {

    loadColors()

    switch(msgType) {
        case 'INFO':
            if (logLevel.contains('INFO')) {
                println(NC + "[INFO] " + message + NC)
            }
            break;
        case 'DEBUG':
            if (logLevel.contains('DEBUG')) {
                println(GREEN + "[DEBUG] " + message + NC)
            }
            break;
        case 'WARN':
            if (logLevel.contains('WARN')) {
                println(CYAN + "[WARN] " + message + NC)
            }
            break;
        case 'ERROR':
            if (logLevel.contains('ERROR')) {
                println(RED + "[ERROR] " + message + NC)
            }
        break
    }

}