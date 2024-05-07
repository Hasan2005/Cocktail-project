package basaeclasses;

import colors.RGB;

public abstract class Ingredient {

   protected String name;
   protected double calories;
   protected double volumeInMilliLiter;
   protected RGB color;
    public String getName() {
        return name;
    }

    public double getCalories() {
        return calories;
    }

    public double getVolumeInMilliLiter() {
        return volumeInMilliLiter;
    }
    
    public String getColor() {
        return color.getColorName();
    }
    
    public RGB getColorRGB(){
        return color;
    }
    
    public abstract String  getInfo();
}
