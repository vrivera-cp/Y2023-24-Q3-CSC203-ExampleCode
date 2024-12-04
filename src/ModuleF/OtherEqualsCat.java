package ModuleF;

public class OtherEqualsCat {
    String name;
    int age;

    public OtherEqualsCat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj.getClass() == getClass()) {
            OtherEqualsCat cat = (OtherEqualsCat) obj;
            return (name == null ? cat.name == null : name.equals(cat.name))
                    && age == cat.age;
        }
        return false;
    }
}
