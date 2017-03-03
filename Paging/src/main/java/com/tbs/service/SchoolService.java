package com.tbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tbs.dao.studentMapper;
import com.tbs.dao.teacherMapper;
import com.tbs.entity.student;
@Component
public class SchoolService {
	/*这里定义接口类型的变量，原因是在springmvc自动注入的时候，可以根据接口在找到对应的类*/
	@Autowired
	private studentMapper sm;
	@Autowired
	private teacherMapper tm;
	
	/** 分页查询
	 * @return
	 */
	public List<student> findStudentByPage(int currentPage){ ;
		List<student> stus = null;
		stus=sm.findStudnetByPage(currentPage-1, currentPage+1);
		return stus;
	}
	
	/**查询总页
	 * @param everyPage
	 * @return
	 */
	public int selectTotalPage(int everyPage){
		int totalRow = 0;
		int totalPage = 0;
		//总行数
		totalRow = sm.queryTotalPage();
		//总页数
		totalPage = (totalRow+everyPage-1)/everyPage;
		return totalPage == 0 ? 1 : totalPage;
	}
}
