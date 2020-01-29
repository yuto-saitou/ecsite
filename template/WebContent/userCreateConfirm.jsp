<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">

<title>新規登録確認画面</title>
</head>

<body>
	<div id="header">
	</div>
	<div id="main">
		<div id="top">
			<p>UserCreateConfirm</p>
		</div>
		<div>
			<h3>登録内容は以下でよろしいでしょうか</h3>
		<table>
			<s:form action="UserCreateCompleteAction">
		<tr id="box">
			<td>
				<label>ログインID</label>
			</td>
			<td>
				<s:property value="loginUserId" escape="false"/>
			</td>
		</tr>

		<tr id="box">
			<td>
				<label>ログインPASS</label>
			</td>
			<td>
				<s:property value="loginPassword" escape="false"/>
			</td>
		</tr>

		<tr id="box">
			<td>
				<label>ユーザー名</label>
			</td>
			<td>
				<s:property value="userName" escape="false"/>
			</td>
		</tr>
		<tr>
			<td>
			<s:submit value="完了"/>
			</td>
		</tr>
		</s:form>
		</table>
	</div>
</div>
<div id="footer">
</div>

</body>
</html>