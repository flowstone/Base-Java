package org.xueyao.day009_02;
/**
 * @author Yao Xue
 * @date Jul 18, 2017 11:48:41 AM
 */
public class FlowerBook {
    public static void main(String[] args) {
        ����Ⱥ С�� = new ����Ⱥ();
            С��.�Թ�(); 
    }
}

abstract class �������� {
    public abstract void �Թ�();
}

class ����Ⱥ extends �������� {

    @Override
    public void �Թ�() {
        // TODO Auto-generated method stub
        System.out.println("����ǩ");
    }
    
}

class ��ƽ֮ extends �������� {

    @Override
    public void �Թ�() {
        // TODO Auto-generated method stub
        System.out.println("��ָ�׵�");
    }
    
}

class �������� extends �������� {

    @Override
    public void �Թ�() {
        // TODO Auto-generated method stub
        System.out.println("�ô���");
    }
    
}