package cocktailrequirements;

public class Apple extends Fruit{
    

    public Apple(String name, float calories, short volumeInMilliLiter, RGB color) {
        super(name, calories, volumeInMilliLiter, color);
        name = "Apple";
        calories = 50;
        volumeInMilliLiter = 50;
        color = new RGB((short) 255,(short) 0,(short) 0);
    }
    
}
