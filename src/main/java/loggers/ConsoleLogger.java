
package loggers;

import java.io.FileWriter;
import interfaces.MyLogger;

public class ConsoleLogger implements MyLogger{

    @Override
    public void log(String message) {
        System.out.println(message + "\n");
    }
    
}
