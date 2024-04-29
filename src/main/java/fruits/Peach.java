package fruits;

import basaeclasses.Ingredient;
import colors.RGB;

public class Peach extends Ingredient{

  private static int count;
    
    public Peach() {
        name = "Peach";
        calories = 58;
        volumeInMilliLiter = 50;
        color = new RGB(255, 220, 190);
    }
    
    public static int getCount() {
        return count;
    }
    
     public static void setCount(int count) {
        Peach.count = count;
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
