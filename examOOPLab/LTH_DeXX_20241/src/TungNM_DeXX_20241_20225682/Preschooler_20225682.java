package TungNM_DeXX_20241_20225682;

public class Preschooler_20225682 extends Child_20225682{
    private String guardian_20225682;

    public String getGuarian_20225682() {
        return guardian_20225682;
    }

    public void setGuardian_20225682(String guardian) {
        this.guardian_20225682 = guardian;
    }

    public Preschooler_20225682 (String name, int age, String className, String guardian) {
        super(name, age, className);
        this.guardian_20225682 = guardian;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Gọi phương thức displayInfo của lớp cha
        System.out.println("Nguoi giam ho: " + guardian_20225682);
    }
}
