package fruits;

import basaeclasses.Fruit;
import colors.RGB;

public class Peach extends Fruit{

    public Peach() {
        name = "Peach";
        calories = 58;
        volumeInMilliLiter = 47;
        color = new RGB((short) 255,(short) 220,(short) 190);
    }
    
}
