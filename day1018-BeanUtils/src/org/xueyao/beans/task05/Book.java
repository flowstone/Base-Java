package org.xueyao.beans.task05;
/**
 * @author Yao Xue
 * @date Aug 10, 2017 8:49:12 PM
 */
public class Book {
    private String bookName;
    private String author;
    private String price;
    private String passDate;
    public Book() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Book(String bookName, String author, String price, String passDate) {
        super();
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.passDate = passDate;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public String getPassDate() {
        return passDate;
    }
    public void setPassDate(String passDate) {
        this.passDate = passDate;
    }
    @Override
    public String toString() {
        return "Book [bookName=" + bookName + ", author=" + author + ", price=" + price + ", passDate=" + passDate
                + "]";
    }
    
    
}
