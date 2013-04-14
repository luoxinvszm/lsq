<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend>信息设置</legend>

		<table>
			<tr>
				<td>字数设置
				<td>
				<td><form action="messageSettings.action">
						<input type="hidden" value="perMsgWords" name="method"> <input
							type="text" value="70"> <input type="submit"
							value="提交修改" />
					</form></td>
			</tr>
			<tr>
				<td>发送次数限制设置
				<td>
				<td><form action="messageSettings.action">
						<input type="hidden" value="sendMsgNum" name="method"> <input
							type="text" value="2"> <input type="submit" value="提交修改" />
					</form></td>
			</tr>
		</table>
	</fieldset>
</body>
</html>