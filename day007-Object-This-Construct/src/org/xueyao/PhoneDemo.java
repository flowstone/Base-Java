package org.xueyao;
/**
 * �ֻ���Ĳ�����
 * @author Yao Xue
 * @date Jul 3, 2017 10:40:51 AM
 */
public class PhoneDemo {
    public static void main(String[] args) {
        //��������
        Phone p = new Phone();
        
        //�����Ա����ֵ 
        System.out.println("Ʒ�ƣ�"+p.brand);
        System.out.println("�۸�"+p.price);
        System.out.println("��ɫ��"+p.color);
        System.out.println("-------------");
        //����Ա������ֵ
        p.brand = "����";
        p.price = 2999;
        p.color = "��ɫ";
        
      //�����Ա����ֵ 
        System.out.println("Ʒ�ƣ�"+p.brand);
        System.out.println("�۸�"+p.price);
        System.out.println("��ɫ��"+p.color);
        System.out.println("-------------");
        
        
        //���ó�Ա����
        
        p.call("����ϼ");
        p.sendMessage();
    }
}
