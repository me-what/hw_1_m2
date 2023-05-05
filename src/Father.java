public class Father extends Grandfather {
    private String name2;
    private int age2;
    private String character2;

    public Father(String name, int age, String character, SmithFamily smithFamily, Generation generation) {
        this.name2 = name;
        this.age2 = age;
        this.character2 = character;
        super.setSmithFamily(smithFamily);
        super.setGeneration(generation);
    }

    public String getName2() {
        return name2;
    }
    public int getAge2() {
        return age2;
    }
    public String getCharacter2() {
        return character2;
    }

    public String info(){
        return "Name: " + name2 + ", age: " + age2 + ", character: " + character2 + ", profession: " + getSmithFamily().getProfession() +
                ", hobby: " + getSmithFamily().getHobby() + ", generation: " + getGeneration() + ", ";
    }
    public void info(String info){
        info = "Senior Java developer";
        System.out.println(name2 + " " + info);
    }
    public final void info(int age){
        System.out.println(name2 + " started programming at the age of " + age + "\n");
    }
}
