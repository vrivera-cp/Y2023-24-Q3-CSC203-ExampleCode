package Module2;

public class CatMain {
    public static void main(String[] args) {
        Cat mochi = new Cat();
        Cat harvest = new Cat();

        mochi.name = "Mochi";
        mochi.age = 5;

        System.out.printf("%s, %d years old%n", mochi.name, mochi.age);
        System.out.printf("%s, %d years old%n", harvest.name, harvest.age);
    }
}
