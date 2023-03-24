public class Animal implements Enclosure {
    private String type;
    private int occupancy;

    // Default constructor
    public Animal() {
        type = "undefined";
        occupancy = defaultPerEnclosure;
    }

    // Parameterized constructor
    public Animal(String type, int occupancy) {
        this.type = type;
        this.occupancy = occupancy;
    }

    // toString method
    public String toString() {
        return "Number of " + this.type + " per enclosure is " + this.occupancy;
    }
}