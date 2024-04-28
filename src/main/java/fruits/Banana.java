
package fruits;

import basaeclasses.Ingredient;
import colors.RGB;

public class Banana extends Ingredient {
    
    public Banana(){
        name = "banana";
        calories = 105;
        volumeInMilliLiter =50;
        color = new RGB((short) 255,(short) 225,(short) 150);
    }
}
