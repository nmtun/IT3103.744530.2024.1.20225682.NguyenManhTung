package hust.soict.dsai.aims.media;

import java.util.Comparator;

public abstract class MediaTungNM implements Comparable<MediaTungNM>{
    private int id;
    private String title;
    private String category;
    private float price;

    public static final Comparator<MediaTungNM> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<MediaTungNM> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public MediaTungNM() {
        //TODO Auto-generated constructor stub
    }

    public MediaTungNM(String title, float price) {
        this.title = title;
        this.price = price;
    }

    public MediaTungNM(String title, String category, float price) {
        this.title = title;
        this.category = category;
        this.price = price;
    }

    public MediaTungNM(int id, String title, String category, float price) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.price = price;
    }

    // method check title matching    
    public boolean isMatchNmt(String title) {
        return this.getTitle().trim().equalsIgnoreCase(title.trim());
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof MediaTungNM)) return false;
        // 2 media items are considered as indentical if thay same title
        return ((MediaTungNM) o).getTitle().equals(this.title);
    }

    @Override
    public String toString() {
        return "MediaTungNM{" +
                "id" + id + 
                ", title='" + title + '\'' + 
                ", category='" + category + '\'' +
                ", cost=" + price + 
                '}'; 
    }

    @Override
    public int compareTo(MediaTungNM o) {
    // So sánh tiêu đề trước
    int titleCompare = getTitle().compareTo(o.getTitle());
    if (titleCompare != 0) return titleCompare;

    // So sánh giá nếu tiêu đề bằng nhau
    return Double.compare(getPrice(), o.getPrice());
}

    public Object getLength() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLength'");
    }

    public Object getLengt() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLengt'");
    }


}