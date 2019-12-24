package com.zhangyaoxing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.zhangyaoxing.entity.Manth;
import com.zhangyaoxing.entity.Vo;
import com.zhangyaoxing.service.ManthService;

@Controller
public class ManthController {
	@Autowired
	private ManthService manthService;
	
	@RequestMapping("select")
	public String select(Model m, Vo vo, @RequestParam(defaultValue = "1")int pageNum) {
		PageInfo<Manth> selectManths=null;
		
		if(null!=vo.getWd()) {
			String id = manthService.selectManth(vo);
			System.out.println("id============="+id);
			selectManths = manthService.selectManths(id, pageNum);
			
		}
		
		if(null==vo.getWd()) {
			System.out.println("vovovovo"+vo);
			selectManths = manthService.selectManths(null, pageNum);
		}
		
		m.addAttribute("selectManths", selectManths);
		
		
		return "select";
	}
}
