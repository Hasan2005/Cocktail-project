package basaeclasses;

import colors.RGB;

public abstract class Ingredient {

   protected  String name;
   protected  double calories;
   protected double volumeInMilliLiter;
   protected  RGB color;
   private static int count;
   
   public Ingredient(){
       count++;
   }
   
    public static void setCount(int count) {
        Ingredient.count = count;
    }
   
    public String getName() {
        return name;
    }

    public double getCalories() {
        return calories;
    }

    public double getVolumeInMilliLiter() {
        return volumeInMilliLiter;
    }
    
    public  double caloriesPerMilliLiter(){
        return calories/ volumeInMilliLiter;
    }
    
    public String getColor() {
        return color.getColorName();
    }
    
    public RGB getColorRGB(){
        return color;
    }

    public static int getCount() {
        return count;
    }
    
    public abstract String  getInfo();
}
