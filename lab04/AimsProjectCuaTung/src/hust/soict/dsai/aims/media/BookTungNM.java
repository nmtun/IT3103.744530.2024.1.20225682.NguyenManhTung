package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class BookTungNM extends MediaTungNM{
   
    private List<String> authors = new ArrayList<String>();

    // Default constructor
    public BookTungNM() {
        //super();
    }

    // // Constructor with 4 parameters to match the parent class constructor
    // public BookTungNM(int id, String title, String category, float price) {
    //     super(id, title, category, price);
    // }

    // // Constructor with 3 parameters 
    // public BookTungNM(String title, String category, float price) {
    //     super(title, category, price);
    // }

    public void addAuthor(String name) {
        if(!authors.contains(name)) {
            System.out.println("Author " + name + " already exist");
        } else {
            authors.add(name);
            System.out.println("Author " + name + " has been added successfully");
        }
    }

    public void removeAuthor(String name) {
        if(authors.contains(name)) {
            System.out.println("Author " + name + " does not exist");
        } else {
            authors.remove(name);
            System.out.println("Author " + name + " has been removed");
        }
    }
}
