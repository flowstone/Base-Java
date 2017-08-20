package org.xueyao.domain;

import java.util.List;
import java.util.Scanner;

import org.xueyao.service.ProductService;
import org.xueyao.utils.Product;

/**
 * @author Yao Xue
 * @date Aug 19, 2017 10:16:58 AM
 */
public class WebTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("请输入以下指令进行操作:");
            System.out.println("c:创建、u：修改、d:删除、da：删除所有、i:通过id查询、fa:查询所有、q:退出");
            
            //接受用户输入的指令
            String choose = sc.nextLine().trim();
            //根据用户输入的指令判断操作
            
            switch(choose) {
                case "a":
                    findByPage(sc);
                    break;
                case "c":
                    save(sc);
                    break;
                case "u":
                    update(sc);
                    break;
                case "d":
                    deleteById(sc);
                    break;
                case "da":
                    deleteAll(sc);
                    break;
                case "i":
                    findProductById(sc);
                    break;
                case "fa":
                    findAllProduct();
                    break;
                case "q":
                    System.out.println("退出程序");
                    System.exit(0);
                    break;
                default:
                    System.out.println("请输入正确的指令!");
                    break;
            }
        }
    }
    /**
     * 查询所有商品
     */
    public static void findAllProduct() {
        //直接调用service层的findAllProduct方法查询所有的商品
        ProductService productService = new ProductService();
        List<Product> proList = productService.findAllProduct();
        System.out.println("查询结果：");
        for (Product product : proList) {
            System.out.println(product);
        }
    }

    private static void findProductById(Scanner sc) {
        System.out.println("请输入查询编号");
        //接受用户输入的值
        int pid = Integer.parseInt(sc.nextLine().trim());
        //直接调用service层的方法
        ProductService productService = new ProductService();
        Product product = productService.findProductById(pid);
        
        if (product == null) {
            System.out.println("商品不存在");
        } else {
            System.out.println("商品信息: "+product);
        }
    }

    private static void deleteAll(Scanner sc) {
        // TODO Auto-generated method stub
        
    }

    private static void deleteById(Scanner sc) {
        System.out.println("请输入删除的商品的编号 :");
        int pid = Integer.parseInt(sc.nextLine().trim());
        ProductService productService  = new ProductService();
        Product product = productService.findProductById(pid);
        if (product == null) {
            System.out.println("商品不存在");
        } else {
            System.out.println("商品信息:"+product);
            System.out.println("是否确定要删除?请输入y");
            
            String choose = sc.nextLine().trim();
            if ("y".equals(choose)) {
                productService.deleteById(pid);
            } else {
                System.out.println("取消操作");
            }
        }
    }

    private static void update(Scanner sc) {
        System.out.println("请输入编辑商品编号:");
        int pid = Integer.parseInt(sc.nextLine());
        ProductService productService = new ProductService();
        Product product = productService.findProductById(pid);
        
        if (product == null) {
            System.out.println("商品不存在");
        } else {
            System.out.println("商品信息:"+product);
            System.out.println("请输入修改后的商品名称:");
            
            String pname = sc.nextLine().trim();
            System.out.println("请输入修改后的商品的价格:");
            
            int price = Integer.parseInt(sc.nextLine().trim());
            product.setPname(pname);
            product.setPrice(price);
            
            boolean flag = productService.update(product);
            if (flag) {
                System.out.println("修改成功");
            } else {
                System.out.println("修改失败");
            }
        }
    }

    private static void save(Scanner sc) {
        System.out.println("请输入商品名称:");
        //接受用户输入的商品名称
        String pname = sc.nextLine().trim();
        System.out.println("请输入价格:");
        //接受用户输入的商品价格
        int price = Integer.parseInt(sc.nextLine().trim());
        //将商品的信息封装成javaBean
        Product product = new Product(1,pname, price, "1","c001");
        //直接调用service层的方法完成插入数据的操作
        ProductService productService = new ProductService();
        productService.save(product);
    }

    private static void findByPage(Scanner sc) {
        // TODO Auto-generated method stub
        
    }
}
