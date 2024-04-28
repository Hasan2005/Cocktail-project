package basaeclasses;

import colors.RGB;

public abstract class Ingredient {

   protected  String name;
   protected  float calories;
   protected int volumeInMilliLiter;
   public RGB color;
   
    public String getName() {
        return name;
    }

    public double getCalories() {
        return calories;
    }

    public int getVolumeInMilliLiter() {
        return volumeInMilliLiter;
    }
    
    public  float caloriesPerMilliLiter(){
        return calories/ volumeInMilliLiter;
    }
    
    public String getColor() {
        return color.getColorName();
    }
    
    public RGB getColorRGB(){
        return color;
    } 
}
