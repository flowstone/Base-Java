package org.xueyao_06;
/**
 * ���������
 * @author Yao Xue
 * @date Jul 3, 2017 4:21:09 PM
 */
public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        
        car.setBrand("һ�Ŵ�����Ŀ�");
        car.setPrice(9999);
        car.setColor("��ɫ");
        
        System.out.println("С����һ������Ʒ����"+car.getBrand()+",��������ɫ��"+car.getColor()+
                ",����������ʮ��Ĺ���,�۸���"+car.getPrice()+"Ԫ");
        
        car.run();
    }
}
