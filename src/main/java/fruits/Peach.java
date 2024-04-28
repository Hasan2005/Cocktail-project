package fruits;

import basaeclasses.Ingredient;
import colors.RGB;

public class Peach extends Ingredient{

    public Peach() {
        name = "Peach";
        calories = 58;
        volumeInMilliLiter = 50;
        color = new RGB((short) 255,(short) 220,(short) 190);
    }
    
}
