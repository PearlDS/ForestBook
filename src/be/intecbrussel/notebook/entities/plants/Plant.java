package be.intecbrussel.notebook.entities.plants;

public class Plant {
    String name;
    double height;

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    Plant(String name){
        this.name = name;

    }
    Plant(String name,double height){
        this.name = name;
        setHeight(height);
    }



}
