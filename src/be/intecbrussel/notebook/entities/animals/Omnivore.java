package be.intecbrussel.notebook.entities.animals;

import be.intecbrussel.notebook.entities.plants.Plant;

import java.util.HashSet;
import java.util.Set;

public class Omnivore extends Animal{

    Set<Plant> plantDiet = new HashSet<>();
    double maxFoodSize;

    @Override
    public String toString() {
        return "Omnivore{" +
                "name='" + getName() + '\'' +
                ", weight=" + getWeight() +
                ", height=" + getHeight() +
                ", length=" + getLength() +
                ", plantDiet=" + plantDiet +
                ", maxFoodSize=" + maxFoodSize +
                '}';
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public Omnivore(String name) {
        super(name);
    }

    public Omnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public void addPlantToDiet(Plant plant){
        plantDiet.add(plant);

    }
}
