
package container;

import colors.RGB;
import interfaces.MixtureInfo;
import basaeclasses.Ingredient;
import exceptions.blender.*;
import java.util.ArrayList;
import java.awt.Color;

public class Blender implements MixtureInfo{
    
   private ArrayList<Ingredient>blender = new ArrayList<>();
   private static final short  capacityInMilliLiter = 1200;
   private int volumeInMilliLiter;
   private boolean blended;
   private static float totalAmountOfCalories;
   
   
    public ArrayList<Ingredient> getBlender() {
        return blender;
    }

    public static short getCapacityInMilliLiter() {
        return capacityInMilliLiter;
    }

    public  int getVolumeInMilliLiter() {
        return volumeInMilliLiter;
    }

    public boolean isBlended() {
        return blended;
    }

    public static float getTotalAmountOfCalories() {
        return totalAmountOfCalories;
    }
   
   
   public void addIngredient(Ingredient ingredient) throws BlenderOverflowException
   {
       if(ingredient.getVolumeInMilliLiter()+ volumeInMilliLiter <= capacityInMilliLiter)
       {
           blender.add(ingredient);
           volumeInMilliLiter += ingredient.getVolumeInMilliLiter();
           totalAmountOfCalories += ingredient.getCalories();
       }
       
       else
           throw new BlenderOverflowException();
   }
       
   
   public void blend() throws EmptyBlenderException
   {
        if(isEmpty()){
            throw new EmptyBlenderException();
        }
        else 
            blended = true;
   }
   
   public void pour(int numberOforederedCups, int cupSize) throws EmptyBlenderException,  NotBlendedException
   {
       if(isEmpty())
           throw new EmptyBlenderException();
       else if(!blended)
           throw new NotBlendedException();
       else
            volumeInMilliLiter -= numberOforederedCups * cupSize;
   }
   
   public boolean isEmpty()
   {
       return blender.isEmpty();
   }

    @Override
    public float calculateCalories()
    {
       for(Ingredient ingredient:blender)
        {
           totalAmountOfCalories+= ingredient.getCalories();
        }
        return totalAmountOfCalories;
    }

    @Override
    public String getColor()
    {
        short red = 0, green = 0, blue = 0;
        for(Ingredient ingredient: blender)
        {
            RGB color = ingredient.getColorRGB();
            red+= color.getRed();
            green+= color.getGreen();
            blue+= color.getBlue();
        }
        
        int ingredientsCount= blender.size();
        red/=  (short) ingredientsCount;
        green/= (short) ingredientsCount;
        blue/= (short) ingredientsCount;
        
        RGB color = new RGB(red, green, blue);
        return color.getColorName();
        
    }

   public String getInfo() {
    StringBuilder info = new StringBuilder();
    info.append("Blender Contents:\n");
    for (Ingredient ingredient : blender) {
        info.append("- ")
            .append(ingredient.getName())
            .append(": ")
            .append(ingredient.getVolumeInMilliLiter())
            .append(" mL, ")
            .append(ingredient.getCalories())
            .append(" calories, ")
            .append(ingredient.getColor())
            .append("\n");
    }
    info.append("Total Calories: ")
        .append(getTotalAmountOfCalories())
        .append("\n")
        .append("Current Volume: ")
        .append(getVolumeInMilliLiter())
        .append(" mL")
        .append("\n")
        .append("Capacity: ")
        .append(getCapacityInMilliLiter())
        .append(" mL\n")
        .append("Final color: ")
        .append(getColor());
    return info.toString();
    }
    
}
