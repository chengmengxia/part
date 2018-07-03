package com.qingniao.usertest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qingniao.core.dao.UserTestMapper;

/**
 * 测试配置是否成功
 * @author 123
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/applicationContext-*.xml"})
public class UserDemo {
	@Autowired
	UserTestMapper userTestMapper;
	@Test
	public void demo1(){
		
	}

}
