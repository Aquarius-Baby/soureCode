package com.learn;

import org.springframework.stereotype.Component;

/**
 * @author: Aquarius
 * @time: 2022/9/17 23:29
 * @description:
 */
@Component
public class Teacher {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
