/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: RedisJdkSerialize.java 
 * @Prject: chentianxing_week1
 * @Package: com.chentianxing.test 
 * @Description: TODO
 * @author: 陈天星  
 * @date: 2019年8月12日 上午8:51:40 
 * @version: V1.0   
 */
package com.chentianxing.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chentianxing.bean.User;
import com.chentianxing.common.utils.RandomUitl;
import com.chentianxing.common.utils.StringUtil;

/** 
 * @ClassName: RedisJdkSerialize 
 * @Description: TODO
 * @author:陈天星
 * @date: 2019年8月12日 上午8:51:40  
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans2.xml")
public class RedisJsonSerialize {

	@Resource
	RedisTemplate<String, Serializable> redisTemplate;
	
	@Test
	public void test1() {
		
		List<User> list = new ArrayList<User>();
		
		
		String[] str = {"@qq.com","@163.com","@sian.com","@gmail.com","@sohu.com","@hotmail.com"};
		
		for (int i = 0; i < 100000; i++) {
			list.add(new User(
					i,
					StringUtil.generateChineseName(),
					RandomUitl.random(0, 2) > 1 ? "男" : "女",
					"13" + RandomUitl.randomString(9),
					""+RandomUitl.randomString2(RandomUitl.random(3, 20))+str[RandomUitl.random(0, str.length-1)],
					""+RandomUitl.random(18, 70)
					));
		}
		
		long startTime = System.currentTimeMillis();
		for (User user : list) {
			redisTemplate.opsForValue().set("e_"+user.getId(), user);
		}
		long endTime = System.currentTimeMillis();
		
		System.out.println("json存储时间为: "+(endTime-startTime));
	}
	
	
}
