<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<%@include file="/WEB-INF/inc/header.jsp" %>
<%
	request.setCharacterEncoding("utf-8");
%>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="/WEB-INF/inc/top.jsp" %>
<%
	String lang=request.getParameter("lang");
%>


<c:if test="${param.lang ne null }">
<fmt:setLocale value="${param.lang }"  scope="session"/>
</c:if>

<c:redirect  url='<%=request.getHeader("Referer") %>'></c:redirect>
 









</body>
</html>