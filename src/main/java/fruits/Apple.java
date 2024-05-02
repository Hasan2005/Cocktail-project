package fruits;

import basaeclasses.Ingredient;
import colors.RGB;

public class Apple extends Ingredient{
    
    public Apple() {
        name = "Apple";
        color = new RGB( 255, 0, 0);
        volumeInMilliLiter = 50;
        calories = 90;
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
