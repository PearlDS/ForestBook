package be.intecbrussel.notebook.service;

import be.intecbrussel.notebook.entities.animals.Animal;
import be.intecbrussel.notebook.entities.animals.Cornivore;
import be.intecbrussel.notebook.entities.animals.Herbivore;
import be.intecbrussel.notebook.entities.animals.Omnivore;
import be.intecbrussel.notebook.entities.plants.Plant;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ForestNotebook {


    private List<Cornivore> carnivores;
    private List<Omnivore> omnivores;
    private List<Herbivore> herbivores;
    private int plantCount;
    private int animalCount;
    private List<Animal> animals;
    private List<Plant> plants;

    public ForestNotebook() {
        carnivores = new ArrayList<>();
        omnivores = new ArrayList<>();
        herbivores = new ArrayList<>();
        animals = new ArrayList<>();
        plants = new ArrayList<>();
    }




    public int getPlantCount() {
        return plantCount;
    }

    public void setPlantCount(int plantCount) {
        this.plantCount = plantCount;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public void setAnimalCount(int animalCount) {
        this.animalCount = animalCount;
    }

    public List<Cornivore> getCarnivores() {
        return carnivores;
    }

    public void setCarnivores(List<Cornivore> carnivores) {
        this.carnivores = carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public List<Plant> getPlants() {
        return plants;
    }

    public void setPlants(List<Plant> plants) {
        this.plants = plants;
    }

    public void addAnimal(Animal animal){

        animals.add(animal);
        animalCount++;

        if(animal instanceof Cornivore){
            carnivores.add((Cornivore) animal);
        }
        else if(animal instanceof Herbivore){
            herbivores.add((Herbivore) animal);
        }
        else if(animal instanceof Omnivore){
            omnivores.add((Omnivore) animal);
        }
    }
    public void addPlant(Plant plant){
        
        if(!plants.contains(plant)){
        plantCount++;
        plants.add(plant);
        }

    }

    public void sortAnimalsByName(){

        animals = animals.stream().sorted(Comparator.comparing(Animal::getName)).collect(Collectors.toList());
        carnivores = carnivores.stream().sorted(Comparator.comparing(Animal::getName)).collect(Collectors.toList());
        herbivores = herbivores.stream().sorted(Comparator.comparing(Animal::getName)).collect(Collectors.toList());
        omnivores = omnivores.stream().sorted(Comparator.comparing(Animal::getName)).collect(Collectors.toList());
    }

    public void sortPlantsByName(){

        plants = plants.stream().
                sorted(Comparator.comparing(Plant::getName))
                .collect(Collectors.toList());

    }
    public void sortAnimalsByHeight(){
        animals = animals.stream().sorted(Comparator.comparing(Animal::getHeight)).collect(Collectors.toList());
    }

    public void sortPlantsByHeight(){
        plants = plants.stream().sorted(Comparator.comparing(Plant::getHeight)).collect(Collectors.toList());
    }

    public void printAnimals(){
        animals.forEach(System.out::println);
    }

    public void printPlants(){
        plants.forEach(System.out::println);
    }

    public void printNotebook(){

        carnivores.forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------------------");
        omnivores.forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------------------");
        herbivores.forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("PLANTS");
        System.out.println("--------------------------------------------------------------------------------");
        plants.forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------------------");
    }
}
