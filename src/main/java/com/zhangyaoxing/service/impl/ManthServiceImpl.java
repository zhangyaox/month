package com.zhangyaoxing.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhangyaoxing.entity.Manth;
import com.zhangyaoxing.entity.Vo;
import com.zhangyaoxing.mapper.ManthMapper;
import com.zhangyaoxing.service.ManthService;
import com.zhangyaoxing.util.DistanceUtil;
@Service
public class ManthServiceImpl implements ManthService {
	@Autowired
	private ManthMapper manthMapper;

	@Override
	public boolean addManth(List<Manth> manths) {
		// TODO Auto-generated method stub
		return manthMapper.addManth(manths);
	}

	@Override
	public String selectManth(Vo vo) {
		List<Manth> selectManth = manthMapper.selectManth();
		String ids="";
		for (Manth manth : selectManth) {
			if(null!=vo&&null!=vo.getJd()&&null!=vo.getWd()) {
				Double jd = manth.getJd();//我查找到的
				Double wd = manth.getWd();//我查找到的
				double distance = DistanceUtil.getDistance(vo.getJd(), vo.getWd(), jd, wd);//计算出距离
				System.out.println("计算出的距离"+distance);
				System.out.println("vo.getStart()"+vo.getStart());
				System.out.println("vo.getEnd()"+vo.getEnd());

					if(vo.getStart()<=distance&&vo.getEnd()>=distance) {//区间
						ids+=manth.getId()+",";
						System.out.println("idid的id"+ids);
					}
				
			}
		}
		
		if(null!=ids&&ids!="") {
			String id = ids.substring(0, ids.length()-1);
			
			return id;
		}
		return ids;
		
		
	}

	@Override
	public PageInfo<Manth> selectManths(String id, int pageNum) {
		Page<Object> startPage = PageHelper.startPage(pageNum, 3);
		List<Manth> selectManths = manthMapper.selectManths(id);
		return new PageInfo<Manth>(selectManths);
	}
}
