<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<%@include file="/WEB-INF/inc/header.jsp"%>
<title>회원가입 3단계</title>
</head>
<body>
	<%@include file="/WEB-INF/inc/top.jsp"%>
	<div class="container">

		<div class="row col-md-8 col-md-offset-2">
			<div class="page-header">
				<h3>회원가입 3단계</h3>
			</div>


			<table class="table">
				<colgroup>
					<col width="20%" />
					<col />
				</colgroup>

				<tr class="form-group-sm">
					<th>생일</th>
					<td></td>
				</tr>
				<tr class="form-group-sm">
					<th>우편번호</th>
					<td></td>
				</tr>
				<tr class="form-group-sm">
					<th>주소</th>
					<td>add1 add2</td>
				</tr>
				<tr class="form-group-sm">
					<th>핸드폰</th>
					<td></td>
				</tr>
				<tr>
					<th>직업</th>
					<td>
						<div class="form-group-sm">
							form select써서 <select name="memJob" class="form-control">

							</select>
						</div>
					</td>
				</tr>
				<tr>
					<th>취미</th>
					<td class="form-group-sm">
						form select써서 <select name="memLike" class="form-control">
						</select>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<div class="pull-left">
							<a href="${pageContext.request.contextPath}/join/cancel" class="btn btn-sm btn-default"> <span class="glyphicon glyphicon-remove" aria-hidden="true"></span> &nbsp;&nbsp;취 소
							</a>
						</div>
						<div class="pull-right">
							<button type="submit" class="btn btn-sm btn-primary">
								<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span> &nbsp;&nbsp;다 음
							</button>
						</div>
					</td>
				</tr>
			</table>
		</div>

	</div>
</body>
</html>



