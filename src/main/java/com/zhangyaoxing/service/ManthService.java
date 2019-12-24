package com.zhangyaoxing.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.zhangyaoxing.entity.Manth;
import com.zhangyaoxing.entity.Vo;

public interface ManthService {
	boolean addManth(List<Manth> manths);
	
	String selectManth(Vo vo);
	
	PageInfo<Manth> selectManths(String id, int pageNum);
}
