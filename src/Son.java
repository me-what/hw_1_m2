public final class Son extends Father{
    private String profession2;

    public Son(String name, int age, String character, SmithFamily smithFamily, Generation generation, String profession2) {
        super(name, age, character, smithFamily, generation);
        this.profession2 = profession2;
    }

    @Override
    public String info() {
        return super.info() + "serious hobby: " + profession2 + "\n";
    }
}