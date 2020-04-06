//customize error levels 
class LogLevel extends Level {
    public static final Level INFO = new LogLevel("INFO", 5000);
    public static final Level DEBUG = new LogLevel("DEBUG", 6000);
    public static final Level WARN = new LogLevel("WARN", 7000);
    public static final Level ERROR = new LogLevel("ERROR", 8000);

    public LogLevel(String name, int value) {
        super(name, value)
    }
}