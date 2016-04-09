<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>標題</title>
<style type="text/css">

*{
	background-color:#FFE8E8;
}

li {
	font-size: 20px;
	color: purple;
}

#fl_right {
	float: right;
}

#fl_right.li {
	text-align: right;
}
</style>

</head>
<body>
	<!-- 標題 START -->
<table>
<tr>
	<td>
		<div id="logoimg">
			<img src="<c:url value="/img/logo.png"/>" style="float: left; height: 120px">
		</div>
	</td>
	<td>
		<div>
			<h1>巴菲特的左腦哲學</h1>
			<span><font size="4px">EEIT84 project | Philosophy of Buffett's Left Brain</font></span>
		</div>
	</td>
	<td class='menuData'>
				<div class='menu'>
					<c:if test="${empty LoginOK }">
						<a href="<c:url value='/pages/_02_login/login.jsp' />"> 登入 </a>
					</c:if>
				</div>
	</td>
	<td class='menuData'>
				<div class='menu'>
					<c:if test="${!empty LoginOK }">
						<a href="<c:url value='/_02_login/logout.jsp' />"> 登出 </a>
					</c:if>
				</div>
	</td>
	<td class='menuData'>
				<div class='menu'>
					<c:if test="${LoginOK }">
						<a href="<c:url value='/secure/backstage/backstageIndex.jsp' />"> 管理員 </a>
					</c:if>
				</div>
	</td>
		<td class='menuData'>
				<div class='menu'>
					<c:if test="${LoginOK }">
						<a href="<c:url value='/secure/author/authorIndex.jsp' />"> 專欄作家  </a>
					</c:if>
				</div>
	</td>
</tr>
</table>

	<!-- 標題 END -->
</body>
</html>