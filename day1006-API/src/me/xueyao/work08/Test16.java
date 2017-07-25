package me.xueyao.work08;
/**
 * @author Yao Xue
 * @date Jul 25, 2017 9:00:36 PM
 */
public class Test16 {
    public static void main(String[] args) {
        String str = "  anglebaby      女    18   515151511  ";
        String[] split = str.trim().split("\\s+");
        int age = Integer.parseInt(split[2]);
        String name = split[0];
        String gender = split[1];
        String qq = split[3];
        Person person = new Person(name, gender, age, qq);
        System.out.println(person.toString());;
    }
}
