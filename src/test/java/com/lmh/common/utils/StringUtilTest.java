package com.lmh.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		boolean b = StringUtil.hasLength("");
		System.out.println(b);
	}

	@Test
	public void testHasText() {
		boolean b = StringUtil.hasText(" ");
		System.out.println(b);
	}

	@Test
	public void testRandomChineseString() {
		String s = StringUtil.randomChineseString(3);
		System.out.println(s);
	}

	@Test
	public void testGenerateChineseName() {
		String chinese = StringUtil.generateChineseName();
		System.out.println(chinese);
	}

}
