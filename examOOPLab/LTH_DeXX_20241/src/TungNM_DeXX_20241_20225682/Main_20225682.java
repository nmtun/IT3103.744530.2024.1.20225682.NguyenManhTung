package TungNM_DeXX_20241_20225682;
import java.util.Scanner;

public class Main_20225682 {
     public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        SchoolManagement_20225682 schoolManagament = new SchoolManagement_20225682();

        Child_20225682 child1 = new Child_20225682("Tung", 1, "Mam non");
        Child_20225682 child2 = new Child_20225682("Tu", 3, "Mam non");
        Child_20225682 child3 = new Child_20225682("Khanh", 4, "Mau giao");
        Child_20225682 child4 = new Child_20225682("Phuc", 5, "Mau giao");
        Child_20225682 child5 = new Child_20225682("Khanh", 6, "Mau giao");

        schoolManagament.addChild_20225682(child1);
        schoolManagament.addChild_20225682(child2);
        schoolManagament.addChild_20225682(child3);
        schoolManagament.addChild_20225682(child4);
        schoolManagament.addChild_20225682(child5);

        showMenu(schoolManagament);
    }

    public static void showMenu(SchoolManagement_20225682 schoolManagament) {
        while (true) {
            System.out.println("Quan ly truong mam non - 20225682 - Nguyen Manh Tung - 20241 - 9.12");
            System.out.println("-------------------------------------------------------------------");
            System.out.println("1. Them chau");
            System.out.println("2. Hien thi danh sach tat ca cac chau");
            System.out.println("3. Tim kiem va hien thi thong tin");
            System.out.println("4. Thoat - Nguyen Manh Tung - 20225682");
            System.out.println("-------------------------------------------------------------------");

            int choice = scanner.nextInt();
            switch (choice) {
                case 4:
                    System.out.println("Thoat khoi chuong trinh - Nguyen Manh Tung - 20225682");
                    break;
                case 1: 
                    addChild(schoolManagament);
                    continue;
                case 2:
                    printList(schoolManagament);
                    continue;
                case 3: 
                    System.out.println("Tim kiem - Nguyen Manh Tung - 20225682");
                    System.out.println("Nhap ten chau can tim: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    schoolManagament.searchByName_20225682(name);
                    //searchChild(schoolManagament);
                    continue;
                default:
                    System.out.println("Lua chon khong hop le, vui long chon lai");
                    break;
            }
            break;
        }
    }

    public static void addChild(SchoolManagement_20225682 schoolManagament) {
        while (true) {
            System.out.println("Nhap du lieu - Nguyen Manh Tung - 20225682");
            System.out.println("-------------------------------------------------------------------");
            System.out.println("a. Them chau mam non (Preschooler_20225682)");
            System.out.println("b. them chau mau giao (Kindergarten_20225682)");
            System.out.println("0. Thoat - Nguyen Manh Tung - 20225682");
            System.out.println("-------------------------------------------------------------------");

            String choice = scanner.nextLine();
            switch (choice) {
                case "a":
                    // Nhập thông tin cho cháu mầm non
                    System.out.println("Nguyen Manh Tung - 20225682");
                    System.out.println("Nhap ho ten:");
                    String name = scanner.nextLine();
                    System.out.println("Nhap tuoi:");
                    int age = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhap lop hoc:");
                    String className = scanner.nextLine();
                    System.out.println("Nhap nguoi giam ho:");
                    String guardian = scanner.nextLine();

                    // Tạo đối tượng Preschooler và hiển thị thông tin
                    Preschooler_20225682 preschooler = new Preschooler_20225682(name, age, className, guardian);
                    preschooler.displayInfo();
                    break;
                case "b":
                    // Nhập thông tin cho cháu mẫu giáo
                    System.out.println("Nguyen Manh Tung - 20225682");
                    System.out.println("Nhap ho ten:");
                    String nameKindergarten = scanner.nextLine();
                    System.out.println("Nhap tuoi:");
                    int ageKindergarten = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhap lop hoc:");
                    String classNameKindergarten = scanner.nextLine();
                    System.out.println("Nhap do choi yeu thich:");
                    String favoriteToy = scanner.nextLine();

                    // Tạo đối tượng Kindergarten và hiển thị thông tin
                    Kindergarten_20225682 kindergarten = new Kindergarten_20225682(nameKindergarten, ageKindergarten, classNameKindergarten, favoriteToy);
                    kindergarten.displayInfo();
                    break;
                case "0":
                    System.out.println("Thoat chuong trinh.");
                    return;  // Thoát khỏi hàm addChild()
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
                    break;
            }
        }
    }

    public static void printList(SchoolManagement_20225682 schoolManagament) {
        System.out.println("Hien thi thong tin - Nguyen Manh Tung - 20225682");
        schoolManagament.displayAll_20225682();
    }

    public static void searchChild(SchoolManagement_20225682 schoolManagament) {
        // Tìm kiếm và hiển thị thông tin
        System.out.println("Nhap ten chau can tim:");
        scanner.nextLine();
        String name = scanner.nextLine();
        schoolManagament.searchByName_20225682(name);
    }
}
