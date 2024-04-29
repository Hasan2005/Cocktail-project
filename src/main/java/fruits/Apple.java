package fruits;

import basaeclasses.Ingredient;
import colors.RGB;

public class Apple extends Ingredient{
    
    private static int count;
    
    public Apple() {
        name = "Apple";
        color = new RGB( 255, 0, 0);
        volumeInMilliLiter = 50;
        calories = 90;
        count++;
    }
   
    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Apple.count = count;
    }
    
    @Override
     public String getInfo()
    {
          StringBuilder info = new StringBuilder();
          
          info.append("-------------------------------------------------------------------------\n")
                .append("ingredient: ")
                .append(name)
                .append("\n")
                .append("calories: ")
                .append(calories)
                .append("\n")
                .append("volume mL: ")
                .append(volumeInMilliLiter)
                .append("\n")
                .append("color: ")
                .append(color.getColorName())
                .append("\n----------------------------------------------------------------------------");
                  
          return info.toString();
    }
    
    
    
}
