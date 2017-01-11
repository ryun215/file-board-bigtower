<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="<%=request.getContextPath() %>/memberAdd" method="post">
		<div>ID : <input type="text" name="mId"></div>
		<div>PW : <input type="password" name="mPw"></div>
		<div>NAME : <input type="text" name="mName"></div>
		<div>권한 : 
			<select name="mLevel">
				<option value="관리자">관리자</option>
				<option value="회원">회원</option>
			</select>
		</div>
		<input type="submit" value="가입하기">
		<input type="reset" value="리셋하기">
	</form>
</body>
</html>