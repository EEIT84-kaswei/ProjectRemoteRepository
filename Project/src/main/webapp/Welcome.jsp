<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- <%@ page import="freemarker.template.SimpleDate"%> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta name="viewport" content="width=device-width, initial-scale=1" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- <link rel="stylesheet" href="css/bootstrap.min.css" > -->

<head>
<script src="js/bootstrap.min.js"></script>
<title>歡迎頁面</title>


</head>

<body>
<div class="container">
<!-- 網頁最上方標題「巴菲特的左腦哲學」 -->
<jsp:include page="/title.jsp" />


<!-- 網頁主要導覽列 -->
<div style="background-color:#FFF0D4;padding:20;height:40px;margin:0 auto">
<jsp:include page="/nav.jsp" />
</div>
<!-- 主畫面 -->
<jsp:include page="/defaultView.jsp" />




<%-- <%@ page language="java" contentType="text/html;charset=UTF-8" --%>
<%-- pageEncoding="UTF-8" import="java.util.Date" import="java.text.SimpleDateFormat" %> --%>

<%-- <% --%>
<!-- // Date date = new Date(); -->
<%-- %> --%>
<%-- <%= date %> --%>

</div>
</body>
</html>
