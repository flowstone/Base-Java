package org.xueyao.homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * �����⣺�����������󣬲��ô���ʵ��
    ��Ŀ��·������text.txt�ļ����������£�
            �Ұ�����
    123456
    ����IO����֪ʶ��ȡtext.txt�ļ������ݷ�ת��д��text.txt�ļ���
 * @author Yao Xue
 * @date Jul 8, 2017 4:40:46 PM
 */
public class HomeWork_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("text.txt"));
        
       /* char ch = '��';
        System.out.println(ch);*/
        String line;
        String[] str = new String[2];
        while ((line=bufferedReader.readLine())!=null) {
            int i = 0;
            String s = line.trim();
            StringBuffer stringBuffer = new StringBuffer(s);
            stringBuffer.reverse().toString();
           
            System.out.println(stringBuffer);
        }
      //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("text.txt"));
    //bufferedWriter.write(line);
        //bufferedWriter.close();
        bufferedReader.close();
    }
}

