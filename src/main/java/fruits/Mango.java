
package fruits;

import basaeclasses.Ingredient;
import colors.RGB;

public class Mango extends  Ingredient  {
    
 private static int count;
    
    public Mango(){
        name = "Mango";
        calories = 100;
        volumeInMilliLiter = 50;
        color = new RGB((short) 255,(short) 165,(short) 0);
    }
    
    public static int getCount() {
        return count;
    }
    
     public static void setCount(int count) {
        Mango.count= count;
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
