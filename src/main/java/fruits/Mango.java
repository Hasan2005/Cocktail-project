
package fruits;

import basaeclasses.Fruit;
import colors.RGB;

public class Mango extends Fruit  {
    
    public Mango(){
        name = "Mango";
        calories = 100;
        volumeInMilliLiter = 50;
        color = new RGB((short) 255,(short) 0,(short) 0);
    }
}
