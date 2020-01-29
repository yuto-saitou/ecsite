<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>BuyItem画面</title>
</head>
<body>
	<div id="header">
	</div>
	<div id="main">
		<div id="top">
			<p>BuyItem</p>
		</div>
	<div>
	<s:form action="BuyItemAction">
		<table><!--テーブル表示作成.th.tr.td -->
			<tr><!-- テーブルの行-->
				<td><!--テーブルの列 -->
					<span>商品名</span>
				</td>
				<td>
					<s:property value="session.buyItem_name"/>
				</td>
			</tr>
			<tr>
				<td>
					<span>値段</span>
				</td>
				<td>
				<s:property value="session.buyItem_price"/>
					<span>円</span>
				</td>
			</tr>
			<tr>
				<td>
					<span>在庫</span>
				</td>
				<td>
					<select name="stock">
					<option value="1" selected="selected">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>
					<span>支払い方法</span>
				</td>
				<td>
					<input type="radio" name="pay" value="1"
					checked="checked">現金払い
					<input type="radio" name="pay" value="2">クレジットカード
				</td>
			</tr>
			<tr>
				<td>
					<s:submit value="購入"/>
				</td>
			</tr>
		</table>
	</s:form>
		<div>
			<span>前画面に戻るには</span>
			<a href='<s:url action="HomeAction"/>'>こちら</a>
		</div>
	</div>
</div>
<div id="footer">
</div>
</body>
</html>