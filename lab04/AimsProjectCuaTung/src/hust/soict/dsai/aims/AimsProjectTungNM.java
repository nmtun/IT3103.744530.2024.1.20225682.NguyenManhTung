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
        while (true) {
                System.out.println("Options: ");
                System.out.println("------------------------------------------------------");
                System.out.println("1. See a media's details");
                System.out.println("2. Add a media to cart");
                System.out.println("3. Play media");
                System.out.println("4. See current cart");
                System.out.println("0. Exit");
                System.out.println("------------------------------------------------------");
                System.out.println("Please choose a number: 0, 1, 2, 3, 4");
                System.out.println("--->");

                String title;
                MediaTungNM item;
                int choice = scanner.nextInt();
                switch (choice) {
                    case 0:
                        break;
                    case 1:
                        System.out.println("Enter the media title: ");
                        scanner.nextLine();
                        title = scanner.nextLine();
                        item = store.searchByTitle(title);
                        if(item != null) {
                            mediaDetailMenu(item);
                        }
                        continue;
                    case 2:
                        System.out.println("Enter the media title: ");
                        scanner.nextLine();
                        title = scanner.nextLine();
                        item = store.searchByTitle(title);
                        if(item != null) {
                            cart.addMediaTungNM(item);
                        }
                        continue;
                    case 3:
                        System.out.println("Enter the media title: ");
                        scanner.nextLine();
                        title = scanner.nextLine();
                        item = store.searchByTitle(title);
                        if(item instanceof PlayableTungNM) {
                            ((PlayableTungNM) item).play();
                        } else if (item != null) {
                            System.out.println("This item is not playable");
                        }
                        continue;
                    case 4:
                        cart.printItemsInCartNMT();
                        continue;
                    default:
                        System.out.println("Invalid choise, please try again");
                        continue;
                }
                break;
            }
        }
       

    public static void mediaDetailMenu(MediaTungNM item) {
        while (true) {
            System.out.println("Options: ");
            System.out.println("------------------------------------------------------");
            System.out.println("1. Add to cart");
            System.out.println("2. Play");
            System.out.println("0. Back");
            System.out.println("------------------------------------------------------");
            System.out.println("Please chosse a number: 0, 1, 2");
            System.out.println("--->");

            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    break;
                case 1:
                    cart.addMediaTungNM(item);
                    continue;
                case 2:
                    if(item instanceof BookTungNM) {
                        System.out.println("Books are not playable");
                    } else if (item instanceof PlayableTungNM) {
                        ((PlayableTungNM) item).play();
                    }
                    continue;
                default:
                    System.out.println("Invalid choice, please try again");
                    break;
            }
            break;
        }
    }

    public static void cartMenu() {
        while (true) {
            System.out.println("Options: ");
            System.out.println("------------------------------------------------------");
            System.out.println("1. Filter medias in cart");
            System.out.println("2. Sort medias in cart");
            System.out.println("3. Remove media from cart");
            System.out.println("4. Play media");
            System.out.println("5. Place order");
            System.out.println("0. Back");
            System.out.println("Please choose a number: 0, 1, 2, 3, 4, 5");
            System.out.println("--->");

            int choice = scanner.nextInt();
            String title = null;
            MediaTungNM item = null;
            switch (choice) {
                case 0:
                    break;
                case 1:
                    System.out.println("Enter a title: ");
                    scanner.nextLine();
                    System.out.println(cart.searchByTitleNmt(title));
                    continue;
                case 2:
                    cart.getItemOrdered().sort(MediaTungNM.COMPARE_BY_COST_TITLE);
                    continue;
                case 3:
                    System.out.println("Enter the title: ");
                    scanner.nextLine();
                    title = scanner.nextLine();
                    item  = cart.searchByTitleNmt(title);
                    if(item != null) {
                        cart.removeMediaTungNM(item);
                    }
                    continue;
                case 4:
                    System.out.print(("Enter a title: "));
                    scanner.nextLine();
                    title = scanner.nextLine();
                    item = cart.searchByTitleNmt(title);
                    if (item == null) {
                        continue;
                    }
                    if (item instanceof PlayableTungNM) {
                        ((PlayableTungNM) item).play();
                    } else {
                        System.out.println("Item not playable");
                    }
                    continue;
                case 5:
                    System.out.println("Order info:");
                    System.out.println("Total cost: " + cart.totalPrice());
                    System.out.println("1. Continue\t2. Back");
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            cart.getItemOrdered().clear();
                            System.out.println("Order placed successfully");
                        case 2:
                    break;
                    }
                    continue;
                default:
                System.out.println("Invalid choice, please try again");
                    break;
            }
            break;
        }
    }

}
