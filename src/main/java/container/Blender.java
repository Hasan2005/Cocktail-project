
package container;

import colors.RGB;
import interfaces.MixtureInfo;
import basaeclasses.Ingredient;
import exceptions.blender.*;
import java.util.ArrayList;
import java.awt.Color;
import fruits.*;
import java.util.HashMap;
import java.util.Map;

public class Blender implements MixtureInfo{
    
   private ArrayList<Ingredient>blender = new ArrayList<>();
   private static final short  capacityInMilliLiter = 1200;
   private int volumeInMilliLiter;
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

    public static float getTotalAmountOfCalories() {
        return totalAmountOfCalories;
    }
   
   
   public void addIngredient(Ingredient ingredient, int cup, int numberOfCups) throws BlenderOverflowException
   {
       if(ingredient.getVolumeInMilliLiter()+ volumeInMilliLiter <= cup*numberOfCups)
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
           getInfo();
   }
   
   public void pour(int numberOforederedCups, int cupSize) throws EmptyBlenderException,  NotBlendedException
   {
       if(isEmpty())
           throw new EmptyBlenderException();
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
        StringBuilder numberOfFruits = new StringBuilder();
        for (String key : fruitMap.keySet()) {
            numberOfFruits.append("Number of ")
                                    .append(key)
                                    .append('s')
                                    .append(": ")
                                    .append(fruitMap.get(key))
                                    .append("\n");
        }
        if(milkAdded){
            numberOfFruits.append("Milk volume :")
                                     .append(milkVolume);
        }
    StringBuilder info = new StringBuilder();
    info.append("Blender Contents:\n");
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
        .append(getColor())
        .append("\n")
        .append(numberOfFruits);
    return info.toString();
    }
    
}
