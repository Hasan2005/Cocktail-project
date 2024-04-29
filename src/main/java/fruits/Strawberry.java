package fruits;

import basaeclasses.Ingredient;
import colors.RGB;

public class Strawberry extends Ingredient{

    private static int count;
    
    public Strawberry() {
        name = "Strawberry";
        calories = 4;
        volumeInMilliLiter = 10;
        color = new RGB( 255, 35, 35);
    }
    
    public static int getCount() {
        return count;
    }
    
     public static void setCount(int count) {
        Strawberry.count = count;
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
