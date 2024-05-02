package fruits;

import basaeclasses.Ingredient;
import colors.RGB;

public class Strawberry extends Ingredient{

    public Strawberry() {
        name = "Strawberry";
        calories = 4;
        volumeInMilliLiter = 10;
        color = new RGB( 255, 35, 35);
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
