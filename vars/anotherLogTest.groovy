def call(String message, String msgType, String logLevel) {

    switch(msgType) {
        case 'INFO':
            if (logLevel.contains('INFO')) {
                println "[INFO] " + message
            }
            break;
        case 'DEBUG':
            if (logLevel.contains('DEBUG')) {
                println "[DEBUG] " + message
            }
            break;
        case 'WARN':
            if (logLevel.contains('WARN')) {
                println "[WARN] " + message
            }
            break;
        case 'ERROR':
            if (logLevel.contains('ERROR')) {
                println "[ERROR] " + message
            }
        break
    }

}