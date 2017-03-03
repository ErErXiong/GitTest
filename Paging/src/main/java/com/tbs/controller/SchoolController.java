package com.tbs.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tbs.entity.student;
import com.tbs.service.SchoolService;
@Controller
public class SchoolController {
	@Autowired
	private SchoolService ss;
	
	@RequestMapping("stupaging")
	public String fingStuByPage(ModelMap map,HttpSession session){
		//第一次查询
		List<student> stus = ss.findStudentByPage(1);
		for (student student : stus) {
			System.out.println(student);
		}
		//查询总行数
		int totalPage = ss.selectTotalPage(2);
		session.setAttribute("totalPage", totalPage);
		map.put("stus", stus);
		map.put("currentPage", 1);
		return "index";
	}
	/** 查询 新 数据
	 * @param currentPage
	 * @param map
	 * @return
	 */
	@RequestMapping("setPage")
	public String setPage(int currentPage,ModelMap map){
		String path = "index";
		System.out.println(currentPage);  //因为map是request域，所以页面转跳后currentPage就没了。
		map.put("currentPage", currentPage);
		//计算
		List<student> stus = ss.findStudentByPage(currentPage);
		map.put("stus", stus);
		return path;
	}
}
