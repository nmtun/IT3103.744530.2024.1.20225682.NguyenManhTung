package hust.soict.dsai.aims;

import java.util.Scanner;

import hust.soict.dsai.aims.media.*;

public class AimsProjectTungNM {
    public static Scanner scanner = new Scanner(System.in);
    public static StoreTungNM store = new StoreTungNM();
    public static CartTungNM cart = new CartTungNM();

    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        while (true) {
            System.out.println("Nguyen manh Tung 20225682");
            System.out.println("------------------------------------------------------");
            System.out.println("1. View store");
            System.out.println("2. Update store");
            System.out.println("3. See current cart");
            System.out.println("0. Exit");
            System.out.println("------------------------------------------------------");

            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    break;
                case 1: 
                    storeMenu();
                    continue;
                case 2:
                    updateStoreMenu();
                    continue;
                case 3: 
                    cartMenu();
                    continue;
                default:
                    System.out.println("Invalid choice, please try again");
                    break;
            }
            break;
        }
    }

    public static void updateStoreMenu() {
        while (true) {
            System.out.println("Options:");
            System.out.println("------------------------------------------------------");
            System.out.println("1. Add a media");
            System.out.println("2. Remove a media");
            System.out.println("0. Back");
            System.out.println("------------------------------------------------------");
            System.out.println("---> ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    break;
                case 1:
                    MediaTungNM newItem = createNewMedia();
                    store.addMediaTungNM(newItem);
                    continue;
                case 2:
                    System.out.println("Enter the media title: ");
                    scanner.nextLine();
                    String title = scanner.nextLine();
                    store.removeMediaTungNM(title);
                    continue;
                default:
                    System.out.println("Invalid choice, please try again");
                    break;
            }
            break;
        }
    }

    public static MediaTungNM createNewMedia() {
        MediaTungNM item = null;
        System.out.println("Enter the Media info");
        System.out.println("Title: ");
        scanner.nextLine();
        String title = scanner.nextLine();
        System.out.println("Cost: ");
        float price = scanner.nextFloat();

        while (true) {
            System.out.println("Chosse a media type: ");
            System.out.println("1. Book");
            System.out.println("2. DVD");
            System.out.println("3. CD");
            System.out.println("0. Back");

            int choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    break;
                case 1: 
                    item = new BookTungNM(title, price);
                    break;
                case 2: 
                    item = new DVDTungNM(title, price);
                    break;
                case 3: 
                    item = new CompactDiscTungNM(title, price);
                    break;
                default:
                    System.out.println("Invalid choice, please try again");
                    break;
            }
            break;
        }
        return item;
    }

    public static void storeMenu() {
        
    }

}
