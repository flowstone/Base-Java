package org.xueyao.domain;

import org.xueyao.service.ProductService;
import org.xueyao.util.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author XueYao
 * @date 2017-08-20
 */
public class MainApp {
    public static void main(String[] args) {
        System.out.println("欢迎来到商品管理系统");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入指令");
            System.out.println("c:创建、u:修改、d：删除、da：删除所有、i:通过id查询、fa：查询所有、q：退出");
            //接受用户输入的数据
            String choose = sc.nextLine().trim();
            switch (choose) {
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
                    findAll();
                    break;
                case "q":
                    System.out.println("欢迎下次再来");
                    System.exit(0);
                    break;
                default :
                    System.out.println("请输入正确的指令");
                    break;
            }
        }
    }
    private static void findAll() {
        ProductService productService = new ProductService();
        List<Product> proList = productService.findAll();
        System.out.println("查询结果");
        for (Product product : proList) {
            System.out.println(product);
        }
    }

    private static void findProductById(Scanner sc) {
        System.out.println("请输入查询商品的编号:");
        //接受用户输入的信息
        int pid = Integer.parseInt(sc.nextLine().trim());
        ProductService productService = new ProductService();
        Product product = productService.findProductById(pid);
        if (product != null) {
            System.out.println("查询结果:" + product);
        } else {
            System.out.println("商品不存在");
        }
    }

    private static void save(Scanner sc) {
        System.out.println("请输入商品的名称");
        //接受用户输入商品的名称
        String pname = sc.nextLine().trim();
        System.out.println("请输入商品的价格");
        double price = Double.parseDouble(sc.nextLine().trim());

        Product product = new Product();
        product.setPname(pname);
        product.setPrice(price);

        ProductService productService = new ProductService();
        boolean flag = productService.save(product);
        if (flag) {
            System.out.println("添加成功");
        } else {
            System.out.println("出现异常，添加失败");
        }
    }

    private static void update(Scanner sc) {
        System.out.println("请输入商品的编号：");
        int pid = Integer.parseInt(sc.nextLine().trim());
        ProductService productService = new ProductService();
        Product product = productService.findProductById(pid);
        if (product == null) {
            System.out.println("商品不存在");
        } else {
            System.out.println("查询结果："+product);
            System.out.println("请输入修改的商品的名称");

            String pname = sc.nextLine().trim();
            System.out.println("请输入修改的商品的价格");
            double price = Double.parseDouble(sc.nextLine().trim());

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

    private static void deleteById(Scanner sc) {
        System.out.println("请输入删除商品的编号：");
        int pid = Integer.parseInt(sc.nextLine().trim());

        ProductService productService = new ProductService();
        Product product = productService.findProductById(pid);
        if (product == null) {
            System.out.println("该商品不存在");
        } else {
            System.out.println("商品信息：" + product);
            System.out.println("是否确认删除?请输入y");
            String choose = sc.nextLine().trim();

            if ("y".equals(choose)) {
                boolean flag = productService.deleteById(pid);
                if (flag) {
                    System.out.println("删除成功");
                } else {
                    System.out.println("删除失败");
                }
            } else {
                System.out.println("取消操作");
            }
        }
    }
    
    private static void deleteAll(Scanner sc) {
        System.out.println("进入批量删除模式，(输入-1退出)");
        ProductService productService = new ProductService();
        //创建一个list集合将id值保存起来
        ArrayList<Integer> pids = new ArrayList<Integer>();
        while (true) {
            System.out.println("请输入商品的编号：");
            //接受用户输入的编号
            int pid = Integer.parseInt(sc.nextLine().trim());
            if (pid == -1) {
                break;
            }
            //调用service层的查询方法
            Product product = productService.findProductById(pid);
            if (product == null) {
                System.out.println("该商品不存在");
            } else {
                //如果商品存在，才做删除的操作
                pids.add(pid);
                System.out.println("商品信息："+product);
            }
        }

        System.out.println("确定删除被标记的"+pids.size()+"个商品?请输入y");
        //接受用户输入的值
        String choose = sc.nextLine().trim();
        if ("y".equals(choose)) {
            //删除
            boolean flag = productService.deleteAll(pids);
            if (flag) {
                System.out.println("删除成功");
            } else {
                System.out.println("出现异常，删除失败");
            }
        } else {
            System.out.println("取消操作");
        }
    }
}
