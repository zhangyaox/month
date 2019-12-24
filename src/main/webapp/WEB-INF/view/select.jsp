<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="/resource/css/bootstrap.css" rel="stylesheet">
<script type="text/javascript" src="/resource/js/jquery-1.8.2.min.js"></script>
<%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>
		<form action="select" method="post">
			经度<input type="text" name="jd" value="">
			纬度<input type="text" name="wd" value="">
			开始距离<input type="text" name="start" value="">
			结束距离<input type="text" name="end" value="">
			<button>查找</button>
		</form>
		<table>
		  <tr>
		    <th>车牌</th>
		    <th>时间</th>
		    <th>经度</th>
		    <th>纬度</th>
		  </tr>
		<c:forEach items="${selectManths.list}" var="list">
			<tr>
				<td>${list.cardno}</td>
				<td>${list.created}</td>
				<td>${list.jd}</td>
				<td>${list.wd}</td>
			</tr>
		</c:forEach>
		<tr>
			<td>
				<input type="button" value="sy" onclick="page(1)">
				<input type="button" value="syy" onclick="page(${selectManths.prePage})">
				<input type="button" value="xyy" onclick="page(${selectManths.nextPage})">
				<input type="button" value="wy" onclick="page(${selectManths.pages})">
			</td>
		</tr>
	</table>
	<script type="text/javascript">
		function page(page){
			location="select?pageNum="+page;
		}
	</script>
</body>
</html>