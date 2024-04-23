
package cocktailrequirements;

import java.util.ArrayList;

public class Blender implements MixtureInfo{
    
   private  ArrayList<Ingredient>blender;
   private static final short  capacityInMilliLiter = 1200;
   private short volumeInMilliLiter;
   private boolean blended;
   
   public void addIngredient(){};  // check if there is enough volume
   
   public void blend(){}; //check if empty.. if not then blend and  blended = true
   
   public void pour(){};  // check if there is enough volume and blended
   
   public boolean isEmpty(){return false;}  

    @Override
    public short calculateCalories() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public String getColor() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
   
}
