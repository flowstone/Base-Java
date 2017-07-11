package com.heima.cn;
/*
 * 1.定义一个学生类Student，在类中定义两个属性name(姓名)：String类型，score(分数)：int类型，并将其私有化，提供get/set方法
 */
public class Student {
	private String name;
	private int score;
	public Student() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
}
