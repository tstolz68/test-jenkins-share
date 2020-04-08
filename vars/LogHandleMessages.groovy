#!groovy

def loadColors() {
    NC='\033[0m'
    RED='\033[0,31m'
    GREEN='\033[0,32m'
    BLUE='\033[0,34m'
    CYAN='\033[0,36m'
}

def info(String message, String logLevels) {
    loadColors()
    sh """set +x; echo -e "${NC}[INFO] - $message ${NC}" """
}

def debug(String message, String logLevels) {
    loadColors()
    sh """set +x; echo -e "${GREEN}[INFO] - $message ${NC}" """
}

def warn(String message, String logLevels) {
    loadColors()
    sh """set +x; echo -e "${CYAN}[INFO] - $message ${NC}" """
}

def error(String message, String logLevels) {
    loadColors()
    sh """set +x; echo -e "${RED}[INFO] - $message ${NC}" """
}
