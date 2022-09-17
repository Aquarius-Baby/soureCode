package com.example.springdebug.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Aquarius
 * @time: 2022/9/16 00:34
 * @description:
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("teacherTest.xml");
		Teacher teacher = ac.getBean(Teacher.class);
		System.out.println(teacher.getName());
		System.out.println(teacher.getApplicationContext());
	}
}
