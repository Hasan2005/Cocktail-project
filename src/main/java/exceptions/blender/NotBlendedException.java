
package exceptions.blender;

public class NotBlendedException extends Exception{

    @Override
    public String getMessage() {
       return "ingredient are not blended";
    }
}
