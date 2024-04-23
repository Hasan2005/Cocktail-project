package cocktailrequirements;

public abstract class Ingredient {

   protected  String name;
   protected  float calories;
   protected short volumeInMilliLiter;
    
    public Ingredient(String name, float calories, short volumeInMilliLiter)
    {
        this.name = name;
        this.calories = calories;
        this.volumeInMilliLiter = volumeInMilliLiter;
    }

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
