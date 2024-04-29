package liquids;

import basaeclasses.Ingredient;
import interfaces.MixtureInfo;
import colors.RGB;

public class Milk extends Ingredient{
    
    public Milk(double volumeInMilliLiter, double calories) {
        name = "Milk";
        this.calories = calories;
        this.volumeInMilliLiter = volumeInMilliLiter;
        color = new RGB(255, 255, 255);
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
