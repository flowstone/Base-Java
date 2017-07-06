package org.xueyao.filewriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * �����д���ݵĲ��裺
 *      A���������������
 *      B����������������д���ݷ�������ˢ�»�����
 *      C���ͷ���Դ
 *      
 *  ���·���� ��Ե�ǰ��Ŀ���Եģ�����Ŀ�ĸ�Ŀ¼��
 *  ����·�� �����̷���ʼ��·��
 *  
 *  close()��flush()����������
 *      flush():ˢ�»�����
 *      close()����ˢ�»�������Ȼ��֪ͨϵͳ�ͷ���Դ
 * @author Yao Xue
 * @date Jul 6, 2017 9:34:19 PM
 */
public class FileWriterDemo2 {
    public static void main(String[] args) throws IOException {
        //�������������
        FileWriter fw = new FileWriter("b.txt");
        
        //��������������д���ݷ�������ˢ�»�����
        fw.write("helloworld");
        fw.flush();
        fw.write("java");
        fw.flush();
        //�ͷ���Դ
        fw.close();
    }
}
