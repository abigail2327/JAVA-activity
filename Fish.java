public class Fish extends Animal {
    private String waterType;

    public Fish(String type, String waterType) {
        super(type, fishPerEnclosure);
        this.waterType = waterType;
    }

    // toString method
    public String toString() {
        return "Fish: " + super.toString() + " swims in " + this.waterType;
    }
}