package q04;

public class Bicycle {
    // Data Member
    private Owner owner;

    //Constructor: Initialises the data member
    public Bicycle() {
        owner = new Owner();
    }

    public Bicycle(Owner owner) {
        this.owner = owner;
    }

    //Returns the name of this bicycle's owner
    public Owner getOwner() {
        return owner;
    }

    //Assigns the name of this bicycle's owner
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

}
