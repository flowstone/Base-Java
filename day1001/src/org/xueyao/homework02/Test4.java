package org.xueyao.homework02;
/**
 * 请用代码描述： 古力娜扎正在看择天记小说(使用匿名对象)
1.定义书类(Book)
   a)属性: 名称(name)
   b)要求:
       i.提供带参构造,setXxx与getXxx方法
2.定义人类(Person)
   a)属性: 名称(name)
   b)行为: 看书: readBook(Book book) 
   c)要求: 提供带参构造
3.定义测试类Test
   a)提供main方法
   b)在main方法中
     i.使用带参构造创建Person对象,name初始化为古力娜扎
     ii.使用该匿名对象,调用readBook(Book book) 方法，使用Book的带参构造创建Book对象,把名称初始化为择天记,把Book的匿名对象作为参数传入readBook(Book book)方法
  c)输出格式
     i.古力娜扎正在看择天记小说
 * @author Yao Xue
 * @date Jul 18, 2017 8:45:45 PM
 */
public class Test4 {
    public static void main(String[] args) {
        Person person = new Person("古力娜扎");
        person.readBook(new Book("择天记"));
    }
}

/*1.定义书类(Book)
a)属性: 名称(name)
b)要求:
    i.提供带参构造,setXxx与getXxx方法
*/

class Book {
    private String name;
    
    public Book(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}

/*2.定义人类(Person)
   a)属性: 名称(name)
   b)行为: 看书: readBook(Book book) 
   c)要求: 提供带参构造
 * */
 class Person {
     private String name;

    public Person(String name) {
        super();
        this.name = name;
    }
     
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //古力娜扎正在看择天记小说
    public void readBook(Book book) {
        System.out.println(name+"正在看"+book.getName()+"小说");
    }
 }