package TungNM_DeXX_20241_20225682;

public class Child_20225682 {
    private String name_20225682;
    private int age_20225682;
    private String className_20225682;

    public String getName_20225682() {
        return name_20225682;
    }

    public void setName_20225682(String name) {
        this.name_20225682 = name;
    }

    public int getAge_20225682() {
        return age_20225682;
    }

    public void setAge_20225682(int age) {
        this.age_20225682 = age;
    }

    public String getClassName_20225682() {
        return className_20225682;
    }

    public void setClassName_20225682(String className) {
        this.className_20225682 = className;
    }

    public Child_20225682 () {}

    public Child_20225682(String name, int age, String className) {
        this.name_20225682 = name;
        this.age_20225682 = age;
        this.className_20225682 = className;
    }

    @Override
    public String toString() {
        return "Child Name: " + name_20225682 + ", Age: " + age_20225682 + ", Class: " + className_20225682;
    }

    public void displayInfo() {
        System.out.println("Thong tin tre: " + "Ten: " + name_20225682 + ", Tuoi: " + age_20225682 + ", Lop hoc: " + className_20225682);
    }
}