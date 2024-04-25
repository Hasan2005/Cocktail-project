
package fruits;

import basaeclasses.Fruit;
import colors.RGB;

public class Banana extends Fruit {
    
    public Banana(){
        name = "banana";
        calories = 105;
        volumeInMilliLiter =50;
        color = new RGB((short) 255,(short) 225,(short) 150);
    }
}
