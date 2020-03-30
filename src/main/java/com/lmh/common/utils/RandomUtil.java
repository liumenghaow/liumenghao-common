package com.lmh.common.utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomUtil {
	/**
	 * 随机数工具类
	 */
	//方法1：返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)
	public static int random(int min, int max){
		if(min>max) {
			System.out.println("最小值不能比最大值大");
		}
		Random r=new Random();
		 
		return r.nextInt(max-min+1)+min;
	
	}
	//方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)
	public static int[] subRandom (int min, int max, int subs){
		if(min>max) {
			System.out.println("最小值不能比最大值大");
			return null;
		}
		//set集合不重复
		Set<Integer> set=new HashSet<Integer>();
		int i[]=new int [subs];
		int m=0;
		
		while(set.size()!=subs) {
			set.add(RandomUtil.random(min, max));
		}
		//遍历set集合给数组赋值
		for (Integer j : set) {
			i[m]=j;
			m++;
		}
		return i;
	
	}
	//方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
	public static char randomCharacter (){
		String str="123456789qwertyuiopasdfghjklmnbvcxzQWERTYUIOPLKJHGFDSAZXCVBNM";
		
		return str.charAt(RandomUtil.random(1, 61));
	
	}
	//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	public static String randomString(int length){
		String string = "";
		for (int i = 0; i <length; i++) {
			char c = RandomUtil.randomCharacter();
			string=string+ String.valueOf(c);
		}
		return string;
	
	}
}
