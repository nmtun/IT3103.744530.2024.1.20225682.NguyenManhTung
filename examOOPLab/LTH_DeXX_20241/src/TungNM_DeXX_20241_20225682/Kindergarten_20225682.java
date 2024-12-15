package TungNM_DeXX_20241_20225682;

public class Kindergarten_20225682 extends Child_20225682 {
    private String favoriteToy_20225682;

    public String getFavoriteToy_20225682() {
        return favoriteToy_20225682;
    }

    public void setFavoriteToy_20225682(String favoriteToy) {
        this.favoriteToy_20225682 = favoriteToy;
    }

    public Kindergarten_20225682(String name, int age, String className, String favoriteToy) {
        super(name, age, className);
        this.favoriteToy_20225682 = favoriteToy;
    }

    @Override
    public void displayInfo() {
        //super.displayInfo(); // Gọi phương thức displayInfo của lớp cha
        System.out.println("Do choi yeu thich: " + favoriteToy_20225682);
    }
}
