
def call(String message, String msgType, String logLevel) {

    loadColors()

    def info(message, logLevel) {
        if (logLevel.contains('INFO')) {
                println("[INFO-VER2] " + message)
        }
    }

    switch(msgType) {
        case 'INFO':
            if (logLevel.contains('INFO')) {
                println("[INFO] " + message)
            }
            break;
        case 'DEBUG':
            if (logLevel.contains('DEBUG')) {
                println("[DEBUG] " + message)
            }
            break;
        case 'WARN':
            if (logLevel.contains('WARN')) {
                println("[WARN] " + message)
            }
            break;
        case 'ERROR':
            if (logLevel.contains('ERROR')) {
                println("[ERROR] " + message)
            }
        break
    }

}