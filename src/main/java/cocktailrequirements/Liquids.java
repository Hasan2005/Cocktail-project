
package cocktailrequirements;

public abstract class Liquids extends Ingredient implements MixtureInfo{
   private RGB color;
    
     public Liquids(String name, float calories,short volumeInMilliLiter, RGB color) 
    {
        super(name, calories, volumeInMilliLiter);
        this.color = color;
    }

}
