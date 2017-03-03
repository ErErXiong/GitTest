<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
		var currentPage = parseInt('${currentPage}'); 
		var totalPage =  parseInt('${totalPage}');
		function doPage(key){
			switch (key) {
			case "first":
				currentPage= 1 ;
				break;
			case "pre":
				if(currentPage - 1 < 1){
					currentPage=1;
				}else{
					currentPage = currentPage - 1;
				}
				break;
			case "next":
				if(currentPage + 1 > totalPage){
				}else{
					currentPage = currentPage + 1;
				}
				break;
			case "last":
				currentPage = totalPage;
				break;
			default:
				break;
			}
			location.href="setPage.do?currentPage="+currentPage;
		}
	</script>
  </head>
  
  <body>
    This is my JSP page. <br>
    <a href="stupaging.do">paging</a>
    <c:if test="${stus ne null}">
    	<table width="400px" style="text-align: center;">
    		<tr>
    			<th>编号</th>
    			<th>姓名</th>
    			<th>年龄</th>
    			<th>老师</th>
    		</tr>
    		<c:forEach items="${stus }" var="stu">
    			<tr>
	    			<td>${stu.sid }</td>
	    			<td>${stu.sname }</td>
	    			<td>${stu.sage }</td>
	    			<td>${stu.tname }</td>
    			</tr>
    		</c:forEach>
    		<tr>
    			<td colspan="4"> 
    				<a href="javascript:doPage('first')">第一页</a>
    				<a href="javascript:doPage('pre')">上一页</a>
    				<a href="javascript:doPage('next')">下一页</a>
    				<a href="javascript:doPage('last')">最后一页</a>
    				当前第${currentPage}页   总共${totalPage}页
    			</td>
    		</tr>
    	</table>
    </c:if>
  </body>
</html>
