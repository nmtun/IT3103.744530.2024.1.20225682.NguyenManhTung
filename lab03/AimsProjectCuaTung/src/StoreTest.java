import hust.soict.dsai.aims.media.StoreNmt;

public class StoreTest {
    public static void main(String[] args) {
        StoreNmt myStore = new StoreNmt();

        DVDTungNM dvd1 = new DVDTungNM("Naruto", "Manga", 19.95f);
        myStore.addDVDNmtStore(dvd1);
        DVDTungNM dvd2 = new DVDTungNM("One Piece", "Anime", 24.95f, "Sumimoto");
        myStore.addDVDNmtStore(dvd2);
        DVDTungNM dvd3 = new DVDTungNM("Doraemon", "Animation", 21.20f, "Fujio. Fujito", 10);
        myStore.addDVDNmtStore(dvd3);
        DVDTungNM dvd4 = new DVDTungNM("Dragon Ball", "Super sentai", 99.99f, "Tung dep trai", 90);
        myStore.addDVDNmtStore(dvd4);

        myStore.removeDVDNmtStore(dvd1);
    }
}
