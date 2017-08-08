package org.xueyao.bookmanageros.task05;
/**
 * @author Yao Xue
 * @date Aug 7, 2017 7:59:49 PM
 */
public class Book {
    private String bookId;
    private String bookAuthor;
    private String bookPress;
    private String bookDate;
    private double bookPrice;
    private int bookCount;
    public Book() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Book(String bookId, String bookAuthor, String bookPress, String bookDate, double bookPrice, int bookCount) {
        super();
        this.bookId = bookId;
        this.bookAuthor = bookAuthor;
        this.bookPress = bookPress;
        this.bookDate = bookDate;
        this.bookPrice = bookPrice;
        this.bookCount = bookCount;
    }
    public String getBookId() {
        return bookId;
    }
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
    public String getBookAuthor() {
        return bookAuthor;
    }
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
    public String getBookPress() {
        return bookPress;
    }
    public void setBookPress(String bookPress) {
        this.bookPress = bookPress;
    }
    public String getBookDate() {
        return bookDate;
    }
    public void setBookDate(String bookDate) {
        this.bookDate = bookDate;
    }
    public double getBookPrice() {
        return bookPrice;
    }
    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }
    public int getBookCount() {
        return bookCount;
    }
    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }
    @Override
    public String toString() {
        return bookId + ", " + bookAuthor + ", " + bookPress + ", "
                + bookDate + ", " + bookPrice + ", " + bookCount;
    }
    
    
}
