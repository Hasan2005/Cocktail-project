package fruits;

import basaeclasses.Ingredient;
import colors.RGB;

public class Strawberry extends Ingredient{

    public Strawberry() {
        name = "Strawberry";
        calories = 4;
        volumeInMilliLiter = 10;
        color = new RGB((short) 255,(short) 35,(short) 35);
    }
    
}
