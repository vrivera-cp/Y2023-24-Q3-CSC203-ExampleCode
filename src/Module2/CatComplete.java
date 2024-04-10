package Module2;

public class CatComplete {
    private String name;
    private int age;

    public CatComplete() {}

    public CatComplete(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void getPets(int number) {
        System.out.printf("%s accepts %d pets.", name, number);
    }

    public static void getPets(CatComplete cat, int number) {
        System.out.printf("%s accepts pets.", cat.name, number);
    }
}