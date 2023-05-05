import java.util.Arrays;

public final class Dog extends Pet{

    private String name;
    private String breed;
    private String[] commands;

    public Dog(){
        System.out.println("Age: " + super.getAge() +"\nShelter name: Mir\nShelter address: Lenina 1\n" + "Name: Hus\n" + "Breed: Siberian Husky\n" +"Commands: Фас!");
    }

    public Dog(String name, String breed, String[] commands,
               ColorEnum colorEnum, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
        super.setColor(colorEnum);
        super.setShelter(shelter);
    }

    public Dog(String name, String breed,
               ColorEnum colorEnum, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        super.setColor(colorEnum);
        super.setShelter(shelter);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void makeVoice() {
        System.out.println("Гав гав");
    }

    public void makeVoice(String voice) {
        System.out.println(voice);
    }

    public void makeVoice(String voice, String voice2) {
        System.out.println(voice + " " + voice2);
    }

    public final String getInfo() {
        return super.getInfo() +
                "\nName: " + this.name +
                "\nBreed: " + breed +
                "\nCommands: " + Arrays.toString(commands);
    }
}