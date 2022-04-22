package be.intecbrussel.notebook.entities.plants;

public class Flower extends Plant{

    Scent smell;

    Flower(String name) {
        super(name);
    }

    public Flower(String name, double height) {
        super(name, height);
    }

    @Override
    public String toString() {
        return "Flower{" +
                "smell=" + smell +
                '}';
    }

    public Scent getSmell() {
        return smell;
    }

    public void setSmell(Scent smell) {
        this.smell = smell;
    }


}
