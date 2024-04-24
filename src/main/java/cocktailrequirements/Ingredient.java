package cocktailrequirements;

public abstract class Ingredient {

   protected  String name;
   protected  float calories;
   protected short volumeInMilliLiter;
    
    public String getName() {
        return name;
    }

    public double getCalories() {
        return calories;
    }

    public short getVolumeInMilliLiter() {
        return volumeInMilliLiter;
    }
 
}
