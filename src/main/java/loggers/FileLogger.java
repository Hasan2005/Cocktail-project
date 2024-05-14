
package loggers;

import java.io.FileWriter;
import java.io.IOException;
import interfaces.MyLogger;

public class FileLogger implements MyLogger{

    private String filePath;

    public FileLogger(String filePath) {
        this.filePath = filePath;
    }
    
    @Override
    public void log(String message) {
        try {
            FileWriter history = new FileWriter(filePath, true);
            history.write(message + "\n");
            history.close();
        } 
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
