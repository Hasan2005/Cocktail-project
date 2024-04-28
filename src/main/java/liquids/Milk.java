package liquids;

import basaeclasses.Ingredient;
import interfaces.MixtureInfo;
import colors.RGB;

public class Milk extends Ingredient{
    
    public Milk(String name, float calories, short volumeInMilliLiter, RGB color) {
        name = "Milk";
        calories = 35;
        volumeInMilliLiter = 100;
        color = new RGB((short) 255,(short) 255,(short) 255);
    }

}
