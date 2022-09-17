package com.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Aquarius
 * @time: 2022/9/18 01:29
 * @description:
 */
public class MyDemo {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("teacherxml.xml");
		Teacher teacher = (Teacher) applicationContext.getBean("teacher");
		System.out.println(teacher.getName());
		System.out.println(teacher.getApplicationContext());
	}
}
