package be.intecbrussel.notebook.entities.animals;

public class Cornivore extends Animal{

    //1. variabelen
    private double maxFoodSize;
    
    //2.Constructors
    
    
    public Cornivore(String name) {
        super(name);
    }

    public Cornivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }
    
    //3. getters and setters
    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }
    
    //4.other methods
    

    @Override
    public String toString() {
        return "Cornivore{" +
                "name='" + getName() + '\'' +
                ", weight=" + getWeight() +
                ", height=" + getHeight() +
                ", length=" + getLength() +
                ", maxFoodSize=" + maxFoodSize +
                '}';
    }

    

}
