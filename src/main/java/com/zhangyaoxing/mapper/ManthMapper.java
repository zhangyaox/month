package com.zhangyaoxing.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhangyaoxing.entity.Manth;

public interface ManthMapper {
	boolean addManth(@Param("manths")List<Manth> manths);
	
	List<Manth> selectManth();
	
	List<Manth> selectManths(@Param("id")String id);
}
