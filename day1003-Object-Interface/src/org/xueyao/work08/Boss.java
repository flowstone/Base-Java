package org.xueyao.work08;
/**
 * @author Yao Xue
 * @date Jul 22, 2017 9:43:34 AM
 */
public class Boss {
    public static void main(String[] args) {
        goToWork(new AdminStaff("行政部-001","张丽",10000));
        goToWork(new Developer("开发部-101","贾笑林",18888));
        goToWork(new Treasurer("财务部-201","王欣欣",6666));
        
        goToActed(new AdminStaffActed("行政部-001","张丽",10000));
        goToActed(new DeveloperActed("开发部-101","贾笑林",18888));
        goToActed(new TreasurerActed("财务部-201","王欣欣",6666));
    }
    
    public static void goToWork(Employee e) {
        if (e instanceof AdminStaff) {
            ((AdminStaff)e).work();
        } else if (e instanceof Developer) {
            ((Developer)e).work();
        } else if (e instanceof Treasurer) {
            ((Treasurer)e).work();
        }
    }
    
    public static void goToActed(Actor a) {
        if (a instanceof AdminStaffActed) {
            ((AdminStaffActed)a).play();
        } else if (a instanceof DeveloperActed) {
            ((DeveloperActed)a).play();
        } else if (a instanceof TreasurerActed) {
            ((TreasurerActed)a).play();
        }
    }
}
