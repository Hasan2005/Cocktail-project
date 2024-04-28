
package fruits;

import basaeclasses.Ingredient;
import colors.RGB;

public class Mango extends  Ingredient  {
    
    public Mango(){
        name = "Mango";
        calories = 100;
        volumeInMilliLiter = 50;
        color = new RGB((short) 255,(short) 165,(short) 0);
    }
}
