public class LogLevels {
    
    public static String message(String logLine) {
        return logLine.split(":")[1].trim();
    }

    public static String logLevel(String logLine) {
          return logLine.substring(1,logLine.indexOf("]")).toLowerCase();
    }

    public static String reformat(String logLine) {
        String pesan=message(logLine);
        String level=logLevel(logLine);
        return pesan+" ("+level+")";
    }
}
