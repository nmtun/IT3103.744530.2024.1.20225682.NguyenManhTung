public class TestPassingParameter {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        DVDTungNM jungleDVD = new DVDTungNM("Jungle");
        DVDTungNM cinderellaDVD = new DVDTungNM("Cinderella");

        // swap(jungleDVD, cinderellaDVD);
        // System.out.println("jungle dvd title: " + jungleDVD.getTitleNmt());
        // System.out.println("cinderella dvd title: " + cinderellaDVD.getTitleNmt());

        swapNmt(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitleNmt());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitleNmt());

        changeTitle(jungleDVD, cinderellaDVD.getTitleNmt());
        System.out.println("jungle dvd title: " + jungleDVD.getTitleNmt());
        System.out.println("Toi la Nguyen Manh Tung 20225682");
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

    public static void swapNmt(DVDTungNM dvd1, DVDTungNM dvd2) {
        DVDTungNM tmp = new DVDTungNM(
            dvd1.getTitleNmt(),
            dvd1.getCategoryNmt(),
            dvd1.getPriceNmt(),
            dvd1.getAuthorNmt(),
            dvd1.getLengthNmt()
        );

        dvd1.setTitleNmt(dvd2.getTitleNmt());
        dvd1.setCategoryNmt(dvd2.getCategoryNmt());
        dvd1.setPriceNmt(dvd2.getPriceNmt());
        dvd1.setAuthorNmt(dvd2.getAuthorNmt());
        dvd1.setLengthNmt(dvd2.getLengthNmt());

        dvd2.setTitleNmt(tmp.getTitleNmt());
        dvd2.setCategoryNmt(tmp.getCategoryNmt());
        dvd2.setPriceNmt(tmp.getPriceNmt());
        dvd2.setAuthorNmt(tmp.getAuthorNmt());
        dvd2.setLengthNmt(tmp.getLengthNmt());
    }

}
