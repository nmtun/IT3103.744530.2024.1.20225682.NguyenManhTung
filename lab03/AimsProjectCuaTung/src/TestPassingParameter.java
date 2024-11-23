public class TestPassingParameter {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        DVDTungNM jungleDVD = new DVDTungNM("Jungle");
        DVDTungNM cinderellaDVD = new DVDTungNM("Cinderella");

        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitleNmt());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitleNmt());

        changeTitle(jungleDVD, cinderellaDVD.getTitleNmt());
        System.out.println("jungle dvd title: " + jungleDVD.getTitleNmt());
    }

    public static void swap(Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

    public static void changeTitle(DVDTungNM dvd, String title) {
        String oldTitle = dvd.getTitleNmt();
        dvd.setTitleNmt(title);
        dvd = new DVDTungNM(oldTitle);
    }
}
