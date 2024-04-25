
package exceptions.blender;

public class BlenderOverflowException extends Exception{

    @Override
    public String getMessage()  {
        return "adding this ingredient will cause an overflow";
    }
   
}
