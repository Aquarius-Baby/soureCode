package com.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Aquarius
 * @time: 2022/9/17 23:30
 * @description:
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("teacherTest.xml");
		Teacher teacher = ac.getBean(Teacher.class);
		System.out.println(teacher.getName());
	}
}
