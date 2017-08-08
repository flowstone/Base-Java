package org.xueyao.bookmanageros.task05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * c
 * 图书编号：
 * 作者：
 * 出版社：
 * 出版日期：
 * 单价：
 * 数量：
 * @author Yao Xue
 * @date Aug 7, 2017 7:45:39 PM
 */
public class BookDao {
    private ArrayList<Book> bookInfo = new ArrayList<Book>();
    private String bookPath = "book_information_data.txt";
    
    @MyTest
    public void addBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("图书编号：");
        String bookId = sc.nextLine();
        for (Book b : bookInfo) {
            if (bookId.equals(b.getBookId())) {
                System.out.println("对不起,您输入的图片编号:"+bookId+",数据库中已经存在,请您输入其它编号");
                return;
            }
        }
        
        System.out.println("作者:");
        String bookAuthor = sc.nextLine().trim();
        System.out.println("出版社:");
        String bookPress = sc.nextLine().trim();
        System.out.println("出版日期(格式:xxxx-xx-xx)");
        String bookDate = sc.nextLine().trim();
        System.out.println("单价:");
        double bookPrice = sc.nextDouble();
        System.out.println("数量:");
        int bookCount = sc.nextInt();
        Book book = new Book(bookId, bookAuthor, bookPress, bookDate, bookPrice, bookCount);
        bookInfo.add(book);
        
    }
    @MyTest
    public void editBook() {
        
    }
    
    public void deleteBook() {
        
    }
    
    public void queryBook() {
        
    }
    
    public void writeFile(ArrayList<Book> books, String bookPath) throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter(bookPath));
        
        for (Book book : books) {
            Book b = book;
            bw.write(b.toString());
            bw.newLine();
        }
        
        bw.close();
    }
    
    public void readFile(ArrayList<Book> books, String bookPath) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(bookPath));
        String bookLine = null;
        while ((bookLine=br.readLine())!= null) {
            String[] book = bookLine.split(",");
            books.add(new Book(book[0], book[1], book[2], book[3], Double.parseDouble(book[4]), Integer.parseInt(book[5])));
        }
        br.close();
    }
}

