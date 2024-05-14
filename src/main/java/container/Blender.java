
package container;

import colors.RGB;
import basaeclasses.Ingredient;
import exceptions.blender.*;
import java.util.ArrayList;
import java.awt.Color;
import fruits.*;
import java.util.HashMap;
import java.util.Map;

public class Blender {
    
   private ArrayList<Ingredient>blender = new ArrayList<>();
   private static final int  capacityInMilliLiter = 1200;
   private int volumeInMilliLiter;
   private int totalAmountOfCalories;
   private boolean blended;
   
    public static int  getCapacityInMilliLiter() {
        return capacityInMilliLiter;
    }

    public  int getVolumeInMilliLiter() {
        return volumeInMilliLiter;
    }

    public int getTotalAmountOfCalories() {
        return totalAmountOfCalories;
    }
    
    public void clearIngredients()
    {
        volumeInMilliLiter = 0;
        totalAmountOfCalories = 0;
            blender.clear();
    }
   
   
    public void addIngredient(Ingredient ingredient, int cupSize, int numberOfCups) throws BlenderOverflowException
   {
       if(ingredient.getVolumeInMilliLiter()+ volumeInMilliLiter <= cupSize*numberOfCups)
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
        if(isEmpty())
        {
            throw new EmptyBlenderException();
        }
        else
        {
           System.out.println("================================\n"
                                       + "Color: " + getColor()
                                       +"\nTotal Calories: " + getTotalAmountOfCalories()
                                       +"\n================================\n");
           blended = true;
        }
   }
   
   public void pour(int numberOforederedCups, int cupSize) throws EmptyBlenderException,  NotBlendedException
   {
       if(isEmpty())
           throw new EmptyBlenderException();
       else if (!blended)
           throw new NotBlendedException();
       else
       {
            volumeInMilliLiter =  numberOforederedCups * cupSize - volumeInMilliLiter;
            System.out.println("================================\n"
                                       + "number of cups: " + numberOforederedCups + "\n"
                                       + "calories per cup: " + (totalAmountOfCalories/numberOforederedCups) + "\n"
                                       +  this.getInfo());
       }
   }
  
   public boolean isEmpty() {
       return blender.isEmpty();
   }    

    public double calculateCalories()
    {
       for(Ingredient ingredient:blender)
        {
           totalAmountOfCalories+= ingredient.getCalories();
        }
        return totalAmountOfCalories;
    }

    public String getColor()
    {
        int red = 0, green = 0, blue = 0;
        for(Ingredient ingredient: blender)
        {
            RGB color = ingredient.getColorRGB();
            red+= color.getRed();
            green+= color.getGreen();
            blue+= color.getBlue();
        }
        
        int ingredientsCount = blender.size();
        if(ingredientsCount != 0){
        red/= ingredientsCount;
        green/= ingredientsCount;
        blue/= ingredientsCount;
        }
        RGB color = new RGB(red, green, blue);
        return color.getColorName();
        
    }
    
   public String getInfo() 
   {
        Map<String, Integer> fruitMap = new HashMap<>();
        boolean milkAdded = false;
        double milkVolume = 0;
        for(Ingredient ingredient : blender){
            if(ingredient.getName().equals("Milk")){
                  milkAdded = true;
                  milkVolume = ingredient.getVolumeInMilliLiter();
                continue;
            }
          if (fruitMap.containsKey(ingredient.getName()))
                fruitMap.put(ingredient.getName(), fruitMap.get(ingredient.getName()) + 1);
            else
                fruitMap.put(ingredient.getName(), 1);
        }
        StringBuilder blenderContents = new StringBuilder();
        for (String key : fruitMap.keySet()) {
            blenderContents.append("Number of ")
                                    .append(key)
                                    .append('s')
                                    .append(": ")
                                    .append(fruitMap.get(key))
                                    .append("\n");
        }
        if(milkAdded)
        {
            blenderContents.append("Milk volume :")
                           .append(milkVolume);
        }
        if(blended)
        {
            blenderContents.append("\nIngredient Blended ")       
                                     .append("\nFinal color: ")
                                     .append(getColor());
        }
        else
        {
            blenderContents.append("\nIngredient not blended");
        }
    StringBuilder info = new StringBuilder();
    info.append("================================\n")
         .append("Blender Contents:\n")
         .append("Total Calories: ")
        .append(getTotalAmountOfCalories())
        .append("\n")
        .append("Current Volume: ")
        .append(getVolumeInMilliLiter())
        .append(" mL")
        .append("\n")
        .append("Capacity: ")
        .append(getCapacityInMilliLiter())
        .append(" mL\n")
        .append(blenderContents)
        .append("\n================================");
    return info.toString();
    }
        
}