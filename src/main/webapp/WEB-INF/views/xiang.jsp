<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	String path=request.getContextPath();
%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="/resource/css/bootstrap.css" rel="stylesheet">
<link href="/resource/css/index.css" rel="stylesheet">
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="/resource/js/bootstrap.min.js"></script>
<script type="text/javascript">


$(function () {
	$.post("/chaxun",function(obj){
		
		$("name=name")(obj.name);
		$("type=type")(obj.type);
		$("typeid=typeid")(obj.typeid);
		$("uptime=uptime")(obj.uptime);
		$("jiage1=jiage1")(obj.jiage1);
		$("jiage2=jiage2")(obj.jiage2);
		$("picture=picture")(obj.picture);
		
		$.post("/chaselect",function(arr){
			
			$("select").append("<option value='"arr[i].typeid"'"+arr[i].typename+"</option>");
		})
		
	}) 
		
}) 

</script>
</head>
<body>
<div>
<form action="/update">
	<input type="hidden" name="id" value="${param.id }">
	车型* <input type="text" name="name">
	类型   <input type="radio" name="type" value="非进口">非进口
		<input type="radio" name="type" value="进口">
	汽车类型* <select name="type2.typeid">
			<option value="">已上市</option>
			<option value="">未上市</option>
			<option value="">将上市</option>
			<option value="">海外车</option>
		  </select>
	上市日期   <input type="date" name="uptime" WdatePicker()>
	价格范围(万元)   <input type="text" name="jiage1" style="width: 130px">  到     
			  <input type="text" name="jiage2" style="width: 130px">
	上传图片*  <input type="file" name="picture">
	
	<input type="button" value="提交"  onclick="add()">
</form>
</div>
</body>
</html>