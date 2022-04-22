package be.intecbrussel.notebook.entities.plants;

public class Weed extends Plant{

    private double area;

    Weed(String name) {
        super(name);
    }

    public Weed(String name, double height) {
        super(name, height);
    }

    @Override
    public String toString() {
        return "Weed{" +
                "area=" + area +
                '}';
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }


}
