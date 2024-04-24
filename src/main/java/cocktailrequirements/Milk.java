// second commit - 1
package cocktailrequirements;

public class Milk extends Liquids{
    
    private boolean fullFat;
    
    public Milk(String name, float calories, short volumeInMilliLiter, RGB color) {
        //fullFat -> true ... volume *fullFat calories
    }
    
    public boolean isFullFat() {
        return fullFat;
    }

    @Override
    public short calculateCalories() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public String getColor() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
