package q1;

public class Pet {
    private String name;
    private String type;

    public Pet(){
        this.name = "Unknown";
        this.type = "Unknown";
    }

    public Pet(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName( ) {
        return name;
    }
    public void setName(String petName) {
        name = petName;
    }

    public String getType( ) {
        return type;
    }
    public void setType(String petType) {
        type = petType;
    }

    public String speak( ) {
        return "I'm your cuddly little pet.";
    }
}
