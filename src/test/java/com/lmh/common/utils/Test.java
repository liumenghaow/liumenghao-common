package com.lmh.common.utils;

import java.util.Date;

public class Test {
	public static void main(String[] args) {
		for (int i = 0; i <10000; i++) {
			Person p=new Person();
			p.setName(StringUtil.generateChineseName());
			p.setAge(RandomUtil.random(1,120));
			p.setAbout(StringUtil.randomChineseString(140));
			p.setCreated(new Date(123123123l));
			System.out.println(p);
		}
		
	}
}
