
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
   private int volumeInMilliLiter;
   private boolean blended;
   private static float totalAmountOfCalories;
   
   public Blender(ArrayList<Ingredient>blender){
       this.blender = blender;
   }
   
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
    
    
    public void printBlenderIngredients()
    {
        for(Ingredient ingredient: blender)
            System.out.println("ingredient: " + ingredient.getName() +
                                            " \ncalories: " + ingredient.getCalories() +
                                            " \ningredient volume in ml: " +ingredient.getVolumeInMilliLiter() +
                                            " \ningredient color: " + ingredient.getColor());
    }
   
   
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
       System.out.print("blender cotains:\n ");
       printBlenderIngredients();
         return "Blender volume in ml: " + this.getVolumeInMilliLiter() + 
                    "\nBlender capacity in ml: " + capacityInMilliLiter +
                    "\ntotal amout of calories: " + totalAmountOfCalories;
                            
}
    
}
