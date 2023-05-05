public class Grandfather {
    private String name = "Bob";
    private int age = 70;
    private String character = "wise";
    private SmithFamily smithFamily;
    private Generation generation;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCharacter() {
        return character;
    }

    public SmithFamily getSmithFamily() {
        return smithFamily;
    }

    public void setSmithFamily(SmithFamily smithFamily) {
        this.smithFamily = smithFamily;
    }

    public Generation getGeneration() {
        return generation;
    }

    public void setGeneration(Generation generation) {
        this.generation = generation;
    }
}
