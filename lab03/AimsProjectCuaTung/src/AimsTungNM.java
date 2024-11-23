
public class AimsTungNM {
    public static void main(String[] args) {
        //create new cart
        CartTungNM anOrder = new CartTungNM();

        //create new DVD and add to cart
        DVDTungNM dvd1 = new DVDTungNM("Naruto", "Manga", 19.95f);
        //anOrder.addDVDNmt(dvd1);
        DVDTungNM dvd2 = new DVDTungNM("One Piece", "Anime", 24.95f, "Sumimoto");
        //anOrder.addDVDNmt(dvd2);
        DVDTungNM dvd3 = new DVDTungNM("Doraemon", "Animation", 21.20f, "Fujio. Fujito", 10);
        //anOrder.addDVDNmt(dvd3);
        DVDTungNM dvd4 = new DVDTungNM("Dragon Ball", "Super sentai", 99.99f, "Tung dep trai", 90);
        //anOrder.addDVDNmt(dvd4);

        //remove dvd4 
        //anOrder.removeDVDNmt(dvd4);

        //Thêm một mảng các DVD 
        // DVDTungNM[] listDVD = {dvd1, dvd2};
        // anOrder.addDVDNmt(listDVD);

        //Thêm vào số lượng tùy ý các DVD
        //anOrder.addDVDNmtung(dvd1, dvd3);

        //Overloading by differing the number of parameters
        //anOrder.addDVDNmt(dvd1, dvd2);


        //print total price of the items in the cart
        System.out.println("Total price is: " + anOrder.totalPrice() + "$");
    }
}
