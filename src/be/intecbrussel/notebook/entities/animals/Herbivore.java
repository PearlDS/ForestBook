package be.intecbrussel.notebook.entities.animals;

import be.intecbrussel.notebook.entities.plants.Plant;

import java.util.HashSet;
import java.util.Set;

public class Herbivore extends Animal{

    private Set<Plant> plantDiet = new HashSet<>();

    @Override
    public String toString() {
        return "Herbivore{" +
                "name='" + getName() + '\'' +
                ", weight=" + getWeight() +
                ", height=" + getHeight() +
                ", length=" + getLength() +
                ", plantDiet=" + plantDiet +
                '}';
    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public Herbivore(String name) {
        super(name);
    }

    public Herbivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public void printDiet(){


    }
    public void addPlantToDiet(Plant plant){
        plantDiet.add(plant);
    }
}
