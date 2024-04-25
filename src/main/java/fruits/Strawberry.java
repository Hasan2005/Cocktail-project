package fruits;

import basaeclasses.Fruit;
import colors.RGB;

public class Strawberry extends Fruit{

    public Strawberry() {
        name = "Strawberry";
        calories = 4;
        volumeInMilliLiter = 10;
        color = new RGB((short) 255,(short) 35,(short) 35);
    }
    
}
