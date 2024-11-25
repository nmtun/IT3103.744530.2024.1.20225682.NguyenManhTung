public class CartTestTungNM {
    public static void main(String[] args) {
        CartTungNM ordered = new CartTungNM();

        //create new DVD and add to cart
        DVDTungNM dvd1 = new DVDTungNM("Naruto", "Manga", 19.95f);
        ordered.addDVDNmt(dvd1);
        DVDTungNM dvd2 = new DVDTungNM("One Piece", "Anime", 24.95f, "Sumimoto");
        ordered.addDVDNmt(dvd2);
        DVDTungNM dvd3 = new DVDTungNM("Doraemon", "Animation", 21.20f, "Fujio. Fujito", 10);
        ordered.addDVDNmt(dvd3);
        DVDTungNM dvd4 = new DVDTungNM("Dragon Ball", "Super sentai", 99.99f, "Tung dep trai", 90);
        ordered.addDVDNmt(dvd4);

        ordered.checkNullValue(dvd1, dvd2, dvd3, dvd4);

        // tìm kiếm DVD có id=3
        if(ordered.searchByIdNmt(3)) {
            System.out.println("Items has id = 3 is ordered");
        } else {
            System.out.println("No data");
        }
        // tìm kiếm DVD Doraemon
        ordered.searchByTitleNmt("Doraemon"); 
    }
}
