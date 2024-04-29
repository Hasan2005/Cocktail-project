
package exceptions.blender;

public class BlenderOverflowException extends Exception{

    @Override
    public String getMessage()  {
        return "adding  will cause an overflow";
    }
   
}
