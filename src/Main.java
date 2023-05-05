public class Main {
    public static void main(String[] args) {
        String[] commands = {"Сидеть", "Лежать"};
        Shelter shelter = new Shelter("Mir", "Lenina 1");

        Dog dog = new Dog("Rex", "Ovcharka", commands, ColorEnum.BROWN, shelter);
        System.out.println(dog.getInfo());
        System.out.println();

        dog.makeVoice();
        dog.makeVoice("Гув Гув");
        dog.makeVoice("Гив Гив", "Гив Гив");
        System.out.println();

        Dog dog2 = new Dog();
        System.out.println();

        Dog dog3 = new Dog("Lulu", "German Shepherd", ColorEnum.BLACK, shelter);
        System.out.println(dog3.getInfo());
        System.out.println();


        SmithFamily tom = new SmithFamily("Java Developer","chess");
        Father father = new Father("Tom", 40, "kind", tom, Generation.GENERATION_MILLENNIALS );
        System.out.println(father.info());
        father.info("");
        father.info(10);

        SmithFamily will = new SmithFamily("schoolboy","chess");
        Son son = new Son("Will", 10,"honest", will, Generation.GENERATION_ALPHA, "beginner Java programmer");
        System.out.println(son.info());

        SmithFamily ben = new SmithFamily("schoolboy","hockey");
        Son son2 = new Son("Ben", 9,"vigorous", ben, Generation.GENERATION_ALPHA, "beginner C++ programmer");
        System.out.println(son2.info());
    }
}