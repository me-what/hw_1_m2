import java.util.Random;

public class Pet {
    private int age = generetaDefaultAge();
    private ColorEnum colorEnum;
    private Shelter shelter;

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    public ColorEnum getColor() {
        return colorEnum;
    }

    public void setColor(ColorEnum color) {
        this.colorEnum = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int generetaDefaultAge() {
        Random random = new Random();
        return random.nextInt(15)+1;
    }

    public String getInfo() {
        return "Age: " + age +
                "\nShelter name: " + shelter.getName() +
                "\nShelter address: " + shelter.getAddress();
    }

    public void makeVoice() {
        System.out.println("Животное издает звук");
    }
}
