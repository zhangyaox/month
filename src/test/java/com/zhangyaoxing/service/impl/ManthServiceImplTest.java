package com.zhangyaoxing.service.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhangyaoxing.entity.Manth;
import com.zhangyaoxing.service.ManthService;
import com.zhangyaoxing.util.DistanceUtil;
import com.zhangyaoxing.util.StringUtil;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class ManthServiceImplTest {
	
	@Autowired
	private ManthService manthService;
	
	@Test
	public void test() throws IOException {
		InputStream resourceAsStream = this.getClass().getResourceAsStream("/data.txt");
		BufferedReader read = StringUtil.read(resourceAsStream);
		String readLine = read.readLine();
		ArrayList<String> arrayList = new ArrayList<String>();
		while(null!=readLine) {
			arrayList.add(readLine);
			readLine = read.readLine();
		}
//		System.out.println(arrayList);
		ArrayList<Manth> arrayList2 = new ArrayList<Manth>();
		for (String string : arrayList) {
			Manth manth = new Manth();
			String[] split = string.split(",");
			manth.setCardno(split[0]);
			manth.setCreated(split[1]);
			manth.setJd(Double.valueOf(split[2]));
			manth.setWd(Double.valueOf(split[3]));
			arrayList2.add(manth);
		}
		manthService.addManth(arrayList2);
	}
	
	@Test
	public void test2() {
		String s="1,2,3,4,";
		String substring = s.substring(0, s.length()-1);
		System.out.println(substring);
	}
}
