package TungNM_DeXX_20241_20225682;

import java.util.ArrayList;

public class SchoolManagement_20225682 {
    private ArrayList<Child_20225682> childList;

    public SchoolManagement_20225682() {
        this.childList = new ArrayList<>();
    }

    public void addChild_20225682(Child_20225682 child) {
        childList.add(child);  // Thêm cháu vào danh sách
    }


    public void displayAll_20225682() {
        if (childList.isEmpty()) {
            System.out.println("Danh sach trong");
        } else {
            System.out.println("Thong tin cac chau: ");
            for (Child_20225682 child : childList) {
                child.displayInfo();  // Hiển thị thông tin từng cháu
            }
        }
    }

    public void searchByName_20225682(String name) {
        boolean found = false;
        for (Child_20225682 child : childList) {
            if (child.getName_20225682().equalsIgnoreCase(name)) {
                child.displayInfo();  // Hiển thị thông tin của cháu tìm thấy
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay chau nao co ten: " + name);
        }
    }

}
