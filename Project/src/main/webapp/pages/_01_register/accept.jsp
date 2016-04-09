<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>申請會員 - 同意書</title>
<script src="js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<!-- 網頁最上方標題「巴菲特的左腦哲學」 -->
<jsp:include page="/title.jsp" />


<!-- 網頁主要導覽列 -->
<div style="background-color:#FFF0D4;padding:20;height:40px;margin:0 auto">
<jsp:include page="/nav.jsp" />
</div>

<p>
<table>
	<thead>申請會員 契約書	</thead>
	<tr>
		<td>本網站不會將您的個人資料做其他用途</td>	
	</tr>
	<tr>
		<td><input type="submit" value="同意"><input type="button" value="不同意"></td>

	</tr>
</table>

</div>








</body>
</html>