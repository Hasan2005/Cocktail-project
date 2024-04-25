package fruits;

import basaeclasses.Fruit;
import colors.RGB;

public class Apple extends Fruit{
    
    public Apple() {
        name = "Apple";
        calories = 90;
        volumeInMilliLiter = 50;
        color = new RGB((short) 255,(short) 0,(short) 0);
    }
    
    
    
}
