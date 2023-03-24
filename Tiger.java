public class Tiger extends Animal {
    private String habitat;

    public Tiger(String type, String habitat) {
        super(type, tigersPerEnclosure);
        this.habitat = habitat;
    }

    public String toString() {
        return "Tiger: " + super.toString() + " roams in " + this.habitat;
    }
}

