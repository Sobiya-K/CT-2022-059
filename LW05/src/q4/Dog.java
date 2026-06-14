package q4;

public class Dog extends Pet {
    public String speak( ) {
        return " ";
    }
    private double weight;

    public Dog() {
        weight = 0.0;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
}
