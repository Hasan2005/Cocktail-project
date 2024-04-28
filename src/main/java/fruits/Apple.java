package fruits;

import basaeclasses.Ingredient;
import colors.RGB;

public class Apple extends Ingredient{
    
    public Apple() {
        name = "Apple";
        color = new RGB((short) 255,(short) 0,(short) 0);
        volumeInMilliLiter = 50;
        calories = 90;
    }
    
}
