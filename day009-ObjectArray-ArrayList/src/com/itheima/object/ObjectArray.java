package com.itheima.object;
/**
 * @author Yao Xue
 * @date Jul 7, 2017 9:51:28 AM
 */
public class ObjectArray {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        
        Student lili = new Student("Ğ¡Ã÷", 18);
        Student xinxin = new Student("ĞÀĞÀ", 17);
        Student jia = new Student("ÍÈÍæÄê", 28);
        
        students[0] = lili;
        students[1] = xinxin;
        students[2] = jia;
        
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getName()+"-----"+students[i].getAge());
        }
    }
}
