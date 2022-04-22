package be.intecbrussel.notebook.app;


import be.intecbrussel.notebook.entities.animals.Animal;
import be.intecbrussel.notebook.entities.animals.Cornivore;
import be.intecbrussel.notebook.entities.animals.Herbivore;
import be.intecbrussel.notebook.entities.animals.Omnivore;
import be.intecbrussel.notebook.entities.plants.*;
import be.intecbrussel.notebook.service.ForestNotebook;

import java.util.LinkedHashSet;
import java.util.Set;

public class NatureApp {
    public static void main(String[] args) {
        ForestNotebook forestNotebook = new ForestNotebook();

        //PLANTS
        Plant plant1 = new Tree("Acacia",3.5);
        ((Tree) plant1).setLeafType(LeafType.HAND);
        Plant plant2 = new Flower("Lilly",0.54);
        ((Flower) plant2).setSmell(Scent.SWEET);
        Plant plant3 = new Weed("Orchid",1.30);
        ((Weed) plant3).setArea(75);
        Plant plant4 = new Bush("apple tree",1.60);
        ((Bush) plant4).setFruit("apples");
        ((Bush) plant4).setLeafType(LeafType.SPEAR);
        Plant plant5 = new Bush("Corn",2.80);
        ((Bush) plant5).setFruit("Corn");
        ((Bush) plant5).setLeafType(LeafType.NEEDLE);
        Plant plant6 = new Flower("Rose",10);
        ((Flower) plant6).setSmell(Scent.MUSKY);
        forestNotebook.addPlant(plant1);
        forestNotebook.addPlant(plant2);
        forestNotebook.addPlant(plant3);
        forestNotebook.addPlant(plant4);
        forestNotebook.addPlant(plant5);
        forestNotebook.addPlant(plant6);


        //ANIMALS
        //Carnivores
        Animal animal1 = new Cornivore("Cheetah",70,0.80,2.3);
        ((Cornivore) animal1).setMaxFoodSize(500);
        Animal animal2 = new Cornivore("Lion",450,1.45,2.30);
        ((Cornivore) animal2).setMaxFoodSize(800);
        Animal animal3 = new Cornivore("Bear",180,1.80,0.60);
        ((Cornivore) animal3).setMaxFoodSize(85);

        //Herbivores
        Set<Plant> plantDiet = new LinkedHashSet<>();
        plantDiet.add(plant2);
        plantDiet.add(plant3);
        plantDiet.add(plant4);
        plantDiet.add(plant5);

        Animal animal4 = new Herbivore("horse",500,3.10,2.40);
        ((Herbivore) animal4).setPlantDiet(plantDiet);
        Animal animal5 = new Herbivore("kangaroo,",110,1.90,0.75);
        ((Herbivore) animal5).setPlantDiet(plantDiet);
        Animal animal6 = new Herbivore("camel",170,2.50,2.30 );
        ((Herbivore) animal6).setPlantDiet(plantDiet);
        ((Herbivore) animal6).addPlantToDiet(plant6);

        //Omnivores
        Animal animal7 = new Omnivore("chicken",15,0.50,0.45);
        ((Omnivore) animal7).setMaxFoodSize(1.5);
        ((Omnivore) animal7).setPlantDiet(plantDiet);
        Animal animal8 = new Omnivore("pig",300,0.9,1.4);
        ((Omnivore) animal8).setMaxFoodSize(22);
        ((Omnivore) animal8).setPlantDiet(plantDiet);
        Animal animal9 = new Omnivore("monkey",80,1.50,0.60);
        ((Omnivore) animal9).setMaxFoodSize(15);
        ((Omnivore) animal9).setPlantDiet(plantDiet);
        forestNotebook.addAnimal(animal1);
        forestNotebook.addAnimal(animal2);
        forestNotebook.addAnimal(animal3);
        forestNotebook.addAnimal(animal4);
        forestNotebook.addAnimal(animal5);
        forestNotebook.addAnimal(animal6);
        forestNotebook.addAnimal(animal7);
        forestNotebook.addAnimal(animal8);
        forestNotebook.addAnimal(animal9);


        System.out.println("I saw " + forestNotebook.getPlantCount() +" plants along the way");
        System.out.println("I saw " + forestNotebook.getAnimalCount() + " animals along the way");

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("unsorted list of animals and plants");
        System.out.println("--------------------------------------------------------------------------------");
        forestNotebook.printNotebook();

        System.out.println("animals are printed by category");
        System.out.println("carnivores: \n " + forestNotebook.getCarnivores());
        System.out.println("omnivores: \n " + forestNotebook.getOmnivores());
        System.out.println("herbivores: \n " + forestNotebook.getHerbivores());

        forestNotebook.sortPlantsByName();
        forestNotebook.sortAnimalsByName();

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("ALPHABETICALLY SORTED");
        forestNotebook.printNotebook();



        forestNotebook.sortAnimalsByHeight();
        forestNotebook.sortPlantsByHeight();


        System.out.println("Animals sorted by height:\n");
        forestNotebook.printAnimals();
        System.out.println("\nPlants sorted by height: \n");
        forestNotebook.printPlants();

    }
}
