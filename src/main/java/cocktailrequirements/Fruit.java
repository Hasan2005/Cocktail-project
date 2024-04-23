package cocktailrequirements;

public abstract class Fruit extends Ingredient{
        
        protected  RGB color;
        
        public Fruit(String name, float calories, short volumeInMilliLiter, RGB color)
        {
               super(name, calories, volumeInMilliLiter);
               this.color = color;
        }
        
}
