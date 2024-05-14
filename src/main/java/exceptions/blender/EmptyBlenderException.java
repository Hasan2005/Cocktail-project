
package exceptions.blender;

public class EmptyBlenderException extends Exception{

    @Override
    public String getMessage() {
        return "the blender is empty, please add ingredients before blend\n";
    }
        
}
