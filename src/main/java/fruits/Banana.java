
package fruits;

import basaeclasses.Ingredient;
import colors.RGB;
    
   public class Banana extends Ingredient {
    
    private static int count;
    
    public Banana(){
        name = "banana";
        calories = 105;
        volumeInMilliLiter =50;
        color = new RGB((short) 255,(short) 225,(short) 150);
    }

    public static int getCount() {
        return count;
    }
    
     public static void setCount(int count) {
        Banana.count = count;
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
