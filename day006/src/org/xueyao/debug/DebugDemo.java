package org.xueyao.debug;
/**
 * �ϵ���Ե����ã�
 *          A���鿴�����ִ������
 *          B�����Գ���
 * �ϵ㣺
 *      ��ʵ����һ�����
 * ������Ӷϵ�
 *      ���ﲻ�������
 * ��μӶϵ�
 *      �� ������������˫��   
 * 
 *  ������мӶϵ�ĳ����أ�
 *      ��������--�Ҽ�--Debug As --Java Application
 *  ����ó�������ִ��
 *      F6
 *  ����Щ����
 *      �������򣺿������ִ������
 *      Debug���򣺿������ִ������
 *      Variables:�������ı仯
 *      Console:������ �����������
 *      
 * ���ȥ���ϵ�
 *      A���ѼӶϵ�Ķ�������һ��
 *      B����Debug��ͼ�У��ҵ�Breakpoints,ѡ��Ҫɾ���Ķϵ㣬���˫X����
 * @author Yao Xue
 * @date Jun 30, 2017 4:05:37 PM
 */
public class DebugDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("c:"+c);
    }
}
