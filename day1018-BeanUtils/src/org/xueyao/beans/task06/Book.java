package org.xueyao.beans.task06;
/**
 * @author Yao Xue
 * @date Aug 10, 2017 9:40:37 PM
 */
public class Book {
    private String title;
    private String publishDate;
    private int price;
    private String publishingHouse;
    private String author;
    public Book() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Book(String title, String publishDate, int price, String publishingHouse, String author) {
        super();
        this.title = title;
        this.publishDate = publishDate;
        this.price = price;
        this.publishingHouse = publishingHouse;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getPublishDate() {
        return publishDate;
    }
    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getPublishingHouse() {
        return publishingHouse;
    }
    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    @Override
    public String toString() {
        return "Book [title=" + title + ", publishDate=" + publishDate + ", price=" + price + ", publishingHouse="
                + publishingHouse + ", author=" + author + "]";
    }
    
    
}
