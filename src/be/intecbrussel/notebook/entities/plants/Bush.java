package be.intecbrussel.notebook.entities.plants;

public class Bush extends Plant{

    String fruit;
    LeafType leafType;

    Bush(String name) {
        super(name);
    }

    public Bush(String name, double height) {
        super(name, height);
    }

    @Override
    public String toString() {
        return "Bush{" +
          //  "name='" + getName()+'\''+
                "fruit='" + fruit + '\'' +
                ", leafType=" + leafType +
                '}' 
            //+ super.toString()
            ;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }


}
