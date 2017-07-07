package com.itheima.homework.teacher;

/*
 * ��һ�⣺�����������󣬲��ô���ʵ��
	1.�������·���public static String getPropertyGetMethodName(String property)
		��������:
			(1)�÷����Ĳ���ΪString���ͣ���ʾ�û������ĳ�Ա���������֣�����ֵ����ΪString���ͣ�����ֵΪ��Ա������Ӧ��get����������
			(2)�磺�û����ô˷���ʱ�����Ĳ���Ϊ"name",�÷����ķ���ֵΪ"getName"
	2.�������·���public static String getPropertySetMethodName(String property)
		��������:
			(1)�÷����Ĳ���ΪString���ͣ���ʾ�û������ĳ�Ա���������֣�����ֵ����ΪString���ͣ�����ֵΪ��Ա������Ӧ��set����������
			(2)�磺�û����ô˷���ʱ�����Ĳ���Ϊ"name",�÷����ķ���ֵΪ"setName"
 */
public class Test_01 {
	public static void main(String[] args) {
		System.out.println(getPropertyGetMethodName("nAMe"));
		System.out.println(getPropertySetMethodName("nAMe"));
	}

	// �磺�û����ô˷���ʱ�����Ĳ���Ϊ"name",�÷����ķ���ֵΪ"getName"
	/*
	 * 1,�ַ�����ƴ�� 
	 * 2�� Ҫ����ĸ���д������ı�Сд��Ȼ��ƴ������
	 */
	public static String getPropertyGetMethodName(String property) {
		return getUppewLower(property,"get");
		}

	// �磺�û����ô˷���ʱ�����Ĳ���Ϊ"name",�÷����ķ���ֵΪ"setName"
	/*
	 * 1,�ַ�����ƴ�� 
	 * 2�� Ҫ����ĸ���д������ı�Сд��Ȼ��ƴ������
	 */
	public static String getPropertySetMethodName(String property) {
		return getUppewLower(property,"set");
	}

	private static String getUppewLower(String property,String str) {
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		sb.append(property.substring(0, 1).toUpperCase());
		sb.append(property.substring(1, property.length()).toLowerCase());
		return sb.toString();
	}
}
