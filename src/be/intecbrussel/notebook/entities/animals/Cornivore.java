package be.intecbrussel.notebook.entities.animals;

public class Cornivore extends Animal{

    private double maxFoodSize;

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

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    public Cornivore(String name) {
        super(name);
    }

    public Cornivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }
}
