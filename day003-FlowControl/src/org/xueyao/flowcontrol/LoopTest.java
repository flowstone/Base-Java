package org.xueyao.flowcontrol;

public class LoopTest {
    public static void main(String[] args) {
        //-----------------------------
        /*  int x = 1,y = 1;
            if(x++==2 & ++y==2) {  
                x =7;
            }
            System.out.println("x="+x+",y="+y); 
            int a = 1,b = 1;
            if(a++==2 && ++b==2) {
                a =7;
            }
            System.out.println("a="+a+",b="+b);*/
         //--------------------------------------   
        /*  int x = 2,y=3;
            switch(x)
            {
                default:
                    y++;  //4
                case 3:
                    y++;  
                    break;
                case 4:
                    y++;
            }
            System.out.println("y="+y);*/
        
        //----------------------------
        int x = 1,y = 1;
        if(x++==1 | ++y==1) {
            x =7;
        }
        System.out.println("x="+x+",y="+y);
        
        int a = 1,b = 1;
        if(a++==1 || ++b==1) {
            a =7;
        }
        System.out.println("a="+a+",b="+b);
        
        boolean c = true;

        if(c==false) 
            System.out.println("a");
        else if(c)
            System.out.println("b");//b
        else if(!c)
            System.out.println("c");
        else
            System.out.println("d");
        
    }
}
