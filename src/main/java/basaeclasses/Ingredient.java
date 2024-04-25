package basaeclasses;

import colors.RGB;

public abstract class Ingredient {

   protected  String name;
   protected  float calories;
   protected short volumeInMilliLiter;
   protected RGB color;
   
    public String getName() {
        return name;
    }

    public double getCalories() {
        return calories;
    }

    public short getVolumeInMilliLiter() {
        return volumeInMilliLiter;
    }
    
    public  float caloriesPerMilliLiter(){
        return calories/ volumeInMilliLiter;
    }
    
    
 
}
