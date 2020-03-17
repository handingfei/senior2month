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
</head>
<body>
<div>
	<a href="/add"><input type="button" value="添加"></a>
	
	<a href="/buycar">5万以下</a>
	<a href="/buycar">5-8万</a>
	<a href="/buycar">8-10万</a>
	<a href="/buycar">10-15万</a>
	<a href="/buycar">15-20万</a>
	<a href="/buycar">20-25万</a>
	<a href="/buycar">25-35万</a>
	<a href="/buycar">35-50万</a>
	<a href="/buycar">50-100万</a>
	<a href="/buycar">100万以上</a>
	
	<button>搜索</button>
</div>
<div class="table">
	
	<dl>
		<dd>${buycar.type }</dd>
		<dd style="color: red">${buycar.jiage1 }-${buycar.jiage2 }</dd>
		<dd>${buycar.uptime }</dd>
		<dd>
			<a href="/cha"><input type="button" value="详情"></a>
			<a href="/upd"><input type="button" value="修改"></a>
		</dd>
	</dl>
	
</div>
</body>
</html>