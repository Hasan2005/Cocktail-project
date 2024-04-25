
package container;

import colors.RGB;
import interfaces.MixtureInfo;
import basaeclasses.Ingredient;
import exceptions.blender.*;
import java.util.ArrayList;
import java.awt.Color;

public class Blender implements MixtureInfo{
    
   private  ArrayList<Ingredient>blender;
   private static final short  capacityInMilliLiter = 1200;
   private short volumeInMilliLiter;
   private boolean blended;
   private static float calories;
   
   public void addIngredient(Ingredient ingredient) throws BlenderOverflowException
   {
       if(ingredient.getVolumeInMilliLiter()+ volumeInMilliLiter <= capacityInMilliLiter)
       {
           blender.add(ingredient);
           volumeInMilliLiter+= ingredient.getCalories();
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
   
   public void pour(int numberOforederedCups)
   {
       volumeInMilliLiter -= numberOforederedCups * 300;
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
            calories+= ingredient.getCalories();
        }
        return calories;
    }

    @Override
    public String getColor()
    {
        short red = 0, green = 0, blue = 0;
        for(Ingredient ingredient: blender)
        {
            RGB color = ingredient.getColor();
            red+= color.getRed();
            green+= color.getGreen();
            blue+= color.getBlue();
        }
        
        int ingredientsCount= blender.size();
        red/=  (short) ingredientsCount;
        green/= (short) ingredientsCount;
        blue/= (short) ingredientsCount;
        
        RGB color = new RGB(red, green, blue);
        return color.getName();
        
    }
   
}
