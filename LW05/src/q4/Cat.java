package q4;

public class Cat extends Pet {
    public String speak( ) {
        return " ";
    }

    private String coatColor;

    public Cat() {
        coatColor = "Unknown";
    }

    public String getCoatColor() {
        return coatColor;
    }
    public void setCoatColor(String coatColor) {
        this.coatColor = coatColor;
    }
}
