package liquids;

import basaeclasses.Ingredient;
import interfaces.MixtureInfo;
import colors.RGB;

public class Milk extends Ingredient{
    
    public Milk(int volumeInMilliLiter, int calories) {
        name = "Milk";
        this.calories = calories;
        this.volumeInMilliLiter = volumeInMilliLiter;
        color = new RGB((short) 255,(short) 255,(short) 255);
    }

}
