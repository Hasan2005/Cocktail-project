package liquids;

import basaeclasses.Liquids;
import interfaces.MixtureInfo;
import colors.RGB;

public class Milk extends Liquids{
    
    public Milk(String name, float calories, short volumeInMilliLiter, RGB color) {
        name = "Milk";
        calories = 35;
        volumeInMilliLiter = 100;
        color = new RGB((short) 255,(short) 255,(short) 255);
    }

}
